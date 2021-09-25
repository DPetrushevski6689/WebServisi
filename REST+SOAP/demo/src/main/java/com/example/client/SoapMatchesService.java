
package com.example.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SoapMatchesService", targetNamespace = "http://Soap.example.com/", wsdlLocation = "http://127.0.0.1:8080/demo/soapapi?wsdl")
public class SoapMatchesService extends Service {

    private final static URL SOAPMATCHESSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPMATCHESSERVICE_EXCEPTION;
    private final static QName SOAPMATCHESSERVICE_QNAME = new QName("http://Soap.example.com/", "SoapMatchesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8080/demo/soapapi?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPMATCHESSERVICE_WSDL_LOCATION = url;
        SOAPMATCHESSERVICE_EXCEPTION = e;
    }

    public SoapMatchesService() {
        super(__getWsdlLocation(), SOAPMATCHESSERVICE_QNAME);
    }

    public SoapMatchesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPMATCHESSERVICE_QNAME, features);
    }

    public SoapMatchesService(URL wsdlLocation) {
        super(wsdlLocation, SOAPMATCHESSERVICE_QNAME);
    }

    public SoapMatchesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPMATCHESSERVICE_QNAME, features);
    }

    public SoapMatchesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapMatchesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return returns SoapMatches
     */
    @WebEndpoint(name = "SoapMatchesPort")
    public SoapMatches getSoapMatchesPort() {
        return super.getPort(new QName("http://Soap.example.com/", "SoapMatchesPort"), SoapMatches.class);
    }

    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure
     *                 on the proxy. Supported features not in the
     *                 <code>features</code> parameter will have their default
     *                 values.
     * @return returns SoapMatches
     */
    @WebEndpoint(name = "SoapMatchesPort")
    public SoapMatches getSoapMatchesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Soap.example.com/", "SoapMatchesPort"), SoapMatches.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPMATCHESSERVICE_EXCEPTION != null) {
            throw SOAPMATCHESSERVICE_EXCEPTION;
        }
        return SOAPMATCHESSERVICE_WSDL_LOCATION;
    }

}
