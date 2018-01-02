package com.cjl.client.bean;

/**
 * Created by chenjianliang on 2018/1/2.
 */
public class MsgInfo {
    private String fromUser;
    private String chatID;
    private String msgContent;
//    private String chatType;


    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Override
    public String toString() {
        return "MsgInfo{" +
                "fromUser='" + fromUser + '\'' +
                ", chatID='" + chatID + '\'' +
                ", msgContent='" + msgContent + '\'' +
                '}';
    }
}
