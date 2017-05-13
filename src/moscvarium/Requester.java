package moscvarium;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

/**
 * Created by xTazy on 5/10/17.
 */
public class Requester {
    private static final XmlMapper xmlMapper = new XmlMapper();
    private final String BaseUrl;

    public Requester(String baseUrl) {
        BaseUrl = baseUrl;
    }

    public <T> T getHTML(String urlToRead, Class<T> resultType) throws Exception {
        StringBuilder result = new StringBuilder();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("189.203.172.82", 8080));
        URL url = new URL(this.BaseUrl + urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"Windows-1251"));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
//        JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
        return xmlMapper.readValue(result.toString(), resultType);
    }
}
