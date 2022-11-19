/*
Akseptansekriterier:

Et år er et skuddår

- Når det er delelig med 4, men ikke 100
- Når det er delelig med 400 (For eksempel var år 2000 et skuddår)
- Et år er ikke et skuddår

- Når det ikke er delelig med 4
- Når det er delelig med 100, men ikke 400. (For eksempel var ikke 1700, 1800 og 1900 skuddår, ei heller blir 2100 et)
*/

public class leapYearLogic {

    public boolean isLeapYear(int year){

        boolean isLeapYear;

        // Ved å ha logikken i en if block så blir det litt lettere å lese hva som tilsier et skuddår.
        // Mindre blokker som kjøres betyr også mindre ressursbruk. Mindre krav egentlig, men fint å tenke på i prosjektet.
        if(year % 4 == 0 && year % 100 != 0
                || year % 400 == 0
                || year % 4000 == 0) {
            isLeapYear = true;
        }
        else {
        isLeapYear = false;
        }
        return isLeapYear;
    }



}