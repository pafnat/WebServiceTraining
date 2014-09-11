package com.geoip.service.consumer;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * http://www.webservicex.net/geoipservice.asmx?op=GetGeoIP
 * GeoIPService - GetGeoIP enables you to easily look up countries by IP addresses
 * http://www.webservicex.net/geoipservice.asmx?WSDL
 */
public class GeoIpClient {

    public static void main(String[] args) {

        String ipAddress = "173.194.32.135"; // google.com IP

        GeoIPService geoIPService = new GeoIPService();
        GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();

        //System.out.println(geoIPServiceSoap.getGeoIPContext());

        GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);

        System.out.println("Google server = " + geoIp.getCountryName());

        System.out.println("Yahoo Germany Server Location = " + geoIPServiceSoap.getGeoIP("212.82.102.24").getCountryName());


    }

}
