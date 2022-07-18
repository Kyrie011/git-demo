package com.gitdemo;

public class App 
{
	public void addData(String data) {
		System.out.println("Data "+data);
		if(data.equals(Constant.Data)) {
			System.out.println("Luffy's Grand Fleet");
		}
	}
	public void newMethod(){
		System.out.println("New Method");
	}
		
    public static void main( String[] args )
    {
//    	App obj = new App();
//    	
//    	obj.addData("Kaizoku orewa naaru");
    	
        System.out.println( "Hello World!" );
    }
}
