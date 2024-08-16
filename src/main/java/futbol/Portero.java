package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public Portero() {
        super();
        this.golesRecibidos = 0;
        this.dorsal = 1;
    }

    @Override
    public int compareTo(Object f) {
        if (f instanceof Portero) {
            Portero j = (Portero) f;
            if (this.getGolesRecibidos() - j.getGolesRecibidos() >= 0) {
                return this.getGolesRecibidos() - j.getGolesRecibidos();
            }
            else {
                return -1*(this.getGolesRecibidos() - j.getGolesRecibidos());
            }
        } else {
            return this.getGolesRecibidos();
        }
    }

    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
                " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }

    public boolean jugarConLasManos() {
        return true;
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
