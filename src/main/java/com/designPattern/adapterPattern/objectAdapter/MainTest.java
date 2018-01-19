package com.designPattern.adapterPattern.objectAdapter;

/***
 * 测试对象适配器
 * 
 * @author liuzhihu
 *
 */
public class MainTest {

	public static void main(String[] args) {
		Robot robot = new Robot();

		DogAdapter adapter = new DogAdapter(robot);

		adapter.isAnimal();

	}

}
