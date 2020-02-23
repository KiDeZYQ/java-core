package com.rampage.javacore.java8.defaultmethod;

public interface Interface2 {
	
	int value = 2;
	
	default void defaultMethod() {
		System.out.println("Interface2#sameMethod");
	}
	
	/**
	 * TIPS: 
	 * 2. interface中的static方法只属于该接口，不属于任何该接口的实现类 调用的时候必须使用接口名称前缀
	 */
	static void staticMethod() {
		System.out.println("Interface2#staticMethod");
	}
	
	/**
	 * TIPS: 
	 * 3. This static method cannot hide the instance method from Object
	 * 	接口的static/default方法不能override Object带的方法
	 * @return
	 */
	/**
	 * static/default String toString() {
		
	}  */
}
