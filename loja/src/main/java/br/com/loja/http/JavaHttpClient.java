package br.com.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(url);
            URLConnection connection = urlApi.openConnection();
            connection.connect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
