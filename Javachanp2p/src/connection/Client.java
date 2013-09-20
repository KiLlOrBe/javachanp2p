package connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client implements Runnable{

	public Client(String IP, int port) throws UnknownHostException, IOException{
		System.out.println("Demande de connexion au " + IP + " port:"+ port);
		socket = new Socket(IP, port);
		out = socket.getOutputStream();
		in = socket.getInputStream();
		System.out.println("Connexion �tablie avec le serveur, authentification");
	}
	
	private Socket socket;
	private OutputStream out;
	private InputStream in;
	
	@Override
	public void run(){

			Thread t1 = new Thread(new Connection(in, out));
			t1.start();

	}
}