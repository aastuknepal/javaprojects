package tcp;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class MsgServer{
    public static void main(String[] args) {
        try {
            
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("Server waiting for client to connect");
        
        Socket socket = ss.accept();
        System.out.println("client connected");
        
        Scanner clientScanner = new Scanner(socket.getInputStream());
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String clientMessage = clientScanner.nextLine();
            System.out.println("client: " + clientMessage);
            
            String serverMessage = scanner.nextLine();
            System.out.println("Server: " + serverMessage);
            writer.println(serverMessage);
            writer.flush();
            
        }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
