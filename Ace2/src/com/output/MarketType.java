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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all minOccurs="0">
 *         &lt;element name="PropertyValues" type="{http://schemas.configit.com/ace/import/v1}PropertyValueCollection" minOccurs="0"/>
 *         &lt;element name="Languages" type="{http://schemas.configit.com/ace/import/v1/library}MarketLanguageCodeCollection"/>
 *         &lt;element name="BrandSpecificData" type="{http://schemas.configit.com/ace/import/v1/library}BrandSpecificDataCollection" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Code" use="required" type="{http://schemas.configit.com/ace/import/v1}CodeType" />
 *       &lt;attribute name="Description" use="required" type="{http://schemas.configit.com/ace/import/v1}LimitedDescriptionType" />
 *       &lt;attribute name="Feature" use="required" type="{http://schemas.configit.com/ace/import/v1}CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketType", propOrder = {

})
public class MarketType {

    @XmlElement(name = "PropertyValues")
    protected PropertyValueCollection propertyValues;
    @XmlElement(name = "Languages")
    protected MarketLanguageCodeCollection languages;
    @XmlElement(name = "BrandSpecificData")
    protected BrandSpecificDataCollection brandSpecificData;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    @XmlAttribute(name = "Feature", required = true)
    protected String feature;

    /**
     * Gets the value of the propertyValues property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyValueCollection }
     *     
     */
    public PropertyValueCollection getPropertyValues() {
        return propertyValues;
    }

    /**
     * Sets the value of the propertyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyValueCollection }
     *     
     */
    public void setPropertyValues(PropertyValueCollection value) {
        this.propertyValues = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link MarketLanguageCodeCollection }
     *     
     */
    public MarketLanguageCodeCollection getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketLanguageCodeCollection }
     *     
     */
    public void setLanguages(MarketLanguageCodeCollection value) {
        this.languages = value;
    }

    /**
     * Gets the value of the brandSpecificData property.
     * 
     * @return
     *     possible object is
     *     {@link BrandSpecificDataCollection }
     *     
     */
    public BrandSpecificDataCollection getBrandSpecificData() {
        return brandSpecificData;
    }

    /**
     * Sets the value of the brandSpecificData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandSpecificDataCollection }
     *     
     */
    public void setBrandSpecificData(BrandSpecificDataCollection value) {
        this.brandSpecificData = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

}