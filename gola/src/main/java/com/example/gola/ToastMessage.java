package com.example.gola;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by anujgupta on 29/12/17.
 */

public class ToastMessage {

    public static void s(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}