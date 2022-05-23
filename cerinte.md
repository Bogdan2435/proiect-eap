# Proiect Elemente avansate de programare
## Dura Alexandru-Bogdan gr 263
Tema aleasa pentru proiectul meu la Elemente avansate de programare este "Gestiunea stocurilor unui magazin"

# Cerinte Proiect

### Etapa I:
1) Definirea sistemului
   Să se creeze o lista pe baza temei alese cu cel puțin 10 acțiuni/interogări care se pot face în cadrul sistemului și
   o lista cu cel puțin 8 tipuri de obiecte.

2) Implementare
   Sa se implementeze în limbajul Java o aplicație pe baza celor definite la primul punct.
   Aplicația va conține: <br />
   • clase simple cu atribute private / protected și metode de acces <br />
   • cel puțin 2 colecții diferite capabile să gestioneze obiectele definite anterior (eg: List, Set, Map, etc.)
   dintre care cel puțin una sa fie sortata – se vor folosi array-uri uni- /bidimensionale în cazul în care
   nu se parcurg colectiile pana la data checkpoint-ului.<br />
   • utilizare moștenire pentru crearea de clase adiționale și utilizarea lor în cadrul colecțiilor; <br />
   • cel puțin o clasă serviciu care sa expună operațiile sistemului <br />
   • o clasa Main din care sunt făcute apeluri către servicii <br />
### Etapa II:
1) Extindeți proiectul din prima etapa prin realizarea persistentei utilizând fișiere: <br />
   • Se vor realiza fișiere de tip CSV pentru cel puțin 4 dintre clasele definite în prima etapa. <br />
   Fiecare coloana din fișier este separata de virgula. Exemplu:nume,prenume,varsta
   • Se vor realiza servicii singleton generice pentru scrierea și citirea din fișiere; <br />
   • La pornirea programului se vor încărca datele din fișiere utilizând serviciile create; <br />

2) Realizarea unui serviciu de audit
   Se va realiza un serviciu care sa scrie într-un fișier de tip CSV de fiecare data când este executată una dintre acțiunile descrise în prima etapa.
   Structura fișierului: nume_actiune, timestamp


### Etapa III:
Înlocuiți serviciile realizate în etapa a II-a cu servicii care sa asigure persistenta utilizând baza de date folosind JDBC.
Să se realizeze servicii care sa expună operații de tip create, read, update si delete pentru cel puțin 4 dintre clasele definite.