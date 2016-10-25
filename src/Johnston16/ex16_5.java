package Johnston16;

/**
 * Created by brian on 10/9/2016.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;

public class ex16_5 extends Application {
    protected TextField decTextField = new TextField();
    protected TextField hexTextField = new TextField();
    protected TextField binTextField = new TextField();


    public void start(Stage primaryStage) {
        decTextField.setAlignment(Pos.BOTTOM_RIGHT);
        hexTextField.setAlignment(Pos.BOTTOM_RIGHT);
        binTextField.setAlignment(Pos.BOTTOM_RIGHT);


        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(10);
        gridpane.setVgap(2);
        gridpane.add(new Label("Decimal"), 0, 0);
        gridpane.add(decTextField, 1, 0);
        gridpane.add(new Label("Hex"), 0, 1);
        gridpane.add(hexTextField, 1, 1);
        gridpane.add(new Label("Binary"), 0, 2);
        gridpane.add(binTextField, 1, 2);


        decTextField.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                hexTextField.setText(Integer.toHexString(
                        Integer.parseInt(decTextField.getText())));

                binTextField.setText(Integer.toBinaryString(
                        Integer.parseInt(decTextField.getText())));
            }
        });

        hexTextField.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                decTextField.setText(String.valueOf(
                        Integer.parseInt(hexTextField.getText(), 16)));

                binTextField.setText(Integer.toBinaryString(
                        Integer.parseInt(hexTextField.getText(), 16)));
            }
        });

        binTextField.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                decTextField.setText(String.valueOf(
                        Integer.parseInt(binTextField.getText(), 2)));

                hexTextField.setText(Integer.toHexString(
                        Integer.parseInt(binTextField.getText(), 2)));
            }
        });


        Scene scene = new Scene(gridpane, 300, 150);
        primaryStage.setTitle("Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}