import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
   private String nome;
    private String colore;
    private Socket socket;

public Client(String nome){
    this.nome=nome;
}
int connetti(String nomeServer, int portaServer){
        try {
            Socket socket = new Socket(nomeServer, portaServer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return 1;
}

void scrivi(){
}

void leggi(){
}

void chiudi(){
    serverSocket.close();
}

}