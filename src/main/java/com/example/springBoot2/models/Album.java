package com.example.springBoot2.models;


public class Album {
    private String name;
    private int year;
    private String artist;
    private int tracks;

    public Album() {
    }

    public Album(String name, String artist, int year, int tracks) {
        this.name = name;
        this.year = year;
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }
}
