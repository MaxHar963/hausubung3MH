/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoe3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Max
 */
public class Class {

    public void einlesen(String fileName, String splitBY) {

        List<Weapon> list = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = "";
            while ((line = br.readLine()) != null) {

                String[] arr = line.split(splitBY);
                if (arr[0].compareTo("name") == 0) {

                } else {

                    list.add(new Weapon(CombatType.valueOf(arr[1].toUpperCase()), DamageType.valueOf(arr[2].toUpperCase()), arr[0], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])));

                }

            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));

            }

        } catch (Exception e) {

            System.out.println("UNO EXEPTIONA");

        }

    }

}
