package ch.heigvd.res.lab00;/*
 * Projet : Lab00App-build
 * Créé le 24.02.2016.
 * Auteur : Adriano Ruberto
 */

public class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 9001;
    }

    @Override
    public String getColor() {
        return "golden";
    }
}
