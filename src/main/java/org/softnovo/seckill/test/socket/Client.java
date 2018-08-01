package org.softnovo.seckill.test.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		String msg = "cgm hello";
		
		try {
			Socket socket = new Socket("127.0.0.1", 8080);
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw.println(msg);
			pw.flush();
			
			String line = in.readLine();
			System.out.println("received from server : " + line);
			pw.close();
			in.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
