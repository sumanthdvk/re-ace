//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 03:28:23 PM IST 
//


package com.output;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrochureModelCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrochureModelCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="BrochureModel" type="{http://schemas.configit.com/ace/import/v1/productrange}BrochureModelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrochureModelCollection", namespace = "http://schemas.configit.com/ace/import/v1/productrange", propOrder = {
    "brochureModel"
})
public class BrochureModelCollection {

    @XmlElement(name = "BrochureModel")
    protected List<BrochureModelType> brochureModel;

    /**
     * Gets the value of the brochureModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brochureModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrochureModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrochureModelType }
     * 
     * 
     */
    public List<BrochureModelType> getBrochureModel() {
        if (brochureModel == null) {
            brochureModel = new ArrayList<BrochureModelType>();
        }
        return this.brochureModel;
    }

}
