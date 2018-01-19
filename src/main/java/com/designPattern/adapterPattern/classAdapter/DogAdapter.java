package com.designPattern.adapterPattern.classAdapter;

public class DogAdapter extends Robot implements Animal {

	@Override
	public void isAnimal() {
		isToy();
	}

}
