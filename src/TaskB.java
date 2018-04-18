// Youngjun Woo
// CS240
// Assignment 1
// 4/17/2018

public class TaskB {
    public static void main(String[] args)
    {

        int count = 0;

        ResizableArrayBag<String> letters = new ResizableArrayBag<>(10);
        ResizableArrayBag<String> vowels = new ResizableArrayBag<>(10);

        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("i");
        letters.add("j");

        while(!letters.isEmpty()) {
            String temp = letters.remove();
            if (temp.equals("a") || temp.equals("i") || temp.equals("e") || temp.equals("o") || temp.equals("u")) {
                vowels.add(temp);
                count++;
            }
        }

        if(letters.isEmpty())
            System.out.println("The bag \"letters\" is empty.");
        System.out.println(count + " items have moved to vowels.\n");

        System.out.println(vowels.getCurrentSize() + " vowels are in the \"vowel\" bag.");
        System.out.println(vowels.getFrequencyOf("a") + " \"a\", " + vowels.getFrequencyOf("i") + " \"i\", "
         + vowels.getFrequencyOf("e") + " \"e\", " + vowels.getFrequencyOf("o") + " \"o\", "
         + "and " + vowels. getFrequencyOf("u") + " \"u\" are in the bag.");
    }





}

