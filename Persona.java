
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

   public void almacenarUser() {

      usuario.generarUsuario(getNombre(), getApellido());

   }
}