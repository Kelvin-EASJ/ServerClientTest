import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8065;
        DataInputStream in;
        DataOutputStream out;
        ServerSocket server;
        Socket socket;
        String aString = "server are the simps of internet connections";

        server = new ServerSocket(port);
        socket = server.accept();
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        while(true) {
            System.out.println(in.readUTF());
            out.writeUTF(aString);
        }
    }
}