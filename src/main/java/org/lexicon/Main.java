package org.lexicon;

import org.lexicon.model.Candy;
import org.lexicon.model.Product;
import org.lexicon.model.Snacks;
import org.lexicon.model.Soda;

public class Main {
    public static void main(String[] args) {
        /*
        Logic

        1.add curency
        Add money to the deposit pool.
        Only accepts the following values:1,2,5,10,20,50,100,200,500,1000

        2. request
        Buy requested Product if there is enough money in the depositPool.

        3. end session
        Returns depositPool and set it to 0

        4. get description
        Returns a String of a Product description

        5. get balance
        Returns the depositPool (not clearing it)

        6. get Products
         Returns String array where each String contains the Product’s id, name and price



         */


        Snacks chips1 = new Snacks(1, 30, "Pringles Paprika");
        Candy bilar1 = new Candy(1, 25, "Ahlgrens bilar");
        Soda cola1 = new Soda(1, 20, "Coca-Cola");


    }
}