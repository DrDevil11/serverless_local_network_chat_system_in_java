package mcstry2;

import java.util.Scanner;

public class programrunner {
	
	public static void main(String[] args)
	{System.out.println("hello,welcome ");
	  userinfo u=new userinfo();
	  System.out.println("out of userinfo ");
	  String s=new String();
	  usrls a=new usrls();
	  int c=1,d;
	  try {
	 getusernames.notifyall(u);
	  Thread t=new Serverthread();
	  t.start();
	     
	  Scanner scn=new Scanner(System.in);
	  do
	  {
	   System.out.println("enter \n1 to check new messages\n2 to send a message\n3 to notifyall\n4 to get users on network\n5 read messages\n0 to exit ");
	   c=scn.nextInt();
	   switch(c)
	   {
	   case 0:endingbroadcast.notifyallend(u);break;
	   case 1:
	          a.dsplymssgs();break;
	   case 2:client.cc();break;
	   case 3:getusernames.notifyall(u);break;
	   case 4:
		      a.dsplyusrs();break;
	   case 5:System.out.println("enter 1 to read all messages,2 to read user specific messages");
	           d=scn.nextInt();
	           filereader f=new filereader();
	           if(d==1)
	           {f.fr();}
	           else
	           {System.out.println("enter user name ");
	        	s=scn.next();
	        	userlist e=new userlist();
	            
	            int i=1;
	           while(i<=a.uls.size())
	         {  e=a.uls.get(i);
	             if(s==e.getusrnm())
	             {break;}
	             i++;
	         }
	           f.fr(e);
	           }break;
	  default:System.out.println("enter valid input");
   	   }
	  }while(c!=0);
	  System.out.println("bye");
	  scn.close();
	  } 
	catch(Exception e)
	{e.printStackTrace();
	System.out.println("program failed ");}
     
	
	
	}
}
	
