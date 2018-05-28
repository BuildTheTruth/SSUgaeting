package com.project.network.ssugaeting.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.network.ssugaeting.databinding.ItemChatBinding;
import com.project.network.ssugaeting.item.Chat;

import java.util.Vector;

/**
 * Created by Jin on 2018-05-16.
 */

public class ChatAdapter extends RecyclerView.Adapter {
    private static final int MY_TURN = 1;
    private static final int OPPONENT_TURN = 2;

    private Vector<Chat> chats;
    private Context context;

    public ChatAdapter(Vector<Chat> chats, Context context) {
        this.chats = chats;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder;
        ItemChatBinding binding = ItemChatBinding.inflate(LayoutInflater.from(context), parent, false);
        holder = new ChatHolder(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ChatHolder itemViewHolder = (ChatHolder) holder;
        final ItemChatBinding binding = itemViewHolder.binding;

        int msgTurn = chats.get(position).getMsgTurn();
        int msgCount = chats.get(position).getMsgCount();
        String userMsg = chats.get(position).getUserMsg();
        String msgTime = chats.get(position).getMsgTime();
        String userName = chats.get(position).getUserName();
        switch (msgTurn) {
            case MY_TURN:
                binding.rlOppChat.setVisibility(View.GONE);
                binding.rlMyChat.setVisibility(View.VISIBLE);
                binding.tvMyChatMsg.setText(userMsg);
                binding.tvMyChatTime.setText(msgTime);
                break;
            case OPPONENT_TURN:
                binding.rlMyChat.setVisibility(View.GONE);
                binding.rlOppChat.setVisibility(View.VISIBLE);
                binding.tvOppChatName.setText(userName);
                binding.tvOppChatMsg.setText(userMsg);
                binding.tvOppChatTime.setText(msgTime);
                if (msgCount > 1) {
                    binding.tvOppChatName.setVisibility(View.GONE);
                    binding.ivOppChatPhoto.setVisibility(View.INVISIBLE);
                }
                // setImageResource
                break;
        }
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    private class ChatHolder extends RecyclerView.ViewHolder {
        ItemChatBinding binding;

        ChatHolder(ItemChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
