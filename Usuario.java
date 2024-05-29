public class Usuario {

   private String usuario;
   private String contrasena;

   public String getUsuario() {
      return usuario;
   }

   public void setUsuario(String newUsuario) {
      usuario = newUsuario;
   }

   public String getContrasena() {
      return contrasena;
   }

   public void setContrasena(String newContrasena) {
      contrasena = newContrasena;
   }

   public Usuario() {

   }

   public void generarUsuario(String nombre1, String apellido1) {

      String nombre = nombre1.substring(0, 2).toLowerCase();
      String apellido = apellido1.toLowerCase();
      int numero = (int) Math.floor(Math.random() * 100 + 1);
      String numero1 = Integer.toString(numero);
      String username = nombre + apellido + numero1;
      setUsuario(username);

   }

}