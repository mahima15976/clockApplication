package clock;

public class Time2Application {

	public static void main(String[] args)
	   {
		 try
	      {
	         Time2 t = new Time2(27, 74, 99); // invalid values
	      } catch (IllegalArgumentException e) {
			// TODO: handle exception
			 System.out.println("Invalid time values given");
		}
		 
		 Time2 t1 = new Time2(18, 37); //6.37pm
		 System.out.println("Time: "+t1.toString());
		 
		 Time2 t2= new Time2(8,23); 

		 System.out.print("The Time difference in seconds is: "+t1.difference(t2));
	   }
}
