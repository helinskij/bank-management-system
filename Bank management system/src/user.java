public class user {
    private String name;
    private String userID;

    public user(String name, String userID){
        this.name = name;
        this.userID = userID;
    }

    public String getName(){
        return name;
    }

    public String getUserID(){
        return userID;
    }
}
