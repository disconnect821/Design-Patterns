package DesginPattern.CreationalPattern.SingletonPattern.example;

public class AppSetting {
    private String databaseUrl;
    private String password;

    private AppSetting(){
        databaseUrl = "JDBC";
        password = "kszjfgha";
    }

    public static AppSetting instance;

    public static AppSetting getInstance(){
        if(instance == null){
            instance = new AppSetting();
        }
        return instance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }
}
