package com.iteso;

public class Main {

    public static void main(String[] args) {

        System.out.println("Brute Force: " + anagramaBruteForce("abc", "cba"));
        System.out.println("Brute Force: " + anagramaBruteForce("listen", "silent"));
        System.out.println("Brute Force: " + anagramaBruteForce("listen", "silenv"));

        System.out.println("Xor: " + anagramaXor("abc", "cba"));
        System.out.println("Xor: " + anagramaXor("listen", "listen"));
        System.out.println("Xor: " + anagramaXor("listen", "silenv"));
    }


    public static boolean anagramaBruteForce (String a, String b) {

        boolean aux = false;

        for(int i = 0; i < b.length(); i++) {
            aux = false;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == b.charAt(i)) {
                    aux = true;
                    break;
                }
            }
            if (!aux) return false;
        }

        return true;
    }

    public static boolean anagramaXor (String word1, String word2) {
        int x = 0;

        if(word1.length() != word2.length()) return false;

        for (int i = 0; i < word1.length(); i++) {
            x = x ^ (word1.charAt(i)) ^ word2.charAt(i);
            //System.out.println(" -> " + (Integer.valueOf(word1.charAt(i)) ^ Integer.valueOf(word2.charAt(i))));
        }

        // System.out.println(x);
        if (x == 0) return true;
        else return false;
    }




}
