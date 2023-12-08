package za.co.wanda.ModelsDAO;

public class Person {

    private String firstName;
    private String lastName;
    private String currentLocation;


    public void setFirstName( String firstName){
        this.firstName = firstName;
    }


    public void setLastName( String lastName ){
        this.lastName = lastName;
    }

    public void setCurrentLocation( String currentLocation ){
        this.currentLocation = currentLocation;
    }


    public String getCurrentLocation( ){
        return this.currentLocation;
    }
    

    public String getFirstName( ){
        return this.firstName;
    }
    

    public String getLastName( ){
        return this.lastName;
    }
    
}
