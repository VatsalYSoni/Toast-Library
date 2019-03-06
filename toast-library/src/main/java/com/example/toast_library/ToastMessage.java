package com.example.toast_library;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void s(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

}
