package implementarcola;

import Datos.Cliente;
import Modelo.Cola;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelTitulo;
    
    @FXML
    private Label labelNombre;
    
    @FXML
    private Label labelTelefono;
    
    @FXML
    private Label labelCodigo;
    
    
    @FXML
    private TextField NombreTF;
    
    @FXML
    private TextField TelefonoTF;
    
    @FXML
    private TextField CodigoTF;
    
    
    @FXML
    private TextArea AreaText;
    
    Cola<Cliente> ColaP1;
    
    @FXML
    private void AgregarCola(ActionEvent event) {
        
        String nombre = NombreTF.getText();
        String telefono = TelefonoTF.getText();
        Integer codigo = Integer.parseInt(CodigoTF.getText());
        
        Cliente obj = new Cliente(nombre, telefono, codigo);
    }
    
    
    @FXML
    private void MostrarCola(ActionEvent event) {
        ColaP1.toString();
    }
    
    @FXML
    private void QuitarDeCola(ActionEvent event) {
        ColaP1.desencolar();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ColaP1 = new Cola<>();
    }    
    
}
