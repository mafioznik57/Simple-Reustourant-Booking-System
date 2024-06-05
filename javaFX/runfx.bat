@echo off
javac --module-path "C:\Program Files\Java\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml *.java
java --module-path "C:\Program Files\Java\javafx-sdk-21.0.2\lib" --add-modules javafx.controls,javafx.fxml %1
