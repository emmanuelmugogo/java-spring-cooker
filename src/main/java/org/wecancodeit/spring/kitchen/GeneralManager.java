package org.wecancodeit.spring.kitchen;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * The @Component annotation marks this as a dependency that will be created and
 * managed by Spring, allowing us to <i>inject</i> it elsewhere.
 */
@Component
public class GeneralManager {

	/**
	 * This tells Spring to inject all instances of {@link Appliance} that it
	 * knows about. Polymorphism, yay!
	 */
	@Resource
	private Collection<Appliance> appliances;

	public void turnPowerOn() {
		System.out.println("I'm turning the power on so we can get cooking!");

		for (Appliance currentAppliance : appliances) {
			currentAppliance.powerOn();
		}
	}

}
