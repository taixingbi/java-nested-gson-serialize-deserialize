package hello;

public class UserNested {
    String name;
    String email;
    int age;
    boolean isDeveloper;
    UserAddress userAddress;

    public UserNested(String name, String email, int age, boolean isDeveloper, UserAddress userAddress) {
        this.name= name;
        this.email= email;
        this.age= age;
        this.isDeveloper= isDeveloper;
        this.userAddress= userAddress;
    }
    public String getName(){
        return name;
    }

    public String getGmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public boolean getIsDeveloper(){
        return isDeveloper;
    }


    public UserAddress userAdress(){
        return userAddress;
    }
}

