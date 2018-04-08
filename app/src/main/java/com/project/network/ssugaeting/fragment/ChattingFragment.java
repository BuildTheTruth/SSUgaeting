package com.project.network.ssugaeting.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.project.network.ssugaeting.R;
import com.project.network.ssugaeting.adapters.ChatAdapter;
import com.project.network.ssugaeting.item.Chatting;

public class ChattingFragment extends Fragment {

    private ChatAdapter adapter;
    private ListView chatList;

    public ChattingFragment() {
    }

    public static ChattingFragment newInstance() {
        return new ChattingFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chatting_list, container, false);
        chatList = (ListView) view.findViewById(R.id.rv_chatList);
        adapter=new ChatAdapter(getContext());
        adapter.addItem(new Chatting("김용현", "俺はこの世界を支配する男だぜ","오후 12:00", 27));
        adapter.addItem(new Chatting("김용현", "나는 이 세계를 지배할 남자다.", "2018/4/7", 246));
        chatList.setAdapter(adapter);

        return view;
    }
}
