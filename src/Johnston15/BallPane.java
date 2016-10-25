package Johnston15;/**
 * Created by brian on 10/9/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BallPane extends Pane {
    private Circle circle = new Circle(25, 25, 25);


    public BallPane() {
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);
        getChildren().add(circle);
    }

    // Move ball left
    public void left() {
        circle.setCenterX(circle.getCenterX() > circle.getRadius() ?
                circle.getCenterX() - 20 : circle.getCenterX());
        circle.setCenterY(circle.getCenterY());
    }

    // Move ball right
    public void right() {
        circle.setCenterX(circle.getCenterX() < getWidth() - circle.getRadius() ?
                circle.getCenterX() + 20 : circle.getCenterX());
        circle.setCenterY(circle.getCenterY());
    }

    // Move ball up
    public void up() {
        circle.setCenterY(circle.getCenterY() > circle.getRadius() ?
                circle.getCenterY() - 20 : circle.getCenterY());
        circle.setCenterX(circle.getCenterX());
    }

    // Move ball down
    public void down() {
        circle.setCenterX(circle.getCenterX());
        circle.setCenterY(circle.getCenterY() < getHeight() - circle.getRadius() ?
                circle.getCenterY() + 20 : circle.getCenterY());
    }
}