package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String Posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, Posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public int compareTo(Futbolista f) {
        return this.getEdad() - f.getEdad();
    }

    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
                " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }

    public boolean jugarConLasManos() {
        return false;
    }
}
