package com.project.network.ssugaeting.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jin on 2018-04-08.
 */

public class Chat implements Parcelable {
    private String userId;
    private String userName;
    private String userImageURL;
    private String userMsg;
    private String msgTime;
    private int msgCount;
    private int msgTurn;

    // Constructor for display of ChatRoomListView
    public Chat(String userName, String userMsg, String msgTime, int msgCount) {
        this.userName = userName;
        this.userMsg = userMsg;
        this.msgTime = msgTime;
        this.msgCount = msgCount;
    }

    public Chat(String userId, String userName, String userImageURL, String userMsg, String msgTime, int msgCount, int msgTurn) {
        this.userId = userId;
        this.userName = userName;
        this.userImageURL = userImageURL;
        this.userMsg = userMsg;
        this.msgTime = msgTime;
        this.msgCount = msgCount;
        this.msgTurn = msgTurn;
    }

    protected Chat(Parcel in) {
        userId = in.readString();
        userName = in.readString();
        userImageURL = in.readString();
        userMsg = in.readString();
        msgTime = in.readString();
        msgCount = in.readInt();
        msgTurn = in.readInt();
    }

    public static final Creator<Chat> CREATOR = new Creator<Chat>() {
        @Override
        public Chat createFromParcel(Parcel in) {
            return new Chat(in);
        }

        @Override
        public Chat[] newArray(int size) {
            return new Chat[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userId);
        dest.writeString(userName);
        dest.writeString(userImageURL);
        dest.writeString(userMsg);
        dest.writeString(msgTime);
        dest.writeInt(msgCount);
        dest.writeInt(msgTurn);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    public String getUserMsg() {
        return userMsg;
    }

    public void setUserMsg(String userMsg) {
        this.userMsg = userMsg;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }

    public int getMsgCount() {
        return msgCount;
    }

    public void setMsgCount(int msgCount) {
        this.msgCount = msgCount;
    }

    public int getMsgTurn() {
        return msgTurn;
    }

    public void setMsgTurn(int msgTurn) {
        this.msgTurn = msgTurn;
    }
}
