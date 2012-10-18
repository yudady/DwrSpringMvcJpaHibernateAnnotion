package com.tommy.dwr.service;

import org.apache.log4j.Logger;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Service enables the class to be used as a Spring service
 * @RemoteProxy enables the class to be used as a DWR service
 * @Transactional enables transaction support for this clas
 */
@Service("springService")
@RemoteProxy(name="dwrService")
@Transactional
public class ArithmeticService {
	
	protected static Logger logger = Logger.getLogger("service");
	
	/**
	 * @RemoteMethod exposes this method to DWR.
	 * Your JSP pages can access this method as Javascript
	 * Your Spring beans can still access this method.
	 */
	@RemoteMethod
	public Integer add(Integer operand1, Integer operand2) {
		logger.debug("[LOG]Adding two numbers");
		// A simple arithmetic addition
		return operand1 + operand2;
	}
	
}
