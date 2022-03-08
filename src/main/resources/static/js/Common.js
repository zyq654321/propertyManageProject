function isEmpty(str) {
	if (str == null || typeof str == "undefined" || str.trim() == "") {
		return true;
	} else {
		return false;
	}
}
function isInteger(obj) {
	var reg = /^[1-9]\d*$|^0$/; // 注意：故意限制了 0321 这种格式，如不需要，直接reg=/^\d+$/;
	return reg.test(obj);

}
function isDouble(obj) {
	var reg = /^[0-9]*\.?[0-9]*$/;
	return reg.test(obj);

}

function getSysDate() {
	var myDate = new Date();
	var month = "0" + (myDate.getMonth() + 1);
	var date = "0" + myDate.getDate();
	var sysDate = myDate.getFullYear() + "-" + month.substring(month.length - 2) + "-" + date.substring(date.length - 2);
	return sysDate;
}

/**
 * 设置未来(全局)的AJAX请求默认选项
 * 主要设置了AJAX请求遇到Session过期的情况
 */
$.ajaxSetup({
	type: 'POST',
	complete: function(xhr, status) {
		var sessionStatus = xhr.getResponseHeader('sessionstatus');
		if (sessionStatus == 'timeout') {
			var top = getTopWinow();
			$("#confirmDlg p").html("由于您长时间没有操作, 状态信息已过期, 请重新登录");
			$("#confirmDlg").dialog({
				buttons: {
					"确定": function() {
						$(this).dialog('close');
						top.location.href = '/weiCanPj/index.jsp';

					},
					"取消": function() { $(this).dialog('close'); }
				}
			});
			$("#confirmDlg").dialog("open");

		}
	}
});

/**
 * 在页面中任何嵌套层次的窗口中获取顶层窗口
 * @return 当前页面的顶层窗口对象
 */
function getTopWinow() {
	var p = window;
	while (p != p.parent) {
		p = p.parent;
	}
	return p;
}


//2） 乘法函数
//说明：javascript的乘法结果会有误差，在两个浮点数相乘的时候会比较明显。这个函数返回较为精确的乘法结果。 
//调用：accMul(arg1,arg2) 
//返回值：arg1乘以arg2的精确结果 
function accMul(arg1, arg2) {
	var m = 0, s1 = arg1.toString(), s2 = arg2.toString();
	try { m += s1.split(".")[1].length } catch (e) { }
	try { m += s2.split(".")[1].length } catch (e) { }
	return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m)
}

//3） 加法函数
//说明：javascript的加法结果会有误差，在两个浮点数相加的时候会比较明显。这个函数返回较为精确的加法结果。 
//调用：accAdd(arg1,arg2) 
//返回值：arg1加上arg2的精确结果 
function accAdd(arg1, arg2) {
	var r1, r2, m;
	try { r1 = arg1.toString().split(".")[1].length } catch (e) { r1 = 0 }
	try { r2 = arg2.toString().split(".")[1].length } catch (e) { r2 = 0 }
	m = Math.pow(10, Math.max(r1, r2))
	return (arg1 * m + arg2 * m) / m
}
//4） 减法函数
function accSub(arg1, arg2) {
	var r1, r2, m, n;
	try { r1 = arg1.toString().split(".")[1].length } catch (e) { r1 = 0 }
	try { r2 = arg2.toString().split(".")[1].length } catch (e) { r2 = 0 }
	m = Math.pow(10, Math.max(r1, r2));
	//last modify by deeka 
	//动态控制精度长度 
	n = (r1 >= r2) ? r1 : r2;
	return ((arg1 * m - arg2 * m) / m).toFixed(n);
}


/**
		 * 获取上一个月
		 *
		 * @date 格式为yyyy-mm-dd的日期，如：2014-01-25
		 */
function getPreMonth(date) {
	var arr = date.split('-');
	var year = arr[0]; //获取当前日期的年份
	var month = arr[1]; //获取当前日期的月份
	var day = arr[2]; //获取当前日期的日

	var days = new Date(year, month, 0);
	days = days.getDate(); //获取当前日期中月的天数
	var year2 = year;
	var month2 = parseInt(month) - 1;
	if (month2 == 0) {//如果是1月份，则取上一年的12月份
		year2 = parseInt(year2) - 1;
		month2 = 12;
	}
	var day2 = day;
	var days2 = new Date(year2, month2, 0);
	days2 = days2.getDate();
	if (day2 > days2) {//如果原来日期大于上一月的日期，则取当月的最大日期。比如3月的30日，在2月中没有30
		day2 = days2;
	}
	if (month2 < 10) {
		month2 = '0' + month2;//月份填补成2位。
	}
	var t2 = year2 + '-' + month2 + '-' + day2;
	return t2;
}

