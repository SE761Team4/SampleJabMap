package gui;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class JabMapGUI {
    //private static JabMapFrame mainFrame;
    public JabMapGUI(Stage primaryStage) {
        //mainFrame = new JabMapFrame(primaryStage);
        //Scene scene = new Scene(root, 800, 800);
        WebView webView= new WebView();
        WebEngine webEngine = webView.getEngine();
        webEngine.load(getClass().getResource("./test/test.html").toString());

        StackPane layout= new StackPane();
        layout.getChildren().add(webView);

        Scene scene1= new Scene(layout, 300, 250);
        primaryStage.setScene(scene1);

        primaryStage.setTitle("JabMap");
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


}
