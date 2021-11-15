package ch13.web.userInfo;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties(); //file 에서 값을 쌍으로 받을 수 있다.
        prop.load(fis); //fis 에서부터 읽는다.

        String dbType = prop.getProperty("DBTYPE"); //DBTYPE 의 value 를 반환한다.

        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("asher");
        userInfo.setUserName("ksj");
        userInfo.setPassword("1234");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
