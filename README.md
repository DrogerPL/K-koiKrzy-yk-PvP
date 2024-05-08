Konsolowy program do gry w kółko i krzyżyk dla dwóch graczy. Rozpoczyna się od utworzenia pustej planszy o rozmiarze 3x3, gdzie gracze będą 
umieszczać swoje znaki - X lub O.

Metoda Druk służy do wyświetlania aktualnego stanu planszy w formie tabeli.

Metoda Winner sprawdza, czy któryś z graczy wygrał. Sprawdza ona wszystkie możliwe kombinacje wygrywające w rzędach, 
kolumnach i przekątnych. Jeśli wykryje, że któryś gracz ma trzy znaki w jednym z tych układów, ogłasza zwycięzcę i zwraca true.

Metoda drawOrGamenotfin sprawdza, czy gra zakończyła się remisem. Jeśli plansza jest pełna i nie ma zwycięzcy, to jest remis.

Metoda placeX pozwala na umieszczanie znaków X lub O na planszy na podstawie wprowadzonych przez gracza współrzędnych.
Sprawdza również poprawność wprowadzonych danych oraz zajętość wybranego pola. Jeśli dane są nieprawidłowe lub pole jest zajęte, prosi 
gracza o ponowne wprowadzenie danych.

W metodzie main odbywa się główna pętla gry. Program wyświetla planszę, a następnie na zmianę umieszcza 
znaki X lub O na planszy w odpowiednich miejscach, sprawdzając przy tym, czy któryś gracz wygrał lub czy gra zakończyła się remisem.
