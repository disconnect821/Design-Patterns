package DesginPattern.CreationalPattern.SingletonPattern.example;

import DesginPattern.CreationalPattern.SingletonPattern.SingletonClass;

public class Client {
    public static void main(String[] args) {
        AppSetting appSetting = AppSetting.getInstance();

        System.out.println(appSetting.getDatabaseUrl());

        AppSetting appSetting2 = AppSetting.getInstance();
        appSetting2.setDatabaseUrl("New JDBC");

        System.out.println(appSetting.getDatabaseUrl());
    }
}
