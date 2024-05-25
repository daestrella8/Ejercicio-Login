import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {

    Paneldecontrol panel = new Paneldecontrol();
    ArrayList<Persona> listaDePersonas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String opt;

    while (true) {

      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      panel.panelIngresoDatos();

      System.out.println("\n[+] Generando Usuario......\n");
      Thread.sleep(3 * 1000);

      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      panel.imprimoDatos();

      System.out.print("\n[+] Desea Agregar Otro usuario?(s/n): ");
      opt = scanner.nextLine();

      if (opt.equals("s")) {

        continue;

      } else if (opt.equals("n")) {

        System.out.println(listaDePersonas);

        break;

      } else {

        System.out.println("[!] Opción invalida, El Programa agregara otro usario!!!!!");
        Thread.sleep(3 * 1000);

      }

    }

  }
}