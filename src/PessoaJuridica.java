
public class PessoaJuridica extends Contato {
    private String cnpj;
    private int inscricao_estadual;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj, int inscricao_estadual) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getInscricaoEstadual() {
        return inscricao_estadual;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCnpj: " + getCnpj() + "\nInscrição estadual: " + getInscricaoEstadual() + "\n";
    }

}