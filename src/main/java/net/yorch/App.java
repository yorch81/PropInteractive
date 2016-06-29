package net.yorch;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello ProInteractive !!!" );
        Map<String, String> cfg  = new HashMap<String, String>();
        
        cfg.put("ServerDB", "Teclee nombre del servidor");
        cfg.put("UserName","Teclee el nombre de usuario");
        cfg.put("Password", "Teclee el nombre del password");
        
        Interactive obj = new Interactive(cfg);
        
    }

}
