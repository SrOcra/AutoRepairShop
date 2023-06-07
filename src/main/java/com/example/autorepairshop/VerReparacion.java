package com.example.autorepairshop;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class VerReparacion implements Initializable {
    //id de la tabla
    @FXML
    public TableView<DatosReparacion> RecibeDatosClienteAuto;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeNumOrden;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeNombreyApellido;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeMail;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeDireccion;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeAño;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeModelo;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeMarca;
    @FXML
    public TableColumn<DatosReparacion, String> RecibePatente;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeMotor;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeChasis;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeElProblema;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeElEstado;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeLaSolucion;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeDocumento;
    @FXML
    public TableColumn<DatosReparacion, String> RecibeElValor;


    //Datos sobre el cliente
    @FXML
    public TextField NombreApellidoText;
    @FXML
    public TextField DireccionText;
    @FXML
    public TextField TelefonoText;
    @FXML
    public TextField DocumentoText;
    @FXML
    public Label CostosdeReparacion;
    @FXML
    public TextArea ProblemasTextArea;


    //Datos de reparacion
    @FXML
    public MenuButton SeleccionaEstado;
    @FXML
    public MenuItem AbiertaSeleccion;
    @FXML
    public MenuItem CerradoSeleccion;
    @FXML
    public MenuItem EnRevisionSeleccion;
    @FXML
    public MenuItem EnEsperaSeleccion;
    //
    @FXML
    public TextArea InfoReparacionTextArea;
    @FXML
    public Button GuardarReparacionBoton;


    //busca cosas

    @FXML
    public TextField NombreApellidoBuscaText;

    @FXML
    public TextField NumOrdenBuscaText;

    @FXML
    public TextField PatenteBuscaText;

    //botones
    @FXML
    public Button AbreHistorialBoton;
    @FXML
    public Button EntregarAutoBoton;
    @FXML
    public Button CerrarVerReparacion;
    @FXML
    public DatePicker SeleccionaFechaEnVerReparacion;



    private ObservableList<DatosReparacion> data;
    public String DatosNuevos;
    @FXML
    protected void RecibeDatosClienteAuto(){
        String NumeroOrden = RecibeNumOrden.getText();
        String NombreyApellido = RecibeNombreyApellido.getText();
        String Mail = RecibeMail.getText();
        String Direccion = RecibeDireccion.getText();
        String Año = RecibeAño.getText();
        String Modelo = RecibeModelo.getText();
        String Marca = RecibeMarca.getText();
        String Patente = RecibePatente.getText();
        String Motor = RecibeMotor.getText();
        String Chasis = RecibeChasis.getText();
        String Problema = RecibeElProblema.getText();
        String Estado = RecibeElEstado.getText();
        String Solucion = RecibeLaSolucion.getText();
        String Documento = RecibeDocumento.getText();
        String Valor = RecibeElValor.getText();
        DatosReparacion DatosClienteVR = new DatosReparacion (NumeroOrden, NombreyApellido, Mail, Direccion,
                Año, Modelo, Marca , Patente, Motor, Chasis, Problema, Estado,
                Solucion, Documento, Valor);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        data = FXCollections.observableArrayList(
                new DatosReparacion ("NumeroOrden", "NombreyApellido", "Mail", "Direccion",
                        "Año", "Modelo", "Marca" , "Patente", "Motor", "Chasis", "Problema", "Estado",
                        "Solucion", "Documento", "Valor")
        );

        RecibeNumOrden.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Número de Orden:"));
        RecibeNombreyApellido.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Nombre y Apellido:"));
        RecibeMail.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Mail:"));
        RecibeDireccion.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Direccion:"));
        RecibeAño.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Año:"));
        RecibeModelo.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Modelo:"));
        RecibeMarca.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Marca:"));
        RecibePatente.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Patente:"));
        RecibeMotor.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Motor:"));
        RecibeChasis.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Chasis:"));
        RecibeElProblema.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Problema:"));
        RecibeElEstado.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Estado:"));
        RecibeLaSolucion.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Solucion:"));
        RecibeDocumento.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("D.N.I:"));
        RecibeElValor.setCellValueFactory(new PropertyValueFactory<DatosReparacion,String>("Valor:"));


        RecibeDatosClienteAuto.setItems(data);

    }
}