package ie.atu.productv3;


public class ProductDB {

    public static Product getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
        Product someItem = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            someItem = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            someItem = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            someItem = myBook;
        }
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            someItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            someItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            someItem = mySoftware;
        }
        if (productCode.equalsIgnoreCase("PINK")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(25);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("the Columbia group");
            someItem=myMusic;
        }
        else if (productCode.equalsIgnoreCase("Beatles")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Hey Jude");
            myMusic.setPrice(25);
            myMusic.setArtist("The Beatles");
            myMusic.setLabel("the Apple Records");
            someItem=myMusic;
        }
        else if (productCode.equalsIgnoreCase("ABBA")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Dancing Queen");
            myMusic.setPrice(25);
            myMusic.setArtist("ABBA");
            myMusic.setLabel("the AMIGA");
            someItem=myMusic;
        }
        if(productCode.equalsIgnoreCase("kdl43"))
        {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(819);
            myTV.setManufacture("SONY");
            myTV.setScreenSize("55'");
            someItem=myTV;
        }
        return someItem;
    }

}

