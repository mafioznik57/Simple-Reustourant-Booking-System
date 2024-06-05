import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;

public class SimpleController{
    @FXML
    private Button bookingButton;

    @FXML
    private Button secondBookingButton;

    @FXML
    private Button galleryButton;
    
    @FXML
    private Button menuButton;

    @FXML
    private Button secondMenuButton;

    @FXML
    private Button contactButton;

    @FXML
    private void handleBookingButton(ActionEvent event) {
        openNewWindow();
    }

    @FXML
    private void handleSecondBookingButton(ActionEvent event) {
        openNewWindow();
    }
    @FXML
    private void handleGalleryButton(ActionEvent event){
        openNewWindow2();
    }
    @FXML
    private void handleMenuButton(ActionEvent event){
        openNewWindow3();
    }
    @FXML
    private void handleSecondMenuButton(ActionEvent event){
        openNewWindow3();
    }
    @FXML
    private void handleContactButton(ActionEvent event){
        openNewWindow4();
    }


    private void openNewWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow.xml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Booking");
            stage.setScene(new Scene(root));
            stage.show();
            stage.setFullScreen(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void openNewWindow2() {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow2.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Gallery");
            stage.setScene(new Scene(root));
            stage.show();
            stage.setFullScreen(true);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
        private void openNewWindow3() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow3.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Menu");
            stage.setScene(new Scene(root));
            stage.show();
            stage.setFullScreen(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void openNewWindow4() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow4.xml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Contact");
            stage.setScene(new Scene(root));
            stage.show();
            stage.setFullScreen(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
}


