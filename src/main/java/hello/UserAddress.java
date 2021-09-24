package hello;

public class UserAddress {
    String street;
    String houseNumber;
    String city;
    String country;

    UserAddress(String street, String houseNumber, String city, String country ){
        this.street= street;
        this.houseNumber= houseNumber;
        this.city= city;
        this.country= country;
    }

    public String getStreet(){
        return this.street;
    }

}
