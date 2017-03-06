package org.wecancodeit.spring.kitchen;

import javax.annotation.Resource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class KitchenApplication {

	/**
	 * The <code>try</code> below is called a <a href=
	 * "https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html">try-with-resources</a>
	 * statement. It ensures that whatever resources (files, streams, etc) that
	 * are opened get closed. Don't get hung up on it -- focus on how the context is used for now.
	 */
	public static void main(String[] args) {
		
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(
				KitchenApplication.class)) {

			KitchenApplication application = context.getBean(KitchenApplication.class);
			application.doThingsInTheKitchen();

		}
	}

	/**
	 * This is a dependency injected by Spring.
	 */
	@Resource
	private GeneralManager generalMgr;
	
	/**
	 * … and so is this.
	 */
	@Resource
	private KitchenManager kitchenMgr;
	
	/**
	 * This isn't static. It's an instance method.
	 */
	public void doThingsInTheKitchen() {
	
		System.out.println("Telling the GM to turn the power on.");
		generalMgr.turnPowerOn();
		
		System.out.println();
		System.out.println("Telling the kitchen manager to get cooking.");
		kitchenMgr.cookAllTheThings();
	}
}
