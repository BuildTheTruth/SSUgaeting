package com.project.network.ssugaeting.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.adapters.ChatAdapter;
import com.project.network.ssugaeting.databinding.ActivityChatroomBinding;
import com.project.network.ssugaeting.item.Chat;

import java.util.Date;
import java.util.Vector;

public class ChatRoomActivity extends AppCompatActivity {
    private static final int MY_TURN = 1;
    private static final int OPPONENT_TURN = 2;

    private Vector<Chat> chats;
    private ChatAdapter chatAdapter;

    ActivityChatroomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int msgCount = 0;
        binding = DataBindingUtil.setContentView(this, R.layout.activity_chatroom);
        chats = new Vector<>();
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.rvChatList.setLayoutManager(manager);

        // test
        Chat selectedChatRoom = getIntent().getParcelableExtra("SELECTED_CHATROOM");
        String userName = selectedChatRoom.getUserName();
        binding.tvChatRoomOppName.setText(userName);
        chats.add(new Chat("dd11", userName, "url", "재현아 일어나라", "오후 9:19", ++msgCount, OPPONENT_TURN));
        chats.add(new Chat("dd11", userName, "url", "개빠졌네", "오후 9:19", ++msgCount, OPPONENT_TURN));
        chatAdapter = new ChatAdapter(chats, this);
        binding.rvChatList.setAdapter(chatAdapter);
        binding.ivChatRoomBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        binding.ivSendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = binding.etInputMsg.getText().toString();
                String time;
                Date date = new Date();
                if (date.getHours() < 12)
                    time = "오전 " + date.getHours() + ":" + String.format("%02d", date.getMinutes());
                else
                    time = "오후 " + (date.getHours() - 12) + ":" + String.format("%02d", date.getMinutes());
                chats.add(new Chat("dd11", "김용현", "url", msg, time, 0, MY_TURN));
                chatAdapter.notifyDataSetChanged();
                binding.rvChatList.scrollToPosition(chats.size() - 1);
                binding.etInputMsg.setText(null);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ChatRoomActivity.this, MainActivity.class);
        intent.putExtra("position", 1);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
