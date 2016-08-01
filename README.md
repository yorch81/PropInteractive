# PropInteractive #

## Description ##
Creates a Properties files with interactive console

## Requirements ##
* [Java](https://www.java.com/es/download/)

## Developer Documentation ##
JavaDoc.

## Installation ##
Add JCenter Repository to pom.xml:

~~~
<repository>
  <id>jcenter</id>
  <url>http://jcenter.bintray.com </url>
  <snapshots>
    <enabled>true</enabled>
    <updatePolicy>never</updatePolicy>
    <checksumPolicy>warn</checksumPolicy>
  </snapshots>
   <releases>
     <enabled>true</enabled>
     <checksumPolicy>warn</checksumPolicy>
  </releases>
</repository>
~~~

Add maven dependency:

~~~
<dependency>
  <groupId>net.yorch</groupId>
  <artifactId>PropInteractive</artifactId>
  <version>1.0</version>
</dependency>
~~~

## Example ##
~~~

Interactive interactive = new Interactive();
        
interactive.addQuestion("hostname", "Type hostname:");
interactive.addQuestion("user","Type User Name:");
interactive.addQuestion("password", "Type Password:");
interactive.addQuestion("dbname", "Type Database Name:");

interactive.interactive();
interactive.save("config.properties");

~~~

## Notes ##
Check JCenter Repository.

## References ##
https://docs.oracle.com/javase/7/docs/api/java/util/Properties.html

P.D. Let's go play !!!







