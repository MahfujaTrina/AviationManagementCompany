/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rttit
 */
public class HeadOfSupplyChainSupplierMonitoringController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private Button loadPieChartButton;
    
    private ObservableList <PieChart.Data> list 
            = FXCollections.observableArrayList();
    
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
    private void loadPieChartButtonOnClick(ActionEvent event) {
        
        pieChart.getData().clear();
        list.add( new PieChart.Data("Flight Operations",90) );
        list.add( new PieChart.Data("Safety and Compliance",80) );
        list.add( new PieChart.Data("Maintenance and Repairs",50) );
        list.add( new PieChart.Data("Inventory Management",40) );
        list.add( new PieChart.Data("Fleet Management",70) );
        list.add( new PieChart.Data("Customer Service",100) );
        
        pieChart.setData(list);
        
    }
    
}
