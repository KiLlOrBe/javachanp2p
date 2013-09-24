package connection;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import data.IdentiteReseau;
import data.Message;


public class ChatRoom {
	public ChatRoom(String IP, int port, IdentiteReseau id){
		this.id = id;
		this.connections = new ArrayList<Connection>();
		this.identites = new ArrayList<IdentiteReseau>();
		try {
			Thread t = new Thread(new Client(IP,port, this));
			t.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		Thread srv = new Thread(new Serveur(id.getPort(),this));
		srv.run();
	}
	
	private IdentiteReseau id;
	private ArrayList<Connection> connections;
	private ArrayList<IdentiteReseau> identites;
	
	
	public void addMessage(Message msg){
		
	}

	public void addIdentite(Connection connection, IdentiteReseau identite){
		connections.add(connection);
		identites.add(identite);
		System.out.println("id : "+ identite.getPseudo() + " ip : " + identite.getIP() + " port : " + identite.getPort());
	}
	
	public void sendMessage(Message msg){
		for(int i = 0 ; i < connections.size(); i++){
			try {
				connections.get(i).sendMessage(msg);
			} catch (IOException e) {
				//probleme avec cette connection ? test puis retrer possible de la liste
			}
		}
	}

	public IdentiteReseau getIdentite() {
		return id;
	}
}
