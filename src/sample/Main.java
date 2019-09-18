package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

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
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
