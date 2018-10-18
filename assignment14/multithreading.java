class mythread extends Thread
{
	private int start=0;
	private int end=0;
	mythread(int start,int end)
	{
		this.start=start;
		this.end=end;
		
	}
	public void run()
	{
	count();	
	}
   public synchronized  void count()
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}
	}
}
class Multithread
{

	public static void main(String[] args) throws InterruptedException 
	{
		mythread t1 = new mythread(0,500);
		t1.start();
		t1.sleep(10);
		mythread t2 = new mythread(500,1000);
		t2.start();

	}

}