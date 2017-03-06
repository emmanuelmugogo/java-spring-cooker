package org.wecancodeit.spring.kitchen.cooking;

import org.springframework.stereotype.Component;
import org.wecancodeit.spring.kitchen.Appliance;
import org.wecancodeit.spring.kitchen.Cooker;

@Component
public class Microwave extends Appliance implements Cooker {

	@Override
	public void cook() {
		System.out.println("Cooking by spinning polar molecules!");
	}
	
}
