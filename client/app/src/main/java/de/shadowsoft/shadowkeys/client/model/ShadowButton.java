package de.shadowsoft.shadowkeys.client.model;

import android.graphics.Bitmap;
import de.shadowsoft.shadowkeys.client.ToolBox;

import java.util.UUID;

public class ShadowButton {

    private int blue;
    private String caption;
    private int green;
    private int height;
    private int holdKey1;
    private int holdKey2;
    private String id;
    private String image;
    private int keyCode;
    private ShadowPosition pos;
    private int red;
    private int width;

    public ShadowButton() {
        id = UUID.randomUUID().toString();
        blue = 255;
        red = 255;
        green = 255;
        pos = new ShadowPosition(1, 1);
        keyCode = 0;
        holdKey1 = 0;
        holdKey2 = 0;
        width = 1;
        height = 1;
        caption = "";
        image = "";
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(final int blue) {
        this.blue = blue;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(final String caption) {
        this.caption = caption;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(final int green) {
        this.green = green;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public int getHoldKey1() {
        return holdKey1;
    }

    public void setHoldKey1(final int holdKey1) {
        this.holdKey1 = holdKey1;
    }

    public int getHoldKey2() {
        return holdKey2;
    }

    public void setHoldKey2(final int holdKey2) {
        this.holdKey2 = holdKey2;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public Bitmap getImageBitmap() {
        return ToolBox.getImageFromBase64(image);
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(final int keyCode) {
        this.keyCode = keyCode;
    }

    public ShadowPosition getPos() {
        return pos;
    }

    public void setPos(final ShadowPosition pos) {
        this.pos = pos;
    }

    public int getRed() {
        return red;
    }

    public void setRed(final int red) {
        this.red = red;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }
}
    
    