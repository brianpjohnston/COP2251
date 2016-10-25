package Johnston15;

/**
 * Created by brian on 10/9/2016.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Move_ball_15_3 extends Application {
    private BallPane ballPane = new BallPane();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);
        Button leftBtn = new Button("Left");
        Button rightBtn = new Button("Right");
        Button upBtn = new Button("Up");
        Button downBtn = new Button("Down");
        hBox.getChildren().addAll(leftBtn, rightBtn, upBtn, downBtn);


        leftBtn.setOnAction(e -> ballPane.left());
        rightBtn.setOnAction(e -> ballPane.right());
        upBtn.setOnAction(e -> ballPane.up());
        downBtn.setOnAction(e -> ballPane.down());


        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10, 15, 5, 10));
        pane.setCenter(ballPane);
        pane.setBottom(hBox);


        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Move_ball_15_3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}