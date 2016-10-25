package calendar;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Date dt = new Date();
	    
	 	Calendar c = new GregorianCalendar();
	    c.setTime(dt);
	    
	    String result = "TO_DATE('";
	    if(c.get(c.DAY_OF_MONTH)>=10){
	    	result = result + c.get(c.DAY_OF_MONTH)+"/";
	    }
	    else result = result + "0" + c.get(c.DAY_OF_MONTH)+"/";
	    if(c.get(c.MONTH)>=10){
	    	result = result + c.get(c.MONTH)+"/";
	    }
	    else result = result + "0" + c.get(c.MONTH)+"/";
	    
	    result = result + c.get(c.YEAR) + " " + c.get(c.HOUR) + ":";
	    
	    if(c.get(c.MINUTE)>=10){
	    	result = result + c.get(c.MINUTE)+":";
	    }
	    else result = result + "0" + c.get(c.MINUTE)+":";
	    if(c.get(c.SECOND)>=10){
	    	result = result + c.get(c.SECOND);
	    }
	    else result = result + "0" + c.get(c.SECOND);

	    result = result + "', 'dd/mm/yyyy HH:MI:SS')";
	    
	    System.out.println(result);
	    
	    String näide =  "TO_DATE('21/07/2015 8:30:25', 'dd/mm/yyyy HH:MI:SS')";
	    
	    
	}
	
}
