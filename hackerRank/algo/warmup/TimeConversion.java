package hackerRank.algo.warmup;

import java.util.*;

public class TimeConversion {
	
	@SuppressWarnings("resource")
	public String readString()
	{
		Scanner in = new Scanner(System.in);
		String time = in.next();
		String minSec = time.substring(2,time.length()-2);
		String period = time.substring(time.length()-2, time.length());
		String hour = time.substring(0, 2);
		int numHour = Integer.parseInt(hour);
		
		if("PM".equals(period))
		{
			if(numHour == 12)
			{
				String output = Integer.toString(numHour);
				return  output + minSec;
			}
			else
			{
				numHour = 12 + numHour;
				String output = Integer.toString(numHour);
				return  output + minSec;
			}
		}
		else
		{
			if(numHour == 12)
			{
				numHour = 0;
				return "0" + numHour + minSec;
			}
			else	
				return hour + minSec;
		}
	}
    
}
