package mcstry2;

import java.io.*;
import java.net.Socket;

public class getusernames {
	
	public static void  notifyall(userinfo u)
	{  System.out.println("broadcast ");
		int c=0;
	String ip=u.getip();
	String broadcastadd=new String();
	for(int i=0;i<ip.length();i++)
	{  
		if(c<4)
			{if(ip.charAt(i)=='.')
			    c++;
			    broadcastadd=broadcastadd + ip.charAt(i);
			}   
		else
			{broadcastadd=broadcastadd + "255";
		      break;}
	}
	try{Socket s = new Socket(broadcastadd,8888);
	ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream()); 
    message ts=new message();
    ts.settype0();
    ts.setusrnm(u.getusernm(),u.getip());
    System.out.println("closing resources ");
    dos.writeObject(ts);
      dos.close();
       s.close();
	}
	catch(Exception e)
	{e.printStackTrace();}
  }	
 
	
}
