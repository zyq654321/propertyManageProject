package propertyManage.control;

import java.math.BigDecimal;
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
import propertyManage.db.bean.HouseAccoutBean;
import propertyManage.db.repository.HouseAccoutRepository;

@Controller
public class SaveHouseInfoControl {
	
	@Autowired
	private HouseAccoutRepository houseAccoutRepository;
	
	
	@Autowired
	private MessageSource messageSource;

	
	@RequestMapping("/saveHouseInfo")
	@ResponseBody
	public Map<String,String> execute(@RequestBody Map<String, String> requestInfo, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		StringUtil.consoleLog("saveHouseInfo!!!!!!");
		Map<String,String> resultMap=new HashMap<String,String>();
		String mainMemberName = requestInfo.get("MainMemberName");
		Long houseAccount = StringUtil.toLong(requestInfo.get("HouseAccount"));
		Long mainMemberCall = StringUtil.toLong(requestInfo.get("MainMemberCall"));
		BigDecimal houseArea = StringUtil.strToBigDecimal(requestInfo.get("HouseArea"));
		BigDecimal propertyFeeRate = StringUtil.strToBigDecimal(requestInfo.get("PropertyFeeRate"));
		
		Integer feePeriod= StringUtil.toInteger(requestInfo.get("FeePeriod"));
		
		BigDecimal cleanFeeRate = StringUtil.strToBigDecimal(requestInfo.get("CleanFeeRate"));
		BigDecimal securityFeeRate = StringUtil.strToBigDecimal(requestInfo.get("SecurityFeeRate"));
		BigDecimal waterPumpFeeRate = StringUtil.strToBigDecimal(requestInfo.get("WaterPumpFeeRate"));
		BigDecimal otherFeeRate = StringUtil.strToBigDecimal(requestInfo.get("OtherFeeRate"));
		BigDecimal elevatorRate = StringUtil.strToBigDecimal(requestInfo.get("ElevatorRate"));
		BigDecimal parkingFee= StringUtil.strToBigDecimal(requestInfo.get("ParkingFee"));
		BigDecimal fixedFee= StringUtil.strToBigDecimal(requestInfo.get("FixedFee"));
		BigDecimal totalPeriodFee= StringUtil.strToBigDecimal(requestInfo.get("TotalPeriodFee"));

		
		
		HouseAccoutBean houseAccoutBean=new HouseAccoutBean();
		
		if (!StringUtil.isBlank(houseAccount)) {
			
			Optional<HouseAccoutBean> optio=houseAccoutRepository.findById(houseAccount);
			if (optio.isPresent()) {
				houseAccoutBean=optio.get();
			}
			
		}
		houseAccoutBean.setMainMemberName(mainMemberName); 
		houseAccoutBean.setMainMemberCall(mainMemberCall);
		houseAccoutBean.setHouseArea(houseArea);
		houseAccoutBean.setPropertyFeeRate(propertyFeeRate);
		houseAccoutBean.setFeePeriod(feePeriod);
		houseAccoutBean.setCleanFeeRate(cleanFeeRate);
		houseAccoutBean.setSecurityFeeRate(securityFeeRate);
		houseAccoutBean.setWaterPumpFeeRate(waterPumpFeeRate);
		houseAccoutBean.setOtherFeeRate(otherFeeRate);
		houseAccoutBean.setElevatorRate(elevatorRate);
		houseAccoutBean.setFeePeriod(feePeriod);
		houseAccoutBean.setParkingFee(parkingFee);
		houseAccoutBean.setFixedFee(fixedFee);
		houseAccoutBean.setTotalPeriodFee(totalPeriodFee);
	


		try {
			
			houseAccoutBean=houseAccoutRepository.save(houseAccoutBean);
			resultMap.put(PropertyConstant.RESULT, PropertyConstant.RESULT_KBN.OK.getValue());
			

			String msg=messageSource.getMessage(PropertyConstant.MSG_KEY_HOUSE_INFO_SAVED, null,null);
			resultMap.put(PropertyConstant.MSG_CONTEXT, msg);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMap;

	}
	

}
