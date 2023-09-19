package com.vndevpro.android53_day5;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManger {

    public static final String SHEF_NAME = "Android53_day5";

    public static void saveString(Context context, String key, String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHEF_NAME, context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();
    }
    public static String getString(Context context, String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHEF_NAME, context.MODE_PRIVATE);
        return sharedPreferences.getString(key,null);
    }

    public static void removeKey(Context context, String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHEF_NAME, context.MODE_PRIVATE);
        sharedPreferences.edit().remove(key).apply();
    }
}
