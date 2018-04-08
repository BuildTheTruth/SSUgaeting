package com.project.network.ssugaeting.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.project.network.ssugaeting.item.Chatting;
import com.project.network.ssugaeting.item_view.ChattingView;

import java.util.ArrayList;

/**
 * Created by Jin on 2018-04-08.
 */

public class ChatAdapter extends BaseAdapter {
    private ArrayList<Chatting> items = new ArrayList<Chatting>();
    Context context;

    public ChatAdapter(Context context) {
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
        ChattingView mView = (ChattingView) convertView;

        if (convertView == null)
            mView = new ChattingView(context.getApplicationContext());

        Chatting item = items.get(position);
        mView.setOpponentName(item.getOpponentName());
        mView.setMessage(item.getMessage());
        mView.setTime(item.getTime());
        mView.setCount(item.getCount());
        mView.setOpponentImageURL(context.getApplicationContext(), item.getOpponentImageURL());

        return mView;
    }

    public void addItem(Chatting item) {
        items.add(item);
    }

    public void clearItem() {
        items.clear();
    }
}
