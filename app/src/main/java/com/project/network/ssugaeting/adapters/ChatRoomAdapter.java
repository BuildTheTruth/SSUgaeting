package com.project.network.ssugaeting.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.project.network.ssugaeting.item.Chat;
import com.project.network.ssugaeting.item_view.ChatRoomView;

import java.util.ArrayList;

/**
 * Created by Jin on 2018-04-08.
 */

public class ChatRoomAdapter extends BaseAdapter {
    private ArrayList<Chat> items = new ArrayList<Chat>();
    Context context;

    public ChatRoomAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatRoomView mView = (ChatRoomView) convertView;

        if (convertView == null)
            mView = new ChatRoomView(context.getApplicationContext());

        Chat item = items.get(position);
        mView.setUserName(item.getUserName());
        mView.setUserMsg(item.getUserMsg());
        mView.setMsgTime(item.getMsgTime());
        mView.setMsgCount(item.getMsgCount());
        mView.setUserImageURL(context.getApplicationContext(), item.getUserImageURL());

        return mView;
    }

    public void addItem(Chat item) {
        items.add(item);
    }

    public void clearItem() {
        items.clear();
    }
}
