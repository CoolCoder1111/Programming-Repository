package com.mycompany.enumeratorlab;

import java.io.BufferedReader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileReader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Stages & Scenes
        AnchorPane pane1 = new AnchorPane();
        Scene scene1 = new Scene(pane1, 640, 400);

        AnchorPane pane2 = new AnchorPane();
        Scene scene2 = new Scene(pane2, 640, 400);

        ObservableList<Game> allGames = FXCollections.observableArrayList();
        ObservableList<Game> filteredGames = FXCollections.observableArrayList();

        //Scene 1 Intro
        Label L1 = new Label("Welcome to the Game Search!");
        Label L2 = new Label("To begin, please select a game genre and the number of players.");
        Label L3 = new Label("Genre: ");
        Label L4 = new Label("Min. Players: ");
        Label L5 = new Label("Max. Players: ");
        Label error = new Label();

        GameGenres Strategy = GameGenres.STRATEGY;
        GameGenres Family = GameGenres.FAMILY;
        GameGenres Cooperative = GameGenres.COOPERATIVE;
        GameGenres Cardgame = GameGenres.CARDGAME;
        GameGenres Abstract = GameGenres.ABSTRACT;
        GameGenres Party = GameGenres.PARTY;

        ComboBox c1 = new ComboBox();
        c1.getItems().addAll(Strategy, Family, Cooperative, Cardgame, Abstract, Party);

        TextField t1 = new TextField();
        t1.setPrefWidth(50);
        TextField t2 = new TextField();
        t2.setPrefWidth(50);
        Button b1 = new Button("Search");
        b1.setOnAction(ActionEvent -> {
            try {
                GameGenres genreSelected = (GameGenres) c1.getSelectionModel().getSelectedItem();
                int min = Integer.parseInt(t1.getText());
                int max = Integer.parseInt(t2.getText());
                filteredGames.clear();

                for (Game e : allGames) {
                    boolean match = e.getGenre() == genreSelected;
                    boolean player = e.getMin() <= max && e.getMax() >= min;

                    if (match && player) {
                        filteredGames.add(e);
                    }
                }
                stage.setScene(scene2);
            } catch (Exception e) {
                error.setText("Failed to search with critera entered. Please try again.");

            }
        });

        AnchorPane.setTopAnchor(L1, 0.0);
        AnchorPane.setLeftAnchor(L1, 250.0);

        AnchorPane.setTopAnchor(L2, 25.0);
        AnchorPane.setLeftAnchor(L2, 150.0);

        AnchorPane.setTopAnchor(c1, 150.0);
        AnchorPane.setLeftAnchor(c1, 50.0);

        AnchorPane.setTopAnchor(t1, 150.0);
        AnchorPane.setLeftAnchor(t1, 250.0);

        AnchorPane.setTopAnchor(t2, 150.0);
        AnchorPane.setLeftAnchor(t2, 400.0);

        AnchorPane.setTopAnchor(L4, 150.0);
        AnchorPane.setLeftAnchor(L4, 180.0);

        AnchorPane.setTopAnchor(L5, 150.0);
        AnchorPane.setLeftAnchor(L5, 320.0);

        AnchorPane.setBottomAnchor(b1, 0.0);
        AnchorPane.setRightAnchor(b1, 0.0);

        AnchorPane.setTopAnchor(L3, 150.0);
        AnchorPane.setLeftAnchor(L3, 0.0);

        AnchorPane.setTopAnchor(error, 200.0);
        AnchorPane.setLeftAnchor(error, 200.0);

        pane1.getChildren().addAll(L1, L2, c1, t1, t2, L4, L5, b1, L3, error);

        //Scene 1 Works
        try {
            File f1 = new File("gamelist.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader file = new BufferedReader(fr);

            String LineReader;
            while ((LineReader = file.readLine()) != null) {
                String[] chunk = LineReader.split(",");
                String name = chunk[0];
                int min = Integer.parseInt(chunk[1]);
                int max = Integer.parseInt(chunk[2]);
                GameGenres genres = GameGenres.valueOf(chunk[3].toUpperCase().trim());
                allGames.add(new Game(name, min, max, genres));

            }
            file.close();
        } catch (FileNotFoundException e) {
            error.setText("File not found. Please restart the application.");
        } catch (IOException f) {
            error.setText("There was a file error. Please restart the application.");
        }
        //scene 2
        TableView tv = new TableView();
        tv.setItems(filteredGames);
        tv.setPrefWidth(620);
        tv.setPrefHeight(380);

        TableColumn<Game, String> column1 = new TableColumn("Game Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Game, String> column2 = new TableColumn("Genre");
        column2.setCellValueFactory(new PropertyValueFactory<>("genre"));

        tv.getColumns().addAll(column1, column2);
        Button b2 = new Button("Back");
        b2.setOnAction(ActionEvent -> {
            stage.setScene(scene1);
            t1.clear();
            t2.clear();
            c1.getSelectionModel().clearSelection();
        });

        pane2.getChildren().addAll(tv, b2);

        AnchorPane.setBottomAnchor(b2, 0.0);
        AnchorPane.setRightAnchor(b2, 0.0);

        stage.setTitle("Game Search");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
