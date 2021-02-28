package mcstry2;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileWriter; 
//import java.io.IOException;
import java.io.ObjectOutputStream; 
class filewriter 
{ 
    public void fwr(message m) 
    { try {
        FileOutputStream f=new FileOutputStream("abc.dat");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(m);
        o.close();
        f.close();
    }
    catch(Exception e)
    {e.printStackTrace();}
    }
    public void fws(message m) 
    { try {
        FileOutputStream f=new FileOutputStream("abcd.dat");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(m);
        o.close();
        f.close();
    }
    catch(Exception e)
    {e.printStackTrace();}
    }

}