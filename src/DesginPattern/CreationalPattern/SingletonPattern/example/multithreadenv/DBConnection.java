package DesginPattern.CreationalPattern.SingletonPattern.example.multithreadenv;

//Singleton Class
public class DBConnection {
    private String databaseUrl;

    private DBConnection(){
        System.out.println("DB connection created");
        databaseUrl = "JDBC";
    }

    public static DBConnection instance;

    //Synchronized should be used so that one thread runs the method at a time
    public synchronized static DBConnection getDBConnection(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }

    //less costly than above function method name
    public static DBConnection getDBConnection_with_sync_block(){
        if(instance == null){
            synchronized (DBConnection.class){
                if(instance == null){
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }

}
