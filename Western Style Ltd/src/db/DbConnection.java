package db;

import java.sql.*;


public class DbConnection
{   //Constants used to get access to the database
	//SQL Server
   private static final String  driver = "jdbc:sqlserver://kraka.ucn.dk:1433";
   private static final String  databaseName = ";databaseName=UCN_dmaa0216_2Sem_5";
    //SQL Server
    private static String  userName = "; user=UCN_dmaa0216_2Sem_5";
    private static String password = ";password=Password1!";
   
  
    private DatabaseMetaData dma;
    private static Connection con;
    // an instance of the class is generetated
    private static DbConnection  instance = null;

    // the constructor is private to ensure that only one object of this class is created
    private DbConnection()
    {
    	String url = driver + databaseName + userName + password;

        try{
            //load af driver
            //SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Load af class ok");
          
        }
        catch(Exception e){
            System.out.println("Can not find the driver");
            System.out.println(e.getMessage());
        }//end catch
        try{
            //connection to the database
           
            con = DriverManager.getConnection(url);
            //set autocommit
            con.setAutoCommit(true);
            dma = con.getMetaData(); // get meta data
            System.out.println("Connection to " + dma.getURL());
            System.out.println("Driver " + dma.getDriverName());
            System.out.println("Database product name " + dma.getDatabaseProductName());
        }//end try
        catch(Exception e){

            System.out.println("Problems with the connection to the database");
            System.out.println(e.getMessage());
            System.out.println(url);
        }//end catch
    }//end  constructor
	   
  //closeDb: closes the connection to the database
    public static void closeConnection()
    {
       	try{
            con.close();
            System.out.println("The connection is closed");
        }
         catch (Exception e){
            System.out.println("Error trying to close the database " +  e.getMessage());
         }
    }//end closeDB
		
    //getDBcon: Get-method, returns the connection to the database
    public  Connection getDBcon()
    {
       return con;
    }
    //this method is used to get the instance of the connection
    public static DbConnection getInstance()
    {
        if (instance == null)
        {
          instance = new DbConnection();
        }
        return instance;
    }
    public static void startTransaction()
    { try{
        con.setAutoCommit(false);
        }
      catch(Exception e){
        System.out.println("fejl start transaction");
        System.out.println(e.getMessage());
      }
    }
    public static void commitTransaction()
    { try{
        con.setAutoCommit(true);
        }
      catch(Exception e){
        System.out.println("fejl commit transaction");
        System.out.println(e.getMessage());
      }
    }
    public static void rollbackTransaction()
    { try{
        con.rollback();
        con.setAutoCommit(true);
        }
      catch(Exception e){
        System.out.println("fejl rollback transaction");
        System.out.println(e.getMessage());
      }
    }
}//end DbConnection
