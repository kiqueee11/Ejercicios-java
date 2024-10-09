public interface Autenticable {
    public abstract void iniciarSesion(String nombre,String password);
    public abstract void cerrarSesion();
}
