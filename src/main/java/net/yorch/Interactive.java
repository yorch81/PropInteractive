
package net.yorch;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import java.util.Scanner;



/**
 * Interactive<br>
 * 
 * Interactive Class to Creates a Properties Files with Interactive Console<br><br>
 * 
 * Copyright 2016 Carlos Ismael
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @version    1.0.0, 2016-06-29
 * @author     <a href="mailto:the.yorch@gmail.com">Jorge Alberto Ponce Turrubiates</a>
 */
public class Interactive {
	
	/**
	 * Private Configuration Map
	 */
	private Map<String, String> cfg  = new LinkedHashMap<String, String>();
	
	Scanner entrada = new Scanner(System.in);
	/**
	 * Private Properties 
	 */
	private Properties propCfg = new Properties();
	private OutputStream salida = null;
	
	/**
	 * Constructor Class
	 * 
	 * @param config Map<String, String> Configuration Map
	 */
	public Interactive(Map<String, String> config) {
		cfg = config;
	}
	
	/**
	 * Show Interactive Console
	 * @throws IOException 
	 */
	public void interactive() throws IOException {
		
		//recorrer el map y mostrar mensaje, pedir los valores a guardar	
		
		
		Iterator it = cfg.entrySet().iterator();
		
		while(it.hasNext())
		{	
			
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getValue());
			String aux = entrada.nextLine();
			//Introducir valores al .propertie
			propCfg.setProperty(e.getKey().toString(),aux);
			
		}
		
	}
	
	/**
	 * Save Configuration File 
	 * 
	 * @param fileName String Full File Name
	 * @return boolean
	 * @throws IOException 
	 */
	public boolean save(String fileName) throws IOException {
		salida = new FileOutputStream(fileName + ".properties");
		propCfg.store(salida, null);

		if(salida != null){
			salida.close();
			System.out.println("Archivo " + fileName + ".properties generado");
		}
		return true;
	}
}
