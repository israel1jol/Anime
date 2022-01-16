import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;


public class Scene1Controller{

    @FXML

    private TextField nameTextField;

    @FXML
    private TextField emailTextField;

    private Parent root;
    private Stage stage;
    private Scene scene;


    public void login(ActionEvent e) throws Exception{
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        root = loader.load();

        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.welcomeUser(name, email);

        
        scene = new Scene(root, 800, 600);
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}