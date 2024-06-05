import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ColorAndFontDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Rectangle header = new Rectangle(0, 0, Double.MAX_VALUE, 50);
        header.setFill(Color.BLACK);

        
        Label label = new Label("Hello, Arial!");
        label.setFont(Font.font("Arial", 30));
        label.setLayoutX(450);
        label.setLayoutY(300);

        
        Group root = new Group();
        root.getChildren().addAll(header, label);

        
        Scene scene = new Scene(root, 1000, 700);

        
        Image icon = new Image("reustourant_icon.png");
        stage.getIcons().add(icon);

        // Устанавливаем сцену на окно и показываем его
        stage.setScene(scene);
        stage.setTitle("Restaurant Ordering System");
        stage.show();
    }
}









