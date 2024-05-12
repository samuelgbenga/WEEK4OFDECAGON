package org.example;

import java.io.*;

import static java.lang.Integer.parseInt;




public class Main {

   static void toRead(String filePath){

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();

            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }

            // line = reader.readLine();

            reader.close();
        }catch  (Exception e){
            System.out.println("it is wrong");}

    }

    // to write file
    static void toWrite(String pathToWrite){
       try {
           BufferedWriter writer = new BufferedWriter(new FileWriter(pathToWrite));
           writer.write("write a string");
           writer.close();
       }catch (Exception e){
           System.out.println("we don't know the exception yet");
       }
    }

    public static void main(String[] args) {

       String readFilePath = "file.txt";
        toRead(readFilePath);

        String writeFilePath = "output.txt";
        toWrite(writeFilePath);

        String writeToCSV = "output1.csv";
        toWrite(writeToCSV);
       /*
       to write your file on other path you need to specify the absolute
       path:
       eg:
       driveName:\\dir\\dir\\filename with extension.
        */



    }
}