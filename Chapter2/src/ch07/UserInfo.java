package ch07;

public class UserInfo {

    public int userId;
    public int userPassWord;
    public String userName;
    public String userAddress;
    public int userPhoneNumber;

    public UserInfo() {}

    public UserInfo(int userId, int userPassWord, String userName) {
        this.userId = userId;
        this.userPassWord = userPassWord;
        this.userName = userName;
    }

    public void showUserInfo() {
        System.out.printf("id:%d \npassword:%d \nname:%s \naddress:%s \nphonenumber:%d", userId, userPassWord, userName, userAddress, userPhoneNumber);
    }
}
