
package factory;

public abstract class Mensaje {
    public String contenido;
    public Mensaje(String contenido) { this.contenido = contenido; }
    public abstract void enviar();
}
