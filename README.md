# Trailrunner2.0
## TDD-dagbok
Datum: 15/1
* Krav: Skapa löprunda
* Test: testNewRun - skapa ny runda
* Reflektion: Inget ";" efter @Test (funkar inte). Google is my friend. 

Datum 2/4
* Lagt upp ett ordentligt repo på GitHub, för att kunna jobba mer strukturerat. 
* Sparkat igång den gamla koden (från 15/1), den fungerar inte av någon anledning. 
* Installerat GitHub Copilot för att hjälpa till med felsökning.
* Kollar igenom extensions, uppdaterar där det finns uppdateringar.
* Kollar om dependencies stämmer, uppdaterar till lite nyare version.

Datum 4/4
* Öppnar projektet igen efter att ha startat om allt (uppdateringar i windows osv) och det fungerar! Woop woop!

Datum 5/4
* Krav: Användarklassen ska kunna ställa in längd och vikt
* Test: testNewUser med user input i terminalen
* Reflektion: Det är lite trixigt att testa user input. Efter en konversation med Copilot har jag provat mig fram till slutversionen. Det som tillslut verkat spela mest roll var att ställa in locale på min scanner. 

* Krav: Användarklassen ska kunna räkna ut sin BMI med hjälp av längd- och viktdata.
* Test: Returnerar calculateBMI-metoden rätt data? 


public User() {
    Scanner scanner = new Scanner(System.in); // Create the Scanner inside the constructor

    System.out.print("Enter your username: ");
    this.username = scanner.nextLine();

    System.out.print("Enter your weight (kg): ");
    while (!scanner.hasNextDouble()) { // Validate input for weight
        System.out.println("Invalid input. Please enter a valid number for weight.");
        scanner.next();
    }
    this.weight = scanner.nextDouble();

    System.out.print("Enter your height (m): ");
    while (!scanner.hasNextDouble()) { // Validate input for height
        System.out.println("Invalid input. Please enter a valid number for height.");
        scanner.next();
    }
    this.height = scanner.nextDouble();

    System.out.println("User created successfully!");
}



## Trailrunner
*   Nästa steg: Skriva tester för LogRun.
*   Logga runda
    * Distans
    * Tid
    * Datum
* Unikt ID-nummer (String) för varje ny runda


* Klass: Runda
    * Klassvariabel: (String id)
    * Klassvariabel: (double distance)
    * Klassvariabel: (int minutes)
    * Klassvariabel: (String date)
* Klass för att logga rundor
    * ArrayList
