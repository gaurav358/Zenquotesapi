package com.zenquotesapi.zenquotesapi.helping;

public class Bin {
//
//    GeoDatabase geoDatabase;
//    @GetMapping("/getc")
//    public String getCountry(@RequestParam(value="ipAddress", required=true)String ipAddress) throws IOException, GeoIp2Exception {
//        return geoDatabase.getCo("192.168.0.105");
//    }
//
//
//    package com.zenquotesapi.zenquotesapi.GeoDatabase;
//
//    import com.maxmind.geoip2.DatabaseReader;
//    import com.maxmind.geoip2.exception.GeoIp2Exception;
//    import com.maxmind.geoip2.model.CityResponse;
//
//    import java.io.File;
//    import java.io.IOException;
//    import java.net.InetAddress;
//
//    public class GeoDatabase {
//
//        File database = new File("C:\\GeoLite2-City_20220913\\GeoLite2-City.mmdb");
//        DatabaseReader dbReader = new DatabaseReader.Builder(database).build();
//
//        CityResponse getInet (String ip) throws IOException, GeoIp2Exception {
//            InetAddress ipAddress = InetAddress.getByName(ip);
//            CityResponse response = dbReader.city(ipAddress);
//            return response;
//
//        }
//
//        public String getCountry(String ip) throws IOException, GeoIp2Exception {
//            CityResponse response = getInet(ip);
//            String countryName = response.getCountry().getName();
//            return countryName;
//        }
//
//        public GeoDatabase() throws IOException {
//        }
//    }
//
//
//<dependency>
//			<groupId>com.maxmind.geoip2</groupId>
//			<artifactId>geoip2</artifactId>
//			<version>2.8.0</version>
//		</dependency>
//
//
//    show dbs
//    show collections
//db.AllQuotes.find()
//
//
//    @GetMapping("/new_order")
//    public String newOrder(@RequestHeader(value = "User-Agent") String userAgent, RedirectAttributes redirectAttributes, Model model) {
//        System.out.println(userAgent);
//        System.out.println(redirectAttributes);
//        System.out.println(model);
//        return userAgent;
//    }
//
//    @GetMapping("/new_order")
//    public String newOrder(@RequestHeader(value = "User-Agent") String userAgent, RedirectAttributes redirectAttributes, Model model) {
//        System.out.println(userAgent);
//        System.out.println(redirectAttributes);
//        System.out.println(model);
//        return userAgent;
//    }
//
//
//    @PostMapping("/addQuotes")
//    public ResponseEntity<?> addQuotes(@RequestBody AllQuotes allQuotes) {
//        AllQuotes save = this.quotes.save(allQuotes);
//        return ResponseEntity.ok(save);
//    }
//
//    {
//        @GetMapping("/getQuoteById")
//        public Object getQuoteWithAuthor(@RequestParam("id") int id) {
//
//        return quotes.findById(id);
//
//    }
//        @PostMapping("/addQuotes")
//        public ResponseEntity<?> addQuotes(@RequestBody AllQuotes allQuotes) {
//        AllQuotes save = this.quotes.save(allQuotes);
//        return ResponseEntity.ok(save);
//    }
//        @GetMapping("/getQuoteByAuthors")
//        public ResponseEntity<?>  getQuoteWithAuthors(@RequestParam("country") String country) {
//        List<String> authorList = new ArrayList<>();
//        List<CountryMapping> countrydata =  countryrepo.getBycountry(country);
//        for(CountryMapping triii:countrydata){
//            authorList = triii.getAuthor();
//        }
//        return ResponseEntity.ok(this.quotes.findBy(authorList));
//    }
//        @GetMapping("/getQuotes")
//        public ResponseEntity<?> getQuotes() {
//        return ResponseEntity.ok(this.quotes.findAll());
//    }
//
//        https://www.youtube.com/watch?v=eqZORQpOuZA
//}
}