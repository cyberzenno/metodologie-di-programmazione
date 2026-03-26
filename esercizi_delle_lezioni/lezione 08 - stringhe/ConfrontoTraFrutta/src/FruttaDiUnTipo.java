public class FruttaDiUnTipo {
    private int id;
    private String nome;
    private String categoria;

    // Costruttore
    public FruttaDiUnTipo(int id, String nome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
}