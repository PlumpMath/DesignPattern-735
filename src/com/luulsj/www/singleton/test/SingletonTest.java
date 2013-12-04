package com.luulsj.www.singleton.test;

import org.junit.Test;

import com.luulsj.www.singleton.God1;
import com.luulsj.www.singleton.God2;

public class SingletonTest {

	@Test
	public void testGod1() {
		God1 god1_1 = God1.getInstance();
		God1 god1_2 = God1.getInstance();
		System.out.println(god1_1 == god1_2);
	}
	
	@Test
	public void testGod2(){
		God2 god2_1 = God2.getInstance();
		God2 god2_2 = God2.getInstance();
		System.out.println(god2_1 == god2_2);
	}

}
