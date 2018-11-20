package com.github.artemzi.entities;

import java.util.List;

public class Gallery {
    private long id;
    private List<Object> images;

    public Gallery() {
    }

    public Gallery(long id, List<Object> images) {
        this.id = id;
        this.images = images;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "id=" + id +
                ", images=" + images +
                '}';
    }
}
