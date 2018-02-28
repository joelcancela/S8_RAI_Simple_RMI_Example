package unice.polytech.si4.jcancela.rmi.client;

import unice.polytech.si4.jcancela.rmi.server.Distant;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
        try {
            // Fetch remote service
            Distant stub = null;
            String url = "rmi://localhost/Distant";
            stub = (Distant) Naming.lookup(url);
            System.out.println("[INFO] Connected @ " + url);
            System.out.printf("###>");
            stub.echo();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[ERR] Remote connection failed... " + e.getMessage());
            System.exit(1);
        }
    }
}
