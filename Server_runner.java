package mcstry2;


	import java.io.*; 

	import java.net.*; 
	  
	// Server class 
	public class Server_runner 
	{ 
	    public static void ss() throws IOException  
	    {   System.out.println("inside server_runner ");
	        // server is listening on port 5056 
	        ServerSocket ss = new ServerSocket(8888); 
	          
	        // running infinite loop for getting 
	        // client request 
	        while (true)  
	        { 
	            Socket s = null; 
	              
	            try 
	            { 
	                // socket object to receive incoming client requests 
	                s = ss.accept(); 
	                  
	                System.out.println("A new client is connected : " + s); 
	                  
	                // obtaining input and out streams 
	                ObjectInputStream dis = new ObjectInputStream(s.getInputStream()); 
	                ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream()); 
	                  
	               // System.out.println("Assigning new thread for this client"); 
	  
	                // create a new thread object 
	                Thread t = new server(s, dis, dos); 
	  
	                // Invoking the start() method 
	                t.start(); 
	                  
	            } 
	            catch (Exception e){ 
	                s.close(); 
	                e.printStackTrace(); 
	            } 
	           finally
	           {ss.close();}
	        } 
	    } 
	

}
