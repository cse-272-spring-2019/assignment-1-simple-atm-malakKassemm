package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WindowNo1 {
    //public static Boolean whatButWithdraw;

    public static void withdraw(){
        Stage window = new Stage();
        //final double balance ;

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("WITHDRAW");
        window.setMinWidth(250);

        Label label = new Label();
        label.setText("PLEASE CHOSE THE AMOUNT YOU WANT TO WITHDRAW ");

        SaveMyBalance deposit00 = new SaveMyBalance();

        Button fiftty = new Button("50");
        fiftty.setOnAction(e -> {final double balance = deposit00.getSave();
            if (balance >= 50){
                double totalBalance = balance - 50;

                deposit00.setSave(totalBalance);
                System.out.print(totalBalance);
                window.close();}
            else {Alert.display("ERROR","NOT ENOUGH MONEY IN YOUR A/C");}

        });

        Button oneH = new Button("100");
        oneH.setOnAction(e -> {final double balance = deposit00.getSave();
            if (balance >= 100){
                double totalBalance = balance - 100;
                deposit00.setSave(totalBalance);
                System.out.print(totalBalance);
                window.close();}
            else {Alert.display("ERROR","NOT ENOUGH MONEY IN YOUR A/C");}

        });

        Button twoH = new Button("200");
        twoH.setOnAction(e -> {final double balance = deposit00.getSave();
            if (balance >= 200){
                double totalBalance = balance - 200;
                Main.malak.getHistory().add("Withdraw:200 EGP");
                deposit00.setSave(totalBalance);
                System.out.print(totalBalance);
                window.close();}
            else {Alert.display("ERROR","NOT ENOUGH MONEY IN YOUR A/C");}

        });


        Button fiveH = new Button("500");
        fiveH.setOnAction(e -> {final double balance = deposit00.getSave();
            if (balance >= 500){
                double totalBalance = balance - 500;
                Main.malak.getHistory().add("Withdraw:500 EGP");
                deposit00.setSave(totalBalance);
                System.out.print(totalBalance);
                window.close();}
            else {Alert.display("ERROR","NOT ENOUGH MONEY IN YOUR A/C");}

        });

        Button oneTH = new Button("1000");
        oneTH.setOnAction(e -> {final double balance = deposit00.getSave();
            if (balance >= 1000){
                double totalBalance = balance - 1000;
                deposit00.setSave(totalBalance);
                System.out.print(totalBalance);
                window.close();}
            else {Alert.display("ERROR","NOT ENOUGH MONEY IN YOUR A/C");}

        });

        Button twoTH = new Button("2000");
        twoTH.setOnAction(e -> {final double balance = deposit00.getSave();
            if (balance >= 2000){
                double totalBalance = balance - 2000;
                deposit00.setSave(totalBalance);
                System.out.print(totalBalance);
                window.close();}
            else {Alert.display("ERROR","NOT ENOUGH MONEY IN YOUR A/C");}

        });

        Button fiveTH = new Button("5000");
        fiveTH.setOnAction(e -> {final double balance = deposit00.getSave();
            if (balance >= 5000){
            double totalBalance = balance - 5000;
            deposit00.setSave(totalBalance);
            System.out.print(totalBalance);
            window.close();}
            else {Alert.display("ERROR","NOT ENOUGH MONEY IN YOUR A/C");}

    });




        HBox layout = new HBox(9);
        layout.getChildren().addAll(fiftty,oneH,twoH,fiveH,oneTH,twoTH,fiveTH);
        layout.setAlignment(Pos.CENTER);

        VBox layoutAll = new VBox(15);
        layoutAll.getChildren().addAll(label,layout);


        Scene scene = new Scene(layoutAll);
        window.setScene(scene);
        window.showAndWait();

    }

}
