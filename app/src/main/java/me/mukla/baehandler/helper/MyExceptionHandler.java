package me.mukla.baehandler.helper;

import android.util.Log;

/**
 * Created by rayhan on 11/20/2014.
 */
public class MyExceptionHandler {

    public void handleException(Exception thrownException){
        if(thrownException instanceof NullPointerException){
            Log.e("Null Pointer Exception", "");
        }else if (thrownException instanceof NumberFormatException){
            Log.e("Number Format Exception", "");
        }else if (thrownException instanceof ArrayIndexOutOfBoundsException){
            Log.e("Array Index out of Bound Exception", "");
        }
    }
}
