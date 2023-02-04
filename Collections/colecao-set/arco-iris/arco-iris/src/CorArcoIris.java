import java.util.Comparator;

public class CorArcoIris implements Comparable<CorArcoIris>  {
    String cor;
    Integer ordemCor;

    

 
    public CorArcoIris(String cor, Integer ordemCor) {
        this.cor = cor;
        this.ordemCor = ordemCor;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getOrdemCor() {
        return ordemCor;
    }
    public void setOrdemCor(Integer ordemCor) {
        this.ordemCor = ordemCor;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        result = prime * result + ((ordemCor == null) ? 0 : ordemCor.hashCode());
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
        CorArcoIris other = (CorArcoIris) obj;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        if (ordemCor == null) {
            if (other.ordemCor != null)
                return false;
        } else if (!ordemCor.equals(other.ordemCor))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return " [cor=" + cor + ", ordemCor=" + ordemCor + "]";
    }
 
    @Override
    public int compareTo(CorArcoIris c) {
        // TODO Auto-generated method stub
        return this.getCor().compareToIgnoreCase(c.getCor());
    }


}
