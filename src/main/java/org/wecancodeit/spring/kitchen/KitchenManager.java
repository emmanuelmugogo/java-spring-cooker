package org.wecancodeit.spring.kitchen;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * The @Component annotation marks this as a dependency that will be created and
 * managed by Spring, allowing us to <i>inject</i> it elsewhere.
 */
@Component
public class KitchenManager {

	/**
	 * This tells Spring to inject all instances of {@link Cooker} that it
	 * knows about. Polymorphism, yay!
	 */
	@Resource
	private Collection<Cooker> cookers;

	public void cookAllTheThings() {
		System.out.println("I'm doing the cooking!");
		
		for(Cooker currentCooker: cookers) {
			currentCooker.cook();
		}
	}

}
