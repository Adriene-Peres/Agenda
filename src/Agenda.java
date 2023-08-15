import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void addContato(Contato c) {
        contatos.add(c);
    }

    public Contato buscarContato(String info) {
        for (Contato c : contatos) {
            if (c instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) c;
                if (pf.getCpf().equals(info)) {
                    return c;
                }
            } else {
                PessoaJuridica pj = (PessoaJuridica) c;
                if (pj.getCnpj().equals(info)) {
                    return c;
                }
            }
        }
        return null;
    }

    public void removerContato(String info) {
        Contato c = buscarContato(info);
        if (c != null) {
            contatos.remove(c);
        } else {
            System.out.println("Contato não existe.");
        }
    }

    public void visualizarContatos() {
        System.out.println("#### TODOS OS CONTATOS ####");
        for (Contato x : contatos) {
            System.out.println(x);
        }
    }
}