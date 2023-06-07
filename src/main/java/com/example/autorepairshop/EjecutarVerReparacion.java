package com.example.autorepairshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EjecutarVerReparacion extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EjecutarVerReparacion.class.getResource("VistaVerReparacion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1004, 680);
        stage.setTitle("Ver Reparación!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}