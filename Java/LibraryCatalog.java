public class LibraryCatalog{
    public static BookSpec byIsbn(String isbn){
        if(isbn.equals("BK101")){
            return new BookSpec(isbn, 3.0);
        }else if(isbn.equals("BK202")){
            return new BookSpec(isbn, 5.0);
        }else{
            return null;
        }
    }
}
