import java.io.IOException;
import java.net.ServerSocket;
public class Server() {
    private ServerSocket serverSocket;
    private Socket Socket;
    private int porta;

    public Server(int porta) throws IOException {
        this.porta = porta;
        serverSocket = new ServerSocket(porta);
    }

/*void scrivi(){
}

void leggi(){
}

void chiudi(){
}

void termina(){
}*/
}