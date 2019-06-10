
package com.cybersource.schemas.transaction_data_1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PayerAuthEnrollReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerAuthEnrollReply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="acsURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cavvAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proxyPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proofXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ucafAuthenticationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ucafCollectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paresStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="veresEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerAuthEnrollReply", propOrder = {
    "reasonCode",
    "acsURL",
    "authenticationResult",
    "authenticationStatusMessage",
    "cavv",
    "cavvAlgorithm",
    "commerceIndicator",
    "eci",
    "eciRaw",
    "paReq",
    "proxyPAN",
    "xid",
    "proofXML",
    "ucafAuthenticationData",
    "ucafCollectionIndicator",
    "paresStatus",
    "veresEnrolled",
    "authenticationPath"
})
public class PayerAuthEnrollReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String acsURL;
    protected String authenticationResult;
    protected String authenticationStatusMessage;
    protected String cavv;
    protected String cavvAlgorithm;
    protected String commerceIndicator;
    protected String eci;
    protected String eciRaw;
    protected String paReq;
    protected String proxyPAN;
    protected String xid;
    protected String proofXML;
    protected String ucafAuthenticationData;
    protected String ucafCollectionIndicator;
    protected String paresStatus;
    protected String veresEnrolled;
    protected String authenticationPath;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the acsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsURL() {
        return acsURL;
    }

    /**
     * Sets the value of the acsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsURL(String value) {
        this.acsURL = value;
    }

    /**
     * Gets the value of the authenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Sets the value of the authenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationResult(String value) {
        this.authenticationResult = value;
    }

    /**
     * Gets the value of the authenticationStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationStatusMessage() {
        return authenticationStatusMessage;
    }

    /**
     * Sets the value of the authenticationStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationStatusMessage(String value) {
        this.authenticationStatusMessage = value;
    }

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the cavvAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvAlgorithm() {
        return cavvAlgorithm;
    }

    /**
     * Sets the value of the cavvAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvAlgorithm(String value) {
        this.cavvAlgorithm = value;
    }

    /**
     * Gets the value of the commerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceIndicator() {
        return commerceIndicator;
    }

    /**
     * Sets the value of the commerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceIndicator(String value) {
        this.commerceIndicator = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * Gets the value of the eciRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Sets the value of the eciRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Gets the value of the paReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaReq() {
        return paReq;
    }

    /**
     * Sets the value of the paReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaReq(String value) {
        this.paReq = value;
    }

    /**
     * Gets the value of the proxyPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyPAN() {
        return proxyPAN;
    }

    /**
     * Sets the value of the proxyPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyPAN(String value) {
        this.proxyPAN = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Gets the value of the proofXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofXML() {
        return proofXML;
    }

    /**
     * Sets the value of the proofXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofXML(String value) {
        this.proofXML = value;
    }

    /**
     * Gets the value of the ucafAuthenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcafAuthenticationData() {
        return ucafAuthenticationData;
    }

    /**
     * Sets the value of the ucafAuthenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcafAuthenticationData(String value) {
        this.ucafAuthenticationData = value;
    }

    /**
     * Gets the value of the ucafCollectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcafCollectionIndicator() {
        return ucafCollectionIndicator;
    }

    /**
     * Sets the value of the ucafCollectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcafCollectionIndicator(String value) {
        this.ucafCollectionIndicator = value;
    }

    /**
     * Gets the value of the paresStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParesStatus() {
        return paresStatus;
    }

    /**
     * Sets the value of the paresStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParesStatus(String value) {
        this.paresStatus = value;
    }

    /**
     * Gets the value of the veresEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    /**
     * Sets the value of the veresEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeresEnrolled(String value) {
        this.veresEnrolled = value;
    }

    /**
     * Gets the value of the authenticationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationPath() {
        return authenticationPath;
    }

    /**
     * Sets the value of the authenticationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationPath(String value) {
        this.authenticationPath = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}