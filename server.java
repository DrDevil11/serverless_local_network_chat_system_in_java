package mcstry2;

import java.io.*; 
//import java.text.*; 
import java.util.*; 
import java.net.*; 
class server extends Thread  
{   
	final static LinkedList<userlist> uls=new LinkedList<userlist>();
    final ObjectInputStream dis; 
    final ObjectOutputStream dos; 
    final Socket s; 
      
  
    // Constructor 
    public server(Socket s, ObjectInputStream dis, ObjectOutputStream dos)  
    { 
        this.s = s; 
        this.dis = dis; 
        this.dos = dos; 
    } 
  
    @Override
    public void run()  
    { message m;
        while (true)  
        { 
            try {m=(message)dis.readObject();
                 if(m.gettype()==0)
                 {ene(m);}
                 else if(m.gettype()==1)
                 {rmu(m);}
                 else
                 {mssgcntr(m);}
                
            } catch (Exception e) { 
                e.printStackTrace(); 
            } 
        } 
          
       
    } 
    
    public void ene(message m)
	{userinfo a=new userinfo();
		uls.add(new userlist(m));
		
		getusernames.notifyall(a);
		
	}
    public void rmu(message m)
    { userlist a=new userlist();
        
         int i=1;
        while(i<=uls.size())
      {  a=uls.get(i);
          if(a.getip()==m.getip())
          {uls.remove(i);break;}
          i++;
      }
    }
     public void mssgcntr(message m)
     {userlist a=new userlist();
     
     int i=1;
    while(i<=uls.size())
  {  a=uls.get(i);
      if(a.getip()==m.getip())
      {uls.remove(i);
       filewriter f=new filewriter();
       f.fwr(m);
       a.setn();
       uls.add(i, a);
       break;
      }
      i++;
  }
    	 
     }
    public void resetn(message m)
    {
    	userlist a=new userlist();
       
        int i=1;
       while(i<=uls.size())
     {  a=uls.get(i);
         if(a.getip()==m.getip())
         {uls.remove(i);
          filereader f=new filereader();
          f.fr(a);  
          a.resetn();
          uls.add(i, a);
          break;
         }
         i++;
    }
}

    
} 
