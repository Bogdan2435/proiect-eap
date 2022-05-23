# Proiect Elemente avansate de programare
## Dura Alexandru-Bogdan gr 263
Tema aleasa pentru proiectul meu la Elemente avansate de programare este "Gestiunea stocurilor unui magazin" 

## Clase Implementate

1. Persoana
2. Angajat (extends persoana)
3. Locatie 
4. Depozit (extends locatie)
5. Furnizor (extends locatie)
6. Magazin (extends locatie)
7. Categorie
8. Produs (extends categorie)

In plus am mai adaugat clase auxiliare (servii, meniu si main).

### Etapa I:

Am implementat metodele pentru adaugarea, vizualizarea, modificarea si stergerea informatiilor. </br>
Am mai implementat urmatoarele metode:
 - Filtrarea Depozitelor in functie de locatie. (Tara / Judet / Localitate)
 - Afisarea Depozitelor ce corespund unui anumit magazin
 - Calcularea stocului unei piese. 
 - Calcularea stocului total dintr-un depozit.
 - Afisarea stocurilor unui depozit in ordine crescatoare.

### Etapa II:

Am creat 8 fisiere de tip CSV din care citesc (Fisirele ListaXXXXXX.csv) informatile claselor si in care pot scrie informatiile claselor (Fisirele AfisajXXXXXX.csv). </br>
</br>
Am creat inca un fisier (Audit.csv) in care scriu ce metoda a fost selectata si cand. </br>
Acest fisier este resetat la fiecare rulare a programului.

### Etapa III:

Am conectat proiectul la o baza de date din MySQL.</br>
Am implementat metode de adaugare,  citire, modificare si stergere a informatiilor din baza de date.
