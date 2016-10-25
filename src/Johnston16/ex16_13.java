package Johnston16;

/**
 * Created by brian on 10/9/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class ex16_13 extends Application {
    protected TextField loanAmtTextField = new TextField();
    protected TextField numOfYearsTextField = new TextField();
    protected TextArea areaTextField = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        numOfYearsTextField.setPrefColumnCount(2);
        loanAmtTextField.setPrefColumnCount(7);
        areaTextField.setPrefColumnCount(30);


        Button buttonShow = new Button("Show Table");


        HBox paneForControls = new HBox(10);
        paneForControls.setAlignment(Pos.CENTER);
        paneForControls.getChildren().addAll(new Label("Loan Amount"), loanAmtTextField,
                new Label("Num of Years"), numOfYearsTextField, buttonShow);


        ScrollPane scrollPane = new ScrollPane(areaTextField);

        BorderPane pane = new BorderPane();
        pane.setTop(paneForControls);
        pane.setCenter(areaTextField);


        buttonShow.setOnAction(e -> {
            print();
        });


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Loan calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void print() {

        double intRate;
        double monthPay;
        String output = "";


        // Add table header
        output += "Interest Rate       Monthly Payment          Total Payment\n";


        for (double i = 5.0; i <= 8; i += 0.125) {
            intRate = i / 1200;
            monthPay = Double.parseDouble(loanAmtTextField.getText()) *
                    intRate / (1 - 1 / Math.pow(1 + intRate,
                    Double.parseDouble(numOfYearsTextField.getText()) * 12));

            output += String.format("%-24.3f%-34.2f%-8.2f\n", i,
                    monthPay, (monthPay * 12) *
                            Double.parseDouble(numOfYearsTextField.getText()));
        }

        areaTextField.setText(output);
    }

}