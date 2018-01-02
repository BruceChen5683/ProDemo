package com.cjl.awt.ui;

import com.cjl.client.bean.LoginInfo;

import java.awt.*;

/**
 * Created by chenjianliang on 2018/1/1.
 */
public class UserLoginWindow extends Frame{

    private Label labelUser;
    private Label labelServer;
    private Label labelPort;

    private TextField user;
    private TextField serverAdd;
    private TextField port;

    private Button btnLogin;
    private Button btnReset;


    public void init(){

        this.setSize(300,300);
        this.setVisible(true);
        this.setTitle("用户登录");

        labelUser = new Label();
        labelServer = new Label();
        labelPort = new Label();

        labelUser.setText("用户名");
        labelServer.setText("服务器地址");
        labelPort.setText("端口");


        labelUser.setSize(80,30);
        labelServer.setSize(80,30);
        labelPort.setSize(80,30);

        labelUser.setLocation(10,60);
        labelServer.setLocation(10,110);
        labelPort.setLocation(10,160);



        labelUser.setForeground(Color.blue);
        labelServer.setForeground(Color.blue);
        labelPort.setForeground(Color.blue);

        this.add(labelUser);
        this.add(labelServer);
        this.add(labelPort);



        user = new TextField();
        serverAdd = new TextField();
        port = new TextField();

        user.setSize(100,30);
        serverAdd.setSize(100,30);
        port.setSize(100,30);


        user.setLocation(120,60);
        serverAdd.setLocation(120,110);
        port.setLocation(120,160);

        user.setText("1");
        serverAdd.setText("2");
        port.setText("3");

        this.add(user);
        this.add(serverAdd);
        this.add(port);

        btnLogin = new Button();
        btnReset = new Button();

        btnLogin.setLabel("登录");
        btnReset.setLabel("重置");

        btnLogin.setSize(60,30);
        btnReset.setSize(60,30);
        btnLogin.setLocation(90,250);
        btnReset.setLocation(150,250);

        this.add(btnLogin);
        this.add(btnReset);

//        addListener();

    }

//    public void addListener(){
//        btnLogin.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                getLoginInfo();
//            }
//        });
//
//
//        btnReset.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                reset();
//            }
//        });
//    }

    public LoginInfo getLoginInfo(){
        if(user == null || serverAdd == null || port == null){
            System.out.println("getLoginInfo null Excepition");
            return null;
        }
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setUser(user.getText());
        loginInfo.setServer(serverAdd.getText());
        loginInfo.setPort(Integer.parseInt(port.getText()));
        return loginInfo;
    }

    public void reset(){
        if(user == null || serverAdd == null || port == null){
            System.out.println("reset null Excepition");
            return;
        }
        user.setText("");
        serverAdd.setText("");
        port.setText("");
    }

    public void setLoginInfo(LoginInfo loginInfo){
        if(user == null || serverAdd == null || port == null){
            System.out.println("setLoginInfo null Excepition");
            return;
        }

        user.setText(loginInfo.getUser());
        serverAdd.setText(loginInfo.getServer());
        port.setText(loginInfo.getPort()+"");
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public Button getBtnReset() {
        return btnReset;
    }

}
