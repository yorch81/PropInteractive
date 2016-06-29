package net.yorch;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

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
	private Map<String, String> cfg  = new HashMap<String, String>();
	
	/**
	 * Private Properties 
	 */
	private Properties propCfg = new Properties();
	
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
	 */
	public void interactive() {
		System.out.println("Teclee valor de variable");
	}
	
	/**
	 * Save Configuration File 
	 * 
	 * @param fileName String Full File Name
	 * @return boolean
	 */
	public boolean save(String fileName) {
		return true;
	}
}
