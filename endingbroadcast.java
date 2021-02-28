package mcstry2;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class endingbroadcast {
	public static void  notifyallend(userinfo u)
	{  int c=0;
	String ip=u.getip();
	String broadcastadd=new String();
	for(int i=0;i<ip.length();i++)
	{  
		if(c<3)
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
    ts.settype1();
    ts.setusrnm(u.getusernm(),u.getip());
    dos.writeObject(ts);
      dos.close();
       s.close();
	}
	catch(Exception e)
	{e.printStackTrace();}
  }	
 
}
