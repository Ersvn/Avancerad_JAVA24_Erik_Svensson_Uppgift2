# Student Management System

## Översikt
Detta **Student Management System** är utvecklat i Java och erbjuder ett menybaserat konsolgränssnitt för att hantera studentdata. Programmet implementerar **Singleton-mönstret** för att säkerställa att endast en instans av studenthanteraren existerar. Studenter kan läggas till, sökas, visas, samt sparas och läsas från en textfil.

Programmet är designat för att vara enkelt att använda och kan köras i alla system som har Java 8 eller senare installerat.

## Funktioner

1. **Lägg till student**: Lägger till studentdata (ID, namn, betyg) till systemet.
2. **Sök student via ID**: Söker en student baserat på deras unika student-ID.
3. **Visa alla studenter**: Visar en lista över alla lagrade studenter.
4. **Spara studenter till fil**: Sparar alla studentdata till en textfil.
5. **Läs studenter från fil**: Laddar studentdata från en textfil vid programstart.
6. **Avsluta programmet**: Stänger programmet och sparar data till fil.

Betyg på studenter anges som bokstäver mellan **A-F**.

---

## Teknisk Information

### Använda teknologier
- **Språk**: Java 8 eller senare
- **Mönster**: Singleton
- **Filhantering**: Läser och skriver studentdata till en textfil
- **Datastruktur**: HashMap används för att lagra studenter i minnet med unikt ID som nyckel

---

## Installation och Användning

### Förutsättningar
För att köra programmet, se till att **Java 8 eller senare** är installerat på din dator. Du kan ladda ner och installera Java från den officiella webbplatsen: https://www.oracle.com/java/technologies/javase-jdk8-downloads.html

### Installation med Maven
1. Klona projektet:
   ```bash
   git clone <repository-url>
   cd <project-folder>
Bygg och kör programmet med Maven:
bash
Copy code
mvn clean install
mvn exec:java
Manuell installation och körning (utan Maven)
Om du inte använder Maven kan du kompilera och köra programmet med standard Java-kommandon.

Kompilera koden:

bash
Copy code
javac -d bin src/main/java/org/example/*.java
Kör programmet:

bash
Copy code
java -cp bin org.example.Main
Filstruktur
Projektets struktur är organiserad enligt följande:

bash
Copy code
.
├── src
│   └── main
│       └── java
│           └── org
│               └── example
│                   ├── FileHandler.java        # Hanterar filin- och utmatning
│                   ├── Main.java               # Huvudklass med användargränssnitt och logik
│                   ├── Student.java            # Modellklass för studentdata
│                   └── StudentManager.java     # Singletonklass som hanterar studenter i minnet
├── datastudents.txt                      # Fil där studentdata sparas
└── README.md                             # Denna fil
Användning
När du kör programmet ser du en meny med följande alternativ:

Lägg till student:
Ange studentens ID, namn och betyg (A-F).
Sök student via ID:
Ange studentens ID för att visa deras uppgifter.
Visa alla studenter:
Visa en lista över alla studenter lagrade i systemet.
Spara studenter till fil:
Sparar studentdatat till datastudents.txt.
Avsluta programmet:
Avslutar programmet och sparar alla data.
Exempel på användning:
När du lägger till en student:

mathematica
Copy code
Enter Student ID: 12345
Enter Name: John Doe
Enter Grade (A-F): A
När du söker efter en student via ID:

yaml
Copy code
Enter Student ID: 12345
Student Found: 12345, John Doe, A
När du sparar studenter till fil:

css
Copy code
Students saved to file.
Filhantering
Systemet använder en textfil, datastudents.txt, för att lagra studentdata. Varje rad i filen representerar en student och deras data separeras med kommatecken.

Exempel på filinnehåll:

css
Copy code
12345, John Doe, A
67890, Jane Smith, B
Filens path är fördefinierad i koden men kan ändras om det behövs.

Förbättringar och framtida arbete
Felhantering: Förbättra felhanteringen för att ge mer informativ användarfeedback och skydda mot undantag vid filinläsning och sparning.
GUI: Implementera ett grafiskt användargränssnitt för ett bättre användarflöde.
Data-validering: Lägg till validering för att säkerställa att studentdata är korrekt innan den sparas (t.ex. betyg mellan A och F).
Lägg till fler funktioner: T.ex. möjlighet att uppdatera och ta bort studenter.
