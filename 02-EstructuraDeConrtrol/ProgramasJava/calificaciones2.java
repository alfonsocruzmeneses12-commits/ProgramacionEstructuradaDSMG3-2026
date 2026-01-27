import javax.swing.JOptionPane;

public class calificaciones2 {
    public static void main(String[] args) {
        //Declaracion de variable
        double calif1, calif2, calif3, promedio;
        final int NUM_CALIF=3;

        //Entrada de Datos
        calif1 = Double.parseDouble
        (JOptionPane.showInputDialog
            ("Introducce la calificacion1"));
        calif2 = Double.parseDouble
        (JOptionPane.showInputDialog
            ("Introducce la calificacion2"));
        calif3 = Double.parseDouble
        (JOptionPane.showInputDialog
            ("Introducce la calificacion3"));

            //Proceso: Calculo del promedio

            promedio = (calif1 +calif2 +calif3) / NUM_CALIF;

            //Compracion con una estructura selectiva doble

            if (promedio >= 7.0) {
                JOptionPane.showMessageDialog
                (null, "Aprobado");
            }
            else{
                JOptionPane.showMessageDialog
                (null, "No aprobado");
            }
        } //cierra el main
    
} //cierra la clase
