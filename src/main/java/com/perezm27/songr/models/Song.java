package com.perezm27.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    protected String title;
    protected long length;
    protected int trackNumber;

    @ManyToOne
    Album album;

    public Song(){}
    public Song(String title, long length, int trackNumber, Album album) {
        this.title = title;
        this.length = length * 60;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }
    public String toString(){
        return String.format("%s %s", this.title, this.length, this.trackNumber, this.album);
    }
}
