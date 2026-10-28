public class neighborhoodlibrary {
}
class negiborhoodlibrary {
    public static void main(String[] args) {

        // Create an inventory array that can hold at least 20 books
        var inventory = new Book[20];

        // Preload the array with 20 unique books
        inventory[0] = new Book(1, "9780439139601", "Harry Potter and the Goblet of Fire");
        inventory[1] = new Book(2, "9780439064873", "Harry Potter and the Chamber of Secrets");
        inventory[2] = new Book(3, "9780439358071", "Harry Potter and the Order of the Phoenix");
        inventory[3] = new Book(4, "9780061120084", "To Kill a Mockingbird");
        inventory[4] = new Book(5, "9780743273565", "The Great Gatsby");
        inventory[5] = new Book(6, "9780307277671", "The Road");
        inventory[6] = new Book(7, "9780307588371", "Gone Girl");
        inventory[7] = new Book(8, "9780060850524", "Brave New World");
        inventory[8] = new Book(9, "9780140283334", "1984");
        inventory[9] = new Book(10, "9780307474278", "The Girl with the Dragon Tattoo");
        inventory[10] = new Book(11, "9780143126560", "The Goldfinch");
        inventory[11] = new Book(12, "9780385754729", "The Book Thief");
        inventory[12] = new Book(13, "9780307588364", "Dark Places");
        inventory[13] = new Book(14, "9780062315007", "The Alchemist");
        inventory[14] = new Book(15, "9780307278449", "No Country for Old Men");
        inventory[15] = new Book(16, "9780307387899", "The Road Back");
        inventory[16] = new Book(17, "9780062024039", "Divergent");
        inventory[17] = new Book(18, "9780062024046", "Insurgent");
        inventory[18] = new Book(19, "9780062024053", "Allegiant");
        inventory[19] = new Book(20, "9780307346605", "The Lincoln Lawyer");

        // Demonstrate checking out and checking in
        System.out.println("Checking out book 1...");
        inventory[0].checkOut("Phoenix");
        System.out.println(inventory[0]);

        System.out.println("\nChecking in book 1...");
        inventory[0].checkIn();
        System.out.println(inventory[0]);
    }
}