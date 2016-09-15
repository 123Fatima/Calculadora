/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author intel
 */
public class Calculadora{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lol = new Scanner(System.in);
        Suma sum = new Suma();
        Resta res = new Resta();
        Multiplicacion mul = new Multiplicacion();
        Dividir div = new Dividir();
        Exponente exp = new Exponente();
        Seno sen = new Seno(); 
        Coseno cos = new Coseno();
        Tangente tan = new Tangente();
        ATan ata = new ATan();
        Raiz rai = new Raiz();
        int opcion ;
        double resultado;
        double num1 = 0;
        double num2 = 0;
        System.out.println("Ingrese el numero con la operación deseada");
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Multiplicación");
        System.out.println("4.-División");
        System.out.println("5.-Elevar a tal número");
        System.out.println("6.-Obtener el seno de");
        System.out.println("7.-Obtener el coseno de");
        System.out.println("8.-Obtener el tangente de");
        System.out.println("9.-Obtener el arcotangente de");
        System.out.println("10.-Obtener la raíz de");
        opcion = lol.nextInt();
        switch(opcion){
            case 1: System.out.println("Ingrese el primer numero");
                    num1 = lol.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = lol.nextDouble();
                    resultado = sum.operacion(num1, num2);
                    System.out.println("Respuesta:" + resultado);
                break;
            case 2: System.out.println("Ingrese el primer numero");
                    num1 = lol.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = lol.nextDouble();
                    resultado = res.operacion(num1, num2);
                    System.out.println("Respuesta:" + resultado);
                break;
            case 3: System.out.println("Ingrese el primer numero");
                    num1 = lol.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = lol.nextDouble();
                    resultado = mul.operacion(num1, num2);
                    System.out.println("Respuesta:" + resultado);
                break;
            case 4: System.out.println("Ingrese el primer numero");
                    num1 = lol.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    num2 = lol.nextDouble();
                    resultado = div.operacion(num1, num2);
                    System.out.println("Respuesta:" + resultado);
                break;
            case 5: System.out.println("Ingrese un numero");
                    num1 = lol.nextDouble();
                    System.out.println("Ingrese el exponente");
                    num2 = lol.nextDouble();
                    resultado = exp.operacion(num1, num2);
                    System.out.println("Respuesta:" + resultado); 
                break;
            case 6: System.out.println("Ingrese un numero");
                    num1 = lol.nextDouble();
                    resultado = sen.operacion(num1);
                    System.out.println("Respuesta:" + resultado);
                break;
            case 7: System.out.println("Ingrese un numero");
                    num1 = lol.nextDouble();
                    resultado = cos.operacion(num1);
                    System.out.println("Respuesta:" + resultado);
                break;
            case 8: System.out.println("Ingrese un numero");
                    num1 = lol.nextDouble();
                    resultado = tan.operacion(num1);
                    System.out.println("Respuesta:" + resultado);
                break;
            case 9: System.out.println("Ingrese un numero");
                    num1 = lol.nextDouble();
                    resultado = ata.operacion(num1);
                    System.out.println("Respuesta:" + resultado); 
                break;
            case 10: System.out.println("Ingrese un numero");
                    num1 = lol.nextDouble();
                    resultado = rai.operacion(num1);
                    System.out.println("Respuesta:" + resultado);  
                break;
        }
        }
    }
    

