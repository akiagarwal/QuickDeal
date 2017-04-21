package com.example.akshay_20.assignment;

public class Details2 {
    private String title;
    private String desc;
    private int thumbnail;

    public Details2() {
    }

    public Details2(String title, String desc,int thumbnail) {
        this.title = title;
        this.desc = desc;
        this.thumbnail=thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

