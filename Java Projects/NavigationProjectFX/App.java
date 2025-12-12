package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.CheckBox;

public class App extends Application {
    
    Vehicle v1;

    @Override
    public void start(Stage stage) {
        //Scenes
        AnchorPane pane1 = new AnchorPane();
        Scene scene1 = new Scene(pane1, 640, 400);
        
        AnchorPane pane2 = new AnchorPane();
        Scene scene2 = new Scene(pane2, 640, 400);
        
        AnchorPane pane3 = new AnchorPane();
        Scene scene3 = new Scene(pane3, 640, 400);
        
        //Scene 1
        
          //Introduction
        Label L1 = new Label("Welcome to the Navigation Game!");
        Label L2 = new Label("Please create a vehicle to begin");
        Label temp = new Label();
        Label status = new Label();
        Label bad2 = new Label();
        
        
         //Location List
        ListView<Location> list = new ListView();
//        
//        list.getItems().add(new Location("Cleveland", 0, 0, true));
//        list.getItems().add(new Location("North Pole", 500, 100, true));
//        list.getItems().add(new Location("Campbell Hill", -50, -50, false));
//        list.getItems().add(new Location("Tokyo", -100, 1000, true));
//        list.getItems().add(new Location("Chicago", -200, 75, true));
//        list.getItems().add(new Location("Erie PA", 150, 0, true));
//        list.getItems().add(new Location("Allegheny National Forest", 300, -75, false));
//        list.getItems().add(new Location("Teufort", 200, -1000, false));

        try{
            File f = new File("Locations.txt");
            FileReader fr = new FileReader(f);
            BufferedReader file = new BufferedReader(fr);
            
           String LineReader;
           while((LineReader = file.readLine()) !=null) {
               String[] chunk = LineReader.split(",");
               String e = chunk[0];
               int LocX = Integer.parseInt(chunk[1]);
               int LocY = Integer.parseInt(chunk[2]);
               boolean Gas = Boolean.parseBoolean(chunk[3]);
               list.getItems().add(new Location(e, LocX, LocY, Gas));
           }
           file.close();
        }catch(IOException a) {
            bad2.setText("File Error!");
        }catch (Exception a) {
            bad2.setText("File not found! Please try again!");
        }
        
          //Buttons & the Layout
        Button NV = new Button("New Vehicle");
        NV.setOnAction(ActionEvent -> {stage.setScene(scene2);
        });
        
        Button vroom = new Button("Drive");
       vroom.setOnAction(ActionEvent ->  {
           try{
               v1.Drive(list.getSelectionModel().getSelectedItem());
               status.setText("Current Location: " + v1.toString());
               
           }
           catch(IllegalStateException kl){
               bad2.setText(kl.getMessage());
           }
           catch(Exception something){
               bad2.setText("That didn't work. Did you create a vehicle and select from the location list?");
           }
           
       });
        Button rf = new Button("Refuel");
        rf.setOnAction(ActionEvent -> {
            try{
                v1.refuel(true);
                status.setText("Current Location: " + v1.toString());
            }
            catch(IllegalStateException e){
                bad2.setText(e.getMessage());
            }
           catch(Exception e){
                bad2.setText("You cannot refuel here. Please drive to another location.");
            }
                
        });
        Button Adloc = new Button("Add Location");
        Adloc.setOnAction(ActionEvent -> stage.setScene(scene3));
        
        Button RemLoc= new Button("Remove Location");
        RemLoc.setOnAction(ActionEvent ->{
                list.getItems().remove(list.getSelectionModel().getSelectedItem());            
        });
        
        Button SV = new Button("Save");
        SV.setOnAction(ActionEvent -> {
           try{
               FileWriter fw = new FileWriter("Locations.txt");
               for (int i = 0; i < list.getItems().size(); i++) {
                  String name = list.getItems().get(i).getLocationName();
                  int LocX = list.getItems().get(i).getX();
                  int LocY = list.getItems().get(i).getY();
                  boolean Gas = list.getItems().get(i).isGasStation();
                  fw.write(name + "," + LocX + "," + LocY + "," + Gas + "\n");
                  temp.setText("Saved!");
               }
              fw.close();
           }catch (IOException as){
               bad2.setText("Error! File failed to write! Please try again.");
           }
        });
        
        AnchorPane.setTopAnchor(L1, 20.0);
        
        AnchorPane.setTopAnchor(L2, 20.0);
        AnchorPane.setBottomAnchor(L2, 300.0);
        
        AnchorPane.setRightAnchor(list, 0.0);
        
        AnchorPane.setBottomAnchor(NV, 50.0);
        
        AnchorPane.setBottomAnchor(vroom, 50.0);
        AnchorPane.setLeftAnchor(vroom, 90.0);
        
        AnchorPane.setBottomAnchor(rf, 50.0);
        AnchorPane.setLeftAnchor(rf, 140.0);
        
        AnchorPane.setBottomAnchor(Adloc, 0.0);
        AnchorPane.setLeftAnchor(Adloc, 0.0);
        
        AnchorPane.setBottomAnchor(RemLoc, 0.0);
        AnchorPane.setLeftAnchor(RemLoc, 100.0);
        
        AnchorPane.setBottomAnchor(temp, 100.0);
        
        AnchorPane.setBottomAnchor(status, 200.0);
        
        AnchorPane.setTopAnchor(bad2, 250.0);
        
        AnchorPane.setBottomAnchor(SV, 0.0);
        AnchorPane.setLeftAnchor(SV, 230.0);
        
        
        
        pane1.getChildren().addAll(L1, L2, list, NV, vroom, rf, Adloc, RemLoc, temp, status, bad2, SV);

        //scene2
        Label L3 = new Label("Max Fuel Cap");
        Label L4 = new Label("Miles Per Gallon");
        Label badInput = new Label();
        
        
        TextField MFC = new TextField();
        TextField MPG = new TextField();
        
        Button B = new Button("Back");
        B.setOnAction(ActionEvent -> stage.setScene(scene1));
        
        Button CV = new Button("Create Vehicle");
        CV.setOnAction(ActionEvent -> {
            
           try{
            int max = Integer.parseInt(MFC.getText());
            int miles = Integer.parseInt(MPG.getText());
           
            v1 = new Vehicle(list.getItems().get(0), max, 100, miles);
            temp.setText("Your vehicle has been created!");
            status.setText("Current Location: " + v1.toString());
            stage.setScene(scene1);
            NV.setVisible(false);
           }
           catch(Exception eee){
               badInput.setText("You have typed something other than a number. Please try again.");
           }
          
        });
         //Layout of scene2
           
           AnchorPane.setTopAnchor(L3, 20.0);
           
           AnchorPane.setTopAnchor(L4, 50.0);
           
           AnchorPane.setTopAnchor(MFC, 20.0);
           AnchorPane.setLeftAnchor(MFC, 80.0);
           
           AnchorPane.setTopAnchor(MPG, 50.0);
           AnchorPane.setLeftAnchor(MPG, 90.0);
           
           AnchorPane.setBottomAnchor(CV, 0.0);
           AnchorPane.setRightAnchor(CV, 0.0);
           
           AnchorPane.setBottomAnchor(B, 0.0);
           AnchorPane.setLeftAnchor(B, 0.0);
        pane2.getChildren().addAll(L3, L4, MFC, MPG, CV, badInput, B);
        //scene3
  
        Label L5 = new Label("Location Name: ");
        Label L6 = new Label("Location Coordinate X: ");
        Label L7 = new Label("Location Coordinate Y: ");
        Label L8 = new Label("Gas Station: ");
        Label ungoodinput = new Label();
        
        TextField LocName = new TextField();
        TextField LocX = new TextField();
        TextField LocY = new TextField();
        CheckBox CB1 = new CheckBox();
        
        Button Bk = new Button("Back");
        Bk.setOnAction(ActionEvent -> stage.setScene(scene1));
        
        Button CL = new Button("Create Location");
        CL.setOnAction(ActionEvent ->{
            try{
              
                int numX = Integer.parseInt(LocX.getText());
                int numY = Integer.parseInt(LocY.getText());
                boolean gas = CB1.isSelected();
                
                list.getItems().add(new Location(LocName.getText(), numX, numY, gas));
                temp.setText("Your location has been added!");
                stage.setScene(scene1);
                LocName.clear();
                LocX.clear();
                LocY.clear();
                CB1.setSelected(false);
            }catch(Exception except){
                ungoodinput.setText("Invalid input. Please try again.");
            }
        });
        
        
        
        //Scene3 layout
        
        AnchorPane.setTopAnchor(L5, 20.0);
        
        AnchorPane.setTopAnchor(L6, 50.0);
        
        AnchorPane.setTopAnchor(L7, 90.0);
        
        AnchorPane.setTopAnchor(LocName, 20.0);
        AnchorPane.setLeftAnchor(LocName, 90.0);
        
        AnchorPane.setTopAnchor(LocX, 50.0);
        AnchorPane.setLeftAnchor(LocX, 120.0);
        
        AnchorPane.setTopAnchor(LocY, 90.0);
        AnchorPane.setLeftAnchor(LocY, 120.0);
        
        AnchorPane.setBottomAnchor(CL, 0.0);
        AnchorPane.setRightAnchor(CL, 0.0);
        
        AnchorPane.setTopAnchor(ungoodinput, 200.0);
        
        AnchorPane.setBottomAnchor(Bk, 0.0);
        AnchorPane.setLeftAnchor(Bk, 0.0);
        
        pane3.getChildren().addAll(L5, L6, L7, LocName, LocX, LocY, CL, ungoodinput,Bk,CB1,L8);
        //End
        stage.setTitle("Navigation Game");
        
        stage.setScene(scene1);
        stage.show();
    
    }

    public static void main(String[] args) {
        launch();
    }

}