package meysamkeshvari.onboarding.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context context;
 
    //mode
    private int PRIVATE_MODE = 0;
 
    // file name
    private static final String PREF_NAME = "ON_BOARDING";
    private static final String IS_FIRST_TIME = "IsFirstTime";
 
    public Prefs(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
        editor.apply();
    }
 
    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME, isFirstTime);
        editor.commit();
    }
 
    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME, true);
    }
}