/*获取下个月*/
function getNextMonth(date) {
	var arr = date.split('-');
	var year = arr[0]; //获取当前日期的年份
	var month = arr[1]; //获取当前日期的月份
	var day = arr[2]; //获取当前日期的日
	var days = new Date(year, month, 0);
	days = days.getDate(); //获取当前日期中的月的天数
	var year2 = year;
	var month2 = parseInt(month) + 1;
	if (month2 == 13) {
		year2 = parseInt(year2) + 1;
		month2 = 1;
	}
	var day2 = day;
	var days2 = new Date(year2, month2, 0);
	days2 = days2.getDate();
	if (day2 > days2) {
		day2 = days2;
	}
	if (month2 < 10) {
		month2 = '0' + month2;
	}
	var t2 = year2 + '-' + month2 + '-' + day2;
	return t2;
}
function inputCheckCom(checkOjbArray, checkTypeArray) {

	var rtn = false;
	for (var i = 0; i < checkOjbArray.length; i++) {


		var checkObj = checkOjbArray[i];
		var checkType = checkTypeArray[i];

		var objectVal = $(checkObj[0]).val();
		for (var j = 0; j < checkType.length; j++) {
			/* 必须输入check */
			if (checkType[j][0] == 1) {

				if (isEmpty(objectVal)) {
					$(checkObj[0]).focus();
					$("#alertDlg p").html("请输入"+checkObj[1] );
					$("#alertDlg").dialog("open");
					return false;
				}
			}
			/* 位数check */
			if (checkType[j][0] == 2) {


				if (objectVal.length != checkType[j][1]) {
					$(checkObj[0]).focus();
					$("#alertDlg p").html(checkObj[1] + "必须为" + checkType[j][1] + "位");
					$("#alertDlg").dialog("open");
					return false;
				}
			}

			/* 最小位数check */
			if (checkType[j][0] == 4) {


				if (objectVal.length <= checkType[j][1]) {
					$(checkObj[0]).focus();
					$("#alertDlg p").html(checkObj[1] + "不能少于" + checkType[j][1] + "位");
					$("#alertDlg").dialog("open");
					return false;
				}
			}

			/* 整数check */
			if (checkType[j][0] == 3) {
				if (objectVal.length > 0) {

					if (!isInteger(objectVal)) {
						$(checkObj[0]).focus();
						$("#alertDlg p").html(checkObj[1] + "必须为数字！");
						$("#alertDlg").dialog("open");
						return false;
					}
				}
			}
			/* 小数check */
			if (checkType[j][0] == 3.1) {
				if (objectVal.length > 0) {

					if (!isDouble(objectVal)) {
						$(checkObj[0]).focus();
						$("#alertDlg p").html(checkObj[1] + "必须为数字！");
						$("#alertDlg").dialog("open");
						return false;
					}
				}
			}
		}
	}
	return true;
}



function getAddr(addressUnitSet, addrType) {
	var addr = $("#addressUnit1").val();;

	if (addressUnitSet[addrType].addressUnit1Name != "任意") {
		addr = addr + addressUnitSet[addrType].addressUnit1Name;
	}
	if ($("#addressUnit2").length > 0) {
		addr = addr + $("#addressUnit2").val() + addressUnitSet[addrType].addressUnit2Name;
	}
	if ($("#addressUnit3").length > 0) {
		addr = addr + $("#addressUnit3").val() + addressUnitSet[addrType].addressUnit3Name;
	}
	if ($("#addressUnit4").length > 0) {
		addr = addr + $("#addressUnit4").val() + addressUnitSet[addrType].addressUnit4Name;
	}
	return addr;
}
	function getAddrInfo(addrName) {
		
		var addr="";
		if ($("#"+addrName).length>0) {
			addr=$("#"+addrName).val();
		}
		return addr;
	}
