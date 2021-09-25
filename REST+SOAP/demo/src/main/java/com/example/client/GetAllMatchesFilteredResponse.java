
package com.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetAllMatchesFilteredResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllMatchesFilteredResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchesPojo" type="{http://Soap.example.com/}matchesPojo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllMatchesFilteredResponse", propOrder = { "matchesPojo" })
public class GetAllMatchesFilteredResponse {

    @XmlElement(name = "MatchesPojo")
    protected MatchesPojo matchesPojo;

    /**
     * Gets the value of the matchesPojo property.
     * 
     * @return possible object is {@link MatchesPojo }
     * 
     */
    public MatchesPojo getMatchesPojo() {
        return matchesPojo;
    }

    /**
     * Sets the value of the matchesPojo property.
     * 
     * @param value allowed object is {@link MatchesPojo }
     * 
     */
    public void setMatchesPojo(MatchesPojo value) {
        this.matchesPojo = value;
    }

}
