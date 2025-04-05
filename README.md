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
* Reflektion: Det är lite trixigt att testa user input. Efter en konversation med Copilot har jag provat mig fram till slutversionen. "System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));" är en kodrad jag fick från Copilot, som gör att det går att testa konstruktorn med simulerad user input. Jag förstår efter lite efterforskning att den raden gör så att scannern hämtar sin input från en array som skapats med datan från "simulatedInput", så väntar inte scannern på input från en användare. För att scannern ska återgå till sin vanliga funktionalitet måste koden återställas efter testet, tillbaka till System.in. 

* Krav: Användarklassen ska kunna räkna ut sin BMI med hjälp av längd- och viktdata.
* Test: Returnerar calculateBMI-metoden rätt data? 
* Reflektion: Exceptionellt straight-forward test... Har jag missat nåt? Ska det vara så simpelt?

* Krav: Löprundan ska automatiskt beräkna medelhastighet samt kilometertid. 
* Test: Testa calculate-metoder för dessa, asserta om de returnerar det de borde.
* Reflektion: Också så simpelt. Men kul! Math is mathing. 

Datum 6/4







## Trailrunner 2Do:
* Nästa steg: Skriva tester för RunLog.

* Unikt ID-nummer (String) för varje ny runda

* Refaktorering: Korrigera format för datum och ta dagens datum om inget annat anges.

* Ordna en Run-konstruktor som tar user input. OBS! Det unika ID-numret ska ändå tilldelas automagiskt.  


