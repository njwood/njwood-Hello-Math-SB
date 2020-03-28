package sample;

import javafx.fxml.FXML;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private Button btnadd;

    @FXML
    private Button btnsub;

    @FXML
    private Button btnmul;

    @FXML
    private Button btndiv;

    @FXML
    private Button btnclear;

    @FXML
    private TextField txtnum1;

    @FXML
    private TextField txtnum2;

    @FXML
    private Label lblanswer;

    @FXML
    private void handleButtonAction(ActionEvent e){
        int num1, num2, answer;
        char symbol;

        if(e.getSource() == btnclear){
            txtnum1.setText("");
            txtnum2.setText("");
            lblanswer.setText("?");
            txtnum1.requestFocus();
            return;
        }

        num1 = Integer.parseInt(txtnum1.getText());
        num2 = Integer.parseInt(txtnum2.getText());

        if(e.getSource() == btnadd){
            answer = num1 + num2;
            symbol = '+';
        }
        else if(e.getSource() == btnsub){
            answer = num1 - num2;
            symbol = '-';
        }
        else if(e.getSource() == btnmul){
            answer = num1*num2;
            symbol = '*';
        }
        else{
            answer = num1/num2;
            symbol = '/';
        }
        lblanswer.setText("" + num1 + symbol + num2 + "=" + answer + "");
    }
}
