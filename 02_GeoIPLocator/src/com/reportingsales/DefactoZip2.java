
package com.reportingsales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefactoZip2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefactoZip2">
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
 *         &lt;element name="LAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AREALAND" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AREAWATR" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WhiteOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BlackOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NativeOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AsianOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IslandOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HispOrLatino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotHispOrLatino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OtherRaceOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TwoOrMoreRace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Urban" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UrbanUrbanizedArea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UrbanCluster" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rural" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18Total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18OneRace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18WhiteOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18BlackOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18NativeOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18AsianOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18IslandOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18OtherRaceOnly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18HispOrLatino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Over18NotHispOrLatino" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaleTot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaleUnder5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male5To9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male10To14" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male15To17" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male18To19" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male20" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male21" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male22To24" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male25To29" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male30To34" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male35To39" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male40To44" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male45To49" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male50To54" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male55To59" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male60To61" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male62To64" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male65To66" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male67To69" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male70To74" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male75TO79" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male80To84" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Male84AndUp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FemTot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FemUnder5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem5To9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem10To14" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem15To17" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem18To19" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem20" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem21" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem22To24" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem25To29" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem30To34" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem35To39" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem40To44" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem45To49" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem50To54" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem55To59" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem60To61" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem62To64" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem65To66" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem67To69" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem70To74" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem75To79" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem80To84" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fem84AndUp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MedAgeBoth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MedAgeMale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MedAgeFem" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
 *         &lt;element name="defactozip2id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefactoZip2", propOrder = {
    "fileid",
    "stusab",
    "chariter",
    "cifsn",
    "logrecno",
    "name",
    "zip",
    "lat",
    "lon",
    "arealand",
    "areawatr",
    "total",
    "whiteOnly",
    "blackOnly",
    "nativeOnly",
    "asianOnly",
    "islandOnly",
    "hispOrLatino",
    "notHispOrLatino",
    "otherRaceOnly",
    "twoOrMoreRace",
    "urban",
    "urbanUrbanizedArea",
    "urbanCluster",
    "rural",
    "over18Total",
    "over18OneRace",
    "over18WhiteOnly",
    "over18BlackOnly",
    "over18NativeOnly",
    "over18AsianOnly",
    "over18IslandOnly",
    "over18OtherRaceOnly",
    "over18HispOrLatino",
    "over18NotHispOrLatino",
    "maleTot",
    "maleUnder5",
    "male5To9",
    "male10To14",
    "male15To17",
    "male18To19",
    "male20",
    "male21",
    "male22To24",
    "male25To29",
    "male30To34",
    "male35To39",
    "male40To44",
    "male45To49",
    "male50To54",
    "male55To59",
    "male60To61",
    "male62To64",
    "male65To66",
    "male67To69",
    "male70To74",
    "male75TO79",
    "male80To84",
    "male84AndUp",
    "femTot",
    "femUnder5",
    "fem5To9",
    "fem10To14",
    "fem15To17",
    "fem18To19",
    "fem20",
    "fem21",
    "fem22To24",
    "fem25To29",
    "fem30To34",
    "fem35To39",
    "fem40To44",
    "fem45To49",
    "fem50To54",
    "fem55To59",
    "fem60To61",
    "fem62To64",
    "fem65To66",
    "fem67To69",
    "fem70To74",
    "fem75To79",
    "fem80To84",
    "fem84AndUp",
    "medAgeBoth",
    "medAgeMale",
    "medAgeFem",
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
    "defactozip2Id"
})
public class DefactoZip2
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
    @XmlElement(name = "LAT")
    protected String lat;
    @XmlElement(name = "LON")
    protected String lon;
    @XmlElement(name = "AREALAND", required = true, type = Double.class, nillable = true)
    protected Double arealand;
    @XmlElement(name = "AREAWATR", required = true, type = Double.class, nillable = true)
    protected Double areawatr;
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
    @XmlElement(name = "HispOrLatino", required = true, type = Integer.class, nillable = true)
    protected Integer hispOrLatino;
    @XmlElement(name = "NotHispOrLatino", required = true, type = Integer.class, nillable = true)
    protected Integer notHispOrLatino;
    @XmlElement(name = "OtherRaceOnly", required = true, type = Integer.class, nillable = true)
    protected Integer otherRaceOnly;
    @XmlElement(name = "TwoOrMoreRace", required = true, type = Integer.class, nillable = true)
    protected Integer twoOrMoreRace;
    @XmlElement(name = "Urban", required = true, type = Integer.class, nillable = true)
    protected Integer urban;
    @XmlElement(name = "UrbanUrbanizedArea", required = true, type = Integer.class, nillable = true)
    protected Integer urbanUrbanizedArea;
    @XmlElement(name = "UrbanCluster", required = true, type = Integer.class, nillable = true)
    protected Integer urbanCluster;
    @XmlElement(name = "Rural", required = true, type = Integer.class, nillable = true)
    protected Integer rural;
    @XmlElement(name = "Over18Total", required = true, type = Integer.class, nillable = true)
    protected Integer over18Total;
    @XmlElement(name = "Over18OneRace", required = true, type = Integer.class, nillable = true)
    protected Integer over18OneRace;
    @XmlElement(name = "Over18WhiteOnly", required = true, type = Integer.class, nillable = true)
    protected Integer over18WhiteOnly;
    @XmlElement(name = "Over18BlackOnly", required = true, type = Integer.class, nillable = true)
    protected Integer over18BlackOnly;
    @XmlElement(name = "Over18NativeOnly", required = true, type = Integer.class, nillable = true)
    protected Integer over18NativeOnly;
    @XmlElement(name = "Over18AsianOnly", required = true, type = Integer.class, nillable = true)
    protected Integer over18AsianOnly;
    @XmlElement(name = "Over18IslandOnly", required = true, type = Integer.class, nillable = true)
    protected Integer over18IslandOnly;
    @XmlElement(name = "Over18OtherRaceOnly", required = true, type = Integer.class, nillable = true)
    protected Integer over18OtherRaceOnly;
    @XmlElement(name = "Over18HispOrLatino", required = true, type = Integer.class, nillable = true)
    protected Integer over18HispOrLatino;
    @XmlElement(name = "Over18NotHispOrLatino", required = true, type = Integer.class, nillable = true)
    protected Integer over18NotHispOrLatino;
    @XmlElement(name = "MaleTot", required = true, type = Integer.class, nillable = true)
    protected Integer maleTot;
    @XmlElement(name = "MaleUnder5", required = true, type = Integer.class, nillable = true)
    protected Integer maleUnder5;
    @XmlElement(name = "Male5To9", required = true, type = Integer.class, nillable = true)
    protected Integer male5To9;
    @XmlElement(name = "Male10To14", required = true, type = Integer.class, nillable = true)
    protected Integer male10To14;
    @XmlElement(name = "Male15To17", required = true, type = Integer.class, nillable = true)
    protected Integer male15To17;
    @XmlElement(name = "Male18To19", required = true, type = Integer.class, nillable = true)
    protected Integer male18To19;
    @XmlElement(name = "Male20", required = true, type = Integer.class, nillable = true)
    protected Integer male20;
    @XmlElement(name = "Male21", required = true, type = Integer.class, nillable = true)
    protected Integer male21;
    @XmlElement(name = "Male22To24", required = true, type = Integer.class, nillable = true)
    protected Integer male22To24;
    @XmlElement(name = "Male25To29", required = true, type = Integer.class, nillable = true)
    protected Integer male25To29;
    @XmlElement(name = "Male30To34", required = true, type = Integer.class, nillable = true)
    protected Integer male30To34;
    @XmlElement(name = "Male35To39", required = true, type = Integer.class, nillable = true)
    protected Integer male35To39;
    @XmlElement(name = "Male40To44", required = true, type = Integer.class, nillable = true)
    protected Integer male40To44;
    @XmlElement(name = "Male45To49", required = true, type = Integer.class, nillable = true)
    protected Integer male45To49;
    @XmlElement(name = "Male50To54", required = true, type = Integer.class, nillable = true)
    protected Integer male50To54;
    @XmlElement(name = "Male55To59", required = true, type = Integer.class, nillable = true)
    protected Integer male55To59;
    @XmlElement(name = "Male60To61", required = true, type = Integer.class, nillable = true)
    protected Integer male60To61;
    @XmlElement(name = "Male62To64", required = true, type = Integer.class, nillable = true)
    protected Integer male62To64;
    @XmlElement(name = "Male65To66", required = true, type = Integer.class, nillable = true)
    protected Integer male65To66;
    @XmlElement(name = "Male67To69", required = true, type = Integer.class, nillable = true)
    protected Integer male67To69;
    @XmlElement(name = "Male70To74", required = true, type = Integer.class, nillable = true)
    protected Integer male70To74;
    @XmlElement(name = "Male75TO79", required = true, type = Integer.class, nillable = true)
    protected Integer male75TO79;
    @XmlElement(name = "Male80To84", required = true, type = Integer.class, nillable = true)
    protected Integer male80To84;
    @XmlElement(name = "Male84AndUp", required = true, type = Integer.class, nillable = true)
    protected Integer male84AndUp;
    @XmlElement(name = "FemTot", required = true, type = Integer.class, nillable = true)
    protected Integer femTot;
    @XmlElement(name = "FemUnder5", required = true, type = Integer.class, nillable = true)
    protected Integer femUnder5;
    @XmlElement(name = "Fem5To9", required = true, type = Integer.class, nillable = true)
    protected Integer fem5To9;
    @XmlElement(name = "Fem10To14", required = true, type = Integer.class, nillable = true)
    protected Integer fem10To14;
    @XmlElement(name = "Fem15To17", required = true, type = Integer.class, nillable = true)
    protected Integer fem15To17;
    @XmlElement(name = "Fem18To19", required = true, type = Integer.class, nillable = true)
    protected Integer fem18To19;
    @XmlElement(name = "Fem20", required = true, type = Integer.class, nillable = true)
    protected Integer fem20;
    @XmlElement(name = "Fem21", required = true, type = Integer.class, nillable = true)
    protected Integer fem21;
    @XmlElement(name = "Fem22To24", required = true, type = Integer.class, nillable = true)
    protected Integer fem22To24;
    @XmlElement(name = "Fem25To29", required = true, type = Integer.class, nillable = true)
    protected Integer fem25To29;
    @XmlElement(name = "Fem30To34", required = true, type = Integer.class, nillable = true)
    protected Integer fem30To34;
    @XmlElement(name = "Fem35To39", required = true, type = Integer.class, nillable = true)
    protected Integer fem35To39;
    @XmlElement(name = "Fem40To44", required = true, type = Integer.class, nillable = true)
    protected Integer fem40To44;
    @XmlElement(name = "Fem45To49", required = true, type = Integer.class, nillable = true)
    protected Integer fem45To49;
    @XmlElement(name = "Fem50To54", required = true, type = Integer.class, nillable = true)
    protected Integer fem50To54;
    @XmlElement(name = "Fem55To59", required = true, type = Integer.class, nillable = true)
    protected Integer fem55To59;
    @XmlElement(name = "Fem60To61", required = true, type = Integer.class, nillable = true)
    protected Integer fem60To61;
    @XmlElement(name = "Fem62To64", required = true, type = Integer.class, nillable = true)
    protected Integer fem62To64;
    @XmlElement(name = "Fem65To66", required = true, type = Integer.class, nillable = true)
    protected Integer fem65To66;
    @XmlElement(name = "Fem67To69", required = true, type = Integer.class, nillable = true)
    protected Integer fem67To69;
    @XmlElement(name = "Fem70To74", required = true, type = Integer.class, nillable = true)
    protected Integer fem70To74;
    @XmlElement(name = "Fem75To79", required = true, type = Integer.class, nillable = true)
    protected Integer fem75To79;
    @XmlElement(name = "Fem80To84", required = true, type = Integer.class, nillable = true)
    protected Integer fem80To84;
    @XmlElement(name = "Fem84AndUp", required = true, type = Integer.class, nillable = true)
    protected Integer fem84AndUp;
    @XmlElement(name = "MedAgeBoth", required = true, type = Double.class, nillable = true)
    protected Double medAgeBoth;
    @XmlElement(name = "MedAgeMale", required = true, type = Double.class, nillable = true)
    protected Double medAgeMale;
    @XmlElement(name = "MedAgeFem", required = true, type = Double.class, nillable = true)
    protected Double medAgeFem;
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
    @XmlElement(name = "defactozip2id")
    protected int defactozip2Id;

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
     * Gets the value of the urban property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrban() {
        return urban;
    }

    /**
     * Sets the value of the urban property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrban(Integer value) {
        this.urban = value;
    }

    /**
     * Gets the value of the urbanUrbanizedArea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrbanUrbanizedArea() {
        return urbanUrbanizedArea;
    }

    /**
     * Sets the value of the urbanUrbanizedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrbanUrbanizedArea(Integer value) {
        this.urbanUrbanizedArea = value;
    }

    /**
     * Gets the value of the urbanCluster property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUrbanCluster() {
        return urbanCluster;
    }

    /**
     * Sets the value of the urbanCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUrbanCluster(Integer value) {
        this.urbanCluster = value;
    }

    /**
     * Gets the value of the rural property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRural() {
        return rural;
    }

    /**
     * Sets the value of the rural property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRural(Integer value) {
        this.rural = value;
    }

    /**
     * Gets the value of the over18Total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18Total() {
        return over18Total;
    }

    /**
     * Sets the value of the over18Total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18Total(Integer value) {
        this.over18Total = value;
    }

    /**
     * Gets the value of the over18OneRace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18OneRace() {
        return over18OneRace;
    }

    /**
     * Sets the value of the over18OneRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18OneRace(Integer value) {
        this.over18OneRace = value;
    }

    /**
     * Gets the value of the over18WhiteOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18WhiteOnly() {
        return over18WhiteOnly;
    }

    /**
     * Sets the value of the over18WhiteOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18WhiteOnly(Integer value) {
        this.over18WhiteOnly = value;
    }

    /**
     * Gets the value of the over18BlackOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18BlackOnly() {
        return over18BlackOnly;
    }

    /**
     * Sets the value of the over18BlackOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18BlackOnly(Integer value) {
        this.over18BlackOnly = value;
    }

    /**
     * Gets the value of the over18NativeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18NativeOnly() {
        return over18NativeOnly;
    }

    /**
     * Sets the value of the over18NativeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18NativeOnly(Integer value) {
        this.over18NativeOnly = value;
    }

    /**
     * Gets the value of the over18AsianOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18AsianOnly() {
        return over18AsianOnly;
    }

    /**
     * Sets the value of the over18AsianOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18AsianOnly(Integer value) {
        this.over18AsianOnly = value;
    }

    /**
     * Gets the value of the over18IslandOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18IslandOnly() {
        return over18IslandOnly;
    }

    /**
     * Sets the value of the over18IslandOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18IslandOnly(Integer value) {
        this.over18IslandOnly = value;
    }

    /**
     * Gets the value of the over18OtherRaceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18OtherRaceOnly() {
        return over18OtherRaceOnly;
    }

    /**
     * Sets the value of the over18OtherRaceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18OtherRaceOnly(Integer value) {
        this.over18OtherRaceOnly = value;
    }

    /**
     * Gets the value of the over18HispOrLatino property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18HispOrLatino() {
        return over18HispOrLatino;
    }

    /**
     * Sets the value of the over18HispOrLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18HispOrLatino(Integer value) {
        this.over18HispOrLatino = value;
    }

    /**
     * Gets the value of the over18NotHispOrLatino property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOver18NotHispOrLatino() {
        return over18NotHispOrLatino;
    }

    /**
     * Sets the value of the over18NotHispOrLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOver18NotHispOrLatino(Integer value) {
        this.over18NotHispOrLatino = value;
    }

    /**
     * Gets the value of the maleTot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaleTot() {
        return maleTot;
    }

    /**
     * Sets the value of the maleTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaleTot(Integer value) {
        this.maleTot = value;
    }

    /**
     * Gets the value of the maleUnder5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaleUnder5() {
        return maleUnder5;
    }

    /**
     * Sets the value of the maleUnder5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaleUnder5(Integer value) {
        this.maleUnder5 = value;
    }

    /**
     * Gets the value of the male5To9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale5To9() {
        return male5To9;
    }

    /**
     * Sets the value of the male5To9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale5To9(Integer value) {
        this.male5To9 = value;
    }

    /**
     * Gets the value of the male10To14 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale10To14() {
        return male10To14;
    }

    /**
     * Sets the value of the male10To14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale10To14(Integer value) {
        this.male10To14 = value;
    }

    /**
     * Gets the value of the male15To17 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale15To17() {
        return male15To17;
    }

    /**
     * Sets the value of the male15To17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale15To17(Integer value) {
        this.male15To17 = value;
    }

    /**
     * Gets the value of the male18To19 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale18To19() {
        return male18To19;
    }

    /**
     * Sets the value of the male18To19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale18To19(Integer value) {
        this.male18To19 = value;
    }

    /**
     * Gets the value of the male20 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale20() {
        return male20;
    }

    /**
     * Sets the value of the male20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale20(Integer value) {
        this.male20 = value;
    }

    /**
     * Gets the value of the male21 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale21() {
        return male21;
    }

    /**
     * Sets the value of the male21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale21(Integer value) {
        this.male21 = value;
    }

    /**
     * Gets the value of the male22To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale22To24() {
        return male22To24;
    }

    /**
     * Sets the value of the male22To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale22To24(Integer value) {
        this.male22To24 = value;
    }

    /**
     * Gets the value of the male25To29 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale25To29() {
        return male25To29;
    }

    /**
     * Sets the value of the male25To29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale25To29(Integer value) {
        this.male25To29 = value;
    }

    /**
     * Gets the value of the male30To34 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale30To34() {
        return male30To34;
    }

    /**
     * Sets the value of the male30To34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale30To34(Integer value) {
        this.male30To34 = value;
    }

    /**
     * Gets the value of the male35To39 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale35To39() {
        return male35To39;
    }

    /**
     * Sets the value of the male35To39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale35To39(Integer value) {
        this.male35To39 = value;
    }

    /**
     * Gets the value of the male40To44 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale40To44() {
        return male40To44;
    }

    /**
     * Sets the value of the male40To44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale40To44(Integer value) {
        this.male40To44 = value;
    }

    /**
     * Gets the value of the male45To49 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale45To49() {
        return male45To49;
    }

    /**
     * Sets the value of the male45To49 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale45To49(Integer value) {
        this.male45To49 = value;
    }

    /**
     * Gets the value of the male50To54 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale50To54() {
        return male50To54;
    }

    /**
     * Sets the value of the male50To54 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale50To54(Integer value) {
        this.male50To54 = value;
    }

    /**
     * Gets the value of the male55To59 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale55To59() {
        return male55To59;
    }

    /**
     * Sets the value of the male55To59 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale55To59(Integer value) {
        this.male55To59 = value;
    }

    /**
     * Gets the value of the male60To61 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale60To61() {
        return male60To61;
    }

    /**
     * Sets the value of the male60To61 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale60To61(Integer value) {
        this.male60To61 = value;
    }

    /**
     * Gets the value of the male62To64 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale62To64() {
        return male62To64;
    }

    /**
     * Sets the value of the male62To64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale62To64(Integer value) {
        this.male62To64 = value;
    }

    /**
     * Gets the value of the male65To66 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale65To66() {
        return male65To66;
    }

    /**
     * Sets the value of the male65To66 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale65To66(Integer value) {
        this.male65To66 = value;
    }

    /**
     * Gets the value of the male67To69 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale67To69() {
        return male67To69;
    }

    /**
     * Sets the value of the male67To69 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale67To69(Integer value) {
        this.male67To69 = value;
    }

    /**
     * Gets the value of the male70To74 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale70To74() {
        return male70To74;
    }

    /**
     * Sets the value of the male70To74 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale70To74(Integer value) {
        this.male70To74 = value;
    }

    /**
     * Gets the value of the male75TO79 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale75TO79() {
        return male75TO79;
    }

    /**
     * Sets the value of the male75TO79 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale75TO79(Integer value) {
        this.male75TO79 = value;
    }

    /**
     * Gets the value of the male80To84 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale80To84() {
        return male80To84;
    }

    /**
     * Sets the value of the male80To84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale80To84(Integer value) {
        this.male80To84 = value;
    }

    /**
     * Gets the value of the male84AndUp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMale84AndUp() {
        return male84AndUp;
    }

    /**
     * Sets the value of the male84AndUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMale84AndUp(Integer value) {
        this.male84AndUp = value;
    }

    /**
     * Gets the value of the femTot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFemTot() {
        return femTot;
    }

    /**
     * Sets the value of the femTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFemTot(Integer value) {
        this.femTot = value;
    }

    /**
     * Gets the value of the femUnder5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFemUnder5() {
        return femUnder5;
    }

    /**
     * Sets the value of the femUnder5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFemUnder5(Integer value) {
        this.femUnder5 = value;
    }

    /**
     * Gets the value of the fem5To9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem5To9() {
        return fem5To9;
    }

    /**
     * Sets the value of the fem5To9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem5To9(Integer value) {
        this.fem5To9 = value;
    }

    /**
     * Gets the value of the fem10To14 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem10To14() {
        return fem10To14;
    }

    /**
     * Sets the value of the fem10To14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem10To14(Integer value) {
        this.fem10To14 = value;
    }

    /**
     * Gets the value of the fem15To17 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem15To17() {
        return fem15To17;
    }

    /**
     * Sets the value of the fem15To17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem15To17(Integer value) {
        this.fem15To17 = value;
    }

    /**
     * Gets the value of the fem18To19 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem18To19() {
        return fem18To19;
    }

    /**
     * Sets the value of the fem18To19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem18To19(Integer value) {
        this.fem18To19 = value;
    }

    /**
     * Gets the value of the fem20 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem20() {
        return fem20;
    }

    /**
     * Sets the value of the fem20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem20(Integer value) {
        this.fem20 = value;
    }

    /**
     * Gets the value of the fem21 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem21() {
        return fem21;
    }

    /**
     * Sets the value of the fem21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem21(Integer value) {
        this.fem21 = value;
    }

    /**
     * Gets the value of the fem22To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem22To24() {
        return fem22To24;
    }

    /**
     * Sets the value of the fem22To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem22To24(Integer value) {
        this.fem22To24 = value;
    }

    /**
     * Gets the value of the fem25To29 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem25To29() {
        return fem25To29;
    }

    /**
     * Sets the value of the fem25To29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem25To29(Integer value) {
        this.fem25To29 = value;
    }

    /**
     * Gets the value of the fem30To34 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem30To34() {
        return fem30To34;
    }

    /**
     * Sets the value of the fem30To34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem30To34(Integer value) {
        this.fem30To34 = value;
    }

    /**
     * Gets the value of the fem35To39 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem35To39() {
        return fem35To39;
    }

    /**
     * Sets the value of the fem35To39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem35To39(Integer value) {
        this.fem35To39 = value;
    }

    /**
     * Gets the value of the fem40To44 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem40To44() {
        return fem40To44;
    }

    /**
     * Sets the value of the fem40To44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem40To44(Integer value) {
        this.fem40To44 = value;
    }

    /**
     * Gets the value of the fem45To49 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem45To49() {
        return fem45To49;
    }

    /**
     * Sets the value of the fem45To49 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem45To49(Integer value) {
        this.fem45To49 = value;
    }

    /**
     * Gets the value of the fem50To54 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem50To54() {
        return fem50To54;
    }

    /**
     * Sets the value of the fem50To54 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem50To54(Integer value) {
        this.fem50To54 = value;
    }

    /**
     * Gets the value of the fem55To59 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem55To59() {
        return fem55To59;
    }

    /**
     * Sets the value of the fem55To59 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem55To59(Integer value) {
        this.fem55To59 = value;
    }

    /**
     * Gets the value of the fem60To61 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem60To61() {
        return fem60To61;
    }

    /**
     * Sets the value of the fem60To61 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem60To61(Integer value) {
        this.fem60To61 = value;
    }

    /**
     * Gets the value of the fem62To64 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem62To64() {
        return fem62To64;
    }

    /**
     * Sets the value of the fem62To64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem62To64(Integer value) {
        this.fem62To64 = value;
    }

    /**
     * Gets the value of the fem65To66 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem65To66() {
        return fem65To66;
    }

    /**
     * Sets the value of the fem65To66 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem65To66(Integer value) {
        this.fem65To66 = value;
    }

    /**
     * Gets the value of the fem67To69 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem67To69() {
        return fem67To69;
    }

    /**
     * Sets the value of the fem67To69 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem67To69(Integer value) {
        this.fem67To69 = value;
    }

    /**
     * Gets the value of the fem70To74 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem70To74() {
        return fem70To74;
    }

    /**
     * Sets the value of the fem70To74 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem70To74(Integer value) {
        this.fem70To74 = value;
    }

    /**
     * Gets the value of the fem75To79 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem75To79() {
        return fem75To79;
    }

    /**
     * Sets the value of the fem75To79 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem75To79(Integer value) {
        this.fem75To79 = value;
    }

    /**
     * Gets the value of the fem80To84 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem80To84() {
        return fem80To84;
    }

    /**
     * Sets the value of the fem80To84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem80To84(Integer value) {
        this.fem80To84 = value;
    }

    /**
     * Gets the value of the fem84AndUp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFem84AndUp() {
        return fem84AndUp;
    }

    /**
     * Sets the value of the fem84AndUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFem84AndUp(Integer value) {
        this.fem84AndUp = value;
    }

    /**
     * Gets the value of the medAgeBoth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMedAgeBoth() {
        return medAgeBoth;
    }

    /**
     * Sets the value of the medAgeBoth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMedAgeBoth(Double value) {
        this.medAgeBoth = value;
    }

    /**
     * Gets the value of the medAgeMale property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMedAgeMale() {
        return medAgeMale;
    }

    /**
     * Sets the value of the medAgeMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMedAgeMale(Double value) {
        this.medAgeMale = value;
    }

    /**
     * Gets the value of the medAgeFem property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMedAgeFem() {
        return medAgeFem;
    }

    /**
     * Sets the value of the medAgeFem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMedAgeFem(Double value) {
        this.medAgeFem = value;
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
     * Gets the value of the defactozip2Id property.
     * 
     */
    public int getDefactozip2Id() {
        return defactozip2Id;
    }

    /**
     * Sets the value of the defactozip2Id property.
     * 
     */
    public void setDefactozip2Id(int value) {
        this.defactozip2Id = value;
    }

}
