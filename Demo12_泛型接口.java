package com.ujiuye.demos;

public class Demo12_·ºÐÍ½Ó¿Ú {

}

interface Inter<W> {
	public abstract void test(W w);
}

class MyImpl3<String> implements Inter<String> {
	@Override
	public void test(String w) {
//		System.out.println(w.len);
	}
}

class MyImpl2<R> implements Inter<R> {

	@Override
	public void test(R w) {

	}
}

class MyImpl implements Inter<String> {

	@Override
	public void test(String w) {
		System.out.println(w.length());
	}
}
