package ch.heigvd.res.lab00;/*
 * Projet : Lab00App-build
 * Créé le 02.03.2016.
 * Auteur : Adriano Ruberto
 */

import java.util.LinkedList;

public class Orchestra {
   LinkedList<IInstrument> instruments = new LinkedList<>();
   public int getNumberOfInstruments() {
	  return instruments.size();
   }

   public void addInstrument(IInstrument i) {
	  instruments.add(i);
   }

   public LinkedList<String> makeMusic() {
	  LinkedList<String> musics = new LinkedList<>();
	  for(IInstrument i : instruments)
		 musics.add(i.play());

	  return musics;
   }
}
