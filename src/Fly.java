public class Fly extends Koeretoej{
    // extends forbinder fly til koeretoej, så fly har koe... instancevariabler, men ikke omvendt.
    int antalPassengere;
    int antalNoedoeadgange;
    String madLevendoer;

    String fremad() {
        return "Flyver";
    }


    boolean testKoeretoej() {
        return true;
    }
}
