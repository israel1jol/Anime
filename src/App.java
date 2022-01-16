import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch();
    }
    
    @Override
    public void start(Stage stage) throws Exception{
        Parent fxml1 = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene1 = new Scene(fxml1);



        stage.setScene(scene1);
        stage.setTitle("Log in");
        stage.show();
    }


}
