package intento4;

class Hombre extends Persona {
public Hombre(String nombre) {
super(nombre); }
public String[] obtenerAtributosPosibles() {
    return new String[]{"Barba", "Bigote", "Calvo", "Lentes", "tatuajes", "Cabello largo"};
}

}
