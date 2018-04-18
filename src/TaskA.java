// Youngjun Woo
// CS240
// Assignment 1
// 4/17/2018

public class TaskA {
    public static void main(String[] args) {
        int count = 0;

        BagInterface<String> groceryBag = new ResizableArrayBag<>(10);

        groceryBag.add("cheese");
        groceryBag.add("milk");
        groceryBag.add("soup");
        groceryBag.add("cereal");
        groceryBag.add("coffee");
        groceryBag.add("apple");
        groceryBag.add("soup");
        groceryBag.add("steak");
        groceryBag.add("soup");
        groceryBag.add("soup");

        while (groceryBag.contains("soup")){
            groceryBag.remove("soup");
            count++;
        }

        System.out.println(count + " soup has removed from your bag." );


    }
}