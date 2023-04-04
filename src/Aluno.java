public class Aluno {

    private static Aluno instancia;
    private String _nome;
    private int idade;
    private String ra;

    public String getNome()
    {
        return this._nome;
    }

    public String setNome()
    {
        return this._nome;
    }

    public int getIdade()
    {
        return this.idade;
    }

    public int setIdade()
    {
        return this.idade;
    }

    public String getRa()
    {
        return this.ra;
    }

    public String setRa()
    {
        return this.ra;
    }

    public static Aluno getInstance()
    {
        if(instancia == null){
            instancia = new Aluno();
        }
        return instancia;
    }

    private Aluno()
    {

    }


}
