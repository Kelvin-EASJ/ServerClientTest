import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client  {
    public static void main(String[] args) throws IOException {
        int port = 8005;
        String host = "192.168.43.192";
        DataInputStream in;
        DataOutputStream out;
        Socket socket;
        String aString = "server are the simps of internet connections";


        socket = new Socket(host, port);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        while(true) {
            System.out.println("Indtast noget: ");
            Scanner input = new Scanner(System.in);
            String tekst = input.nextLine();
            out.writeUTF(tekst);
            System.out.println(in.readUTF());
        }
    }
}
