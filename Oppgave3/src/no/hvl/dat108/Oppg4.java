package no.hvl.dat108;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Oppg4 {

    public static void main(String[] args) {
        List<Ansatt> ansatte = Arrays.asList(new Ansatt("Eirik", "Alvestad", "M", "sjef", 1000000),
                        new Ansatt("Orjan", "maBoi", "M", "sjef", 1500),
                        new Ansatt("Grim" , "yaBoi", "K", "nestBest", 1000),
                        new Ansatt("Joakim", "theBoi", "M", "nestBest", 300),
                        new Ansatt("Kjetil", "datBoi","K", "nestBest", 200),
                        new Ansatt("Adrian", "damnBoi","K", "nestBest", 150));


        //oppgave a)
        List<String> etternavn = ansatte.stream().map(x -> x.getEtternavn()).collect(Collectors.toList());
        etternavn.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println();

        //oppgave b)
        int damer = (int)ansatte.stream().filter(x -> x.getKjonn() == "K").count();
        System.out.println("antall damer: " + damer);
        System.out.println();

        double kvinneLonn = ansatte.stream().filter(x -> x.getKjonn() == "K").mapToInt(x -> x.getAarslonn()).average().getAsDouble();
        System.out.println("Gjennomsnitts lønnen til kvinnene: " + kvinneLonn + " kr");
        System.out.println();

        //oppgave d)
        System.out.println("Listen etter oppdatering: ");
        ansatte.stream().filter(x -> x.getStilling() == "sjef").forEach(x -> x.endreLonn(y -> (int)(y * (1 + 7.0 / 100 ))));
        ansatte.forEach(x -> System.out.println(x));
        System.out.println();

        //oppgave e)
        boolean bigMoney = ansatte.stream().allMatch(x -> x.getAarslonn() > 8000000);
        System.out.println("Tjener noen mer enn 800.000 kr :" + bigMoney);
        System.out.println();

        //oppgave f)
        System.out.println("Skriver ut listen uten å bruke løkke");
        ansatte.forEach(x -> System.out.println(x));
        System.out.println();

        //oppgave g)
        int lavesteLonn = ansatte.stream().mapToInt(x -> x.getAarslonn()).min().getAsInt();
        System.out.println("Laveste lønnen: " + lavesteLonn);
        System.out.println();

        //oppgave h)
        int yes = (int)IntStream.range(1, 1001).filter(x -> x % 3 == 0 && x % 5 == 0).count();
        System.out.println(yes);

    }
}
