package com.example.latihan3prauts.model;
///16-05-2019/10116329/RakaGunturAlviansyah/IF-8
public class GalleryModel {
    private int image;
    private String title;
    private String location;

    public GalleryModel(int image, String title, String location) {
        this.image = image;
        this.title = title;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
