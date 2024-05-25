
public class Persona {

   private String nombre;
   private String apellido;
   private String idPersonal;
   private Usuario usuario;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String newNombre) {
      nombre = newNombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String newApellido) {
      apellido = newApellido;
   }

   public String getIdPersonal() {
      return idPersonal;
   }

   public void setIdPersonal(String newIdPersonal) {
      idPersonal = newIdPersonal;
   }

   public Usuario getUsuario() {
      return usuario;
   }

   public void setpass(String pass) {

      usuario.setContrasena(pass);
   }

   public Persona() {
      usuario = new Usuario();
   }

   public void generarUsuario() {

      String nombre1 = nombre.substring(0, 2).toLowerCase();
      String apellido1 = apellido.toLowerCase();
      int numero = (int) Math.floor(Math.random() * 100 + 1);
      String numero1 = Integer.toString(numero);
      String username = nombre1 + apellido1 + numero1;
      usuario.setUsuario(username);

   }
}