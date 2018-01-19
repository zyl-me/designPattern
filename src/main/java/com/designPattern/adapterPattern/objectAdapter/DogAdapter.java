package com.designPattern.adapterPattern.objectAdapter;

/***
 * 对象适配器
 * 
 * @author liuzhihu
 *
 */
public class DogAdapter implements Animal {

	private Toy toy;

	public DogAdapter(Toy toy) {
		this.toy = toy;
	}

	@Override
	public void isAnimal() {

		toy.isToy();

	}

}
