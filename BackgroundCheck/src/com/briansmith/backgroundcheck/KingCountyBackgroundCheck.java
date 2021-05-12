package com.briansmith.backgroundcheck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KingCountyBackgroundCheck implements Runnable{
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Model\\KingCountyCourt.txt"));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Error when running background check with King County Courts:" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
