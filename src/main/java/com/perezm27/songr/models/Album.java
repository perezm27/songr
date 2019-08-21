package com.perezm27.songr.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    protected String title;
    protected String artist;
    protected int songCount;
    protected long length;
    protected String imageUrl;

    public Album(){}
    public Album(String title, String artist, int songCount, long length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length * 60;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public float getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
