package legoset;

import java.util.*;
import java.io.*;
import jaxb.JAXBHelper;
import java.time.Year;


public class Main {
    public static void main(String[] args) throws Exception{
        LegoSet legoset = new LegoSet();

        legoset.setName("Imperial TIE fighter");

        legoset.setTheme("Star wars");

        legoset.setSubtheme("Solo");

        legoset.setYear(Year.parse("2018"));

        legoset.setPieces(519);

        legoset.setNumber("75211");

        Set<String> tags = new HashSet<String>();
        tags.add("Solo");
        tags.add("Star Wars");
        tags.add("Stormtrooper");
        tags.add("Starfighter");
        legoset.setTags(tags);


        List<Minifig> minifigs = new ArrayList<Minifig>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(1,"Imperial Pilot"));
        minifigs.add(new Minifig(1,"Mimban Stormtrooper"));
        legoset.setMinifigs(minifigs);

        legoset.setWeight(new Weight(0.89,"kg"));

        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoset, System.out);

    }
}
