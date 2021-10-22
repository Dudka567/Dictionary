set DIR_PROJECT=C:\\Dictionary\MyPack
del /s %DIR_BIN%\*.class >NUL
javac C:\\Dictionary\MyPack\*.java
java -classpath C:\\Dictionary MyPack.Main