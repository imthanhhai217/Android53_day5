package com.vndevpro.android53_day5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    static boolean  isLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isLogin = getSharedPreferences("Android53_day5",MODE_PRIVATE).getBoolean("IS_LOGIN",false);

        Log.d("TAG", "onCreate: "+isLogin);
//        SharedPreferences sharedPreferences = this.getSharedPreferences("Android53_day5", MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putBoolean("IS_LOGIN",true);
//        editor.apply();

        PrefManger.saveString(this,Constant.USER_NAME,"Hai2");

        UserModel userModel = new UserModel();
        userModel.setUserName("Hai");
        userModel.setPassword("123456");
        userModel.setAddress("HN");

        Gson gson = new Gson();

        String data = gson.toJson(userModel,UserModel.class);
        Log.d("TAG", "onCreate: "+data);

        UserModel userModel1 = gson.fromJson(data,UserModel.class);
        Log.d("TAG", "onCreate: "+userModel1.toString());


        Log.d("TAG", "onCreate: "+PrefManger.getString(this,"USER_NAME"));
    }
}