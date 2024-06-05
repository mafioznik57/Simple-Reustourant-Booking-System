import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.stage.Modality;
import javafx.scene.Node;

public class GalleryController{

	@FXML
	private Button homeButton3;

    @FXML
    private Button bookingButton3;

    @FXML
    private Button manuButton3;

    @FXML
    private Button contactButton3;

	@FXML
	private void handleHomeButton(ActionEvent event){
		try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("simple.fxml"));
        Parent root = loader.load();

        SimpleController simpleController = loader.getController();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Royal Bite");

        
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setFullScreen(true);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());

        stage.showAndWait(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
    @FXML
    private void handleBookingButton(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow.xml"));
        Parent root = loader.load();

        BookingController contactController = loader.getController();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Royal Bite");

        
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setFullScreen(true);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());

        stage.showAndWait(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleMenuButton(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow3.fxml"));
        Parent root = loader.load();

        MenuController menuController = loader.getController();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Royal Bite");

        
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setFullScreen(true);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());

        stage.showAndWait(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleContactButton(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow4.xml"));
        Parent root = loader.load();

        ContactController contactController = loader.getController();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Royal Bite");

        
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setFullScreen(true);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());

        stage.showAndWait(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}