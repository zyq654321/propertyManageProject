package propertyManage.control;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import propertyManage.com.constant.PropertyConstant;
import propertyManage.com.constant.PropertyConstant.REQUEST_STATUS;
import propertyManage.com.util.StringUtil;
import propertyManage.db.bean.HumanResourceBean;
import propertyManage.db.bean.RequestAsignTransBean;
import propertyManage.db.bean.RequestTransactionBean;
import propertyManage.db.repository.HumanResourceRepository;
import propertyManage.db.repository.RequestAsignTransRepository;
import propertyManage.db.repository.RequestTransactionRepository;

@Controller
public class AsignRequestControl {

	@Autowired
	private RequestAsignTransRepository requestAsignTransRepository;
	
	@Autowired
	private HumanResourceRepository humanResourceRepository;
	@Autowired
	private RequestTransactionRepository requestTransactionRepository;
	@Autowired
	private MessageSource messageSource;

	// @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
	@RequestMapping("/asignmentRequest")
	@ResponseBody
	public Map<String, Object> execute(@RequestBody Map<String, String> requestInfo, HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		StringUtil.consoleLog("searchRequest!!!!!!");
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String asignedWorkerName = requestInfo.get("AsignedWorkerName");
		String requestId = requestInfo.get("RequestId");
		String workerHrId = requestInfo.get("WorkerHrId");
		RequestAsignTransBean requestAsignWorkTransBean = new RequestAsignTransBean();
		requestAsignWorkTransBean.setAsignedWorkerName(asignedWorkerName);
		requestAsignWorkTransBean.setWorkerHrId(Long.valueOf(workerHrId));
		requestAsignWorkTransBean.setRequestId(Long.valueOf(requestId));
		HumanResourceBean humanResourceBean = (HumanResourceBean) session.getAttribute(PropertyConstant.USER_INFO);
		requestAsignWorkTransBean.setAsignerName(humanResourceBean.getRealName());

		requestAsignWorkTransBean.setAsignTime(new Timestamp(System.currentTimeMillis()+28800000L));
		
		Optional<HumanResourceBean> optHumanResourceBean=humanResourceRepository.findById(new Long(workerHrId));
		if (optHumanResourceBean.isPresent()) {
			requestAsignWorkTransBean.setAsignedWorkerCall(optHumanResourceBean.get().getCallNumber());
		}
		

		try {
			requestAsignWorkTransBean = requestAsignTransRepository.save(requestAsignWorkTransBean);
			Optional<RequestTransactionBean> optRequestTransactionBean =requestTransactionRepository.findById(Long.valueOf(requestId));
			if (optRequestTransactionBean.isPresent()) {
				RequestTransactionBean requestTransactionBean=optRequestTransactionBean.get();
				requestTransactionBean.setRequestCurrentStatus(REQUEST_STATUS.ASSIGNED.getIndex());
				requestTransactionRepository.save(requestTransactionBean);
			}
			
			resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.OK.getValue());

			String[] para= {requestAsignWorkTransBean.getRequestId().toString(),requestAsignWorkTransBean.getAsignedWorkerName()};
			 String msg = messageSource.getMessage(PropertyConstant.MSG_KEY_ASIGN_OK,
					 para, null);

			 resultMap.put(PropertyConstant.MSG_CONTEXT, msg);

		} catch (Exception e) {
			// TODO Auto-generated catch block,
			e.printStackTrace();
		}
		return resultMap;

	}

}
