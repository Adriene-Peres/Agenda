
public class PessoaFisica extends Contato {
    private String cpf;
    private String estado_civil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String estado_civil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.estado_civil = estado_civil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estado_civil;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCpf: " + getCpf() + "\nEstado civil: " + getEstadoCivil() + "\n";
    }

}
