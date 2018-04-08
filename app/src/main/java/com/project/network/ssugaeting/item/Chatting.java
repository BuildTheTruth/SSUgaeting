package com.project.network.ssugaeting.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jin on 2018-04-08.
 */

public class Chatting implements Parcelable {
    private String opponentId;
    private String opponentName;
    private String opponentMsg;
    private String opponentImageURL;
    private String myMsg;
    private String message;
    private String time;
    private int count;

    public Chatting(String opponentName, String message, String time, int count) {
        this.opponentName = opponentName;
        this.message = message;
        this.time = time;
        this.count = count;
    }

    public Chatting(String opponentId, String opponentName, String opponentMsg, String opponentImageURL, String myMsg, String message, String time, int count) {
        this.opponentId = opponentId;
        this.opponentName = opponentName;
        this.opponentMsg = opponentMsg;
        this.opponentImageURL = opponentImageURL;
        this.myMsg = myMsg;
        this.message = message;
        this.time = time;
        this.count = count;
    }

    protected Chatting(Parcel in) {
        opponentId = in.readString();
        opponentName = in.readString();
        opponentMsg = in.readString();
        opponentImageURL = in.readString();
        myMsg = in.readString();
        message = in.readString();
        time = in.readString();
        count = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(opponentId);
        dest.writeString(opponentName);
        dest.writeString(opponentMsg);
        dest.writeString(opponentImageURL);
        dest.writeString(myMsg);
        dest.writeString(message);
        dest.writeString(time);
        dest.writeInt(count);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Chatting> CREATOR = new Creator<Chatting>() {
        @Override
        public Chatting createFromParcel(Parcel in) {
            return new Chatting(in);
        }

        @Override
        public Chatting[] newArray(int size) {
            return new Chatting[size];
        }
    };

    public void setOpponentId(String opponentId) {
        this.opponentId = opponentId;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }

    public void setOpponentMsg(String opponentMsg) {
        this.opponentMsg = opponentMsg;
    }

    public void setOpponentImageURL(String opponentImageURL) {
        this.opponentImageURL = opponentImageURL;
    }

    public void setMyMsg(String myMsg) {
        this.myMsg = myMsg;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getOpponentId() {
        return opponentId;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public String getOpponentMsg() {
        return opponentMsg;
    }

    public String getOpponentImageURL() {
        return opponentImageURL;
    }

    public String getMyMsg() {
        return myMsg;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
