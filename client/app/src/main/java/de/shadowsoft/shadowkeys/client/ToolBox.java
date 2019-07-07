package de.shadowsoft.shadowkeys.client;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class ToolBox {

    public static Bitmap getImageFromBase64(String imgString) {
        byte[] imgData = Base64.decode(imgString, Base64.URL_SAFE | Base64.NO_WRAP);
        return BitmapFactory.decodeByteArray(imgData, 0, imgData.length);
    }

}
    
    