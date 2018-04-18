// Youngjun Woo
// CS240
// Assignment 1
// 4/17/2018

public class TaskCDriver {
    public static void main(String[] args){
        PileOfTextbooks books = new PileOfTextbooks(10);

        //demonstrates add method
        books.add("Algebra");
        books.add("Calculus");
        books.add("Introduction to Java");
        books.add("Psychology");
        books.add("Statistics");
        books.add("Physics");
        books.add("Music Technology");
        books.add("Introduction to C++");

        //demonstrates getTopBook method
        System.out.println("\"" + books.getTopBook() + "\" is at the top of the pile\n");

        //demonstrates remove method
        System.out.println("\"" + books.remove() + "\" has been removed.");
        System.out.println("\"" + books.remove() + "\" has been removed.\n");

        //demonstrates clear and isEmpty method
        books.clear();
        System.out.println("Every books has been removed.");
        if(books.isEmpty())
            System.out.println("There is no pile of textbooks.\n");
        else
            System.out.println("There is a pile of textbooks.\n");






    }
}
