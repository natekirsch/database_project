package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        LoginController lc = new LoginController();
        lc.initialize(primaryStage);
    }


    public static void stage_settings(Stage window) {
        window.setTitle("Country Comparator");
        window.setResizable(false);

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram(window);
        });
    }

    public static void closeProgram(Stage window) {
        boolean ans = PopUp.init_confirm("Confirm Close", "Are you sure you want to quit?");
        if (ans)
            window.close();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
