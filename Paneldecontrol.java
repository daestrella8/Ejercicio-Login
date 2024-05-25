import java.util.ArrayList;
import java.util.Scanner;

public class Paneldecontrol {

   private Persona persona1;

   public Paneldecontrol(Persona persona) {
      persona1 = persona;
   }

   public Paneldecontrol() {
      persona1 = new Persona();
   }

   public void panelIngresoDatos() {
      Scanner scanner = new Scanner(System.in);

      System.out.println("\t Registro de Usuario \n");

      System.out.print("Nombre: ");
      persona1.setNombre(scanner.nextLine());

      System.out.print("Apellido: ");
      persona1.setApellido(scanner.nextLine());

      System.out.print("idPersonal: ");
      persona1.setIdPersonal(scanner.nextLine());

      System.out.print("Digite una contraseña: ");
      persona1.setpass(scanner.nextLine());

      persona1.generarUsuario();
   }

   public void imprimoDatosFinales(Persona persona1) {

      System.out.println("\tConfirmación de Datos\n");

      System.out.println("Nombre: " + persona1.getNombre());
      System.out.println("Apellido: " + persona1.getApellido());
      System.out.println("ID Personal: " + persona1.getIdPersonal() + "\n");
      System.out.println("Su Usuario es: " + persona1.getUsuario().getUsuario());
      System.out.println("Su contraseña es: " + persona1.getUsuario().getContrasena());

   }

   public void imprimoDatos() {

      System.out.println("\tConfirmación de Datos\n");

      System.out.println("Nombre: " + persona1.getNombre());
      System.out.println("Apellido: " + persona1.getApellido());
      System.out.println("ID Personal: " + persona1.getIdPersonal() + "\n");
      System.out.println("Su Usuario es: " + persona1.getUsuario().getUsuario());
      System.out.println("Su contraseña es: " + persona1.getUsuario().getContrasena());

   }

}