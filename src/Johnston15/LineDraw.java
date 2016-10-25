package Johnston15;

/**
 * Created by brian on 10/9/2016.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.shape.Polyline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LineDraw extends Application {
    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();


        Polyline polyline = new Polyline(new Double(150.0), new Double(150.0));
        polyline.setFill(Color.WHITE);
        polyline.setStroke(Color.BLUE);
        pane.getChildren().add(polyline);
        ObservableList<Double> list = polyline.getPoints();


        pane.setOnKeyPressed(e -> {
            double x = 0, y = 0;
            double length = 10;
            switch (e.getCode()) {
                case LEFT:
                    x = list.get(list.size() - 2) - length;
                    y = list.get(list.size() - 1);
                    break;
                case RIGHT:
                    x = list.get(list.size() - 2) + length;
                    y = list.get(list.size() - 1);
                    break;
                case DOWN:
                    x = list.get(list.size() - 2);
                    y = list.get(list.size() - 1) + length;
                    break;
                case UP:
                    x = list.get(list.size() - 2);
                    y = list.get(list.size() - 1) - length;
                    break;


            }
            list.add(x);
            list.add(y);
        });


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("LineDraw");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }
}