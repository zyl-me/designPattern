package com.designPattern.adapterPattern.objectAdapter;

/***
 * 机器人
 * 
 * @author liuzhihu
 *
 */
public class Robot implements Toy {

	@Override
	public void isToy() {

		System.out.println("是玩具。。。。。。");

	}

}
