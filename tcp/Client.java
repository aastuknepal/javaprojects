import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);
            
            Scanner serverScanner = new Scanner(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            
            while(true) {
                String clientMessage = scanner.nextLine();
                System.out.println("client: " + clientMessage);
                writer.println(clientMessage);
                writer.flush();
                
                String serverMessage = serverScanner.nextLine();
                
                System.out.println("server: " + serverMessage);
                
                
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}

