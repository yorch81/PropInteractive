package net.yorch;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        
        Map<String, String> cfg  = new LinkedHashMap<String, String>();
        
        cfg.put("hostname", "Teclee nombre del host");
        cfg.put("user","Teclee el nombre de usuario");
        cfg.put("password", "Teclee el password");
        cfg.put("dbname", "Teclee el dbname");
        cfg.put("port", "Teclee el puerto");
        cfg.put("photoPath", "Teclee ruta de photo");
        
        
      //  System.out.println(cfg.keySet());
        System.out.println( "Hello ProInteractive !!!" );
        
        Interactive obj = new Interactive(cfg);
        
        obj.interactive();
        obj.save("Configuración");
        
    }

}
