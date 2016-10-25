package Johnston17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by brian
 * I worked alone.
 */
public class ex_1 extends Application {
    // protected TextField filePath = new TextField();
    protected TextArea fileResults = new TextArea();

    @Override
    public void start(Stage primaryStage) throws ClassNotFoundException, IOException {
        //filePath.setPrefColumnCount(2);
        fileResults.setPrefColumnCount(30);

        Button buttonSelect = new Button("SelectFile");


        HBox paneForControls = new HBox(10);
        paneForControls.getChildren().addAll(buttonSelect);

        ScrollPane scrollPane = new ScrollPane((fileResults));
        BorderPane pane = new BorderPane();
        pane.setTop(paneForControls);
        pane.setCenter(fileResults);


        buttonSelect.setOnAction(e -> {
            try {
                getFile();
            } catch (ClassNotFoundException e1) {
                //to do
            } catch (IOException e2) {
                //to do
            }
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display File");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private void getFile() throws ClassNotFoundException, IOException {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            System.out.println("File contents: " + file.getAbsolutePath());
            System.out.println();
            showContents(file);

        }
    }

    private void showContents(File f) throws ClassNotFoundException, IOException {


        FileInputStream input = new FileInputStream(f);



        StringBuilder hexFormat = new StringBuilder();
        StringBuilder textFormat = new StringBuilder();
        StringBuilder results = new StringBuilder();
        int bytesCounter =0;
        int value = 0;

        while ((value = input.read()) != -1) {

            hexFormat.append(String.format("%02X ", value));


            if (!Character.isISOControl(value)) {
                textFormat.append((char)value);
            }else {
                textFormat.append(".");
            }


            if(bytesCounter==10){
                results.append(hexFormat).append("      ").append(textFormat).append("\n");
                hexFormat.setLength(0);
                textFormat.setLength(0);
                bytesCounter=0;
            }else{
                bytesCounter++;
            }
        }


        if(bytesCounter!=0){

            for(; bytesCounter<10; bytesCounter++){
                hexFormat.append("   ");
            }
            results.append(hexFormat).append("      ").append(textFormat).append("\n");
        }
        fileResults.setText(results.toString());
        input.close();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }


}