To run the project in Eclipse:
	-Right click on the JewelApplication.java file.
	-Run as java application
	-The application will run on tomcat server on port 9090 (Configured in applicaton.properties)
	- Decomplier : https://stackoverflow.com/questions/48396661/eclipse-enhanced-class-decompiler-plugin-does-not-decompile-when-debugging
	
To run in intellij:
	-After build.
	-Copy the war file to tomcat server intalled locally
	-Prefer tomcat to run on 9090 port by changing the port in server.xml in tomcat conf directory
	-Copy the app in webapps and rename the app to ROOT.war for test runs
	
DB Initialization:
	-The queries written in data.sql run only when the tables are created.
	-Delete the existing tables in DB manually and then restart aapplication to make them run via startup.
	
Spring Security Config:
	-http://websystique.com/spring-security/spring-security-4-password-encoder-bcrypt-example-with-hibernate/