package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    public static void main(String[] args){
        Stats stat1 = new Stats(60,60);
        Stats stat2 = new Stats(50,60);
        Stats stat3 = new Stats(60,50);


        Pokemon poke1 = new Pokemon("Poke1", "img1", stat1);
        Pokemon poke2 = new Pokemon("Poke2", "img2", stat2);
        Pokemon poke3 = new Pokemon("Poke3", "img3", stat3);
        Pokemon poke4 = new Pokemon("Poke4", "img4", stat1);

        boolean result1 = poke1.estVainqueurContre(poke2);
        boolean result2 = poke1.estVainqueurContre(poke3);
        boolean result3 = poke1.estVainqueurContre(poke4);
        System.out.println(result1?"gagne avec attaque" : "erreur");
        System.out.println(result2?"gagne avec defense" : "erreur");
        System.out.println(result3?"gagne avec prio (égalité)" : "erreur");

    }
}
