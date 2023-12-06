package Catalogo;

import java.util.Random;

public class Prodotto
{
    long id;
    String nome;
    String categoria;
    double prezzo;

    public  Prodotto(String nome,String categoria, double prezzo)
    {
        Random rnmd=new Random();
        id= (long) rnmd.nextDouble(1.00,100.00);
        this.nome=nome;
        this.categoria=categoria;
        this.prezzo=prezzo;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
