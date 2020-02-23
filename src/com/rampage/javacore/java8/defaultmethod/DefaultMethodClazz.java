package com.rampage.javacore.java8.defaultmethod;

public class DefaultMethodClazz implements Interface1, Interface2 {
	
	public static void main(String[] args) {
		DefaultMethodClazz defaultMethodClazz = new DefaultMethodClazz();
		defaultMethodClazz.defaultMethod();
		// DefaultMethodClazz.staticMethod();  // The method staticMethod() is undefined for the type DefaultMethodClazz
		Interface2.staticMethod();
	}

	
	/**
	 * TIPS: 
	 * 1. 如果一个类继承了两个接口，而两个接口中有相同的两个方法，那么该类必须override该方法，否则会报错  （所谓的Diamond problem）
	 *    必须这样的原因在于default方法设计的初衷是为了在java8中实现stream，而如果给每个集合类添加该方法会比较麻烦,
	 *    最好的实现就是通过default方法在接口中实现，使得实现类自动包含该方法
	 *    
	 */
	@Override
	public void defaultMethod() {
		Interface1.super.defaultMethod();
	}
}
