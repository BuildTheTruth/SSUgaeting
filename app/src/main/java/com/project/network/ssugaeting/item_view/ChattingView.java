package com.project.network.ssugaeting.item_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.network.ssugaeting.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Jin on 2018-04-08.
 */

public class ChattingView extends LinearLayout {
    TextView userName;
    TextView userMessage;
    TextView msgTime;
    TextView msgCount;
    CircleImageView userPhoto;

    public ChattingView(Context context) {
        super(context);
        init(context);
    }

    public ChattingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_chatting, this, true);

        userName=(TextView)findViewById(R.id.tv_chatName);
        userMessage=(TextView)findViewById(R.id.tv_chatMsg);
        msgTime=(TextView)findViewById(R.id.tv_chatTime);
        msgCount=(TextView)findViewById(R.id.tv_chatCnt);
        userPhoto=(CircleImageView)findViewById(R.id.iv_chatPhoto);
    }

    public void setOpponentName(String name) { userName.setText(name); }

    public void setMessage(String message) { userMessage.setText(message); }

    public void setTime(String time) { msgTime.setText(time); }

    public void setCount(int count) { msgCount.setText(""+count); }

    public void setOpponentImageURL(Context context, String imageURL) {
        // Define here after server is connected.
    }

}
