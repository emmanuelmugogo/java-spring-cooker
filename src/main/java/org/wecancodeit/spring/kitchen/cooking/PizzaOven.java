package org.wecancodeit.spring.kitchen.cooking;

import org.springframework.stereotype.Component;
import org.wecancodeit.spring.kitchen.Cooker;

@Component
public class PizzaOven implements Cooker {

	@Override
	public void cook() {
		System.out.println("Baking pizzas over burning wood!");
	}
	
}
