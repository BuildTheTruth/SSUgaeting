package com.project.network.ssugaeting.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.project.network.ssugaeting.item.Profile;

/**
 * Created by Jin on 2018-05-09.
 */

public class SaveSharedPreference {
    static final String PREF_USER_ID = "users";
    static Profile profile;
    static int[] selectedPosArray=new int[6];

    static SharedPreferences getSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setPrefUserId(Context context, String id) {
        SharedPreferences.Editor sEditor = getSharedPreferences(context).edit();
        sEditor.putString(PREF_USER_ID, id);
        sEditor.commit();
    }

    public static Profile getProfile(Context context) {
        String mId = getSharedPreferences(context).getString(PREF_USER_ID, "");
        /*
        Iterator<DataSnapshot> child=dataSnapshot.getChildren().iterator();
        while(child.hasNext()) {
            DataSnapshot ds=child.next();
            if(ds.getKey().equals(mId))
            {
                mProfile = ds.getValue(Profile.class);
                return mProfile;
            }
        */

        if (profile == null)
            profile = new Profile("admin", "123", "admin@soongsil.ac.kr", "관리자", "남성");

        return profile;
    }

    public static void setProfile(Profile pro) {
        profile = pro;
    }

    public static int[] getSelectedPosArray() {
        return selectedPosArray;
    }

    public static void setSelectedPosArray(int[] posArray) {
        selectedPosArray = posArray;
    }

}
