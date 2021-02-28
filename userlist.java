package mcstry2;

public class userlist {
	String u;
	String ip;
	int n;
	public userlist()
	{}
	public userlist(message m)
	{   
		u=m.getusrnm();
		ip=m.getip();
        n=0;
	}
    public  void setn()
    {
    	n++;
    }
	public void resetn()
	{n=0;}
    public int getn()
    {return n;}
   public String getip()
   {
	   return ip;
   }
   public String getusrnm()
   {  return u;  }
   
}
