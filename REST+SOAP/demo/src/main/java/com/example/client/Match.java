
package com.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for match complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="match">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFinished" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateScheduled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stadium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://Soap.example.com/}status" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "match", propOrder = { "city", "dateFinished", "dateScheduled", "id", "name", "score", "stadium",
        "status", "type" })
public class Match {

    protected String city;
    protected String dateFinished;
    protected String dateScheduled;
    protected long id;
    protected String name;
    protected String score;
    protected String stadium;
    @XmlSchemaType(name = "string")
    protected Status status;
    protected String type;

    /**
     * Gets the value of the city property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the dateFinished property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDateFinished() {
        return dateFinished;
    }

    /**
     * Sets the value of the dateFinished property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDateFinished(String value) {
        this.dateFinished = value;
    }

    /**
     * Gets the value of the dateScheduled property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDateScheduled() {
        return dateScheduled;
    }

    /**
     * Sets the value of the dateScheduled property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDateScheduled(String value) {
        this.dateScheduled = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Gets the value of the stadium property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStadium() {
        return stadium;
    }

    /**
     * Sets the value of the stadium property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStadium(String value) {
        this.stadium = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link Status }
     * 
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is {@link Status }
     * 
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setType(String value) {
        this.type = value;
    }

}
