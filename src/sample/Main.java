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
        TilePane pane = new TilePane();
        pane.setHgap(0);
        pane.setVgap(0);
        pane.setPrefColumns(8);
        pane.setPrefRows(8);

        ImageView[][] pieces = new ImageView[8][8];
        ImageView[][] background = new ImageView[8][8];
        Controller controller = new Controller(pieces, background);

        for (int j = 0; j < 8; j++){
            for (int i = 0; i < 8; i++){
                background[i][j] = new ImageView();
                pieces[i][j] = new ImageView();

                final int i2 = i;
                final int j2 = j;
                StackPane currentPane = new StackPane(background[i][j], pieces[i][j]);
                currentPane.setOnMouseClicked(e -> {
                    controller.handle( i2, j2);
                });

                pane.getChildren().add(currentPane);
            }
        }
        controller.initialize();

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
