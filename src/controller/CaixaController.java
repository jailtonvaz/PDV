/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.frameworkGerenciaTela.ControlledScreen;
import controller.frameworkGerenciaTela.ScreensController;
import java.net.URL;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.BLL.BLLCaixa;
import model.Caixa;
import view.ScreensFramework;

/**
 * FXML Controller class
 *
 * @author Xande
 */
public class CaixaController implements Initializable, ControlledScreen {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btnSuprimento;
    @FXML
    private Button btnFecharCaixa;
    @FXML
    private Button btnAbrirCaixa;
    @FXML
    private Button btnSangria;    
    @FXML
    private Button btnVoltar;   
    @FXML
    private Label lblCaixa;   
    @FXML
    private Label lblValorCaixa;    
    @FXML
    private Label lblUsuario;
    @FXML
    private Button btnConferenciaCaixa;    
    
    ScreensController myController;
    
    @FXML
    void btnVoltar_Click(ActionEvent event) {
        myController.setScreen(ScreensFramework.telaPrincipal);
    }
    
@FXML
    void btnAbrirCaixa_Click(ActionEvent event) {
        Caixa caixa = BLLCaixa.AbrirCaixa();
        if(caixa != null)
        {
            btnAbrirCaixa.setDisable(true);
            lblCaixa.setText("CAIXA ABERTO ");
            lblUsuario.setText(caixa.getUsuario().getColaborador().getNome());
        }
    }

    @FXML
    void btnFecharCaixa_Click(ActionEvent event) {

    }

    @FXML
    void btnSuprimento_Click(ActionEvent event) {

    }

    @FXML
    void btnSangria_Click(ActionEvent event) {

    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Date data = new Date();
        Caixa caixa = BLLCaixa.temCaixaAberto(data);
        if(caixa != null)
        {            
            btnAbrirCaixa.setDisable(true);
            lblCaixa.setText("CAIXA ABERTO ");
            lblUsuario.setText(caixa.getUsuario().getColaborador().getNome());
            lblValorCaixa.setText(NumberFormat.getCurrencyInstance().format(BLLCaixa.obterValorCaixa(data)));
        }
        else
        {
            lblCaixa.setText("CAIXA FECHADO");
        }
    }    

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
    
}
