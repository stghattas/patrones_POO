
package observer;

import java.util.ArrayList;
import java.util.List;

public class NotificadorEventos {
    private List<Observador> observadores = new ArrayList<>();

    public void agregar(Observador o) { observadores.add(o); }

    public void notificar(String evento) {
        for (Observador o : observadores)
            o.actualizar(evento);
    }
}
