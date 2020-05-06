package com.example.app_nghe_nha;

public class Song {
    private String _name;
    private String _singer;
    private int _file;

    public Song(String name, String singer, int file) {
        this._name = name;
        this._singer = singer;
        this._file = file;
    }
    public int getFile() {
        return this._file;
    }
    public String getName() {
        return this._name;
    }
    public String getSinger() {
        return this._singer;
    }
}
