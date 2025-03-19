package org.projetoredes;

import org.projetoredes.classes.Client;

import java.util.Scanner;

public class RunClient {
    public static void main(String[] args) {
        Scanner cmd = new Scanner(System.in);
        System.out.print("Endereço de ip do servidor:  ");
        String host = cmd.nextLine();
        if(host.isBlank()) {
            host = "localhost";
        }

        Client client = new Client();

        client.connectServer(host, 6000);
    }
}