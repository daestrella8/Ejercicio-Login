import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {

    Paneldecontrol panel = new Paneldecontrol();

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    panel.panelIngresoDatos();

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    panel.imprimoDatos();

  }
}