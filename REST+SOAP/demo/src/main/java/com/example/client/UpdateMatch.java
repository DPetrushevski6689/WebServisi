
package com.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UpdateMatch complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchPojo" type="{http://Soap.example.com/}matchPojo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMatch", propOrder = { "matchPojo" })
public class UpdateMatch {

    @XmlElement(name = "MatchPojo")
    protected MatchPojo matchPojo;

    /**
     * Gets the value of the matchPojo property.
     * 
     * @return possible object is {@link MatchPojo }
     * 
     */
    public MatchPojo getMatchPojo() {
        return matchPojo;
    }

    /**
     * Sets the value of the matchPojo property.
     * 
     * @param value allowed object is {@link MatchPojo }
     * 
     */
    public void setMatchPojo(MatchPojo value) {
        this.matchPojo = value;
    }

}
