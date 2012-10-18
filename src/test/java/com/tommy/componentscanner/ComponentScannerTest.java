package com.tommy.componentscanner;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlRootElement;

import net.sf.extcos.ComponentQuery;
import net.sf.extcos.ComponentScanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * ComponentScanner package annotion ...
 * scan classpath
 * @author Administrator
 *
 */
public class ComponentScannerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("--setUpBeforeClass--------");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("---tearDownAfterClass-------");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("---setUp-------");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("--tearDown--------");
	}

	/**
	 * package下有哪些class
	 */
	@Test
	public void ComponentScannerTest01() {

		ComponentScanner scanner = new ComponentScanner();
		Set<Class<?>> samples = scanner.getClasses(new ComponentQuery() {

			@Override
			protected void query() {
				select().from("com.tommy");
			}

		});
		Iterator<Class<?>> clazz = samples.iterator();
		while (clazz.hasNext()) {
			Class<?> class1 = (Class<?>) clazz.next();
			System.out.println("[LOG]" + class1);
		}
		System.out.println("--testSayHello--------");
	}

	/**
	 * 實現序列化有哪些class
	 */
	@Test
	public void ComponentScannerTest02() {
		Set<Class<?>> samples = new ComponentScanner()
				.getClasses(new ComponentQuery() {

					@Override
					protected void query() {
						select().from("com.tommy").returning(
								allImplementing(Serializable.class));
					}

				});

		Iterator<Class<?>> clazz = samples.iterator();
		while (clazz.hasNext()) {
			Class<?> class1 = (Class<?>) clazz.next();
			System.out.println("[LOG]" + class1);
		}
		System.out.println("--testSayHello--------");
	}

	@Test
	public void ComponentScannerTest03() {

		final Set<Class<?>> samples = new HashSet<Class<?>>();

		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(new ComponentQuery() {

			@Override
			protected void query() {
				select().from("com.tommy").andStore(
						thoseAnnotatedWith(XmlRootElement.class).into(samples));

			}

		});

		Iterator<Class<?>> clazz = samples.iterator();
		while (clazz.hasNext()) {
			Class<?> class1 = (Class<?>) clazz.next();
			System.out.println("[LOG]" + class1);
		}
		System.out.println("--testSayHello--------");
	}

	@Test
	public void ComponentScannerTest03_1() {

		final Set<Class<?>> samples = new HashSet<Class<?>>();

		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(new ComponentQuery() {

			@Override
			protected void query() {
				select().from("com.tommy").andStore(
						thoseAnnotatedWith(Resource.class).into(samples));

			}

		});

		Iterator<Class<?>> clazz = samples.iterator();
		while (clazz.hasNext()) {
			Class<?> class1 = (Class<?>) clazz.next();
			System.out.println("[LOG]" + class1);
		}
		System.out.println("--testSayHello--------");
	}

	@Test
	public void ComponentScannerTest03_2() {

		final Set<Class<?>> samples = new HashSet<Class<?>>();

		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(new ComponentQuery() {

			@Override
			protected void query() {
				select().from("com.tommy")
						.andStore(
								thoseAnnotatedWith(
										org.springframework.stereotype.Controller.class)
										.into(samples));

			}

		});

		Iterator<Class<?>> clazz = samples.iterator();
		while (clazz.hasNext()) {
			Class<?> class1 = (Class<?>) clazz.next();
			System.out.println("[LOG]" + class1);
		}
		System.out.println("--testSayHello--------");
	}

	@Test
	public void ComponentScannerTest04() {

		ComponentScanner scanner = new ComponentScanner();

		Set<Class<?>> samples = scanner.getClasses(new ComponentQuery() {
			protected void query() {
				select().from("com.tommy").returning(
						allAnnotatedWith(RequestMapping.class));
			}
		});

		Iterator<Class<?>> clazz = samples.iterator();
		while (clazz.hasNext()) {
			Class<?> class1 = (Class<?>) clazz.next();
			System.out.println("[LOG]" + class1);
		}
		System.out.println("--testSayHello--------");
	}
	
	@Test
	public void ComponentScannerTest05() {

		final Set<Class<?>> samples = new HashSet<Class<?>>();

		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(new ComponentQuery() {

			@Override
			protected void query() {
				select().from("com.tommy").
				returning(
			            allAnnotatedWith(RequestMapping.class, withArgument(
			            key("value()"), value(""))));


			}

		});

		Iterator<Class<?>> clazz = samples.iterator();
		while (clazz.hasNext()) {
			Class<?> class1 = (Class<?>) clazz.next();
			System.out.println("[LOG]" + class1);
		}
		System.out.println("--testSayHello--------");
	}
}
