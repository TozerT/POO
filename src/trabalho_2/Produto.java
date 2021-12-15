package trabalho_2;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Produto implements Serializable {
    private int id;
    static private int counter=0;
    private String nome;
    private double preco;
    private LocalDate data;
    private LocalDate inserçao;
    

    public Produto() {}
    
    public Produto( String nome, double preco, LocalDate data,LocalDate inserçao) {
        this.id= counter++;
        this.nome = nome;
        this.preco = preco;
        this.data = data;
        this.inserçao=inserçao;
    }

    public LocalDate getInserçao() {
        return inserçao;
    }

    public void setInserçao(LocalDate inserçao) {
        this.inserçao = inserçao;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getdata() {
        return data;
    }
    

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (this.data != other.data) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + ", data de validade=" + data + ", data de inserção=" + inserçao + '}';
    }

    
    
}
