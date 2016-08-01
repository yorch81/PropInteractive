
package net.yorch;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;

/**
 * Interactive<br>
 * 
 * Interactive Class to Creates a Properties File with Interactive Console<br><br>
 * 
 * Copyright 2016 Carlos Ismael Garcia Sanchez
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
 * @version    1.0, 2016-06-29
 * @author     <a href="mailto:carlosismael4@hotmail.com">Carlos Ismael Garcia Sanchez</a>
 */
public class Interactive {
	/**
	 * Private Configuration Map
	 */
	private Map<String, String> cfg  = new LinkedHashMap<String, String>();
	
	/**
	 * Keyboard Input
	 */
	Scanner keyb = new Scanner(System.in);
	
	/**
	 * Private Properties 
	 */
	private Properties propCfg = new Properties();
	
	/**
	 * Create New Interactive
	 */
	public Interactive() {
		
	}
	
	/**
	 * Add Question
	 * 
	 * @param property String Property Name
	 * @param question String Question
	 */
	public void addQuestion(String property, String question) {
		cfg.put(property, question);
	}
	
	/**
	 * Show Interactive Console
	 */
	public void interactive() {
		Iterator<Entry<String, String>> it = cfg.entrySet().iterator();
		
		while(it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry e = (Map.Entry)it.next();
			
			// Show Question
			System.out.println(e.getValue());
			
			// Type Property
			String aux = keyb.nextLine();
			
			// Add to Properties
			propCfg.setProperty(e.getKey().toString(),aux);
		}	
	}
	
	/**
	 * Save Configuration File 
	 * 
	 * @param fileName String Full File Name
	 * @return boolean
	 */
	public boolean save(String fileName) {
		OutputStream propFile = null;
		boolean retValue = false;
		
		try {
			propFile = new FileOutputStream(fileName);
			
			propCfg.store(propFile, null);

			if(propFile != null){
				propFile.close();
				
				retValue = true;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return retValue;
	}
}
