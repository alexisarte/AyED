package parciales.grafos;

public class Persona {
    
    private String id;
    private String tipo;

    public Persona(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public String getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.id;
    }
    
    public boolean esJubilado() {
        return this.tipo == "jubilado";
    }

}
