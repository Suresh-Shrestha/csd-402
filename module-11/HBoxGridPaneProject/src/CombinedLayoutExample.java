// Suresh Shrestha
// 5/21/2026
// Module-11.2 Assignment
// This program demonstrates JavaFX HBox and GridPane layouts.

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CombinedLayoutExample extends Application {

    @Override
    public void start(Stage stage) {
        // ----- Top HBox -----
        Button homeButton = new Button("Home");
        Button settingsButton = new Button("Settings");
        Button profileButton = new Button("Profile");
        HBox topBar = new HBox(10, homeButton, settingsButton, profileButton);
        topBar.setPadding(new Insets(10));
        topBar.setStyle("-fx-background-color: #dddddd;");

        // ----- Center GridPane -----
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(10);
        grid.setVgap(10);

        // Input fields
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        // Add to grid: (node, column, row)
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(emailLabel, 0, 1);
        grid.add(emailField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        // ----- Combine using BorderPane -----
        // BorderPane lets the HBox sit on top and GridPane fill the center
        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(grid);

        // ----- Scene -----
        Scene scene = new Scene(root, 400, 250);
        stage.setScene(scene);
        stage.setTitle("JavaFX Layout Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
