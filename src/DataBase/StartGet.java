package DataBase;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Scirocco
 * Date: 16.10.14
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class StartGet {

    static GetFromDB getFromDB = new GetFromDB();

    public static String getUSDbuy(int number) throws SQLException {
        float m = getFromDB.getUSDbuy(number);
        return Float.toString(m);
    }
    public static float getUSDsell(int number) {
        return getFromDB.getUSDsell(number);
    }
    public static float getEURbuy(int number) throws SQLException {
        return getFromDB.getEURbuy(number);
    }
    public static float getEURsell(int number) throws SQLException {
        return getFromDB.getEURsell(number);
    }
    public static float getUSDbuy1() throws SQLException {
        return getFromDB.getUSDbuy(1);
    }


    public static void main(String[]args ) throws SQLException {
        System.out.println(getUSDbuy(1) + " " + getUSDsell(1) +  " " + getEURbuy(1) + " " + getEURsell(1));
    }
}
