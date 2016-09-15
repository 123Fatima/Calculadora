/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
 import java.lang.Math;
/*
import java.lang.Math;
/**
 *
 * @author intel
 */
public class Exponente implements calcular {
    public double operacion(double num1,double num2){
        return Math.pow (num1, num2);
    }

    @Override
    public double operacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
