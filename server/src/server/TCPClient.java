package server;

import java.io.*;
import java.net.*;

class TCPClient

{
	public static void main(String argv[]) throws Exception

	{
		String sentence;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		//modtager sætningen fra bruger
		Socket clientSocket = new Socket("172.17.165.98", 6789); //laver en socket
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		//
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));
		sentence = inFromUser.readLine();
		outToServer.writeBytes(sentence + '\n');
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER: " + modifiedSentence);
		clientSocket.close();
	}
}