
package com.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GetAllMatchesFiltered complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllMatchesFiltered">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterModel" type="{http://Soap.example.com/}filterHelper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllMatchesFiltered", propOrder = { "filterModel" })
public class GetAllMatchesFiltered {

    @XmlElement(name = "FilterModel")
    protected FilterHelper filterModel;

    /**
     * Gets the value of the filterModel property.
     * 
     * @return possible object is {@link FilterHelper }
     * 
     */
    public FilterHelper getFilterModel() {
        return filterModel;
    }

    /**
     * Sets the value of the filterModel property.
     * 
     * @param value allowed object is {@link FilterHelper }
     * 
     */
    public void setFilterModel(FilterHelper value) {
        this.filterModel = value;
    }

}
