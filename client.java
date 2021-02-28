package mcstry2;

import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
  
// Client class 
public class client  
{ 
    public static void cc() throws IOException  
    { 
        try
        {   String ip=new String();
            Scanner scn = new Scanner(System.in); 
            System.out.println("enter the username to send message ");
            String s=new String();
            s=scn.next();
            int i=1,c=0;
            scn.close();
            userlist a=new userlist();
            while(i<=usrls.uls.size())
          {  a=usrls.uls.get(i);
              if(s==a.getusrnm())
              {ip=a.getip();
              c++;
              break;
              }
              i++;
          }
            if(c==0)
            	System.out.println("username not found,retry ");
            else
            {
            	Socket ss=new Socket(ip,8888);
            	ObjectOutputStream o=new ObjectOutputStream(ss.getOutputStream());
            	System.out.println("enter message ");
            	message m=new message();
            	m.getmessage();
            	m.setusrnm(s, ip);
            	o.writeObject(m);
                filewriter f=new filewriter();
                f.fws(m);
                o.close();
                ss.close();
            }
        
        }catch(Exception e){ 
            e.printStackTrace(); 
        } 
    } 
} 
