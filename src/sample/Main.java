package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application implements EventHandler<ActionEvent> {

    Button button = new Button();

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        TilePane root = new TilePane();
        ArrayList<ImageView> imgView = new ArrayList<>();
        Image bBishop = new Image("sample/images/45px-Chess_bdt45.svg.png");
        Image wBishop = new Image("sample/images/45px-Chess_blt45.svg.png");
        Image bKing = new Image("sample/images/45px-Chess_kdt45.svg.png");
        Image wKing = new Image("sample/images/45px-Chess_klt45.svg.png");
        System.out.println(imgView.size());
        root.setHgap(8);
        root.setPrefColumns(4);
        for (int i = 0; i < 4; i++) {
            imgView.add(new ImageView());
            root.getChildren().add(imgView.get(i));
        }
        imgView.get(0).setImage(bBishop);
        imgView.get(1).setImage(wBishop);
        imgView.get(2).setImage(bKing);
        imgView.get(3).setImage(wKing);
        button.setText("ok");
        button.setOnAction(e -> {
            imgView.get(0).setImage(null);
            imgView.get(1).setImage(bBishop);
        });
        root.getChildren().add(button);
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public void handle(ActionEvent e){

    }

    public static void main(String[] args) {
        launch(args);
    }
}
