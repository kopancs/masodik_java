package javaFXApplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

    @FXML
    private Label label;

    @FXML
    private TextField textfieldid;

    @FXML
    private TextField textfieldvezeteknev;

    @FXML
    private TextField textfieldkeresztnev;

    @FXML
    private TableView<?> tabla;

    @FXML
    private TableColumn<?, ?> tablaid;

    @FXML
    private TableColumn<?, ?> tablavezeteknev;

    @FXML
    private TableColumn<?, ?> tablakeresztnev;

    @FXML
    void hozzaadGomb(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
