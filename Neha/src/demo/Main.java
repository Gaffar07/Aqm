package demo;


class Simple
{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
}

   public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Simple s=new Simple();
     s.setI(10);
     int i=s.getI();
     System.out.println(i);
		
	}

}
