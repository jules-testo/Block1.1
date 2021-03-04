public class BruttoNetto {
    public static void main(String[] args) {

        float netPrice = 249;
        int tax;   // Prozent
        int maxTax = 50; // EURO

        int tax_class = 1;

        if (tax_class == 1){
            // sobald eine bedingung true, wird der rest übersprungen
            tax = 20;
        } else if (tax_class == 2) {
            tax = 16;
        } else if (tax_class == 3) {
            tax = 8;
        } else {
            tax = 0;
            System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
        }

        switch (tax_class) {
            case 1:
                tax = 20;
                break;
            case 2:
                tax = 16;
                break;
            case 3:
                tax = 8;
                break;
            default:
                tax = 0;
                System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
        }








        double calculatedTax = (netPrice * tax) / 100;
        // access memory and get netPrice (252)
        // put memory to cpu
        // access memory and get tax (20)
        // put memory to cpu
        // tell cpu, multiplicate last two values and move result to cpu
        // access memory and get 100
        // put 100 to cpu
        // tell cpu, divide last to values and move result to cpu
        // ask cpu to store result to memory


        System.out.println("calculatedTax = " + calculatedTax);

        // 200
        boolean maxTaxExceeded = calculatedTax >= maxTax;
        System.out.println("maxTaxExceeded = " + maxTaxExceeded);
        if (maxTaxExceeded == true) { // dann
            // entweder
            System.out.println("Der maximale Steuerbetrag wurde erreicht: " + calculatedTax + " >= " + maxTax);
        } else { // ELSE ist immer optional
            // oder
            System.out.println("Der maximale Stuerbetrag wurde nicht erreicht. Folgender Betrag ist noch verfügbar: "
                    + (maxTax - calculatedTax));
        }

        // Wenn die maximale Steuer nicht erreicht ist, dann "Juhu" ausgeben
        if (maxTaxExceeded == false){ // (false == false) => true
            System.out.println("Juhu");
        }

        if (!maxTaxExceeded){ // !false => true == true => true
            System.out.println("Juhu-2");
        }

        if (true){
            System.out.println("true");
        }

        if (false){
            System.out.println("false");
        }

        if (!false){
            System.out.println("not false");
        }

        boolean check = true;
        System.out.println("check = " + check);
        check = !check; // NOT 
        System.out.println("check = " + check);
        check = !check;
        System.out.println("check = " + check);
        System.out.println("expressions 5==5: " + ( 5 == 5));
        System.out.println("expressions 5==7: " + ( 5 == 7));
        System.out.println("expressions !5==7: " + !( 5 == 7));

        double grossPrice = netPrice + calculatedTax;

        System.out.println("grossPrice = " + grossPrice);

        printNameToGrade(1);
        printNameToGrade(2);
        printNameToGrade(3);
        printNameToGrade(4);
        printNameToGrade(5);
    }

    public static void printNameToGrade(int grade) {

        int language = 1; /* 1 == Deutsch // 2 == Englisch)
        /* Sehr gut / Gut / Befriedigend / Genügend / Nicht Genügend */
        if (grade == 1 && language == 1) {
            System.out.println("Note: Sehr Gut");
        } else if (grade == 2 && language == 1) {
            System.out.println("Note: Gute");
        } else if (grade == 3 && language == 1) {
            System.out.println("Note: Befriedigend");
        } else if (grade == 4 && language == 1) {
            System.out.println("Note: Genügend");
        } else if (grade == 5 && language == 1) {
            System.out.println("Note: Nicht Genügend");
        } else if (grade == 1 && language == 2) {
            System.out.println("Note: A");
        } else if (grade == 2 && language == 2) {
            System.out.println("Note: B");
        } else if (grade == 3 && language == 2) {
            System.out.println("Note: C");
        } else if (grade == 4 && language == 2) {
            System.out.println("Note: D");
        } else if (grade == 5 && language == 2) {
            System.out.println("Note: F");
        } else {
            System.out.println("Falsche Note. Diesen Wert " + grade + " kennen wir nicht");
        }
    }
}