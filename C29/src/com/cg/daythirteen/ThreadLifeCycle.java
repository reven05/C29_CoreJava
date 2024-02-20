package com.cg.daythirteen;

public class ThreadLifeCycle extends Thread {
	public void run() {
		System.out.println("Inside Run Method Thread is Alive or Not?"+this.isAlive());
		int num =0;
		while (num < 4) {
			num++;
			System.out.println("Num= "+num );
			try {
				sleep(1000);
				System.out.println("In non runnable stage, Thread is Alive or Not?"+this.isAlive());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t = new ThreadLifeCycle();
		System.out.println("Before Running, Thread is Alive or Not?"+t.isAlive());
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After Complete Excution, Thread is Alive or Not?"+t.isAlive());
	}

}
