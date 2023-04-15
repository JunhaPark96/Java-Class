package jdbc.connection;

import javafx.application.*;
import javafx.collections.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class JavaFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ObservableList<PieChart.Data> pieData =
                FXCollections.observableArrayList(new PieChart.Data("IT Programs", 40),
                        new PieChart.Data("Nursing", 70), new PieChart.Data("Accounting", 20),
                        new PieChart.Data("Arts", 30), new PieChart.Data("Enginerring", 10));
        
         PieChart pChart = new PieChart(pieData);
         
         Group root = new Group(pChart);
         Scene scene = new Scene(root, 600, 400);
         primaryStage.setTitle("Pie Chart");
         primaryStage.setScene(scene);
         primaryStage.show();
         
    }

}
