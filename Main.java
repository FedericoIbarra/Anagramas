package com.iteso;

public class Main {

    public static void main(String[] args) {

        System.out.println("Permuttation: " + checkPermutation("abc", "cba"));
        System.out.println("Permuttation: " + checkPermutation("Holaas", "odum"));
        System.out.println("Permuttation: " + checkPermutation("listen", "silenv"));

        System.out.println("Permuttation: " + anagramaXor("abc", "cba"));
        System.out.println("Permuttation: " + anagramaXor("Hola mundo", "odum"));
        System.out.println("Permuttation: " + anagramaXor("listen", "silenv"));
    }


    public static boolean checkPermutation (String a, String b) {

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
