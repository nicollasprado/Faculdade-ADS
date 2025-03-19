package org.projetoredes;

import org.projetoredes.classes.Server;

import java.io.IOException;

public class RunServer {
    public static void main(String[] args) throws IOException {
        Server server = new Server("10.25.1.88", 6000, 5);

        server.startServer();
    }
}