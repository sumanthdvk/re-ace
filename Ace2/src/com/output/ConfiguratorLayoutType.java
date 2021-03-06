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
 * <p>Java class for ConfiguratorLayoutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfiguratorLayoutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all minOccurs="0">
 *         &lt;element name="LayoutTabs" type="{http://schemas.configit.com/ace/import/v1/library}LayoutTabCollection" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Code" use="required" type="{http://schemas.configit.com/ace/import/v1}CodeType" />
 *       &lt;attribute name="Name" use="required" type="{http://schemas.configit.com/ace/import/v1}NameType" />
 *       &lt;attribute name="Description" use="required" type="{http://schemas.configit.com/ace/import/v1}DescriptionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfiguratorLayoutType", propOrder = {

})
public class ConfiguratorLayoutType {

    @XmlElement(name = "LayoutTabs")
    protected LayoutTabCollection layoutTabs;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the layoutTabs property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutTabCollection }
     *     
     */
    public LayoutTabCollection getLayoutTabs() {
        return layoutTabs;
    }

    /**
     * Sets the value of the layoutTabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutTabCollection }
     *     
     */
    public void setLayoutTabs(LayoutTabCollection value) {
        this.layoutTabs = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

}
