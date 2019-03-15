package sample;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class Main extends Application
{   LoginAuth authentication ;
    Stage window;
    Scene scene1, scean2;
    String x ;
    int noOfClicks=0;
    Button button;
    Boolean validatePasscode = false;
    public PrevNext ShowHistory = new PrevNext();
    public int PN= ShowHistory.getNumber();
    public WindowNo2 PrintArray = new WindowNo2();
    public static Array malak=new Array();



    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {

        ArrayList <String>  History = new ArrayList(5);
        window = primaryStage;
        PasswordField passwordField = new PasswordField();

        Label passBox = new Label();
        passBox.setFont(Font.font("Verdana",40));
        passwordField.setMaxSize(90, 70);

        Button number1 = new Button("1 ");
        number1.setOnAction(e ->{
            if (noOfClicks==0) {x="1"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "1";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "1"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number2 = new Button("2");
        number2.setOnAction(e ->{
            if (noOfClicks==0) {x="2"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "2";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "2"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number3 = new Button("3");
        number3.setOnAction(e ->{
            if (noOfClicks==0) {x="3"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "3";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "3"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number4 = new Button("4");
        number4.setOnAction(e ->{
            if (noOfClicks==0) {x="4"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "4";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "4"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number5 = new Button("5");
        number5.setOnAction(e ->{
            if (noOfClicks==0) {x="5"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "5";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "5"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number6 = new Button("6");
        number6.setOnAction(e ->{
            if (noOfClicks==0) {x="6"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "6";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "6"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number7 = new Button("7");
        number7.setOnAction(e ->{
            if (noOfClicks==0) {x="7"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "7";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "7"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number8 = new Button("8");
        number8.setOnAction(e ->{
            if (noOfClicks==0) {x="8"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "8";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "8"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number9 = new Button("9");
        number9.setOnAction(e ->{
            if (noOfClicks==0) {x="9"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "9";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "9"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );
        Button number0 = new Button("0");
        number0.setOnAction(e ->{
            if (noOfClicks==0) {x="0"; noOfClicks++; passwordField.setText(x);passBox.setText("•");}
            else if (noOfClicks==3){
                x += "0";noOfClicks++;passwordField.setText(x);passBox.setText("••••");
                authentication = new LoginAuth(x);
                boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");
                    noOfClicks=0; x=null;
                    passwordField.setText(x);
                    passBox.setText(x);

                }}
            else {
                x += "0"; passwordField.setText(x);if (noOfClicks==1)passBox.setText("••");
                if (noOfClicks==2) passBox.setText("•••");noOfClicks++;
            }
            System.out.println(x);}
        );





        Button clear = new Button("CLEAR");
        clear.setOnAction(e ->{
            noOfClicks=0; x=null;
            passwordField.setText(x);
            passBox.setText(x);
            System.out.println(x);} );

        /*Button login = new Button("LOGIN");
        login.setMinWidth(90);
        login.setOnAction(e -> {
            authentication = new LoginAuth(x);
            boolean valid = authentication.ValidationOfEnteredPasscode(x);
                if (valid) {
                    System.out.println("YES");
                    // change scene to scene 2
                    window.setScene(scean2);

                }
                else{
                    System.out.println("NOPE");
                    Alert.display("ERROR","PLEASE TRY AGAIN!");

                } });*/

        HBox l147 = new HBox(5);
        l147.getChildren().addAll(number1,number2,number3);

        HBox l258 = new HBox(5);
        l258.getChildren().addAll(number4,number5,number6);

        HBox l369 = new HBox(5);
        l369.getChildren().addAll(number7,number8,number9);

        HBox zeroNclear = new HBox(5);
        zeroNclear.getChildren().addAll(number0,clear);

        VBox layoutAll = new VBox(5);
        layoutAll.getChildren().addAll(l147,l258,l369,zeroNclear);

        VBox layoutAll2 = new VBox(5);
        layoutAll2.getChildren().add(layoutAll);
        layoutAll2.setAlignment(Pos.CENTER);

        HBox layoutAll3 = new HBox(5);
        layoutAll3.getChildren().addAll(layoutAll2);
        layoutAll3.setAlignment(Pos.CENTER);

        HBox passss = new HBox(5);
        passss.getChildren().addAll(passBox);
        passss.setAlignment(Pos.CENTER);

        VBox fin = new VBox(5);
        fin.getChildren().addAll(passss,layoutAll3);

        scene1 = new Scene(fin, 200, 200);

        // END OF SCENE ONE

        Button withdraw = new Button("WITHDRAW");
        withdraw.setOnAction(e -> WindowNo1.withdraw());


        Button deposit = new Button("DEPOSIT");
        deposit.setOnAction(e -> WindowNo2.deposit() );

        Label labelMainMenu = new Label();


        Button balanceInquiry = new Button("BALANCE INQUIRY");
        balanceInquiry.setOnAction(e -> {

            SaveMyBalance deposit00 = new SaveMyBalance();
            double what = deposit00.getSave();
            labelMainMenu.setText("BALANCE IS " + what);

        });

       //ShowHistory.setNumber(5);

        Button previous = new Button("PREVIOUS");
        previous.setOnAction(e-> {
            labelMainMenu.setText(malak.getHistory().get(PN));
            ShowHistory.setNumber(PN++);
        });
        //previous.setOnAction();





        Button next = new Button("NEXT");
        /*previous.setOnAction(e-> {
            if(PN>0){
            labelMainMenu.setText(malak.getHistory().get(PN));
                ShowHistory.setNumber(PN--);}
        }); */

        /*next.setOnAction(e -> {
            mainTransactions objectTrans = new mainTransactions();
            if (objectTrans.amounts.size()>objectTrans.index){
                if (objectTrans.amounts.size()<=0){
                    labelMainMenu.setText("NO HISTORY");

                }
                else
                {labelMainMenu.setText(String.valueOf(objectTrans.types));}
            }
            else
            {labelMainMenu.setText("NO MORE");}

        }); */


        VBox layout2 = new VBox(0);
        layout2.getChildren().addAll(withdraw,deposit,balanceInquiry,labelMainMenu,previous,next);
        layout2.setAlignment(Pos.CENTER);
        scean2 = new Scene(layout2,200,200);

        window.setTitle("HELLO!!!");

        primaryStage.setScene(scene1);
        primaryStage.show();
    }

}