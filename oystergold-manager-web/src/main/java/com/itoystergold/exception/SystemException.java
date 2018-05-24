package com.itoystergold.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SystemException implements HandlerExceptionResolver{

	private static final Logger logger=LoggerFactory.getLogger(SystemException.class);
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception exception) {
		//打印控制台
		exception.printStackTrace();
		//写日志
/*		logger.debug("测试输出的日志。。。。。。。。。。");
		logger.info("系统发生异常了。。。。。。。。。。");
		logger.error("系统发生异常", exception);*/
		//发送邮件、发短信
		//使用jmail工具包
		//显示错误页面
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("error/exception");
		return modelAndView;
	}

}
