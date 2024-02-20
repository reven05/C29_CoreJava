//program to demonstrate creating thread using thread class
package com.cg.daythirteen;

public class ChildThread extends Thread{
	int n;
	String msg;
	
	//parameterized constructor
	public ChildThread(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=n; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg + i);
		}
	}
	
	

}
