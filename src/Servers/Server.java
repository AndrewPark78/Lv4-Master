package Servers;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public class Dealer{
		Socket s;
		public Dealer(Socket s){
			this.s = s;
		}
	}
	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(1337);
		Server s = new Server();
		while(1 != 0){
			Dealer d = new Dealer(listener.accept());
		}
	}
}
