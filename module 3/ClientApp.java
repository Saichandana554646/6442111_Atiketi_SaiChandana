import java.io.*;
import java.net.*;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String userInput;
        while ((userInput = input.readLine()) != null) {
            out.println(userInput);
            System.out.println("Server: " + in.readLine());
            if (userInput.equalsIgnoreCase("bye")) break;
        }

        socket.close();
    }
}