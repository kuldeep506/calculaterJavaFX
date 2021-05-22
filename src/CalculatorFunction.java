/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 22-05-2021
 *   Time: 05:32 PM
 *   File: CalculatorFunction.java
 */

public class CalculatorFunction {
    public double operations(double n1, double n2, String operator) {
        if (operator.equals("+")) {
            return n1 + n2;
        }
        if (operator.equals("/")) {
            if (n2 == 0) {
                return 0;
            }
            return (float) n1 / (float) n2;
        }
        if (operator.equals("*")) {
            return n1 * n2;
        }
        if (operator.equals("-")) {
            return n1 - n2;
        }
        return 0;
    }
}
