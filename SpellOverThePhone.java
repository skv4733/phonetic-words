package com.javasans.howtodo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpellOverThePhone {

    private Map<Character, String> natoPhoneticAlphabetMap;
    private Map<Character, String> westernUnionAlphabetMap;

    public SpellOverThePhone() {
        natoPhoneticAlphabetMap = new HashMap<Character, String>() {{
            put('a', "Alfa");
            put('b', "Bravo");
            put('c', "Charlie");
            put('d', "Delta");
            put('e', "Echo");
            put('f', "Foxtrot");
            put('g', "Golf");
            put('h', "Hotel");
            put('i', "India");
            put('j', "Juliett");
            put('k', "Kilo");
            put('l', "Lima");
            put('m', "Mike");
            put('n', "November");
            put('o', "Oscar");
            put('p', "Papa");
            put('q', "Quebec");
            put('r', "Romeo");
            put('s', "Sierra");
            put('t', "Tango");
            put('u', "Uniform");
            put('v', "Victor");
            put('w', "Whiskey");
            put('x', "X-ray");
            put('y', "Yankee");
            put('z', "Zulu");
        }};

        westernUnionAlphabetMap = new HashMap<Character, String>() {{
            put('a',	"Adams");
            put('b',	"Boston");
            put('c',	"Chicago");
            put('d',	"Denver");
            put('e',	"Easy");
            put('f',	"Frank");
            put('g',	"George");
            put('h',	"Henry");
            put('i',	"Ida");
            put('j',	"John");
            put('k',	"King");
            put('l',	"Lincoln");
            put('m',	"Mary");
            put('n',	"New York");
            put('o',	"Ocean");
            put('p',	"Peter");
            put('q',	"Queen");
            put('r',	"Roger");
            put('s',	"Sugar");
            put('t',	"Thomas");
            put('u',	"Union");
            put('v',	"Victor");
            put('w',	"William");
            put('x',	"X-ray");
            put('y',	"Young");
            put('z',	"Zero");

        }};

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter word to expand ");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Your entered " + userName + "word to expand ");
        SpellOverThePhone spellOverThePhone = new SpellOverThePhone();
        spellOverThePhone.spellUsingAlphabets(userName, spellOverThePhone.natoPhoneticAlphabetMap);
        spellOverThePhone.spellUsingAlphabets(userName, spellOverThePhone.westernUnionAlphabetMap);

    }

    public void spellUsingAlphabets(String word, Map<Character,String> map) {
        StringBuilder stringBuilder = new StringBuilder("Your expanded sentence   \n");
        char[] chars = word.toLowerCase().toCharArray();
        for (char aChar : chars) {
            String s = map.get(aChar);
            stringBuilder.append(aChar).append(" for ").append(s).append("\n");
        }
        System.out.println("stringBuilder = " + stringBuilder);

    }

}
