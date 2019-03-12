package com.example.android.musically;

/**
 * Created by moham on 22-Jun-18.
 */



public class Songs {

    private String nameSonger, nameSong, yearOfSong;
    private int image;

    public Songs(String nameSonger,String nameSong,String yearOfSong , int image) {

        this.nameSonger = nameSonger;
        this.nameSong = nameSong;
        this.yearOfSong = yearOfSong;
        this.image = image;
    }

    public  int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNameSonger() {
        return nameSonger;
    }

    public void setNameSonger(String nameSonger) {
        this.nameSonger = nameSonger;
    }

    public String  getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getYearOfSong() {
        return yearOfSong;
    }

    public void setYearOfSong(String yearOfSong) {
        this.yearOfSong = yearOfSong;
    }
}

