package controller;

public class Thread_Id extends Thread{

	public Thread_Id() {
		
	}
	
	public void run () {
		System.out.println("Thread #" + getId());
	}

}
