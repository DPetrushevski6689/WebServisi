
package com.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetMatchById complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetMatchById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchID" type="{http://Soap.example.com/}matchID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMatchById", propOrder = { "matchID" })
public class GetMatchById {

    @XmlElement(name = "MatchID")
    protected MatchID matchID;

    /**
     * Gets the value of the matchID property.
     * 
     * @return possible object is {@link MatchID }
     * 
     */
    public MatchID getMatchID() {
        return matchID;
    }

    /**
     * Sets the value of the matchID property.
     * 
     * @param value allowed object is {@link MatchID }
     * 
     */
    public void setMatchID(MatchID value) {
        this.matchID = value;
    }

}
