import javax.swing.JOptionPane;
public class Calificaciones {
    public static void main(String[] args) {
        double calif1 =0.0, calif2 =0.0, calif3 =0.0; 
        double promedio = 0.0;

        //Entrada de los datos
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduccion la calificacion 1"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("Introduccion la calificacion 2"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("Introduccion la calificacion 3"));
        
        //Operacion - Calcular el promedio

        promedio = (calif1 + calif2 + calif3)/3.0;


        // Estructura de seleccion simple
        if (promedio >= 7.0) {
            JOptionPane.showMessageDialog(null, "Aprobado");
        }// Cierra el el if
    }//Cierra el main
}//Cierra la clase
