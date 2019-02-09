package org.pursuit.testing_revisited_creating_tests.translator;

import java.util.HashSet;
import java.util.Set;

public class SillyTranslator implements SillyTranslatorInterface {

    private static SillyTranslator instance;
    private static final Set<Character> VOWEL_SET = new HashSet<Character>() {{
        add('a'); add('e'); add('i'); add('o'); add('u');
    }};

    public static SillyTranslator getInstance() {
        if (instance == null) {
            instance = new SillyTranslator();
        }
        return instance;
    }

    private SillyTranslator() {
    }


    @Override
    public String caesarCypher(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            stringBuilder.append(
                    (char) (input.charAt(i) + 1)
            );
        }
        return stringBuilder.toString();
    }

    @Override
    public String pigLatin(String input) {
        if (input.length() == 0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (VOWEL_SET.contains(
                    input.toLowerCase().charAt(i))) {
                stringBuilder.append(input.substring(i))
                        .append(input.substring(0, i));
                if (i == 0) {
                    stringBuilder.append("way");
                } else {
                    stringBuilder.append("ay");
                }
                break;
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

    @Override
    public String doubleTalk(String input) {
        if (input == null || input.length() == 0){
            return "";
        }
        return input.toUpperCase().substring(0, 1) + input.toLowerCase().substring(1) + " " + input.toLowerCase();
    }

    @Override
    public String snakeSpeak(String input) {
        return input.charAt(0) == 's' ? "ssss" + input.toLowerCase() : input;
    }

    @Override
    public String sarcasticRebuttal(String input) {
        if (input.length() == 0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder(input).append(" ");

        for (int i = 0; i < input.length(); i++) {
            if (VOWEL_SET.contains(
                    input.toLowerCase().charAt(i))) {
                if (input.toLowerCase().charAt(i) == 'm') {
                    stringBuilder.append("sh");
                } else {
                    stringBuilder.append("shm");
                }
                stringBuilder.append(input.substring(i));
                break;
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String elide(String input) {
        return input.length() <= 6 ? input : input.substring(0, 3) + "...";
    }

    @Override
    public String sillyCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            if(i % 2 == 0){
                stringBuilder.append(String.valueOf(input.charAt(i)).toUpperCase());
            } else {
                stringBuilder.append(String.valueOf(input.charAt(i)).toLowerCase());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String deVowel(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(!VOWEL_SET.contains(input.toLowerCase().charAt(i))){
                stringBuilder.append(input.toLowerCase().charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String deConsonant(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(!VOWEL_SET.contains(input.toLowerCase().charAt(i))){
                continue;
            } else {
                stringBuilder.append(input.toLowerCase().charAt(i));
            }
        }
        return stringBuilder.toString();
    }


}
