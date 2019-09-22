public class  Main{
    public static void main(String[] args) {

// her forbinder vi bil1 til vores klasse Bil, som er sat til koeretoej, så bil har samme instansvariabler som koeretoej har.

        Bil bil1 =new Bil();
        bil1.farve = "gul";
        bil1.antalPladser = 4;
        bil1.antalHjul = 4;
        bil1.breandstofTank =45;
        bil1.maxHastighed = 160;
        bil1.navn = "gul bil";
        bil1.veagtTons = 0.5;
        bil1.lydSystem = "BOSE";
        bil1.lys =true;
        bil1.testKoeretoej();

        System.out.println(bil1.lydSystem);

        Cykel cykel1 = new Cykel();
        cykel1.antalHjul = 2;
        cykel1.farve = "Lilla";
        cykel1.maxHastighed = 35;
        cykel1.navn = "Lilla Cykel";
        cykel1.veagtKg = 5.5;
        cykel1.forOgBagLygter = true;


        System.out.println(cykel1.antalPladser);


        Fly fly1 = new Fly();
        fly1.antalNoedoeadgange = 4;
        fly1.antalPassengere = 196;
        fly1.madLevendoer ="High food's";
        fly1.breandstofTank = 1980;
        fly1.antalHjul =4;
        fly1.farve = "Vibrant / regnbuefarver";
        fly1.maxHastighed = 350;
        fly1.veagtTons = 75;
        fly1.navn = "Sierra delta 2 ";

        System.out.println("I dag flyver vi med" + fly1.navn + " med " + fly1.antalPassengere + " vi får mad fra "
        + fly1.madLevendoer + " med en hastighed på "+ fly1.maxHastighed + "Km/t");




    }
}
