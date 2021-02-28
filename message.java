package mcstry2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class message {
	String usrname=new String();
	String ip=new String();
	int type=2;
	String d;
	String t;
	String m=new String();
	public void  getmessage()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter message ");
		m=scn.next();
		Date date=new Date();
		DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd"); 
	    DateFormat fortime = new SimpleDateFormat("hh:mm:ss"); 
		d=fordate.format(date);
		t=fortime.format(date);
	    scn.close();
	}
	public void setusrnm(String a,String b)
	{
		usrname=a;
		ip=d;
	}
	public void settype0()
	{type=0;}
	public void settype1()
	{type=1;}
   public int gettype()
   {return type;}
   public String getusrnm()
   {return usrname;}
   public String getip()
   {return ip;}
   
}
