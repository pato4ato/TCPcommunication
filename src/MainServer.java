import java.util.Random;

public class MainServer {

    public static void main(String[] args) {

        Server server = new Server(5000);
        Random random = new Random();

        if (server.attendi() != null) {

            int energiaPlayer = 30;
            int energiaZombie = 35;
            boolean attivo = true;

            server.scrivi(
                    "Connessione stabilita.\n" +
                            "Comandi disponibili: ATT, DORMI, INFO, ESCI"
            );

            while (attivo) {

                String comando = server.leggi().toUpperCase();
                String risposta = "";

                switch (comando) {

                    case "ATT":
                        int danno = random.nextInt(5) + 1;
                        energiaZombie -= danno;
                        risposta = "Hai inflitto " + danno + " danni.";
                        break;

                    case "DORMI":
                        energiaPlayer += 3;
                        risposta = "Energia recuperata.";
                        break;

                    case "INFO":
                        risposta = "Energia player: " + energiaPlayer +
                                " | Energia zombie: " + energiaZombie;
                        break;

                    case "ESCI":
                        risposta = "Sessione terminata.";
                        attivo = false;
                        break;

                    default:
                        risposta = "Comando non valido.";
                }

                if (energiaZombie > 0 && attivo && !comando.equals("INFO")) {
                    int contrattacco = random.nextInt(3);
                    energiaPlayer -= contrattacco;
                    risposta += "\nLo zombie risponde con "
                            + contrattacco + " danni.";
                }

                if (energiaPlayer <= 0) {
                    risposta += "\nFINE: player sconfitto.";
                    attivo = false;
                }

                if (energiaZombie <= 0) {
                    risposta += "\nFINE: obiettivo completato.";
                    attivo = false;
                }

                server.scrivi(risposta);
            }

            server.chiudi();
            server.termina();
        }
    }
}