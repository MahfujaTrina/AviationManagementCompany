/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rttit
 */
public class HeadOfSupplyChainCostController implements Initializable {

    @FXML
    private TextField HelicopterServiceBudgetTextField;
    @FXML
    private TextField HelicopterServiceCoastTextField;
    @FXML
    private TextArea resultArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("HeadOfSupplyChainDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
        String xS, yS;
        xS = HelicopterServiceBudgetTextField.getText();
        yS = HelicopterServiceCoastTextField.getText();
        int xV, yV, sum;
        xV = Integer.parseInt(xS);
        yV = Integer.parseInt(yS);
        sum = xV + yV;
        resultArea.setText("" + Integer.toString(sum));
    }

    @FXML
    private void subtractButtonOnClick(ActionEvent event) {
        resultArea.setText(""+Integer.toString(Integer.parseInt(HelicopterServiceBudgetTextField.getText())- 
                Integer.parseInt(HelicopterServiceCoastTextField.getText())));
    }

    @FXML
    private void multiplyButtonOnClick(ActionEvent event) {
        double number1 = Double.parseDouble(HelicopterServiceBudgetTextField.getText());
            double number2 = Double.parseDouble(HelicopterServiceCoastTextField.getText());
            double result = number1 * number2;
            resultArea.setText(String.valueOf(result));
    }

    @FXML
    private void clearButtonOnClick(ActionEvent event) {
        HelicopterServiceBudgetTextField.clear();
        HelicopterServiceCoastTextField.clear();
        resultArea.clear();
    }
    
}
