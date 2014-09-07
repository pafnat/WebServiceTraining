package com.javaws.countryInfo.consumer;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class CountryInfoConsumer {

    public static void main(String[] args) {

        CountryInfoService countryInfoService = new CountryInfoService();

        CountryInfoServiceSoapType countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();

        System.out.println("Country name is " + countryInfoServiceSoapType.countryName("AU") + " Capital is " + countryInfoServiceSoapType.capitalCity("AU"));

        System.out.println("Country name is " + countryInfoServiceSoapType.countryName("CN") + " Capital is " + countryInfoServiceSoapType.capitalCity("CN"));

        System.out.println("Country name is " + countryInfoServiceSoapType.countryName("DN") + " Capital is " + countryInfoServiceSoapType.capitalCity("CN") + " Currency code is " + countryInfoServiceSoapType.currencyName("DKK"));


    }

}
