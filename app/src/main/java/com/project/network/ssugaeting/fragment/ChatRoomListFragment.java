package com.project.network.ssugaeting.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.activity.ChatRoomActivity;
import com.project.network.ssugaeting.adapters.ChatRoomAdapter;
import com.project.network.ssugaeting.databinding.FragmentChatroomListBinding;
import com.project.network.ssugaeting.item.Chat;

public class ChatRoomListFragment extends Fragment {
    private ChatRoomAdapter chatRoomAdapter;

    FragmentChatroomListBinding binding;

    public ChatRoomListFragment() {
    }

    public static ChatRoomListFragment newInstance() {
        return new ChatRoomListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chatroom_list, container, false);
        chatRoomAdapter = new ChatRoomAdapter(getContext());
        // sample
        chatRoomAdapter.addItem(new Chat("김재현", "뭐해? 자니? 밖이야?", "오후 12:00", 4));
        chatRoomAdapter.addItem(new Chat("김용현", "상대방과 연결이 되었습니다.", "2018/4/7", 1));
        binding.lvChatRoomList.setAdapter(chatRoomAdapter);

        binding.lvChatRoomList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Chat item = (Chat) chatRoomAdapter.getItem(position);
                Intent intent = new Intent(getContext(), ChatRoomActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("SELECTED_CHATROOM", item);
                startActivity(intent);
            }
        });

        View view = binding.getRoot();
        return view;
    }
}
