package OneMoreSoket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

class tcpClient extends javax.swing.JFrame {

    private Socket socket;
    private BufferedReader inputReader;
    private PrintWriter outputWriter;

    public tcpClient() {
        connectToServer();
    }

    private void connectToServer() {
        try {
            socket = new Socket(InetAddress.getByName("localhost"), 25565);
            inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outputWriter = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread() {
            @Override
            public void run() {
                receiveData();
            }
        }.start();
    }

    private void receiveData() {
        try {
            while (true) {
                System.out.println(inputReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendData(String messageToSend) {
        outputWriter.println(messageToSend);
    }

    public void closeSocket() {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                tcpClient client = new tcpClient();
                client.sendData("print2all Hi");
                client.closeSocket();
            }
        });
    }
}