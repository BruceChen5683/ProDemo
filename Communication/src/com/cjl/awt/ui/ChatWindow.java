package com.cjl.awt.ui;

import com.cjl.client.bean.MsgInfo;

import java.awt.*;

/**
 * Created by chenjianliang on 2018/1/1.
 */
public class ChatWindow extends Frame{
    private Label chatInfo;
    private Label userListInfo;
    private List chatList;
    private List userList;
    private Button btnSend;
    private Button btnClear;
    private TextField textMsg;

    private int chatID = -1;
    private String user = "";

    public void init(int chatID,String user){
        this.chatID = chatID;
        this.user = user;

        this.setTitle("聊天室");
        this.setSize(600,500);
        this.setVisible(true);

        chatInfo = new Label();
        chatInfo.setText("聊天室信息");
        chatInfo.setSize(100,30);
        chatInfo.setLocation(10,20);
        chatInfo.setForeground(Color.blue);
        userListInfo = new Label();
        userListInfo.setText("在线用户列表");
        userListInfo.setSize(100,30);
        userListInfo.setLocation(400,20);
        userListInfo.setForeground(Color.blue);


        chatList = new List();
        chatList.setSize(350,320);
        chatList.setLocation(10,60);
        chatList.setBackground(Color.gray);
        chatList.add("11");
        chatList.add("22");

        userList = new List();
        userList.setSize(100,360);
        userList.setLocation(400,60);
        userList.setBackground(Color.gray);
        userList.add("aa");
        userList.add("bb");

        textMsg = new TextField();
        textMsg.setSize(220,30);
        textMsg.setLocation(10,400);

        btnSend = new Button();
        btnSend.setSize(50,30);
        btnSend.setLocation(240,400);
        btnSend.setLabel("发送");
        btnClear = new Button();
        btnClear.setSize(50,30);
        btnClear.setLocation(290,400);
        btnClear.setLabel("清屏");




        this.add(chatInfo);
        this.add(userList);
        this.add(chatList);
        this.add(userListInfo);
        this.add(btnSend);
        this.add(btnClear);
        this.add(textMsg);

    }


    public MsgInfo getMsg(){
        if(textMsg == null){
            return null;
        }
        MsgInfo msgInfo = new MsgInfo();
        msgInfo.setMsgContent(textMsg.getText());
        msgInfo.setChatID(chatID+"");
        msgInfo.setFromUser(user);
        return msgInfo;
    }

    public void clear(){
        if(textMsg == null){
            return;
        }
        textMsg.setText("");
    }
}
