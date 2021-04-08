package OneMoreSoket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TCPServer {

    private int serverPort = 25565;
    private ServerSocket serverSocket;
    private List<ConnectionService> connections = new ArrayList<ConnectionService>();

    public TCPServer() {
        try {
            serverSocket = new ServerSocket(serverPort);
            System.out.println("Waiting...");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connected: " + socket);
                ConnectionService service = new ConnectionService(socket);
                service.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new TCPServer();
    }

    class ConnectionService extends Thread {

        private Socket socket;
        private BufferedReader inputReader;
        private PrintWriter outputWriter;
        //private String username;

        public ConnectionService(Socket socket) {
            this.socket = socket;
            try {
                inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                outputWriter = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        @Override
        public void run() {
            while (true) {
                try {
                    String receivedMessage = inputReader.readLine();
                    System.out.println(receivedMessage);
                    StringTokenizer stoken = new StringTokenizer(receivedMessage);
                    String fargument = stoken.nextToken();
                    if (fargument.equals("print2all")) {
                        this.sendToAnyone(stoken.nextToken());
                    }
                } catch (IOException ex) {
                    Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                } finally {
                    outputWriter.close();
                }

            }
        }

        protected void sendMessage(String message) {
            outputWriter.println(message);
        }

        private void sendToAnyone(String message) {

            for (ConnectionService connection : connections) {
                connection.sendMessage(message);
            }
        }
    }
}