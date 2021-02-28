package mcstry2;

public class Serverthread extends Thread 
{
public void run()
{
try {
Server_runner.ss();	
}
catch(Exception e)
{e.printStackTrace();}
}

}
