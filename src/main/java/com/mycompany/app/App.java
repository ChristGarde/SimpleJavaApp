package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String userName = System.getProperty("user.name");
        System.out.println(userName);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    Date date = new Date();
	    System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
    }
}
