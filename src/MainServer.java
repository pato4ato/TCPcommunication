public class MainServer {

    public static void main(String[] args) {

        Server server = new Server(5000);

        if (server.attendi() != null) {

            // ricezione nome player
            String nomePlayer = server.leggi();

            System.out.println("Player collegato: " + nomePlayer);

            // risposta al client
            server.scrivi("Connessione al mondo di Ale riuscita.  Benvenuto " + nomePlayer);

            server.chiudi();
            server.termina();
        }
    }
}