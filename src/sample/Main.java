package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    Button button = new Button();

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        TilePane pane = new TilePane();
        pane.setHgap(0);
        pane.setVgap(0);
        pane.setPrefColumns(8);
        pane.setPrefRows(8);

        ImageView[][] boardState = new ImageView[8][8];
        Controller controller = new Controller(boardState);

        Image blkImg = new Image("sample/images/blackSquare.png");
        Image whtImg = new Image("sample/images/whiteSquare.png");


        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                boardState[i][j] = new ImageView();
                final int i2 = i;
                final int j2 = j;
                boardState[i][j].setOnMouseClicked(e -> {
                    controller.handle( i2, j2);
                });
                ImageView background;
                if ( (i+j) % 2 == 1) background = new ImageView(whtImg);
                else background = new ImageView(blkImg);

                pane.getChildren().add(new StackPane(background, boardState[i][j]));
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public void handle(ActionEvent e){

    }

    public static void main(String[] args) {
        launch(args);
    }
}
