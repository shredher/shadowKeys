package de.shadowsoft.shadowkeys.client.model;

import java.util.ArrayList;
import java.util.List;

public class ButtonPageSet {

    private List<ButtonPage> pages;
    private String setName;

    public ButtonPageSet() {
        pages=new ArrayList<>();
        setName = "";
    }

    public List<ButtonPage> getPages() {
        return pages;
    }

    public void setPages(final List<ButtonPage> pages) {
        this.pages = pages;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(final String setName) {
        this.setName = setName;
    }
}
    
    