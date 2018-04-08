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
    TextView userNameText;
    TextView userMessageText;
    TextView msgTimeText;
    TextView msgCountText;
    CircleImageView userPhotoImage;

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

        userNameText=(TextView)findViewById(R.id.tv_chatName);
        userMessageText=(TextView)findViewById(R.id.tv_chatMsg);
        msgTimeText=(TextView)findViewById(R.id.tv_chatTime);
        msgCountText=(TextView)findViewById(R.id.tv_chatCnt);
        userPhotoImage=(CircleImageView)findViewById(R.id.iv_chatPhoto);
    }

    public void setOpponentName(String name) { userNameText.setText(name); }

    public void setMessage(String message) { userMessageText.setText(message); }

    public void setTime(String time) { msgTimeText.setText(time); }

    public void setCount(int count) { msgCountText.setText(""+count); }

    public void setOpponentImageURL(Context context, String imageURL) {
        // Define here after server is connected.
    }

}
