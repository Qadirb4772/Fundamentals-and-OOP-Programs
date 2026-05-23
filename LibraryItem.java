public class LibraryItem{
  private String title;
  private String catalogId;
  
  public LibraryItem(String title, String catalogId){
    this.title = title;
    this.catalogId = catalogId;
  }
  
  public String getTitle(){
    return this.title;
  }
  
  public String getCatalogId(){
    return this.catalogId;
  }
  
  public String availabilityNote(){
    return "See front desk for details";
  }
  
  public void summaryLine(){
    System.out.println("Title = "+this.title+"\nCatalog ID: "+this.catalogId);
  }
}
