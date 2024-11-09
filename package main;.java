
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Firststeps {
    public static void main(String[] args) {
        // Se definen los datos
        final int numero = 1;
        String nombre;
        int edad;
        //Se crea una secuencia para dar sentido a los datos
        System.out.println("El número final es:");
        System.out.println(numero);
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = lector.nextInt();
            if(edad >= 18){
                System.out.println("Sirvase la cerveza");
            }else{
                System.out.println("No puede beber cerveza");
            }
        
        System.out.println("Escriba su nombre");
        nombre = lector.nextLine();
        System.out.println("Un gusto saludarte" + nombre);
        nombre = JOptionPane.showInputDialog(nombre);
        JOptionPane.showMessageDialog(null, "Bienvenido al programa" + nombre);

    }
}
