package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int value = foo("HelloWorld");
        System.out.println(value);
    }

    public static int foo(String string){
        return bar(string.length());
    }

    public static int bar(int length){
        if(length == 1)
            return length;
        return bar(length - 1) * length;
    }
}
