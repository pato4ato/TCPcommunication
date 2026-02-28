import java.io.*;
import java.net.*;

public class Client {

    private String nome;
    private String genere;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Client(String nome, String genere) {
        this.nome = nome;
        this.genere = genere;
    }

    // Connessione TCP al server
    public int connetti(String nomeServer, int portaServer) {
        try {
            socket = new Socket(nomeServer, portaServer);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            return 0;

        } catch (UnknownHostException e) {
            return 1;
        } catch (IOException e) {
            return 2;
        }
    }

    // Invio messaggio
    public void scrivi(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ricezione messaggio
    public String leggi() {
        try {
            return in.readUTF();
        } catch (IOException e) {
            return "Errore comunicazione";
        }
    }

    // Chiusura connessione
    public void chiudi() {
        try {
            if (socket != null)
                socket.close();
        } catch (IOException e) {}
    }
}