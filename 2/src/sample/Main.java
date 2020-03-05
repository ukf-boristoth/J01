package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox root = new HBox();
        Scene scene = new Scene(root,200,200);
        primaryStage.setTitle("2");
        primaryStage.setScene(scene);
        primaryStage.show();

        TextField vst = new TextField();
        Button b1 = new Button("DO IT");
        root.getChildren().addAll(b1,vst);
        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                String vst1 = vst.getText();
                int samohlasky = 0;
                int spoluhlasky = 0;
                for (int i = 0; i < vst1.length(); i++) {
                    String a = vst1.substring(i, i+1);
                    if (a.matches("[a,e,i,o,u,y,ä,á,é,í,ó,ô,ú,ý,A,E,I,O,U,Y,Á,É,Í,Ó,Ú,Ý]"))
                        samohlasky++;
                    if (a.matches("[d,t,n,l,h,k,g,ď,ť,ň,ľ,c,č,ž,š,j,m,b,p,v,z,s,f,r,D,T,N,L,H,K,G,Ď,Ť,Ň,Ľ,C,Č,Ž,Š,J,M,B,P,V,Z,S,F,R]"))
                        spoluhlasky++;
                }
                int r = (samohlasky*16>255) ? 255:(samohlasky*16);
                int g = (spoluhlasky*24>255) ? 255:(spoluhlasky*24);
                int b = (((vst1.length()%25)*10)>255) ? 255:((vst1.length()%25)*10);
                root.setBackground(new Background(new BackgroundFill(Color.rgb(r,g,b),null,null)));
            }
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}