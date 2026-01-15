import javax.swing.JOptionPane;
public class ProgramacionEstructurada {
    public static void main(String[] args) {
        
    
    // Declaracion de variables
    /*
    * En esta parte del codigo se van a 
    * declarar varias tipos de variables
     **/
    int suma ;
    int resta ;
    int multi,div,mod,area;
    double resultado = 0.0, potencia;
    boolean valor = true, valor2 = false;
    float f1 = 8.9f, f2 = 10.3f;
    double d1 = 12;

    //definir una constante siempre en mayusculas
    final double PI = 3.1416 ;
    String salida = "" ;
    //Expesiones aritmetcas
    suma = 3 + 5;
    resta = 10 -12;
    multi = 34 *23;
    div = 10/2;
    mod =10 % 2;
    potencia = Math.pow(4,2);
    
    salida = " ===== Expresiones aritmeticas ===== " +
    "\n La suma es: " + suma +
    "\n La resta es:" + resta +
    "\n La multiplicacion es:" + multi +
    "\n La divicion es :" + div +
    "\n El modulo es:" + mod + 
    "\n La potencia es:" + potencia ;   
    JOptionPane.showMessageDialog (null,salida);

}
}
