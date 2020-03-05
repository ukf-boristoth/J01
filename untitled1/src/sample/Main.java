package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polyline;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 1200,550);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("1");

        Polyline l1 = new Polyline(new double[] {120,300,70,370,210,370,70,170,210,170,176,240});//line(100,173,142,173);
        l1.setStroke(Color.PURPLE);
        l1.setStrokeWidth(8);
        DropShadow shadow1 = new DropShadow(65,Color.PURPLE);
        shadow1.setSpread(0.6);
        l1.setEffect(shadow1);


        Polyline l2 = new Polyline(new double[] {390,300,360,370,280,170,445,170,425,225,375,225});//line(218,173,269,173);
        l2.setStroke(Color.YELLOW);
        l2.setStrokeWidth(8);
        DropShadow shadow2= new DropShadow(65, Color.YELLOW);
        shadow2.setSpread(0.6);
        l2.setEffect(shadow2);

        Polyline l3  = new Polyline( new double [] {600,170,515,370,680,370,630,245});
        l3.setStroke(Color.RED);
        l3.setStrokeWidth(8);
        DropShadow shadow3= new DropShadow(65, Color.RED);
        shadow3.setSpread(0.6);
        l3.setEffect(shadow3);

        Polyline l4  = new Polyline( new double [] {910,170,750,170,830,370,880,240});
        l4.setStroke(Color.LIGHTGREEN);
        l4.setStrokeWidth(8);
        DropShadow shadow4= new DropShadow(65, Color.GREENYELLOW);
        shadow4.setSpread(0.6);
        l4.setEffect(shadow4);

        Polyline l5  = new Polyline( new double [] {1050,230,1060,170,1150,370,980,370,1000,310,1060,300});
        l5.setStroke(Color.CYAN);
        l5.setStrokeWidth(8);
        DropShadow shadow5= new DropShadow(65, Color.CYAN);
        shadow5.setSpread(0.6);
        l5.setEffect(shadow5);

        root.getChildren().addAll(l1, l2, l3, l4, l5);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}