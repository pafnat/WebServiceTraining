package com.geoip.service.consumer;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class GeoIpClient {

    public static void main(String[] args) {

        String ipAddess = "173.194.32.130";

        GeoIPService geoIPService = new GeoIPService();
        GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();

        //System.out.println(geoIPServiceSoap.getGeoIPContext());

        GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddess);

        System.out.println("Google server = " + geoIp.getCountryName());

        System.out.println("Yahoo Germany Server Location = " + geoIPServiceSoap.getGeoIP("212.82.102.24").getCountryName());


    }

}
