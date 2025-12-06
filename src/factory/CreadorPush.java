
package factory;

public class CreadorPush extends CreadorMensaje {
    public Mensaje crearMensaje(String contenido) { return new Push(contenido); }
}
