package com.example.cryptoking;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.widget.Toast;

import java.util.Locale;

public class Crypto extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Configuration  configuration = new Configuration();
        configuration.locale = Locale.ENGLISH;
        super.onConfigurationChanged(configuration);
        Locale.setDefault(configuration.locale);
        getBaseContext().getResources().updateConfiguration(configuration,getResources().getDisplayMetrics());
    }

    public static void Loger(String m){
        Log.e("mip tag",m);

    }
    public static void Tostmaker(Context c,String m){
        Toast.makeText(c,m,Toast.LENGTH_SHORT).show();

    }
    public static void Dialogmaker(Context c,String title,String mes){
        AlertDialog.Builder alert = new AlertDialog.Builder(c);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(mes);
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();

    }
}
