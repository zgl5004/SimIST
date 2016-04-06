/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author kjrya
 */
public class ServerNetworking 
{
    public static void main(String[] args) throws Exception
    {
        String incomingData;
        String capIncomingData;
        ServerSocket welcomeSocket = new ServerSocket(5555);
        
        while(true){
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader incoming = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outgoing = new DataOutputStream(connectionSocket.getOutputStream());
            incomingData = incoming.readLine();
            capIncomingData = incomingData.toUpperCase() + '\n';
            outgoing.writeBytes(capIncomingData);
        }
    }
}
