package com.softwareengineerandroid.davidmata.global;

/**
 * Created by davidmata on 17/10/2016.
 */

public class GlobalData {
    public static String user = null;
    public static int id_user = 0;
    public static int privileges = 0; //1 for admin
    public static boolean appEnd = true;

    public static void resetData(){
        user=null;
        id_user = 0;
        privileges = 0;
        appEnd = true;
    }
}
