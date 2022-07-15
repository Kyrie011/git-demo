package com.gitdemo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("Data "+data);
	}
    public static void main( String[] args )
    {
    	App obj = new App();
    	
    	obj.addData("Kaizoku orewa naaru");
    	
        System.out.println( "Hello World!" );
    }
}
