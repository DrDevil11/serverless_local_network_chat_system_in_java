package mcstry2;

import java.util.LinkedList;

public class usrls {
	final static LinkedList<userlist> uls=new LinkedList<userlist>();
	
	 public void ene(message m)
	{
		uls.add(new userlist(m));
		
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
          a.resetn();
          uls.add(i, a);
          break;
         }
         i++;
    }
    }
   public void dsplymssgs()
   {
	   userlist a=new userlist();
       
       int i=1;
      while(i<=uls.size())
    {  a=uls.get(i);
        if(a.getn()>0)
        {System.out.println(a.getusrnm());
         System.out.println(a.getn());
         break;
        }
        i++;
    }
}
   public void dsplyusrs()
   {
	   userlist a=new userlist();
       
       int i=1;
      while(i<=uls.size())
    {  a=uls.get(i);
        
         System.out.println(a.getusrnm());
         System.out.println(a.getip());
         
        
        i++;
    }
}

}
