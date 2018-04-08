package com.project.network.ssugaeting.item_view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.network.ssugaeting.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Jin on 2018-04-08.
 */

public class ProfileView extends LinearLayout {
    TextView userName;
    TextView userStateMsg;
    CircleImageView userPhoto;

    public ProfileView(Context context) {
        super(context);
        init(context);
    }

    public ProfileView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_profile, this, true);

        userName = (TextView) findViewById(R.id.tv_userName);
        userStateMsg = (TextView) findViewById(R.id.tv_userStateMsg);
        userPhoto = (CircleImageView) findViewById(R.id.iv_userPhoto);
    }

    public void setName(String name) {
        userName.setText(name);
    }

    public void setStateMsg(String stateMsg) {
        userStateMsg.setText(stateMsg);
    }

    public void setImageURL(Context context, String imageURL) {
        // Define here after server is connected.
    }
}