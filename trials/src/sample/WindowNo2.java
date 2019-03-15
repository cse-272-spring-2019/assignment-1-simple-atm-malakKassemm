package sample;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class WindowNo2 {

    /*private boolean isDouble(TextField input, String message){
        try{
            double money = Double.parseDouble(message);
            System.out.println(money);
            return true;

        }
        catch (NumberFormatException e){
            System.out.println("ERROR");
            return false;
        }
    }*/

     //ArrayList <String>  History = new ArrayList(5);








    public static void deposit(){

        Stage window = new Stage();
        //final double balance ;

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("DEPOSIT");
        window.setMinWidth(250);

        Label label = new Label();
        label.setText("PLEASE CHOSE THE AMOUNT YOU WANT TO DEPOSIT ");

        SaveMyBalance deposit00 = new SaveMyBalance();

        Button fiftty = new Button("50");
        fiftty.setOnAction(e -> {final double balance = deposit00.getSave();
            double totalBalance = balance + 50;



            Main.malak.getHistory().add("Deposited:50 EGP");



            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();});

        Button oneH = new Button("100");
        oneH.setOnAction(e -> {final double balance = deposit00.getSave();
            double totalBalance = balance + 100;
            Main.malak.getHistory().add("Deposited:100 EGP");
            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();});

        Button twoH = new Button("200");
        twoH.setOnAction(e -> {final double balance = deposit00.getSave();
            double totalBalance = balance + 200;
            Main.malak.getHistory().add("Deposited:200 EGP");
            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();});


        Button fiveH = new Button("500");
        fiveH.setOnAction(e -> {final double balance = deposit00.getSave();
            double totalBalance = balance + 500;
            Main.malak.getHistory().add("Deposited:500 EGP");
            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();});

        Button oneTH = new Button("1000");
        oneTH.setOnAction(e -> {final double balance = deposit00.getSave();
            double totalBalance = balance + 1000;
            Main.malak.getHistory().add("Deposited:1000 EGP");
            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();});

        Button twoTH = new Button("2000");
        twoTH.setOnAction(e -> {final double balance = deposit00.getSave();
            double totalBalance = balance + 2000;
            Main.malak.getHistory().add("Deposited:2000 EGP");
            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();});

        Button fiveTH = new Button("5000");
        fiveTH.setOnAction(e -> {final double balance = deposit00.getSave();
            double totalBalance = balance + 5000;
            Main.malak.getHistory().add("Deposited:5000 EGP");
            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();});




        HBox layout = new HBox(9);
        layout.getChildren().addAll(fiftty,oneH,twoH,fiveH,oneTH,twoTH,fiveTH);
        layout.setAlignment(Pos.CENTER);

        VBox layoutAll = new VBox(15);
        layoutAll.getChildren().addAll(label,layout);


        Scene scene = new Scene(layoutAll);
        window.setScene(scene);
        window.showAndWait();




}}
