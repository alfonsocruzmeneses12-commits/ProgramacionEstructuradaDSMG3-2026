package Ciclosjava;
import javax.swing.JOptionPane;
public class menu {
    public static void main(String[] args) {
        // Declarar variables
        String menu = "", opcion = "";
        Boolean sentinel = true;

        //Crear la cadena de texto para el menu
        menu = " ===== MENU ======\n"+ 
        "1)Opcion 1 \n"+ 
        "2)Opcion 2 \n" +
        "3)Opcion 3 \n" +
        "4)Salir" +
        "\nElegir Opcion: ";
    do{

        //Mostrar el menu
        opcion = JOptionPane.showInputDialog(menu);
        switch (opcion.toUpperCase()) {
            case "1":
                case "A":
                JOptionPane.showMessageDialog(null, "Opcion 1");
                break;
        case "2":
            case "B":
            JOptionPane.showMessageDialog(null, "Opcion 2");
            break;
            case "3":
                case "C":
                JOptionPane.showMessageDialog(null, "Opcion 3");
                break;
                case "4":
                    case "S":
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                    break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
    }while (sentinel);{
        
    }
    }//Cierra la calse

}//Cierra el main
