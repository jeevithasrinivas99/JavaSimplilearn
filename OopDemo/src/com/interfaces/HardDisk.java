package com.interfaces;

public interface HardDisk {
	public int size();
	
	
	public String speed();

	

public default  String  hardDiskType() { // java8
	
	return "magnetic disk";
	
}

public static String  weight() {
	
		return "100gm";
	
}
}

