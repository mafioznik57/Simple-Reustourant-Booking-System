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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.TextFormatter;
import javafx.stage.Modality;
import javafx.scene.control.TextArea;

public class BookingController {

    @FXML
    private Button enterButton;

    @FXML
    private Button homeButton;

    @FXML
    private Button galleryButton;

    @FXML
    private Button menuButton;

    @FXML
    private Button contactButton;

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField dateField;

    @FXML
    private TextField sizeField;

    @FXML
    private TextArea requestField;

    @FXML
    private ListView<String> bookingListView;

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        TextFormatter<String> formatter = new TextFormatter<>(change -> {
            if (change.getText().matches("[0-9]*")) {
                return change;
            }
            return null;
        });
        sizeField.setTextFormatter(formatter);
    }

    @FXML
    private void handleMassageButton(ActionEvent event) {
        if (allFieldsFilled() && allFieldsAreIntegers()) {
            addToBookingList();
            openMessageBox("You have successfully booked your place!!!");
            clearFields();
        } else {
            openMessageBox("Please fill in all required fields with integer values.");
        }
    }

    @FXML
    private void initialize() {
        loadBookingsFromFile();
    }

    private void addToBookingList() {
        String bookingDetails = "Name: " + nameField.getText() +
                                ", Email: " + emailField.getText() +
                                ", Phone: " + phoneField.getText() +
                                ", Date: " + dateField.getText() +
                                ", Size: " + sizeField.getText();
        bookingListView.getItems().add(bookingDetails);
        saveBookingToFile(bookingDetails);
    }

    private boolean allFieldsFilled() {
        return !nameField.getText().isEmpty() &&
                !emailField.getText().isEmpty() &&
                !phoneField.getText().isEmpty() &&
                !dateField.getText().isEmpty() &&
                !sizeField.getText().isEmpty() &&
                !requestField.getText().isEmpty();
    }

    private boolean allFieldsAreIntegers() {
        try {
            Integer.parseInt(phoneField.getText());
            Integer.parseInt(dateField.getText());
            Integer.parseInt(sizeField.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void clearFields() {
        nameField.clear();
        emailField.clear();
        phoneField.clear();
        dateField.clear();
        sizeField.clear();
        requestField.clear();
    }

    private void openMessageBox(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);

        Stage stage = (Stage) enterButton.getScene().getWindow();
        alert.initOwner(stage);

        alert.showAndWait();
    }

    @FXML
    private void handleHomeButton(ActionEvent event) {
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
    private void handleGallaryButton(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newWindow2.fxml"));
            Parent root = loader.load();

            GalleryController galleryController = loader.getController();

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

    private void saveBookingToFile(String bookingDetails) {
        try {
            File file = new File("bookings.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(bookingDetails);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadBookingsFromFile() {
        try {
            File file = new File("bookings.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                bookingListView.getItems().add(line);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}






