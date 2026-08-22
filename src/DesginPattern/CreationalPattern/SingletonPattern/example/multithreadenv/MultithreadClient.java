package DesginPattern.CreationalPattern.SingletonPattern.example.multithreadenv;

import DesginPattern.CreationalPattern.SingletonPattern.example.AppSetting;

public class MultithreadClient {
    public static void main(String[] args) {
        Thread t1 = new Thread(DBConnection::getDBConnection);
        Thread t2 = new Thread(DBConnection::getDBConnection);


        Thread t3 = new Thread(DBConnection::getDBConnection_with_sync_block);
        Thread t4 = new Thread(DBConnection::getDBConnection_with_sync_block);

        t1.start();
        t2.start();
    }
}
