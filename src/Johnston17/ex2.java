package Johnston17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;

/**
 * Created by brian johnston
 * I worked alone
 */
public class ex2 extends Application {


    protected TextField textform = new TextField();

    @Override
    public void start(Stage primaryStage) {
        Tshirt shirtnew = doesobjectexist();

        textform.setPrefColumnCount(5);
        Button saveButton = new Button("Save");
        Button closeButton = new Button("Close");


        CheckBox cbGift = new CheckBox("Is Gift?");

        final ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Small");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        RadioButton rb2 = new RadioButton("Medium");
        rb2.setToggleGroup(group);
        RadioButton rb3 = new RadioButton("Large");
        rb3.setToggleGroup(group);


        if (shirtnew != null) {
            textform.setText(shirtnew.getText());
            if (shirtnew.getSize().equals("Small")) {
                rb1.setSelected(true);
            } else if (shirtnew.getSize().equals("Medium")) {
                rb2.setSelected(true);

            } else {
                rb3.setSelected(true);
            }
            if (shirtnew.isGift()) {
                cbGift.isSelected();
            }

        } else {
            rb1.setSelected(true);
        }


        Pane root = new Pane();
        textform.setLayoutX(30);
        textform.setLayoutY(0);

        rb1.setLayoutX(00);
        rb1.setLayoutY(50);

        rb2.setLayoutX(100);
        rb2.setLayoutY(50);

        rb3.setLayoutX(200);
        rb3.setLayoutY(50);

        cbGift.setLayoutX(0);
        cbGift.setLayoutY(100);

        saveButton.setLayoutX(150);
        saveButton.setLayoutY(150);

        closeButton.setLayoutX(200);
        closeButton.setLayoutY(150);

        root.getChildren().addAll(new Label("Text"), textform, rb1, rb2, rb3, cbGift, saveButton, closeButton);

        Scene scene = new Scene(root);
        primaryStage.setTitle("T-Shirt Order Form");
        primaryStage.setScene(scene);
        primaryStage.show();

        closeButton.setOnAction(e -> {
            primaryStage.hide();
        });
        saveButton.setOnAction(e -> {
            String size;
            if (rb1.isSelected()) {
                size = "small";
            } else if (rb2.isSelected()) {
                size = "Medium";
            } else {
                size = "large";
            }
            String text = textform.getText();
            boolean gift = cbGift.isSelected();
            Tshirt shirt = new Tshirt(text, size, gift);
            try {
                saveFile(shirt);
            } catch (IOException e1) {
                System.err.println("Could not save file");
            }


        });


    }


    public static void saveFile(Tshirt shirt) throws IOException {

        try (
                ObjectOutputStream output = new ObjectOutputStream(new
                        FileOutputStream("tshirt.dat"));
        ) {

            output.writeObject(shirt.getText());
            output.writeObject(shirt.getSize());
            output.writeBoolean(shirt.isGift());

            output.close();
        }
    }

    public static Tshirt doesobjectexist() {
        try {

            ObjectInputStream input = new ObjectInputStream(new FileInputStream("tshirt.dat"));
            Object shirttext = input.readObject();
            Object shirtSize = input.readObject();
            Boolean shirtGift = input.readBoolean();


            input.close();
            Tshirt shirt = new Tshirt(shirttext.toString(), shirtSize.toString(), shirtGift);
            return shirt;
        } catch (Exception ex2) {
            System.err.print("Could not open file");

        }

        return null;
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}