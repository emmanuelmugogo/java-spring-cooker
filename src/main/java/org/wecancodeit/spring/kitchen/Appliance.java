package org.wecancodeit.spring.kitchen;

public abstract class Appliance {

	public void powerOn() {
		System.out.println("Turning on the power for " + getClass().getSimpleName());
	}

}
