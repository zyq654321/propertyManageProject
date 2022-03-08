package propertyManage.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import propertyManage.db.bean.HouseAddrTypeBean;
import propertyManage.db.bean.HousrAddrTypeWithName;
import propertyManage.db.bean.HumanCommunityRoleBean;
import propertyManage.db.bean.HumanResourceBean;
import propertyManage.db.bean.PropertyCommunityBean;
import propertyManage.db.repository.HouseAddrTypeRepository;
import propertyManage.db.repository.HumanCommunityRoleRepository;
import propertyManage.db.repository.HumanResourceRepository;
import propertyManage.db.repository.PropertyCommunityRepository;

@Controller
public class LoginControl {
	
	@Autowired
	private HumanResourceRepository humanResourceRepository;
	
	@Autowired
	private HumanCommunityRoleRepository humanCommunityRoleRepository;
	
	@Autowired
	private  PropertyCommunityRepository propertyCommunityRepository;
	
	@Autowired
	private  HouseAddrTypeRepository houseAddrTypeRepository;
	
	@Autowired
	private MessageSource messageSource;

	// @RequestMapping(value = {"/hello"},method = RequestMethod.GET)
	@RequestMapping("/login")
	@ResponseBody
	public Map<String,String> execute(@RequestBody Map<String, String> loginInfo, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		StringUtil.consoleLog("LoginControl!!!!!!!");
		Map<String,String> resultMap=new HashMap<String,String>();
		String sysName = loginInfo.get("sysName");
		String password = loginInfo.get("password");
		List<HumanResourceBean> humanResourceBeanList = humanResourceRepository.findBySysName(sysName);



		try {
			
			resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.NG.getValue());
			
			if (null == humanResourceBeanList || humanResourceBeanList.size() == 0) {
				
				String[] para= {sysName};
				String msg=messageSource.getMessage(PropertyConstant.MSG_KEY_NO_USER, para,null);

				resultMap.put(PropertyConstant.MSG_CONTEXT, msg);

			} else {
				HumanResourceBean humanResourceBean = humanResourceBeanList.get(0);

				if (!StringUtil.isEqual(password, humanResourceBean.getPassword())) {
					resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.NG.getValue());
					String msg=messageSource.getMessage(PropertyConstant.MSG_KEY_USER_PASSWORD_UNMATCH, null,null);
					resultMap.put(PropertyConstant.MSG_CONTEXT, msg);


				} else {
					
					session.setAttribute(PropertyConstant.USER_INFO, humanResourceBean);
					List<HumanCommunityRoleBean> HumanCommunityRoleList=humanCommunityRoleRepository.findByHumanResourceId(humanResourceBean.getHumanResourceId());
					
					if (HumanCommunityRoleList!=null && HumanCommunityRoleList.size()>0) {
						
						HumanCommunityRoleBean humanCommunityRoleBean =HumanCommunityRoleList.get(0);
						
						resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.OK.getValue());
						session.setAttribute(PropertyConstant.USER_ROLE, humanCommunityRoleBean);
						Optional<PropertyCommunityBean>  optPropertyCommunityBean=propertyCommunityRepository.findById(humanCommunityRoleBean.getCommunityId());
						if (optPropertyCommunityBean.isPresent()) {
							PropertyCommunityBean propertyCommunityBean=optPropertyCommunityBean.get();
							session.setAttribute(PropertyConstant.PROPERTY_INFO, propertyCommunityBean);
						}
						List<HouseAddrTypeBean> houseAddrTypeBeanList =
								houseAddrTypeRepository.findByCommunityId(humanCommunityRoleBean.getCommunityId());
						List<HousrAddrTypeWithName> HousrAddrTypeWithNameList=new ArrayList<HousrAddrTypeWithName>();
						 
						for(HouseAddrTypeBean houseAddrTypeBean:houseAddrTypeBeanList) {
							HousrAddrTypeWithName housrAddrTypeWithName =new HousrAddrTypeWithName();
							housrAddrTypeWithName.setAddressTypeId(houseAddrTypeBean.getAddressTypeId());
							if (null !=houseAddrTypeBean.getAddressUnit1()) {
								housrAddrTypeWithName.setAddressUnit1Name(PropertyConstant.ADDRESS_UNIT.getNameByValue(houseAddrTypeBean.getAddressUnit1()));
							}
							if (null !=houseAddrTypeBean.getAddressUnit2()) {
								housrAddrTypeWithName.setAddressUnit2Name(PropertyConstant.ADDRESS_UNIT.getNameByValue(houseAddrTypeBean.getAddressUnit2()));
							}
							if (null !=houseAddrTypeBean.getAddressUnit3()) {
								housrAddrTypeWithName.setAddressUnit3Name(PropertyConstant.ADDRESS_UNIT.getNameByValue(houseAddrTypeBean.getAddressUnit3()));
							}
							if (null !=houseAddrTypeBean.getAddressUnit4()) {
								housrAddrTypeWithName.setAddressUnit4Name(PropertyConstant.ADDRESS_UNIT.getNameByValue(houseAddrTypeBean.getAddressUnit4()));
							}
							HousrAddrTypeWithNameList.add(housrAddrTypeWithName);
						}
						
						session.setAttribute(PropertyConstant.HOUSE_ADDR_TYPE, HousrAddrTypeWithNameList);
						
						session.setAttribute(PropertyConstant.HOUSE_ADDR_TYPE_COUNT, houseAddrTypeBeanList.size());
						
						
					}else {
						
						String msg=messageSource.getMessage(PropertyConstant.MSG_KEY_NO_ROLE, null,null);
						resultMap.put(PropertyConstant.MSG_CONTEXT, msg);
					}


				}
		

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMap;

	}
	
//	 @RequestMapping(value = {"/request"},method = RequestMethod.GET)
//	//@RequestMapping(value = "/request")
//	public ModelAndView login(HttpSession session, HttpServletRequest request, HttpServletResponse response,Map data) {
//		StringUtil.consoleLog("DummyControl!!!2");
//		//System.out.println(request.getSession().getAttribute("UserInfo"));
//		System.out.println(" RequestControl Map!!!"+((Map)data).get("OK"));
//		
//	
//		 return new ModelAndView("/request.html");
//	 }
}
