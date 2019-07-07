package de.shadowsoft.shadowkeys.client.model;

import android.graphics.Bitmap;
import de.shadowsoft.shadowkeys.client.ToolBox;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ButtonPage {
    private List<ShadowButton> buttons;
    private String caption;
    private String id;
    private String image;

    public ButtonPage() {
        buttons = new ArrayList<>();
        id = UUID.randomUUID().toString();
        caption = "";
        image = "";
    }

    public List<ShadowButton> getButtons() {
        return buttons;
    }

    public void setButtons(final List<ShadowButton> buttons) {
        this.buttons = buttons;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(final String caption) {
        this.caption = caption;
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
}
    
    