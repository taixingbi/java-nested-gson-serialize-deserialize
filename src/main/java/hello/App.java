package hello;
import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        System.out.println("----------app----------");

//        serializeUser();
        deserializeUser();

        System.out.println("----------app end----------");
    }

    private static void serializeUser(){
        UserAddress userAddress = new UserAddress(
                "ocean ave",
                "1138",
                "bk",
                "us"
        );

        UserNested userObject = new UserNested(
                "hunter",
                "tb@gmail.com",
                38,
                true,
                userAddress
        );

        Gson gson = new Gson();
        String userWithAddressJson = gson.toJson(userObject);
        System.out.println("json: "+ userWithAddressJson);
    }

    private static void deserializeUser() {
        String userJson= " {\"name\":\"taixingbi\",\"email\":\"tb@gmail.com\",\"age\":38,\"isDeveloper\":true,\"userAddress\":{\"street\":\"ocean ave\",\"houseNumber\":\"1138\",\"city\":\"bk\",\"country\":\"us\"}}\n ";

        Gson gson = new Gson();
        UserNested userObject = gson.fromJson(userJson, UserNested.class);
        System.out.println("getStreet: "+ userObject.userAddress.getStreet() );
    }
}
