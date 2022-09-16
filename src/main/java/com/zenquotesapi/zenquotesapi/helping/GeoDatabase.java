package com.zenquotesapi.zenquotesapi.helping;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public class GeoDatabase {

    File database = new File("C:\\GeoLite2-City_20220913\\GeoLite2-City.mmdb");
    DatabaseReader dbReader = new DatabaseReader.Builder(database).build();

    CityResponse getInet (String ip) throws IOException, GeoIp2Exception {
        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = dbReader.city(ipAddress);
        return response;
    }

    public static String getCo(String ip) throws IOException, GeoIp2Exception {
        GeoDatabase abc = new GeoDatabase();
        CityResponse response = abc.getInet(ip);
        String countryName = response.getCountry().getName();
        return countryName;
    }

    public GeoDatabase() throws IOException {
    }
}