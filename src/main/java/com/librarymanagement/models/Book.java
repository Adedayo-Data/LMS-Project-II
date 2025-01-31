com. librarymanagement.models;

public class Book{

    private boolean isAvailable;

    public Book(){
        this.isAvailable = true;
    }   

    public boolean getAvailablity(){
        return isAvailable;
    }

    public void setAvailability(boolean s){
        isAvailable = s;
    }

    
}