/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author intel
 */
public class Dividir implements calcular  {
 public double operacion(double num1,double num2){
    double respuesta = num1 / num2;
    return respuesta;   
}

    @Override
    public double operacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}