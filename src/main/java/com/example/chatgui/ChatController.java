package com.example.chatgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {
//    private final Image userImg = new Image("../resources/img/user.png");

    @FXML
    public ToggleButton chatBt;
    @FXML
    public ToggleButton everyoneBt;
    @FXML
    public ToggleButton profileBt;
    @FXML
    public ToggleButton settingBt;
    @FXML
    public ToggleButton logoutBt;

    @FXML
    public ListView<String> listView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Saigo", "Shiro", "Mark", "Dog");
        listView.setItems(items);

//        listView.setCellFactory(param -> new ListCell<String>() {
//            public ImageView imageView = new ImageView();
//
//            @Override
//            public void updateItem(String name, boolean empty) {
//                super.updateItem(name, empty);
//                if (empty) {
//                    setText(null);
//                    setGraphic(null);
//                } else {
//                    imageView.setImage(userImg);
//                    setText(name);
//                    setGraphic(imageView);
//                }
//            }
//        });
    }

    private void refreshButton() {
        chatBt.setSelected(false);
        everyoneBt.setSelected(false);
        profileBt.setSelected(false);
        settingBt.setSelected(false);
        logoutBt.setSelected(false);
    }

    @FXML
    public void selectChatButton() {
        refreshButton();
        chatBt.setSelected(true);
    }

    @FXML
    public void selectEveryoneButton() {
        refreshButton();
        everyoneBt.setSelected(true);
    }

    @FXML
    public void selectProfileButton() {
        refreshButton();
        profileBt.setSelected(true);
    }

    @FXML
    public void selectSettingButton() {
        refreshButton();
        settingBt.setSelected(true);
    }

}
