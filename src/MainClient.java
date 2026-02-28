import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci nome player: ");
        String nome = scanner.nextLine();

        Client client = new Client(nome, "N/D");

        if (client.connetti("localhost", 5000) == 0) {

            // invio nome al server
            client.scrivi(nome);

            // ricezione risposta
            String risposta = client.leggi();
            System.out.println(risposta);

            client.chiudi();

        } else {
            System.out.println("Connessione fallita.");
        }

        scanner.close();
    }
}