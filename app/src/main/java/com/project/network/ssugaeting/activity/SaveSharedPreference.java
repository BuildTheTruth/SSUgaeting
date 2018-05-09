package com.project.network.ssugaeting.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.project.network.ssugaeting.item.Profile;

/**
 * Created by Jin on 2018-05-09.
 */

public class SaveSharedPreference {
    static final String PREF_USER_ID="users";
    static SharedPreferences getSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setPrefUserId(Context context, String mId) {
        SharedPreferences.Editor sEditor = getSharedPreferences(context).edit();
        sEditor.putString(PREF_USER_ID, mId);
        sEditor.commit();
    }

    public static Profile getProfile(Context context) {
        String mId=getSharedPreferences(context).getString(PREF_USER_ID, "");
        /*
        Iterator<DataSnapshot> child=dataSnapshot.getChildren().iterator();
        while(child.hasNext()) {
            DataSnapshot ds=child.next();
            if(ds.getKey().equals(mId))
            {
                Profile mProfile = ds.getValue(Profile.class);
                return mProfile;
            }
        */
        return new Profile("id", "password", "email", "용현", "남성", "나는 남자다.", "23", "180", "서울시", "사진", "숭실대", "컴퓨터학부", "url");
    }

}
