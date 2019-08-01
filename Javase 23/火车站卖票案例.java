package cn.offcn.demo;

public class TicketDemo {
	
	public static void main(String[] args) {
		
		
		Ticket t1=new Ticket("A����");
		Ticket t2=new Ticket("B����");
		Ticket t3=new Ticket("C����");
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	

}

class Ticket extends Thread{
	
	static int index=100;
	
	public Ticket(String name) {
		super(name);
		
	}
	public void run() {
		
		while(true) {
			synchronized (Ticket.class) {
				
				if(index<1) {
					break;
				}
				
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				index--;
				System.out.println(getName()+"����1��Ʊ,��ʣ��"+index);
			}
			
		}
		
	}
	
}

