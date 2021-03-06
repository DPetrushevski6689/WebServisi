
package com.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UpdateMatchResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMatchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoapResponse" type="{http://Soap.example.com/}soapResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMatchResponse", propOrder = { "soapResponse" })
public class UpdateMatchResponse {

    @XmlElement(name = "SoapResponse")
    protected SoapResponse soapResponse;

    /**
     * Gets the value of the soapResponse property.
     * 
     * @return possible object is {@link SoapResponse }
     * 
     */
    public SoapResponse getSoapResponse() {
        return soapResponse;
    }

    /**
     * Sets the value of the soapResponse property.
     * 
     * @param value allowed object is {@link SoapResponse }
     * 
     */
    public void setSoapResponse(SoapResponse value) {
        this.soapResponse = value;
    }

}
