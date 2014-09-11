
package com.reportingsales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bigZip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bigZip">
 *   &lt;complexContent>
 *     &lt;extension base="{http://reportingsales.com/}EntityObject">
 *       &lt;sequence>
 *         &lt;element name="FILEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STUSAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARITER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOGRECNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WhiteOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BlackOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NativeOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AsianOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IslandOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OtherRaceOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TwoOrMoreRace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousTot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousOcc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVac" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousOccTot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousOccOwned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousOccLoaned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousOccRent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacTot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacForRent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacRented" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacForSale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacSold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacSeasonal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacMigrant" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HousVacOther" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bigzipid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HispOrLatino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotHispOrLatino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AREALAND" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AREAWATR" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bigZip", propOrder = {
    "fileid",
    "stusab",
    "chariter",
    "cifsn",
    "logrecno",
    "name",
    "zip",
    "total",
    "whiteOnly",
    "blackOnly",
    "nativeOnly",
    "asianOnly",
    "islandOnly",
    "otherRaceOnly",
    "twoOrMoreRace",
    "housTot",
    "housOcc",
    "housVac",
    "housOccTot",
    "housOccOwned",
    "housOccLoaned",
    "housOccRent",
    "housVacTot",
    "housVacForRent",
    "housVacRented",
    "housVacForSale",
    "housVacSold",
    "housVacSeasonal",
    "housVacMigrant",
    "housVacOther",
    "bigzipid",
    "hispOrLatino",
    "notHispOrLatino",
    "lat",
    "lon",
    "arealand",
    "areawatr"
})
public class BigZip
    extends EntityObject
{

    @XmlElement(name = "FILEID")
    protected String fileid;
    @XmlElement(name = "STUSAB")
    protected String stusab;
    @XmlElement(name = "CHARITER")
    protected String chariter;
    @XmlElement(name = "CIFSN")
    protected String cifsn;
    @XmlElement(name = "LOGRECNO")
    protected int logrecno;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Total", required = true, type = Integer.class, nillable = true)
    protected Integer total;
    @XmlElement(name = "WhiteOnly", required = true, type = Integer.class, nillable = true)
    protected Integer whiteOnly;
    @XmlElement(name = "BlackOnly", required = true, type = Integer.class, nillable = true)
    protected Integer blackOnly;
    @XmlElement(name = "NativeOnly", required = true, type = Integer.class, nillable = true)
    protected Integer nativeOnly;
    @XmlElement(name = "AsianOnly", required = true, type = Integer.class, nillable = true)
    protected Integer asianOnly;
    @XmlElement(name = "IslandOnly", required = true, type = Integer.class, nillable = true)
    protected Integer islandOnly;
    @XmlElement(name = "OtherRaceOnly", required = true, type = Integer.class, nillable = true)
    protected Integer otherRaceOnly;
    @XmlElement(name = "TwoOrMoreRace", required = true, type = Integer.class, nillable = true)
    protected Integer twoOrMoreRace;
    @XmlElement(name = "HousTot", required = true, type = Integer.class, nillable = true)
    protected Integer housTot;
    @XmlElement(name = "HousOcc", required = true, type = Integer.class, nillable = true)
    protected Integer housOcc;
    @XmlElement(name = "HousVac", required = true, type = Integer.class, nillable = true)
    protected Integer housVac;
    @XmlElement(name = "HousOccTot", required = true, type = Integer.class, nillable = true)
    protected Integer housOccTot;
    @XmlElement(name = "HousOccOwned", required = true, type = Integer.class, nillable = true)
    protected Integer housOccOwned;
    @XmlElement(name = "HousOccLoaned", required = true, type = Integer.class, nillable = true)
    protected Integer housOccLoaned;
    @XmlElement(name = "HousOccRent", required = true, type = Integer.class, nillable = true)
    protected Integer housOccRent;
    @XmlElement(name = "HousVacTot", required = true, type = Integer.class, nillable = true)
    protected Integer housVacTot;
    @XmlElement(name = "HousVacForRent", required = true, type = Integer.class, nillable = true)
    protected Integer housVacForRent;
    @XmlElement(name = "HousVacRented", required = true, type = Integer.class, nillable = true)
    protected Integer housVacRented;
    @XmlElement(name = "HousVacForSale", required = true, type = Integer.class, nillable = true)
    protected Integer housVacForSale;
    @XmlElement(name = "HousVacSold", required = true, type = Integer.class, nillable = true)
    protected Integer housVacSold;
    @XmlElement(name = "HousVacSeasonal", required = true, type = Integer.class, nillable = true)
    protected Integer housVacSeasonal;
    @XmlElement(name = "HousVacMigrant", required = true, type = Integer.class, nillable = true)
    protected Integer housVacMigrant;
    @XmlElement(name = "HousVacOther", required = true, type = Integer.class, nillable = true)
    protected Integer housVacOther;
    protected int bigzipid;
    @XmlElement(name = "HispOrLatino", required = true, type = Integer.class, nillable = true)
    protected Integer hispOrLatino;
    @XmlElement(name = "NotHispOrLatino", required = true, type = Integer.class, nillable = true)
    protected Integer notHispOrLatino;
    @XmlElement(name = "LAT")
    protected String lat;
    @XmlElement(name = "LON")
    protected String lon;
    @XmlElement(name = "AREALAND", required = true, type = Double.class, nillable = true)
    protected Double arealand;
    @XmlElement(name = "AREAWATR", required = true, type = Double.class, nillable = true)
    protected Double areawatr;

    /**
     * Gets the value of the fileid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILEID() {
        return fileid;
    }

    /**
     * Sets the value of the fileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILEID(String value) {
        this.fileid = value;
    }

    /**
     * Gets the value of the stusab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUSAB() {
        return stusab;
    }

    /**
     * Sets the value of the stusab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUSAB(String value) {
        this.stusab = value;
    }

    /**
     * Gets the value of the chariter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARITER() {
        return chariter;
    }

    /**
     * Sets the value of the chariter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARITER(String value) {
        this.chariter = value;
    }

    /**
     * Gets the value of the cifsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIFSN() {
        return cifsn;
    }

    /**
     * Sets the value of the cifsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIFSN(String value) {
        this.cifsn = value;
    }

    /**
     * Gets the value of the logrecno property.
     * 
     */
    public int getLOGRECNO() {
        return logrecno;
    }

    /**
     * Sets the value of the logrecno property.
     * 
     */
    public void setLOGRECNO(int value) {
        this.logrecno = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
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
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

    /**
     * Gets the value of the whiteOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWhiteOnly() {
        return whiteOnly;
    }

    /**
     * Sets the value of the whiteOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWhiteOnly(Integer value) {
        this.whiteOnly = value;
    }

    /**
     * Gets the value of the blackOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlackOnly() {
        return blackOnly;
    }

    /**
     * Sets the value of the blackOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlackOnly(Integer value) {
        this.blackOnly = value;
    }

    /**
     * Gets the value of the nativeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNativeOnly() {
        return nativeOnly;
    }

    /**
     * Sets the value of the nativeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNativeOnly(Integer value) {
        this.nativeOnly = value;
    }

    /**
     * Gets the value of the asianOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAsianOnly() {
        return asianOnly;
    }

    /**
     * Sets the value of the asianOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAsianOnly(Integer value) {
        this.asianOnly = value;
    }

    /**
     * Gets the value of the islandOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIslandOnly() {
        return islandOnly;
    }

    /**
     * Sets the value of the islandOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIslandOnly(Integer value) {
        this.islandOnly = value;
    }

    /**
     * Gets the value of the otherRaceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherRaceOnly() {
        return otherRaceOnly;
    }

    /**
     * Sets the value of the otherRaceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherRaceOnly(Integer value) {
        this.otherRaceOnly = value;
    }

    /**
     * Gets the value of the twoOrMoreRace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTwoOrMoreRace() {
        return twoOrMoreRace;
    }

    /**
     * Sets the value of the twoOrMoreRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTwoOrMoreRace(Integer value) {
        this.twoOrMoreRace = value;
    }

    /**
     * Gets the value of the housTot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousTot() {
        return housTot;
    }

    /**
     * Sets the value of the housTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousTot(Integer value) {
        this.housTot = value;
    }

    /**
     * Gets the value of the housOcc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousOcc() {
        return housOcc;
    }

    /**
     * Sets the value of the housOcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousOcc(Integer value) {
        this.housOcc = value;
    }

    /**
     * Gets the value of the housVac property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVac() {
        return housVac;
    }

    /**
     * Sets the value of the housVac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVac(Integer value) {
        this.housVac = value;
    }

    /**
     * Gets the value of the housOccTot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousOccTot() {
        return housOccTot;
    }

    /**
     * Sets the value of the housOccTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousOccTot(Integer value) {
        this.housOccTot = value;
    }

    /**
     * Gets the value of the housOccOwned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousOccOwned() {
        return housOccOwned;
    }

    /**
     * Sets the value of the housOccOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousOccOwned(Integer value) {
        this.housOccOwned = value;
    }

    /**
     * Gets the value of the housOccLoaned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousOccLoaned() {
        return housOccLoaned;
    }

    /**
     * Sets the value of the housOccLoaned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousOccLoaned(Integer value) {
        this.housOccLoaned = value;
    }

    /**
     * Gets the value of the housOccRent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousOccRent() {
        return housOccRent;
    }

    /**
     * Sets the value of the housOccRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousOccRent(Integer value) {
        this.housOccRent = value;
    }

    /**
     * Gets the value of the housVacTot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacTot() {
        return housVacTot;
    }

    /**
     * Sets the value of the housVacTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacTot(Integer value) {
        this.housVacTot = value;
    }

    /**
     * Gets the value of the housVacForRent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacForRent() {
        return housVacForRent;
    }

    /**
     * Sets the value of the housVacForRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacForRent(Integer value) {
        this.housVacForRent = value;
    }

    /**
     * Gets the value of the housVacRented property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacRented() {
        return housVacRented;
    }

    /**
     * Sets the value of the housVacRented property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacRented(Integer value) {
        this.housVacRented = value;
    }

    /**
     * Gets the value of the housVacForSale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacForSale() {
        return housVacForSale;
    }

    /**
     * Sets the value of the housVacForSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacForSale(Integer value) {
        this.housVacForSale = value;
    }

    /**
     * Gets the value of the housVacSold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacSold() {
        return housVacSold;
    }

    /**
     * Sets the value of the housVacSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacSold(Integer value) {
        this.housVacSold = value;
    }

    /**
     * Gets the value of the housVacSeasonal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacSeasonal() {
        return housVacSeasonal;
    }

    /**
     * Sets the value of the housVacSeasonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacSeasonal(Integer value) {
        this.housVacSeasonal = value;
    }

    /**
     * Gets the value of the housVacMigrant property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacMigrant() {
        return housVacMigrant;
    }

    /**
     * Sets the value of the housVacMigrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacMigrant(Integer value) {
        this.housVacMigrant = value;
    }

    /**
     * Gets the value of the housVacOther property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHousVacOther() {
        return housVacOther;
    }

    /**
     * Sets the value of the housVacOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHousVacOther(Integer value) {
        this.housVacOther = value;
    }

    /**
     * Gets the value of the bigzipid property.
     * 
     */
    public int getBigzipid() {
        return bigzipid;
    }

    /**
     * Sets the value of the bigzipid property.
     * 
     */
    public void setBigzipid(int value) {
        this.bigzipid = value;
    }

    /**
     * Gets the value of the hispOrLatino property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHispOrLatino() {
        return hispOrLatino;
    }

    /**
     * Sets the value of the hispOrLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHispOrLatino(Integer value) {
        this.hispOrLatino = value;
    }

    /**
     * Gets the value of the notHispOrLatino property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotHispOrLatino() {
        return notHispOrLatino;
    }

    /**
     * Sets the value of the notHispOrLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotHispOrLatino(Integer value) {
        this.notHispOrLatino = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAT() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAT(String value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLON() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLON(String value) {
        this.lon = value;
    }

    /**
     * Gets the value of the arealand property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAREALAND() {
        return arealand;
    }

    /**
     * Sets the value of the arealand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAREALAND(Double value) {
        this.arealand = value;
    }

    /**
     * Gets the value of the areawatr property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAREAWATR() {
        return areawatr;
    }

    /**
     * Sets the value of the areawatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAREAWATR(Double value) {
        this.areawatr = value;
    }

}
