package DataBase;

import Banks.Current;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Scirocco
 * Date: 16.10.14
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */
public class PutInDB extends Thread{
    public static   String getTime (){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return (dateFormat.format(date).toString());
    }
    private static String date = getTime();
    private static final String URL = "jdbc:mysql://93.126.108.39:3306/currency";
    private static final String UserName = "currency";
    private static final String Password = "currency";

    public void run(){
        while (true){
            Connection connection;

            try {
                Driver driver = new FabricMySQLDriver();
                DriverManager.registerDriver(driver);
            } catch (SQLException e) {
                System.err.println("Не удалось загрузить класс драйвера");
            }
            try {
                connection = DriverManager.getConnection(URL,UserName,Password);
                Statement statement = connection.createStatement();

                statement.addBatch("insert into currency(id,TTime,USDbuy,USDsell,EURbuy,EURsell) values ('1','"+getTime()+"' ,"+ Current.getPrivatUSDbuy()+" , "+Current.getPrivatUSDsell()+", "+Current.getPrivatEURbuy()+","+Current.getPrivatEURsell()+");");
                statement.addBatch("insert into currency(id,TTime,USDbuy,USDsell,EURbuy,EURsell) values ('2','"+getTime()+"' ,"+ Current.getPravexUSDbuy()+" , "+Current.getPravexUSDsell()+", "+Current.getPravexEURbuy()+","+Current.getPravexEURsell()+");");
                statement.addBatch("insert into currency(id,TTime,USDbuy,USDsell,EURbuy,EURsell) values ('3','"+getTime()+"' ,"+ Current.getXCityUSDbuy()+" , "+Current.getXCityUSDsell()+", "+Current.getXCityEURbuy()+","+Current.getXCityEURsell()+");");
                statement.addBatch("insert into currency(id,TTime,USDbuy,USDsell,EURbuy,EURsell) values ('4','"+getTime()+"' ,"+ Current.getCityCommerceUSDbuy()+" , "+Current.getCityCommerceUSDsell()+", "+Current.getCityCommerceEURbuy()+","+Current.getCityCommerceEURsell()+");");

                statement.executeBatch();  //execute Batches
                boolean status = statement.isClosed(); // cheking is close our statement
                statement.getConnection(); //get connection
                System.out.println(status);
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            try {
                sleep(360000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
}
