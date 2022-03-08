package propertyManage.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import propertyManage.com.constant.PropertyConstant;
import propertyManage.com.constant.PropertyConstant.REQUEST_PUBLIC_PRIVATE;
import propertyManage.com.constant.PropertyConstant.REQUEST_STATUS;
import propertyManage.com.constant.PropertyConstant.REQUEST_TYPE;
import propertyManage.com.util.StringUtil;
import propertyManage.db.bean.RequestAsignTransBean;
import propertyManage.db.bean.RequestTransactionBean;
import propertyManage.db.bean.RequestTransactionBeanWithName;
import propertyManage.db.repository.RequestAsignTransRepository;
import propertyManage.db.repository.RequestTransactionRepository;

@Controller
public class SearchRequestControl {

	@Autowired
	private RequestTransactionRepository requestTransactionRepository;
	
	@Autowired
	private RequestAsignTransRepository requestAsignTransRepository;

	@Autowired
	private MessageSource messageSource;

	// @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
	@RequestMapping("/searchRequest")
	@ResponseBody
	public Map<String, Object> execute(@RequestBody Map<String, String> requestInfo, HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		StringUtil.consoleLog("searchRequest!!!!!!");
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String requesterCall = requestInfo.get("RequesterCall");
		Integer RequestType = StringUtil.optionAllToNull(requestInfo.get("RequestType"));

		Integer requestPrivatePublic = StringUtil.optionAllToNull(requestInfo.get("RequestPrivatePublic"));

		String requesterID = requestInfo.get("RequesterID");
		Integer requestStatus = StringUtil.optionAllToNull(requestInfo.get("RequestStatus"));
		
		String showDetailFlg = requestInfo.get("ShowDetailFlg");

		Long requesterIDSearch=null;
		//java.sql.Date requestDay = requestInfo.get("RequestDay");
		String requesterCallSearch=null;

		java.sql.Date beginDate=null,endDate=null;
		String strBeginDate=requestInfo.get("beginDate");
		String strEndDate=requestInfo.get("endDate");
		if (StringUtil.isNotBlank(strBeginDate) && StringUtil.isNotBlank(strEndDate)) {

			beginDate =new java.sql.Date(StringUtil.strToDate(strBeginDate).getTime());
			endDate =new java.sql.Date(StringUtil.strToDate(strEndDate).getTime());
		}
		
		
		
		
		
		if (StringUtil.isNotBlank(requesterID)) {
			requesterIDSearch =new Long(requesterID);
		}
		if (StringUtil.isNotBlank(requesterCall)) {
			requesterCallSearch =requesterCall;
		}

		try {
			resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.NG.getValue());
			List<RequestTransactionBean> requestTransactionlist = requestTransactionRepository.
					findRequestData(requesterIDSearch,beginDate,endDate,
					requesterCallSearch,requestStatus,RequestType,requestPrivatePublic);
			// requestTransactionBean=requestTransactionRepository.save(requestTransactionBean);
			if (requestTransactionlist ==null  || requestTransactionlist.size()==0) {
				String msg = messageSource.getMessage(PropertyConstant.MSG_KEY_SEARCH_NO_DATA, null, null);
				resultMap.put(PropertyConstant.MSG_CONTEXT, msg);
			}else {
				resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.OK.getValue());
				List<RequestTransactionBeanWithName> requestTransactionStrlist =new ArrayList<RequestTransactionBeanWithName>();
				
				for (RequestTransactionBean requestTransactionBean:requestTransactionlist) {
					
					RequestTransactionBeanWithName requestTransactionBeanWithName=new RequestTransactionBeanWithName();
					BeanUtils.copyProperties(requestTransactionBean, requestTransactionBeanWithName);
					
					requestTransactionBeanWithName.setRequestDateTimeStr(StringUtil.toDateTimeString(requestTransactionBean.getRequestDateTime()));
					requestTransactionBeanWithName.setRequestPrivatePublicStr(REQUEST_PUBLIC_PRIVATE.getNameByValue(requestTransactionBean.getRequestPrivatePublic()));
					requestTransactionBeanWithName.setRequestCurrentStatusStr(REQUEST_STATUS.getNameByValue(requestTransactionBean.getRequestCurrentStatus()));
					requestTransactionBeanWithName.setRequestTypeName(REQUEST_TYPE.getNameByValue(requestTransactionBean.getRequestType()));
					
					if ("1".equals(showDetailFlg)) {
						Optional<RequestAsignTransBean> requestAsignTransBeanOpn =requestAsignTransRepository.findByRequestId(requestTransactionBean.getRequestID());
						if (requestAsignTransBeanOpn.isPresent()) {
						
							RequestAsignTransBean requestAsignTransBean =requestAsignTransBeanOpn.get();
							requestTransactionBeanWithName.setAsignTime(StringUtil.toDateTimeString(requestAsignTransBean.getAsignTime()));
							requestTransactionBeanWithName.setAsignerName(requestAsignTransBean.getAsignerName());
							requestTransactionBeanWithName.setAsignedWorkerCall(requestAsignTransBean.getAsignedWorkerCall());
							requestTransactionBeanWithName.setAsignedWorkerName(requestAsignTransBean.getAsignedWorkerName());
						}
						
					}
					requestTransactionStrlist.add(requestTransactionBeanWithName);
				}
				resultMap.put(PropertyConstant.MSG_KEY_SEARCH_RESULT, requestTransactionStrlist);
				
			}
			
		//String[] para = { requestTransactionBean.getRequestID().toString() };
		//String msg = messageSource.getMessage(PropertyConstant.MSG_KEY_REQUEST_SAVED, para, null);

		//	resultMap.put(PropertyConstant.MSG_CONTEXT, msg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMap;

	}



}
