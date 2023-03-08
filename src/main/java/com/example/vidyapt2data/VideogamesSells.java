package com.example.vidyapt2data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VideogamesSells extends VideoGames {


    String developer;
    String publisher;
    String series;
    int sells;
    public VideogamesSells(String name, String platform, String releaseDate, String developer, String publisher, String series, int sells) {
        super(name, platform, releaseDate);
        this.developer = developer;
        this.publisher = publisher;
        this.series = series;
        this.sells = sells;
    }

    private String getDeveloper() {
        return developer;
    }

    private void setDeveloper(String developer) {
        this.developer = developer;
    }

    private String getPublisher() {
        return publisher;
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private  String getSeries() {
        return series;
    }

    private void setSeries(String series) {
        this.series = series;
    }

    private int getSells() {
        return sells;
    }

    private void setSells(int sells) {
        this.sells = sells;
    }

    public String toString()
    {
        return name + ", " + platform + ", " + releaseDate + ", " + developer + ", " + publisher + ", " + series + ", " + sells;
    }

    void describeSelf() {
        System.out.println(name + ", " + platform + ", " + releaseDate + ", " + developer + ", " + publisher + ", " + series + ", " + sells);
    }
    static void readAllData() {
        Scanner sc = null;
        try{
            File file = new File("Video game sales data");
            sc = new Scanner(file);
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\t");
                String name = lineScanner.next();
                int sales = lineScanner.nextInt();
                String series = lineScanner.next();
                String platform = lineScanner.next();
                String releaseDate = lineScanner.next();
                String developer = lineScanner.next();
                String publisher = lineScanner.next();
                new VideogamesSells(name, platform, releaseDate, developer, publisher, series, sales);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            if (sc != null) sc.close();
        }
    }
}

