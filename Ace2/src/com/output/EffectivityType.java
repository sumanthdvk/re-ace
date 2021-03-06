//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 03:28:23 PM IST 
//


package com.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EffectivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EffectivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="StartEvent" use="required" type="{http://schemas.configit.com/ace/import/v1/productrange}EventCodeType" />
 *       &lt;attribute name="EndEvent" use="required" type="{http://schemas.configit.com/ace/import/v1/productrange}EventCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectivityType", namespace = "http://schemas.configit.com/ace/import/v1/productrange")
@XmlSeeAlso({
    ModelYearMappingType.class,
    MarketAvailabilitySpanType.class,
    MarketAvailabilityType.class,
    BuildPhaseMappingType.class,
    FeatureApplicabilitySpanType.class
})
public class EffectivityType {

    @XmlAttribute(name = "StartEvent", required = true)
    protected String startEvent;
    @XmlAttribute(name = "EndEvent", required = true)
    protected String endEvent;

    /**
     * Gets the value of the startEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartEvent() {
        return startEvent;
    }

    /**
     * Sets the value of the startEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartEvent(String value) {
        this.startEvent = value;
    }

    /**
     * Gets the value of the endEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndEvent() {
        return endEvent;
    }

    /**
     * Sets the value of the endEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndEvent(String value) {
        this.endEvent = value;
    }

}
