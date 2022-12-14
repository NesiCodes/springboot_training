package com.example.profiles;

public class DataSource {

    private String server;
    private int port;

    private DataSource(){

    }

    public DataSource(String server, int port) {
        this.server = server;
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "server='" + server + '\'' +
                ", port=" + port +
                '}';
    }
}
