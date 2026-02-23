<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <title>TCP Communication</title>
</head>

<body>

<h1>TCP Communication - Client/Server</h1>

<h2>Descrizione</h2>
<p>
Applicazione Java che realizza una comunicazione TCP tra un client e un server
tramite socket. Il client invia comandi testuali e il server restituisce
una risposta elaborata.
</p>

<h2>Funzionamento</h2>
<ol>
    <li>Il server viene avviato e resta in ascolto.</li>
    <li>Il client si connette tramite rete TCP.</li>
    <li>Avviene lo scambio di messaggi.</li>
    <li>La comunicazione termina con il comando <strong>ESCI</strong>.</li>
</ol>

<h2>Componenti</h2>
<ul>
    <li>Client.java</li>
    <li>Server.java</li>
    <li>MainClient.java</li>
    <li>MainServer.java</li>
</ul>

<h2>Avvio</h2>
<p>
Avviare prima <strong>MainServer</strong> e successivamente
<strong>MainClient</strong>.
</p>

</body>
</html>
