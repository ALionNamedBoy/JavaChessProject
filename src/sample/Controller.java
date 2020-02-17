package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;

public class Controller {
    private enum ControllerState{START, NOSELECTION, ACTIVESELECTION, END}
    private enum Player{WHITE, BLACK}

    Image blkImg = new Image("sample/images/blackSquare.png");
    Image whtImg = new Image("sample/images/whiteSquare.png");
    Image ylwImg = new Image("sample/images/yellowSquare.png");

    private ControllerState state = ControllerState.NOSELECTION;
    private ImageView[][] pieces;
    private ImageView[][] background;
    private int pieceLoc_i, pieceLoc_j;

    public Controller(){}
    Controller(ImageView[][] pieces, ImageView[][] background){
        this.pieces = pieces;
        this.background = background;
    }

    void initialize(){

        for (int j = 0; j < 8; j++){
            for (int i = 0; i < 8; i++){

                if ((i + j) % 2 == 1) background[i][j].setImage(whtImg);
                else background[i][j].setImage(blkImg);

            }
        }

    }
    
    void handle(final int i, final int j){
        switch (state){
            case NOSELECTION:

            case ACTIVESELECTION:

        }
    }

}
