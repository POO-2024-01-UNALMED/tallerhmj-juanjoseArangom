package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract boolean jugarConLasManos();

    @Override
    public int compareTo(Futbolista f) {
        return this.edad - f.getEdad();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Futbolista) {
            Futbolista f = (Futbolista) o;
            return this.nombre.equals(f.getNombre()) && this.edad == f.getEdad() && this.posicion.equals(f.getPosicion());
        }
        return false;
    }

    @Override
    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }
}
