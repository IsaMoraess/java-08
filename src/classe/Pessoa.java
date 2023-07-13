package classe;

public class Pessoa {
    // Atributos de Classe
    private String nome;
    private int idade;
    private float altura;

    // Metodo Construtor
    //<identificador> <nomeDaClasse>()
    public Pessoa(){
        System.out.println("Uma pessoa acaba de nascer! Parabens.");
    }

    // Metodo getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

}
