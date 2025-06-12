package com.lucisano.busroute.BusDB.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucisano.busroute.BusDB.Repository.BusRepository;
import com.lucisano.busroute.BusDB.entity.BusRoute;

@Service
public class BusRouteService {

    @Autowired
    private BusRepository busRepository;

    // Fetch all buses
    public List<BusRoute> getAllBusRoute() {
        return busRepository.findAll();
    }

    // Fetch buses by route name
    public List<BusRoute> getBusByRoute(String route) {
        return busRepository.findByRoute(route);
    }
     public void fetchAndInsertBuses(String apiUrl) {
        try {
            // Make HTTP GET request
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            // Read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse the JSON response
            JSONObject jsonObject = new JSONObject(response.toString());

            // Extract the "data" array
            JSONArray routeArray = jsonObject.getJSONArray("data");
            
            // Iterate through the JSON array and save each bus into the database
            for (int i = 0; i < routeArray.length(); i++) {
                JSONObject busObject = routeArray.getJSONObject(i);

                // Create Bus entity and set fields from JSON
                BusRoute busRoute = new BusRoute();
                busRoute.setRoute(busObject.getString("route"));
                busRoute.setBound(busObject.getString("bound"));
                busRoute.setServiceType(busObject.getString("service_type"));
                busRoute.setOrigEn(busObject.getString("orig_en"));
                busRoute.setOrigTc(busObject.getString("orig_tc"));
                busRoute.setOrigSc(busObject.getString("orig_sc"));
                busRoute.setDestEn(busObject.getString("dest_en"));
                busRoute.setDestTc(busObject.getString("dest_tc"));
                busRoute.setDestSc(busObject.getString("dest_sc"));

                // Save the Bus entity to the database
                busRepository.save(busRoute);
            }

            System.out.println("Buses fetched and saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

