installed 
download zip of allure and add path to env. variables of bin directory of extracted zip.
Create maven project
and add following dependencies in pom xml
selenium java 4.20.0
testng
allure testng
add test in src>test>java
convert project to testng
in testng.xml add proper class values for test class

run test
open cmd in project location
and type allure serve

This should pull up allure report in chrome
