package com.codegym.mediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("videoplayer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.getIcons().add(new Image("https://media-exp1.licdn.com/dms/image/C510BAQEdjKl11NB6-g/company-logo_200_200/0/1519959194921?e=2147483647&v=beta&t=aw701egxIiTMH5Bvt-yh_lpGyHkBPo5yrORm7DeQ840"));
        stage.setTitle("Media Player for Quoc Dai!");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}