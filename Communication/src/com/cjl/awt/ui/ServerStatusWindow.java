package com.cjl.awt.ui;

import java.awt.*;
import java.awt.List;
import java.util.*;

/**
 * Created by chenjianliang on 2018/1/1.
 */
public class ServerStatusWindow extends Frame{
    private Label serverInfo;
    private Label serverStatus;
    private Label portInfo;
    private TextField port;
    private Button btnServer;
    private List userList;
    private Label userListInfo;

    public void init(){
        this.setSize(300,600);
        this.setVisible(true);
        this.setTitle("服务器");

        serverInfo = new Label();
        serverInfo.setText("服务器状态");
        serverInfo.setSize(60,30);
        serverInfo.setLocation(10,20);

        serverStatus = new Label();
        serverStatus.setText("停止");
        serverStatus.setSize(60,30);
        serverStatus.setLocation(120,20);
        serverStatus.setForeground(Color.red);

        portInfo = new Label();
        portInfo.setText("端口号");
        portInfo.setSize(60,30);
        portInfo.setLocation(10,80);

        port = new TextField();
        port.setText("");
        port.setSize(100,30);
        port.setLocation(120,80);

        btnServer = new Button();
        btnServer.setLabel("启动服务器");
        btnServer.setSize(100,30);
        btnServer.setLocation(200,80);

        userListInfo = new Label();
        userListInfo.setText("在线用户列表");
        userListInfo.setSize(120,30);
        userListInfo.setLocation(10,120);
        userListInfo.setForeground(Color.blue);

        userList = new List();
        userList.setSize(280,400);
        userList.add("aa");
        userList.setForeground(Color.red);
        userList.setLocation(10,160);


        this.add(serverInfo);
        this.add(serverStatus);
        this.add(btnServer);
        this.add(userList);
        this.add(userListInfo);
        this.add(portInfo);
        this.add(port);

    }


    public void start(){
        if(serverStatus == null || port == null || btnServer ==  null){
            return;
        }
        serverStatus.setText("运行中");
        port.setEnabled(false);
        btnServer.setLabel("停止服务器");
    }

    public void stop(){
        if(serverStatus == null || port == null || btnServer ==  null){
            return;
        }
        serverStatus.setText("停止");
        port.setEnabled(true);
        btnServer.setLabel("启动服务器");
    }

    public void update(java.util.List<String> lists){
        if(userList ==  null){
            return;
        }

        String[] strings = userList.getItems();
        java.util.List listStr = Arrays.asList(strings);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(listStr);

        if(lists != null && lists.size() > 0){
            for (int i = 0;i < lists.size();i++){
                if(!arrayList.contains(lists.get(i))){
                    userList.add(lists.get(i));
                }
            }
        }
    }

}
