package org.example;

public class main {
    public static String szyfrujTekst(String tekst, int klucz) {
        StringBuilder wynik = new StringBuilder();

        for (char znak : tekst.toCharArray()) {
            if (znak == ' ') {
                wynik.append(' ');
            } else {
                int baza = 'a';
                int przesuniecie = ((znak - baza + klucz) % 26 + 26) % 26;
                wynik.append((char) (baza + przesuniecie));
            }
        }
        return wynik.toString();
    }
}
