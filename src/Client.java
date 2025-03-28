import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //Remote socket
        try{
            Socket socket = new Socket("localhost", 5000);
            String message = "Hi, I am from Client";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(message);
            dos.flush();
            socket.close();
        }
        catch(IOException e){
            throw new RuntimeException();
        }
    }

}
