package com.example.factura;

import com.example.model.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.math.BigDecimal;
import java.util.List;

public class HelloController {

    @FXML
    VBox productContainer;

    @FXML
    Label total;

    @FXML
    Label total2;

    @FXML
    Label total3;

    @FXML
    Label resultMsg;

    @FXML
    Label amountTotal;

    @FXML
    TextField nameClient;


    @FXML
    protected void calculateProductTotal () {
        String name = nameClient.getText();
        List<Product> productList = getAllProducts(name);
        showAlerts(name, productList);
    }

    private void showAlerts(String name, List<Product> productList) {
        showTotalAmountProducts(productList);
        setValuesMgs(name, getTotalAmount(productList));
    }

    private void setValuesMgs(String name, BigDecimal amount) {
        amountTotal.setText(String.format("Valor Total: %s", amount));
        resultMsg.setText(String.format("Sr o Sra, %s el total de su compra es: %s", name, amount));
    }


    private void showTotalAmountProducts(List<Product> productList) {
        total.setText(productList.get(0).calculateProductTotal().toString());
        total2.setText(productList.get(1).calculateProductTotal().toString());
        total3.setText(productList.get(2).calculateProductTotal().toString());
    }

    private BigDecimal getTotalAmount(List<Product> productList) {
        return productList.stream()
                .map(Product::calculateProductTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private List<Product> getAllProducts(String nameClient) {
        return productContainer.getChildren().stream()
                .filter(HBox.class::isInstance)
                .map(node -> createProductFromHBox((HBox) node, nameClient))
                .toList();
    }

    private Product createProductFromHBox(HBox hbox, String nameClient) {
        List<TextField> fields = hbox.getChildren().stream()
                .filter(TextField.class::isInstance)
                .map(TextField.class::cast)
                .toList();

        return new Product(nameClient, fields.get(0).getText(), new BigDecimal(fields.get(1).getText()), Integer.parseInt(fields.get(2).getText()));
    }
}