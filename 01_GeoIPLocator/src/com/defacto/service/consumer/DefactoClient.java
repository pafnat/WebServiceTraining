package com.defacto.service.consumer;

import com.reportingsales.*;
import java.util.List;

/**
 * http://service-repository.com/service/overview/586914408
 * WSDL (original): http://www.reportingsales.com/DeFactoSF1.asmx?WSDL
 * In order to use or test this service, you must have an application key.
 */
public class DefactoClient {

    private static String key = "CDBD7FCD-FD42-41C0-BA0A-E11F8D67316F";

    public static void main(String[] args) {

        System.out.println(new DefactoClient().key);

/*
        Country name -> List of states in the country
        State name -> City names in the state
*/

        DeFactoSF1 dfs = new DeFactoSF1();

        DeFactoSF1Soap dfSoap = dfs.getDeFactoSF1Soap();

        BigName bName = dfSoap.deFactoSF1Part1ByNameState("Portland", "OR", key);
        System.out.println("City name = " + bName.getNAME());

        BigZip bName2 = dfSoap.deFactoSF1Part1ByZip("97005", key);
        System.out.println(bName2.getNAME());


        ArrayOfDefactoName2 arrDef = dfSoap.deFactoSF1Part2ByNameState("Portland", "OR", key);
        List<DefactoName2> list = arrDef.getDefactoName2();
        for (int i = 0; i < list.size(); i++) {
            DefactoName2 defactoName2 =  list.get(i);
            System.out.println("Total male population in " + defactoName2.getNAME().trim() + " from the ages of 25 to 29 is " + defactoName2.getMale25To29());
        }



    }


}
