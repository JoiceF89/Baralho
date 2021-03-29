package br.edu.fatecmm;

import br.edu.fatecmm.model.Cartas;

public class Baralho {
    public static void main(String[] args) {
        String[] nipes={"Ouros","Copas","Espadas","Paus"};
        String[] faces={"AS","2","3","4","5","6","7","8","9","10","Valete","Damas","Rei"};
        String nipe = nipes [(int) (Math.random() *4)];
        String face = faces[(int) (Math.random() * faces.length)];
        System.out.printf(face +  "de"  + nipe);
    }

}


