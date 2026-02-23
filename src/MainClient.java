import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CLIENT DI MINECRAFT");
        System.out.print("Inserisci nome del player: ");

        String nome = scanner.nextLine();

        Client client = new Client(nome, "N/D");

        if (client.connetti("localhost", 5000) == 0) {

            System.out.println(client.leggi());

            boolean attivo = true;

            while (attivo) {

                System.out.print("\nComando > ");
                String comando = scanner.nextLine();

                client.scrivi(comando);

                if (comando.equalsIgnoreCase("ESCI")) {
                    System.out.println("Connessione terminata.");
                    attivo = false;
                    break;
                }

                String risposta = client.leggi();
                System.out.println(risposta);

                if (risposta.contains("FINE")) {
                    attivo = false;
                }
            }

            client.chiudi();

        } else {
            System.out.println("Impossibile stabilire la connessione.");
        }

        scanner.close();
    }
}