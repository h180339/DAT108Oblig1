package no.hvl.dat108;

import java.util.function.Function;

public class Oppg3 {


    public static void main(String[] args) {
        Ansatt a1 = new Ansatt("Eirik" , "Alvestad", "M", "best", 1000000);
        Ansatt a2 = new Ansatt("Orjan" , "mboi", "M", "nestBest", 1000);
        Ansatt a3 = new Ansatt("Grim" , "mboi", "M", "nestBest", 100);

        int fastKroneTillegg = 50;
        double fastProsentTillegg = 5;
        Function<Integer, Integer> bar = (x -> x + fastKroneTillegg);
        a1.endreLonn(x -> (int)(x * (1 + fastProsentTillegg / 100 )));
        a2.endreLonn(bar);
        a3.endreLonn(prosentTileggFunksjon(5));
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }

    public static Function<Integer, Integer> prosentTileggFunksjon(double tillegg) {

        return x -> (int)(x * (1 + tillegg / 100 ));
    }


}
