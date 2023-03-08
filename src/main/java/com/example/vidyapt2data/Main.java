package com.example.vidyapt2data;

public class Main {
    public static void main(String[] args) {
        VideogamesSells.readAllData();

        VideoGameScore.readAllData();
        for(VideoGames game: VideoGames.getAllVideoGames()) {
            System.out.println(game);
       }
    }

}

