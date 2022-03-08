package propertyManage.control;

import java.math.BigDecimal;
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
import propertyManage.com.util.StringUtil;
import propertyManage.db.bean.PropertyCommunityBean;
import propertyManage.db.bean.RequestTransactionBean;
import propertyManage.db.repository.RequestTransactionRepository;

@Controller
public class SaveRequestControl {
	
	@Autowired
	private RequestTransactionRepository requestTransactionRepository;
	
	
	@Autowired
	private MessageSource messageSource;

	
	@RequestMapping("/saveRequest")
	@ResponseBody
	public Map<String,String> execute(@RequestBody Map<String, String> requestInfo, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		StringUtil.consoleLog("SaveRequestControl!!!!!!");
		Map<String,String> resultMap=new HashMap<String,String>();
		String requesterCall = requestInfo.get("RequesterCall");
		String requesterName = requestInfo.get("RequesterName");
		String requestAddress = requestInfo.get("RequestAddress");
		String estimatedRequestFee = requestInfo.get("EstimatedRequestFee");
		String requestType = requestInfo.get("RequestType");
		String requestPrivatePublic = requestInfo.get("RequestPrivatePublic");
		String requestDesc = requestInfo.get("RequestDesc");
		String requestID= requestInfo.get("RequestId");
		
		
		RequestTransactionBean requestTransactionBeanNew=new RequestTransactionBean();
		
		if (!StringUtil.isBlank(requestID)) {
			
			Optional<RequestTransactionBean> optio=requestTransactionRepository.findById(Long.valueOf(requestID));
			if (optio.isPresent()) {
				requestTransactionBeanNew=optio.get();
			}
			
		}
	
		PropertyCommunityBean propertyCommunityBean= (PropertyCommunityBean)request.getSession().getAttribute(PropertyConstant.PROPERTY_INFO);
		requestTransactionBeanNew.setCommunityId(propertyCommunityBean.getCommunityId());

		if (!StringUtil.isBlank(estimatedRequestFee)) {
			requestTransactionBeanNew.setEstimatedRequestFee(new BigDecimal(estimatedRequestFee));
		}

		requestTransactionBeanNew.setRequestDateTime(new Timestamp(System.currentTimeMillis()+28800000L)); 
		requestTransactionBeanNew.setRequestDesc(requestDesc);
		requestTransactionBeanNew.setRequestPrivatePublic(Integer.valueOf(requestPrivatePublic));
		requestTransactionBeanNew.setRequestType(Integer.valueOf(requestType));
		requestTransactionBeanNew.setRequesterName(requesterName);
		requestTransactionBeanNew.setRequesterCall(Long.valueOf(requesterCall));
		requestTransactionBeanNew.setRequestAddress(requestAddress);
		requestTransactionBeanNew.setRequestCurrentStatus(0);


		try {
			
			requestTransactionBeanNew=requestTransactionRepository.save(requestTransactionBeanNew);
			resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.OK.getValue());
			requestID=requestTransactionBeanNew.getRequestID().toString();
			String[] para= {requestID};
			String msg=messageSource.getMessage(PropertyConstant.MSG_KEY_REQUEST_SAVED, para,null);
			resultMap.put(PropertyConstant.REQUEST_ID, requestID);
			resultMap.put(PropertyConstant.MSG_CONTEXT, msg);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMap;

	}
	

}
