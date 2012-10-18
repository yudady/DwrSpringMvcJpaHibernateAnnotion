package com.tommy.classutils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ClassUtils;

/**
 * ComponentScanner package annotion ... scan classpath
 * 
 * @author Administrator
 * 
 */
public class ClassUtilsTest {

	private static Logger log = LoggerFactory.getLogger(ClassUtilsTest.class);

	/**
	 * package下有哪些class
	 */
	@Test
	public void ClassUtilsTest01() {
		String classNamesToString = ClassUtils
				.classNamesToString(ClassUtilsTest.class);
		log.debug("[LOG][classNamesToString]=" + classNamesToString);
	}
	@Test
	public void ClassUtilsTest02() {
		String name = ClassUtils.getDefaultClassLoader().getClass().getName();
		log.debug("[LOG][name]=" + name);
	}

}
