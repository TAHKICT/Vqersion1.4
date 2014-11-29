package DataBase;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: Scirocco
 * Date: 16.10.14
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public class GetFromDB extends Thread{
    private static int  BankCount = 5;
    private static float[] USDbuy = new float[BankCount];
    private static float[] USDsell = new float[BankCount];
    public static float[] EURbuy = new float[BankCount];
    private static float[] EURsell = new float[BankCount];


    private static String URL = "jdbc:mysql://93.126.108.39:3306/currency";
    private static String UserName = "currency";
    private static String Password = "currency";





     public GetFromDB()   {
          Connection connection;
          Statement statement = null;

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.err.println("Не удалось загрузить класс драйвера");
        }
        try {

            connection = DriverManager.getConnection(URL,UserName,Password);
            statement = connection.createStatement();
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            //Select from bank #1
            String query = ("select * from currency where id = '1' order by `TTime`;");
            ResultSet resultSet1 = statement.executeQuery(query);
            while (resultSet1.next()){
                if(resultSet1.last()){
                    Time timeE = resultSet1.getTime("TTime");
                     USDbuy[1] = resultSet1.getFloat("USDbuy");
                     USDsell[1] = resultSet1.getFloat("USDsell");
                     EURbuy[1] = resultSet1.getFloat("EURbuy");
                     EURsell[1] = resultSet1.getFloat("EURsell");

                //    System.out.println(USDbuy[1] + " " + USDsell[1] + " " + EURbuy[1] + " " + EURsell[1] + " " + timeE);
                }
            }
            //Select from bank #2
            String query2 = ("select * from currency where id = '2' order by `TTime`;");
            ResultSet resultSet2 = statement.executeQuery(query2);
            while (resultSet2.next()){
                if(resultSet2.last()){
                    Time timeE = resultSet2.getTime("TTime");
                     USDbuy[2] = resultSet2.getFloat("USDbuy");
                     USDsell[2] = resultSet2.getFloat("USDsell");
                     EURbuy[2] = resultSet2.getFloat("EURbuy");
                     EURsell[2] = resultSet2.getFloat("EURsell");

              //      System.out.println(USDbuy[2] + " " + USDsell[2] + " " + EURbuy[2] + " " + EURsell[2] + " " + timeE);
                }
            }
            //Select from bank #3
            String query3 = ("select * from currency where id = '3' order by `TTime`;");
            ResultSet resultSet3 = statement.executeQuery(query3);
            while (resultSet3.next()){
                if(resultSet3.last()){
                    Time timeE = resultSet3.getTime("TTime");
                    USDbuy[3] = resultSet3.getFloat("USDbuy");
                     USDsell[3] = resultSet3.getFloat("USDsell");
                     EURbuy[3] = resultSet3.getFloat("EURbuy");
                     EURsell[3] = resultSet3.getFloat("EURsell");

              //      System.out.println(USDbuy[3] + " " + USDsell[3] + " " + EURbuy[3] + " " + EURsell[3] + " " + timeE);
                }
            }
            //Select from bank #4
            String query4 = ("select * from currency where id = '4' order by `TTime`;");
            ResultSet resultSet4 = statement.executeQuery(query4);
            while (resultSet4.next()){
                if(resultSet4.last()){
                    Time timeE = resultSet4.getTime("TTime");
                     USDbuy[4] = resultSet4.getFloat("USDbuy");
                     USDsell[4] = resultSet4.getFloat("USDsell");
                     EURbuy[4] = resultSet4.getFloat("EURbuy");
                     EURsell[4] = resultSet4.getFloat("EURsell");

              //      System.out.println(USDbuy[4] + " " + USDsell[4] + " " + EURbuy[4] + " " + EURsell[4] + " " + timeE);
                }
            }

            boolean status = statement.isClosed(); // cheking is close our statement
            statement.getConnection(); //get connection
           // System.out.println(status);
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }    finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }
        //System.out.println(getUSDbuy(1));

    }
    public static float getUSDbuy(int BankNumber) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
       GetFromDB getFromDB = new GetFromDB();
        return USDbuy[BankNumber];
    }
    public static float getUSDsell(int BankNumber){
        GetFromDB getFromDB = new GetFromDB();
        return USDsell[BankNumber];
    }
    public static float getEURbuy(int BankNumber){
        GetFromDB getFromDB = new GetFromDB();
        return EURbuy[BankNumber];
    }
    public static float getEURsell(int BankNumber){
        GetFromDB getFromDB = new GetFromDB();
        return EURsell[BankNumber];
    }
   public static void main (String[]args){
       System.out.println(GetFromDB.getUSDbuy(1) + " " + GetFromDB.getUSDsell(1));
   }


}

