# OOPL5
Hermetyzacja

## Zadanie 0
Przeczytać przed przystąpieniem do rozwiązywania zadań z konspektu:
Przypomnienie informacji o hermetyzacji: 

* http://edu.pjwstk.edu.pl/wyklady/poj/scb/

## Zadanie 1
Dla wszystkich zadań z poprzedniego konspektu [Lab4](https://github.com/UniversityOfRzeszow/OOPL4) dodać hermetyzację.

## Zadanie 2
Zaprojektuj i utwórz klasę, która opisuje pozycję książkową w księgarni. Książki cechują się następującymi właściwościami: `tytuł`, `autor`, `liczba stron`, `rok wydania`, `cena`. Zastosuj enkapsulację pól w klasie, przy czym uwzględnij, że tylko `cena` książki może się zmieniać w czasie, a pozostałe atrybuty są niezmienne (tylko do odczytu). Utwórz przykładowe obiekty i pokaż w jaki sposób można dostać się do pól obiektu poprzez metody.

## Zadanie 3
Zaprojektuj klasę symulującą działanie struktury stosu. W ramach klasy występują następujące prywatne pola: `n-elementowa tablica liczb całkowitych reprezentująca stos`, `wskaźnik stosu` jako liczba całkowita. `Wskaźnik stosu` wskazuje element ze szczytu stosu. 

* Utwórz metody: umieszczającą element na szczycie stosu `push` oraz  ściągającą wartość ze szczytu stosu `pop`. 

* Zadbaj o to aby w razie przepełnienia stosu nie można było umieścić wartości na stosie, a w razie stosu pustego nie można było ściągnąć danej ze stosu. Zauważ, że instrukcje `push` i `pop` zachowują się jak `get` i `set`. 

* Utwórz konstruktor, którego argumentem jest rozmiar stosu. W ciele konstruktora dokonaj inicjalizacji n-elementowej tablicy reprezentującej stos. Pamiętaj, że instrukcja `push` i `pop` zmieniają odpowiednio wskaźnik stosu.

##### Opracował dr inż. Wojciech Kozioł
