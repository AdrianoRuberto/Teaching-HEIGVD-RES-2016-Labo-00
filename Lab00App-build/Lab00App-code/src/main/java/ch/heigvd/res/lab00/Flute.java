package ch.heigvd.res.lab00;/*
 * Projet : Lab00App-build
 * Créé le 24.02.2016.
 * Auteur : Adriano Ruberto
 */

public class Flute implements IInstrument {
    @Override
    public String play() {
        return "flûtine";
    }

    @Override
    public int getSoundVolume() {
        return 42;
    }

    @Override
    public String getColor() {
        return "green";
    }
}
