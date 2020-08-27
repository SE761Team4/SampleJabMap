import gui.JabMapGUI;
import gui.MindMap;
import javafx.application.Application;
import javafx.stage.Stage;

public class JabMapMain extends Application{

    private static String[] arguments;

    private MindMap mindMap;
    public static void main(String[] args) {
        arguments = args;
        launch(arguments);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        new JabMapGUI(primaryStage);
    }
}
