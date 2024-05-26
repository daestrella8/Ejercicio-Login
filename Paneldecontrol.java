import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Paneldecontrol {

   Persona persona = new Persona();
   Scanner scanner = new Scanner(System.in);
   private String name;
   private int n = 0;
   ArrayList<Persona> personas = new ArrayList<>();

   public Paneldecontrol() {

   }

   public void panelPrincipal() throws IOException, InterruptedException {

      int opt;
      String option;

      while (true) {

         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         System.out.println("\tBienvenido al Panel Principal\n");
         System.out.println("1. Ingresar un Usuario");
         System.out.println("2. Ver Usuaios Registrados");
         System.out.println("3. Salir\n");

         System.out.print("[+] Digite su opción: ");
         opt = scanner.nextInt();

         if (opt == 1) {
            persona = generarObjeto();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            panelIngresoDatos(persona);

            System.out.println("\n[+] Generando Usuario......\n");
            Thread.sleep(3 * 1000);

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            imprimoDatos(persona);

            System.out.print("\n[+] Usuario Creado Correctamente Desea volver al panel Principal?(s/n): ");
            option = scanner.nextLine().toLowerCase();

            if (option.equals("s")) {

               panelPrincipal();

            } else if (option.equals("n")) {
               System.exit(0);
            }

         } else if (opt == 2) {

            option = "";
            scanner.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\t Persona Registradas\n");

            if (personas.size() == 0) {
               System.out.println("\n[!] No se a registrado Ningun Usuario :( ");
            } else {
               for (int i = 0; i < personas.size(); i++) {
                  imprimoPersonas(personas.get(i));
               }
            }

            System.out.print("\n[+] Lista de usuario registrados mostrada, Desea volver al panel principal?(s/n): ");
            option = scanner.nextLine().toLowerCase();

            if (option.equals("s")) {
               panelPrincipal();

            } else if (option.equals("n")) {
               System.exit(0);
            }

         } else if (opt == 3) {
            System.out.println("\n[+] Gracias por visitarnos, Tenga un Buen Dia :)\n");
            System.exit(0);
         } else {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("[!] Opción Invalida !!!!!");
            Thread.sleep(3 * 1000);
            panelPrincipal();
         }

      }
   }

   public void panelIngresoDatos(Persona name) {

      System.out.println("\t Registro de Usuario \n");
      scanner.nextLine();

      System.out.print("Nombre: ");
      name.setNombre(scanner.nextLine());

      System.out.print("Apellido: ");
      name.setApellido(scanner.nextLine());

      System.out.print("idPersonal: ");
      name.setIdPersonal(scanner.nextLine());

      System.out.print("Digite una contraseña: ");
      name.setpass(scanner.nextLine());

      name.generarUsuario();
   }

   public void imprimoDatos(Persona name) {

      System.out.println("\tConfirmación de Datos\n");

      System.out.println("Nombre: " + name.getNombre());
      System.out.println("Apellido: " + name.getApellido());
      System.out.println("ID Personal: " + name.getIdPersonal() + "\n");
      System.out.println("Su Usuario es: " + name.getUsuario().getUsuario());
      System.out.println("Su contraseña es: " + name.getUsuario().getContrasena());
      personas.add(name);

   }

   public void imprimoPersonas(Persona name) {

      System.out.println("Nombre: " + name.getNombre());
      System.out.println("Apellido: " + name.getApellido());
      System.out.println("ID Personal: " + name.getIdPersonal() + "\n");
      System.out.println("Su Usuario es: " + name.getUsuario().getUsuario());
      System.out.println("Su contraseña es: " + name.getUsuario().getContrasena());

      System.out.println("\n############################################\n");

   }

   public Persona generarObjeto() {
      name = this.name + this.n;
      Persona name = new Persona();
      return name;
   }

}