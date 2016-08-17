use nutz;
set names utf8;
INSERT INTO `dict_config` (`code`, `name`, `key`, `value`, `note`)
VALUES
	('common', '常规配置', 'booking.com.proxy.switch', 'on', 'booking.com 代理开关（on 打开，off 关闭）'),
	('common', '常规配置', 'booking.com.proxy.preSubmit', 'off', 'booking.com  preSubmit  接口代理ip 和端口号'),
	('common', '常规配置', 'booking.com.proxy.detail', '10.89.36.25:7001', 'booking.com  detail  接口代理ip 和端口号'),
	('common', '常规配置', 'orderDetail.noHttp.supported.wrapperIds', 'wapsunny000', 'cpc 详情 代理商接口调用控制'),
	('common', '常规配置', 'booking.com.proxy.submit', '10.89.36.25:7001', 'booking.com submit 接口代理'),
	('common', '常规配置', 'qta.promptA', '订单正在与酒店确认，预计需要15分钟，如您已到店，请耐心等待。', 'qta 文案A内容'),
	('common', '常规配置', 'qta.promptB', '您的订单已经提交成功，我们将尽快确认。', 'qta 文案B内容'),
	('common', '常规配置', 'qta.promptC', '酒店处理订单一般需要5-15分钟，如您已到店，请耐心等待，谢谢您的配合。', 'qta 文案C内容'),
	('common', '常规配置', 'qta.promptD', '酒店正在处理您的订单，如您已到店，请耐心等待5-15分钟，谢谢您的配合。', 'qta 文案D内容'),
	('common', '常规配置', 'qta.promptE', '请在${checkIn.month}月${checkIn.day}日${arriveTime}前到店，如晚到请提前联系酒店，${arriveTime}未到店酒店可能取消订单。酒店一般在14:00开始办理入住，早到可能需等待。', 'qta 文案E内容'),
	('common', '常规配置', 'qta.promptFPrePay', '房间为您保留到${checkout.month}月${checkout.day}日的中午12:00。酒店一般在14:00开始办理入住，早到可能需要等待。', 'qta 文案F 预付内容'),
	('common', '常规配置', 'qta.promptFCashGuara', '房间为您保留到${checkInNext.month}月${checkInNext.day}日的中午12:00。酒店一般在14:00开始办理入住，早到可能需要等待。', 'qta 文案F现付担保内容'),
	('common', '常规配置', 'qta.promptG', '请在${arriveTime}前到店，如晚到，请提前联系酒店，${arriveTime}未到店酒店可能取消订单。', 'qta 文案G内容'),
	('common', '常规配置', 'qta.promptHPrePay', '房间为您保留到${checkout.month}月${checkout.day}日的中午12:00。', 'qta 文案H 预付内容'),
	('common', '常规配置', 'qta.promptHCashGuara', '房间为您保留到${checkInNext.month}月${checkInNext.day}日的中午12:00。', 'qta 文案H现付担保内容'),
	('common', '常规配置', 'qta.promptFCashGuaraFirstNight', '房间为您保留到${checkInNext.month}月${checkInNext.day}日的中午12:00。酒店一般在14:00开始办理入住，早到可能需要等待。', 'qta 文案F现付担保内容'),