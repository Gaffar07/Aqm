package demo;


class demo
{
	public  synchronized void print(int n)
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(n*i);
		}
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class myfirst extends Thread
{
	demo d;
	myfirst(demo d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.print(2);
	}
}


class mysecond extends Thread
{
	demo d;
	mysecond(demo d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.print(5);
	}
}


public class test 
{

	public static void main(String[] args)
	{
		
		demo d=new demo();
		myfirst t1=new myfirst(d);
		
		mysecond t2=new mysecond(d);

		t1.start();
		t2.start();
	}

}
