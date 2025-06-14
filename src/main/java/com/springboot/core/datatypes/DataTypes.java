package com.springboot.core.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		
		// 1Byte = 8 bits
		byte b=-128;
		byte b1=127;
		// byte b2=128;
		
		System.out.println("\nByte Details: ");
		System.out.println("Min: "+Byte.MIN_VALUE);
		System.out.println("Max: "+Byte.MAX_VALUE);
		System.out.println(Byte.SIZE/8+" Bytes");
		
		System.out.println("\nCharacte Details: ");
		System.out.println("Min: "+Character.MIN_VALUE);
		System.out.println("Max: "+Character.MAX_VALUE);
		System.out.println(Character.SIZE/8+" Bytes");
		
		short s1=-32768;
		short s2=32767;
		// short b3=32768;
		
		System.out.println("\nShort Details: ");
		System.out.println("Min: "+Short.MIN_VALUE);
		System.out.println("Max: "+Short.MAX_VALUE);
		System.out.println(Short.SIZE/8+" Byte");
		
		int i1=-2147483648;
		int i2=2147483647;
		//int i3=2147483648;
		
		System.out.println("\nint Details: ");
		System.out.println("Min: "+Integer.MIN_VALUE);
		System.out.println("Max: "+Integer.MAX_VALUE);
		System.out.println("Max: "+Integer.SIZE/8+" Bytes");
		
		long l1=-9223372036854775808L;
		long l2=9223372036854775807L;
		//long l3=92233720368547758071L;
		
		//long doen't allow manually assigning value give L at last
		
		System.out.println("\nlong Details: ");
		System.out.println("Min: "+Long.MIN_VALUE);
		System.out.println("Max: "+Long.MAX_VALUE);
		System.out.println("Max: "+Long.SIZE/8+" Bytes");
		
		System.out.println("\nfloat Details: ");
		System.out.println("Min: "+Float.MIN_VALUE);
		System.out.println("Max: "+Float.MAX_VALUE);
		System.out.println("Max: "+Float.SIZE/8+" Bytes");
		
		System.out.println("\ndouble Details: ");
		System.out.println("Min: "+Double.MIN_VALUE);
		System.out.println("Max: "+Double.MAX_VALUE);
		System.out.println("Min: "+Double.SIZE/8+" Bytes");

		char ch = (int) 59999;
		System.out.println(ch);

		
		//maximum values present in below data types
		System.out.println();
		byte b4=127;
		short s4=32767;
		int i4=2147483647;
		long l4=9223372036854775807l;
		float f1=3.4028235E38f;
		double d4=1.7976931348623157E308;
		boolean bb=true;
		boolean bb1=false;
		
		System.out.println("byte: "+b4);
		System.out.println("short: "+s4);
		System.out.println("int: "+i4);
		System.out.println("long: "+l4);
		System.out.println("float: "+f1);
		System.out.println("double: "+d4);
		System.out.println("boolean: "+bb);
		System.out.println("boolean: "+bb1);
		
	}
}
