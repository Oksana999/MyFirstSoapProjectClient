package service;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080//TempConverterImplService?wsdl" );

        QName qName = new QName("http://service/", "TempConverterImplService");

        Service service = Service.create(url, qName);

        QName port = new QName("http://service/", "TempConverterImplPort");

        TempConverter tc = service.getPort(port, TempConverter.class);

        System.out.println(tc.c2F(100));
        System.out.println(tc.f2C(200));
    }
}
