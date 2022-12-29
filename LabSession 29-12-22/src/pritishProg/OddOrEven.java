package pritishProg;

public class OddOrEven implements Runnable
 {
	private int number;
        public OddOrEven(int number)
    {
        this.number = number;
    }
   public void run() 
    {
        if (number % 2 == 0)
      {
            System.out.println(number + " Is An Even Number.");
        }
   else 
     {
       System.out.println(number + " Is An Odd Number.");
     }
   }
 public static void main(String[] args) 
   {
      Thread t1 = new Thread(new OddOrEven(1));
      t1.start();

      Thread t2 = new Thread(new OddOrEven(2));
      t2.start();
    }
}
