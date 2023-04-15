package jdbc.connection;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class JavaFxAnimation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setCenterX(150.0f);
        circle.setCenterY(150.0f);
        circle.setRadius(25.0f);
        circle.setFill(Color.BROWN);
        
        Group root = new Group(circle);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("dadadad");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
