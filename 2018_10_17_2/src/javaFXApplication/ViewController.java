package javaFXApplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private TableColumn<Szemely, String> tablaszuletesiDatum;

    @FXML
    private TableView<Szemely> tabla;

    @FXML
    private TableColumn<Szemely, Number> tablaid;

    @FXML
    private TableColumn<Szemely, String> tablavezeteknev;

    @FXML
    private TableColumn<Szemely, String> tablakeresztnev;
    
    @FXML
    private TextField szuletesidatumMezo;

    @FXML
    void hozzaadGomb(ActionEvent event) {
		/*System.out.println(textfieldid.getText());
		System.out.println(textfieldvezeteknev.getText());
		System.out.println(textfieldkeresztnev.getText());
		System.out.println(szuletesidatumMezo.getText());*/
    	Szemely szemelyAdd =new Szemely(Integer.parseInt(textfieldid.getText()), 
    			textfieldvezeteknev.getText(), 
    			textfieldkeresztnev.getText(), 
    			szuletesidatumMezo.getText());
    	adat.add(szemelyAdd);
    }
    private ObservableList<Szemely> adat =FXCollections.observableArrayList();
    
    private void adatHozzaad() {
    	Szemely szemely1=new Szemely(1, "Mel", "Gibson", "1963.05.05");
    	Szemely szemely2=new Szemely(2, "E", "T", "na");
    	Szemely szemely3=new Szemely(3, "Kimi", "Raikkönnen", "19791021");
    	adat.add(szemely1);
    	adat.add(szemely2);
    	adat.add(szemely3);
    	
    }
    
    @FXML
    void menuitemKilepes(ActionEvent event) {
    	Platform.exit();
    }
    
    private void tablazatLetrehoz() {
    	tablaid.setCellValueFactory(cellaAdat -> cellaAdat.getValue().idProperty());
    	tablavezeteknev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().vezeteknevProperty());
    	tablakeresztnev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().keresztnevProperty());
    	tablaszuletesiDatum.setCellValueFactory(cellaAdat -> cellaAdat.getValue().szuletesidatumProperty());
    	
    	tabla.setItems(adat);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        adatHozzaad();
        tablazatLetrehoz();
    }    
    
}
