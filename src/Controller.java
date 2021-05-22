/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 22-05-2021
 *   Time: 05:27 PM
 *   File: Controller.java
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label result;
    private double number1 = 0;
    private String operator ="";
    private boolean start = true;
    private CalculatorFunction function = new CalculatorFunction();

    @FXML
    public void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }
        String str = ((Button) event.getSource()).getText();
        result.setText(result.getText() + str);
    }

    @FXML
    public void processOperators(ActionEvent event) {
        String str = ((Button) event.getSource()).getText();
        if (!str.equals("=")) {
            if (!operator.isEmpty())
                return;
            operator = str;
            number1 = Double.parseDouble(result.getText());
            result.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }
            double number2 = Double.parseDouble(result.getText());
            double ans = function.operations(number1, number2, operator);
            result.setText(String.valueOf(ans));
            operator = "";
            start = true;
        }
    }

}

