package mcstry2;
import java.net.InetAddress;
import java.util.*;
public class userinfo {
static String username;
static String ip;

public userinfo()
{

Scanner scn=new Scanner(System.in);
System.out.println("enter usrname ");
username=scn.next();
try {
InetAddress i=InetAddress.getLocalHost();
ip=i.getHostAddress();
System.out.println("your ip= "+ip);
}
catch(Exception e)
{
e.printStackTrace();	
}

scn.close();
}
public String getusernm()
{return username;}
public String getip()
{return ip;}
}


