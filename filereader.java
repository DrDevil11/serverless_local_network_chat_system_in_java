package mcstry2;
import java.io.EOFException;
import java.io.FileInputStream;
//import java.io.FileNotFoundException; 
//import java.io.FileReader; 
//import java.io.IOException;
import java.io.ObjectInputStream; 
class filereader
{ 
    public  void fr(userlist u) 
    { int count=0;
       message m;
       try { 
       FileInputStream f=new FileInputStream("abc.dat");
        ObjectInputStream o=new ObjectInputStream(f);
     
       
        while(count<u.getn())
        {
        	try {m=(message)o.readObject();
                 if(m.getusrnm()==u.getusrnm()) 
                 { 
                	System.out.println(count++ + ":"+m+"\n");
                    
                 }
        		
        	     }
        	catch(EOFException e)
        	{
        		e.printStackTrace();
        		break;
        	}
        	catch(Exception e)
        	{e.printStackTrace();}
              
        	
        	
        }
        o.close();
        f.close();
       }
       catch(Exception e)
       {e.printStackTrace();}
       } 
       
    public  void fr() 
    { int count=0;
       message m;
       try {
       FileInputStream f=new FileInputStream("abc.dat");
        ObjectInputStream o=new ObjectInputStream(f);
        while(true)
        {
        	try {m=(message)o.readObject();
                 
                 
                	System.out.println(count++ + ":"+m+"\n");
                     }
        	catch(EOFException e)
        	{
        		e.printStackTrace();
        		break;
        	}
        	catch(Exception e)
        	{e.printStackTrace();}
              
        	
        	
        }
        o.close();
        f.close();
      }
       catch(Exception e)
       {e.printStackTrace();}
       
    }
    public  void frs() 
    { int count=0;
       message m;
       try {
       FileInputStream f=new FileInputStream("abcd.dat");
        ObjectInputStream o=new ObjectInputStream(f);
        while(true)
        {
        	try {m=(message)o.readObject();
                 
                 
                	System.out.println(count++ + ":"+m+"\n");
                     }
        	catch(EOFException e)
        	{
        		e.printStackTrace();
        		break;
        	}
        	catch(Exception e)
        	{e.printStackTrace();}
              
        	
        	
        }
        o.close();
        f.close();
      }
       catch(Exception e)
       {e.printStackTrace();}
       
    }


} 