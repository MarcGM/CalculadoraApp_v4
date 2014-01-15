/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraapp_v4;

/*
 * @author Marc
 */
public class CalculadoraApp_v4 {

    public static String num1;
    public static String num2;
    public static String operador;
    public static int resultado;
    public static boolean calOn;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        calOn = false;
        num1 = null;
        num2 = null;
        operador = null;
        resultado = 0;
         
        encenderCalculadora();
        capturarTeclas();
    }
    public static void encenderCalculadora(){
        calOn = true;
        System.out.println("Calculadora encendida");
    }
    public static void capturarTeclas(){
        while(calOn == true){
            
        }
    }
    
}
