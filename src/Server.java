import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server is starting...");

        try{
            //Server socket
            ServerSocket serverSocket = new ServerSocket(5000);
            //Local socket
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            String message = in.readUTF();
            System.out.println(message);

            socket.close();
        }
        catch (IOException e){
            throw new RuntimeException();
        }
    }
}