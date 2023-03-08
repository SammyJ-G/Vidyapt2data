package com.example.vidyapt2data;

import java.util.ArrayList;

public class VideoGames {
    private static ArrayList<VideoGames> allVideoGames = new ArrayList<>();
     String name;
     String platform;
     String releaseDate;

    VideoGames(String name, String platform, String releaseDate) {
        this.name = name;
        this.platform = platform;
        this.releaseDate = releaseDate;
        allVideoGames.add(this);
    }

    public static ArrayList<VideoGames> getAllVideoGames() {
        return allVideoGames;
    }

    public static void setAllVideoGames(ArrayList<VideoGames> allVideoGames) {
        VideoGames.allVideoGames = allVideoGames;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getPlatform() {
        return platform;
    }

    private void setPlatform(String platform) {
        this.platform = platform;
    }

    private String getReleaseDate() {
        return releaseDate;
    }

    private void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    void describeSelf(){
        System.out.println("I am a video game I have a " + name + ", a " + platform + "and a " + releaseDate);
    }

}
