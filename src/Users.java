public class Users {
    //This is the super class
    int cpr;
    String userID;
    int alder;
    String name;
    Boolean correctPassword;
    String a;

    String logIn(){
        if (correctPassword == true)
            System.out.println("Correct password you've been logged in!");


        else
            System.out.println("Wrong Password try Again!");

        return a;
    }
}
