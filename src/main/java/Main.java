import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static ObjectMapper mapper = new ObjectMapper();
    public static String REMOTE_SERVER_URI = "https://api.nasa.gov/planetary/apod?api_key=rQcITrCQgbpxVre5MX8edxuCDAC85L19rkchrUSs";

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet request = new HttpGet(REMOTE_SERVER_URI);
        CloseableHttpResponse response = httpClient.execute(request);
        NasaResponse myResponse = mapper.readValue(response.getEntity().getContent(), new TypeReference<>() {
        });
        HttpGet request2 = new HttpGet(myResponse.getUrl());
        CloseableHttpResponse response2 = httpClient.execute(request2);
        File nasaFile = new File(myResponse.getUrl().split("/")[myResponse.getUrl().split("/").length - 1]);
        try (FileOutputStream fos = new FileOutputStream(nasaFile)) {
            fos.write(response2.getEntity().getContent().readAllBytes());
        } catch (IOException e) {
            e.getMessage();
        }


    }
}
