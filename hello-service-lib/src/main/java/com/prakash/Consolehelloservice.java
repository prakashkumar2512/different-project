package com.prakash;

public class Consolehelloservice implements Helloservice {

	public String prefix;
	public String suffix;
	
	
	public Consolehelloservice() {
		this(null,null);
	}
	
	public Consolehelloservice(String prefix,String suffix) {
		this.prefix = prefix!=null ? prefix : "Hello";
		this.suffix = suffix!=null ? suffix : "!!!";
	}
	
	public void sayhello(String name) {
		System.out.println(this.prefix + "" + name + "" + this.suffix );

	}

}
