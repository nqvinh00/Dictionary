package Dictionary;

import java.io.*;
import java.lang.reflect.Type;
import java.net.*;
import java.util.*;

import com.formdev.flatlaf.json.Json;
import com.google.gson.*;
import com.squareup.okhttp.*;
import netscape.javascript.JSObject;

public class API {
    private static String subscriptionKey = "77c1fb27ceae4a138b7ee476e790f74f";
    private static String endpoint = "https://api.cognitive.microsofttranslator.com/";
    private String translateTarget;
    private String content;
    String url = endpoint + "/translate?api-version=3.0&to=vi";

    OkHttpClient client = new OkHttpClient();

    public String Post() throws IOException {
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, content);
        Request request = new Request.Builder()
                .url(url).post(body)
                .addHeader("Ocp-Apim-Subscription-Key", subscriptionKey)
                .addHeader("Ocp-Apim-Subscription-Region", "southeastasia")
                .addHeader("Content-type", "application/json").build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    // This function prettifies the json response.
    public static String prettify(String json_text) {
        JsonParser parser = new JsonParser();

        JsonElement json = parser.parse(json_text);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
       return json_text.substring(76, json_text.indexOf("to") - 3);
    }

    public API(String translateTarget) {
        this.translateTarget = translateTarget;
        this.content = "[{\"Text\": \"" + translateTarget + "\"}]";
    }

//    public static void main(String[] args) {
//        try {
//            API translateRequest = new API("Fuck you");
//            String response = translateRequest.Post();
//            System.out.println(prettify(response));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}