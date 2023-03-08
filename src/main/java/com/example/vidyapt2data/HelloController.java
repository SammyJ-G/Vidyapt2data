package com.example.vidyapt2data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class HelloController {
    public TableView VideoGameData;
    public TableColumn releaseDateColumn;
    public TableColumn PlatformColumn;
    public TableColumn SalesColumn;
    public TableColumn NameColumn;



    public void initialize() {
        VideoGameScore.readAllData();
    ArrayList<VideoGames> temporaryList = (ArrayList<VideoGames>) VideoGameScore.getAllVideoGames();
    ObservableList temporaryObservableList = FXCollections.observableArrayList(temporaryList);
    VideoGameData.setItems(temporaryObservableList);
    }
}