public class Livro{
    private String nome;
    private Integer Paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        Paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return Paginas;
    }

    public void setPaginas(Integer paginas) {
        Paginas = paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((Paginas == null) ? 0 : Paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Paginas == null) {
            if (other.Paginas != null)
                return false;
        } else if (!Paginas.equals(other.Paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro => [nome=" + nome + ", Paginas=" + Paginas + "]\n";
    }
    



    
  


}