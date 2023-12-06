import Catalogo.Prodotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Prodotto iphone = new Prodotto("iphone", "smartphone", 1348.99);
        Prodotto harrypotter = new Prodotto("harry potter", "libro", 15.99);
        Prodotto lordofrings=new Prodotto("lord of rings","libro",250.99);
        Prodotto narhinel = new Prodotto("narhinel", "baby", 14.99);
        Prodotto narnia=new Prodotto("narnia","libro",340.90);

        ArrayList <Prodotto>prodotti=new ArrayList<>();
        prodotti.add(iphone);
        prodotti.add(harrypotter);
        prodotti.add(narhinel);
        prodotti.add(lordofrings);
        prodotti.add(narnia);
        Predicate <Prodotto> categoria=categoria1->categoria1.getCategoria().equals("libro");
        Predicate <Prodotto>prezzo=prezzo1->prezzo1.getPrezzo()>100;

        prodotti.stream().filter(categoria.and(prezzo)).forEach(System.out::println);
    }
}