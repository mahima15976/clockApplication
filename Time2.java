package clock;

import java.util.Comparator;


public class Time2 implements Comparator<Time2> //comparator
	{
          
          private int hr;   
          private int min;  
          private int sec; 
          
		public void setTime(int hr, int min, int sec)
          {
		if((hr>=0 && hr<24) && (min>=0 && min<60) && (sec>=0&&sec<60))
		{
                  this.hr = hr;
                  this.min = min;
                  this.sec = sec;
		} 
		else	
                  throw new IllegalArgumentException("Hr, Min, Sec incorrect range");
          }
          public String toUniversalString()
          {
              return String.format("%02d:%02d:%02d", hr, min, sec);
          } 
          public String toString()
          {
              return String.format("%d:%02d:%02d %s",
					((hr==0 || hr==12)?12 : hr%12), min, sec, (hr<12? "am":"pm"));
			
          } 
          public int compare(Time2 time1, Time2 time2) 
          {
             
		int a=time1.hr * 3600 + time1.min * 60 + time1.sec;
		int b=time2.hr * 3600 + time2.min * 60 + time2.sec;
		if(a>b)
		{
                  return 1;
		}
              else if(a<b)
		{
                  return -1;
		}
              else 
              {
                  return 0;
		}
          }
	} //end of class Time1



