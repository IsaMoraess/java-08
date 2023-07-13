public class App {
    public static void main(String[] args, String string) throws Exception {
    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Lucas");
    pessoa.setIdade(32);
    pessoa.setAltura((float) 1.90);

    System.out.format(
        "Nome: %s, idade = %d e %.2fn",
        pessoa.getNome(),
        pessoa.getIdade(),
        pessoa.getAltura()
    );
    
    
    }
    }

