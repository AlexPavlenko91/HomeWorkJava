package ServerClientSocets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class MyServer {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1000)) {
            runServer(serverSocket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void runServer(ServerSocket serverSocket) {
        while (!serverSocket.isClosed()) {

                new Thread(() -> {
                    try (
                            Socket clientSocket = serverSocket.accept();
                            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)//flush - немедленная отправка данных
                    ) {
                        String hostName = clientSocket.getInetAddress().getHostName();
                        System.out.println("Connection at " + hostName);//<<<<
                        writer.println("This is echo server. Type Bye to exit");//>>>>
                        String inputLine;
                        while ((inputLine = reader.readLine()) != null) {//<<<<<<< постоянно считываем данные клиента
                            System.out.println(LocalTime.now() + " " + inputLine);//<<<<
                            writer.println(inputLine);//<<<<
                            if (inputLine.equalsIgnoreCase("bye")) {
                                break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();

        }
    }


}

