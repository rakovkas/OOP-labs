package week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatApplication {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ChatClient <username> <serverIP>");
            System.exit(1);
        }

        String username = args[0];
        String serverIP = args[1];
        int serverPort = 5555;

        try (Socket socket = new Socket(serverIP, serverPort);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {

            writer.println(username);

            Thread receiveThread = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = reader.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();

            String clientMessage;
            while ((clientMessage = consoleReader.readLine()) != null) {
                writer.println(clientMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
