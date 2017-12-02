
package com.wirelesscar.dynafleet.api.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVehicleReportDataExtendedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVehicleReportDataExtendedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://wirelesscar.com/dynafleet/api/types}Api_VehicleDataExtendedTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVehicleReportDataExtendedResponse", propOrder = {
    "result"
})
public class GetVehicleReportDataExtendedResponse {

    @XmlElement(required = true, nillable = true)
    protected ApiVehicleDataExtendedTO result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ApiVehicleDataExtendedTO }
     *     
     */
    public ApiVehicleDataExtendedTO getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiVehicleDataExtendedTO }
     *     
     */
    public void setResult(ApiVehicleDataExtendedTO value) {
        this.result = value;
    }

}
