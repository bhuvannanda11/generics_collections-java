package org.example;

public class databaseConnection {
    private boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Database Connected");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Database Disconnected");
    }

    public boolean isConnected() {
        return isConnected;
    }

}
