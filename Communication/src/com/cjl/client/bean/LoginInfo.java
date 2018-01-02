package com.cjl.client.bean;

/**
 * Created by chenjianliang on 2018/1/1.
 */
public class LoginInfo {
    private String user;
    private String server;
    private int port;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
        return "LoginInfo{" +
                "user='" + user + '\'' +
                ", server='" + server + '\'' +
                ", port=" + port +
                '}';
    }
}
