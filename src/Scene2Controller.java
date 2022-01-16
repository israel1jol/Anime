import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller{
    @FXML
    Label welcomeLabel;

    public void welcomeUser(String user, String email){
        welcomeLabel.setText("Welcome "+user
            +", it's nice to see you again. We sent you an email at "+email
            +" to get things going.");
    }
}