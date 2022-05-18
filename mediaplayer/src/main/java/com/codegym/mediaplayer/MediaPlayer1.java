package com.codegym.mediaplayer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

public class MediaPlayer1 implements Initializable {
    public MediaView idMediaView;
    @FXML
private VBox vBoxParent;

    @FXML
    private MediaView mvVideo;
    private javafx.scene.media.MediaPlayer mpVideo;
    private Media mediaVideo;

    @FXML
    private HBox hBoxControl;

    @FXML
    private HBox hBoxVolume;

    @FXML
    private Button buttonPPR;

    @FXML
    private Label labelCurrentTime;
    @FXML
    private Label labelTotalTime;
    @FXML
    private Label labelSpeed;
    @FXML
    private Label labelFullScreen;
    @FXML
    private Label labelVolume;

    @FXML
    private Slider sliderTime;

    @FXML
    private Slider sliderVolume;

    private boolean atEndOfVideo = false;
    private boolean isPlaying = true;
    private boolean isMuted = true;

    private ImageView ivPlay;
    private ImageView ivPause;
//    private ImageView ivPlay;
//    private ImageView ivPlay;
//    private ImageView ivPlay;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}