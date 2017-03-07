package ejemploficheros.Xogadores;

public class Xogador {
    private String nombre;
    private int dorsal;

    public Xogador() {
    }

    public Xogador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Xogador{" + "nombre=" + nombre + ", dorsal=" + dorsal + '}';
    }
    
    
    
}
