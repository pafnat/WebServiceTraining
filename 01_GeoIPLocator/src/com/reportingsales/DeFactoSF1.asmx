<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://reportingsales.com/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://reportingsales.com/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://reportingsales.com/">
      <s:element name="DeFactoSF1Part2ByZip">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="zip" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="key" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeFactoSF1Part2ByZipResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeFactoSF1Part2ByZipResult" type="tns:DefactoZip2" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="DefactoZip2">
        <s:complexContent mixed="false">
          <s:extension base="tns:EntityObject">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="FILEID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="STUSAB" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CHARITER" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CIFSN" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="LOGRECNO" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="NAME" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Zip" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LAT" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LON" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="AREALAND" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="AREAWATR" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="Total" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="WhiteOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="BlackOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NativeOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AsianOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="IslandOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NotHispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="OtherRaceOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="TwoOrMoreRace" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Urban" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="UrbanUrbanizedArea" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="UrbanCluster" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Rural" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18Total" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18OneRace" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18WhiteOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18BlackOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18NativeOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18AsianOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18IslandOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18OtherRaceOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18HispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18NotHispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MaleTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MaleUnder5" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male5To9" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male10To14" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male15To17" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male18To19" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male20" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male21" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male22To24" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male25To29" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male30To34" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male35To39" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male40To44" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male45To49" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male50To54" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male55To59" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male60To61" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male62To64" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male65To66" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male67To69" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male70To74" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male75TO79" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male80To84" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male84AndUp" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="FemTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="FemUnder5" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem5To9" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem10To14" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem15To17" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem18To19" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem20" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem21" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem22To24" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem25To29" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem30To34" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem35To39" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem40To44" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem45To49" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem50To54" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem55To59" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem60To61" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem62To64" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem65To66" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem67To69" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem70To74" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem75To79" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem80To84" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem84AndUp" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MedAgeBoth" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="MedAgeMale" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="MedAgeFem" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="HousTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOcc" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVac" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccOwned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccLoaned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacRented" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForSale" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSold" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSeasonal" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacMigrant" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacOther" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="defactozip2id" type="s:int" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="EntityObject" abstract="true">
        <s:complexContent mixed="false">
          <s:extension base="tns:StructuralObject">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="EntityKey" type="tns:EntityKey" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:complexType name="StructuralObject" abstract="true" />
      <s:complexType name="EntityKey">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="EntitySetName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EntityContainerName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EntityKeyValues" type="tns:ArrayOfEntityKeyMember" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfEntityKeyMember">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="EntityKeyMember" nillable="true" type="tns:EntityKeyMember" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="EntityKeyMember">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Key" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Value" />
        </s:sequence>
      </s:complexType>
      <s:element name="DeFactoSF1Part1ByZip">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="zip" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="key" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeFactoSF1Part1ByZipResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeFactoSF1Part1ByZipResult" type="tns:bigZip" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="bigZip">
        <s:complexContent mixed="false">
          <s:extension base="tns:EntityObject">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="FILEID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="STUSAB" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CHARITER" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CIFSN" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="LOGRECNO" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="NAME" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="Zip" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Total" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="WhiteOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="BlackOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NativeOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AsianOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="IslandOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="OtherRaceOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="TwoOrMoreRace" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOcc" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVac" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccOwned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccLoaned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacRented" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForSale" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSold" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSeasonal" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacMigrant" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacOther" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="bigzipid" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NotHispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="LAT" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LON" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="AREALAND" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="AREAWATR" nillable="true" type="s:double" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="DeFactoSF1Part1ByNameState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="place" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="state" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="key" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeFactoSF1Part1ByNameStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeFactoSF1Part1ByNameStateResult" type="tns:bigName" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="bigName">
        <s:complexContent mixed="false">
          <s:extension base="tns:EntityObject">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="FILEID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="STUSAB" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CHARITER" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CIFSN" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="LOGRECNO" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="NAME" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="Total" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="WhiteOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="BlackOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NativeOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AsianOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="IslandOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="OtherRaceOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="TwoOrMoreRace" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOcc" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVac" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccOwned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccLoaned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacRented" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForSale" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSold" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSeasonal" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacMigrant" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacOther" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="idbigname" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NotHispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="LAT" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LON" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="AREALAND" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="AREAWATR" nillable="true" type="s:double" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="DeFactoSF1Part2ByNameState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="place" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="state" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="key" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfDefactoName2">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="DefactoName2" nillable="true" type="tns:DefactoName2" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="DefactoName2">
        <s:complexContent mixed="false">
          <s:extension base="tns:EntityObject">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="1" name="FILEID" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="STUSAB" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CHARITER" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="CIFSN" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="LOGRECNO" type="s:int" />
              <s:element minOccurs="0" maxOccurs="1" name="NAME" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LAT" type="s:string" />
              <s:element minOccurs="0" maxOccurs="1" name="LON" type="s:string" />
              <s:element minOccurs="1" maxOccurs="1" name="AREALAND" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="AREAWATR" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="Total" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="WhiteOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="BlackOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NativeOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="AsianOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="IslandOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="NotHispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="OtherRaceOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="TwoOrMoreRace" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Urban" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="UrbanUrbanizedArea" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="UrbanCluster" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Rural" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18Total" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18OneRace" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18WhiteOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18BlackOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18NativeOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18AsianOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18IslandOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18OtherRaceOnly" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18HispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Over18NotHispOrLatino" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MaleTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MaleUnder5" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male5To9" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male10To14" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male15To17" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male18To19" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male20" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male21" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male22To24" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male25To29" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male30To34" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male35To39" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male40To44" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male45To49" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male50To54" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male55To59" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male60To61" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male62To64" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male65To66" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male67To69" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male70To74" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male75TO79" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male80To84" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Male84AndUp" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="FemTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="FemUnder5" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem5To9" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem10To14" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem15To17" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem18To19" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem20" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem21" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem22To24" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem25To29" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem30To34" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem35To39" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem40To44" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem45To49" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem50To54" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem55To59" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem60To61" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem62To64" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem65To66" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem67To69" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem70To74" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem75To79" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem80To84" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="Fem84AndUp" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="MedAgeBoth" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="MedAgeMale" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="MedAgeFem" nillable="true" type="s:double" />
              <s:element minOccurs="1" maxOccurs="1" name="HousTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOcc" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVac" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccOwned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccLoaned" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousOccRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacTot" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForRent" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacRented" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacForSale" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSold" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacSeasonal" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacMigrant" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="HousVacOther" nillable="true" type="s:int" />
              <s:element minOccurs="1" maxOccurs="1" name="defactoname2id" type="s:int" />
            </s:sequence>
          </s:extension>
        </s:complexContent>
      </s:complexType>
      <s:element name="DeFactoSF1Part2ByNameStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DeFactoSF1Part2ByNameStateResult" type="tns:ArrayOfDefactoName2" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DefactoZip2" nillable="true" type="tns:DefactoZip2" />
      <s:element name="bigZip" nillable="true" type="tns:bigZip" />
      <s:element name="bigName" nillable="true" type="tns:bigName" />
      <s:element name="ArrayOfDefactoName2" nillable="true" type="tns:ArrayOfDefactoName2" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="DeFactoSF1Part2ByZipSoapIn">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part2ByZip" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByZipSoapOut">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part2ByZipResponse" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByZipSoapIn">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part1ByZip" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByZipSoapOut">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part1ByZipResponse" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByNameStateSoapIn">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part1ByNameState" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByNameStateSoapOut">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part1ByNameStateResponse" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByNameStateSoapIn">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part2ByNameState" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByNameStateSoapOut">
    <wsdl:part name="parameters" element="tns:DeFactoSF1Part2ByNameStateResponse" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByZipHttpGetIn">
    <wsdl:part name="zip" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByZipHttpGetOut">
    <wsdl:part name="Body" element="tns:DefactoZip2" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByZipHttpGetIn">
    <wsdl:part name="zip" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByZipHttpGetOut">
    <wsdl:part name="Body" element="tns:bigZip" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByNameStateHttpGetIn">
    <wsdl:part name="place" type="s:string" />
    <wsdl:part name="state" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByNameStateHttpGetOut">
    <wsdl:part name="Body" element="tns:bigName" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByNameStateHttpGetIn">
    <wsdl:part name="place" type="s:string" />
    <wsdl:part name="state" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByNameStateHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfDefactoName2" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByZipHttpPostIn">
    <wsdl:part name="zip" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByZipHttpPostOut">
    <wsdl:part name="Body" element="tns:DefactoZip2" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByZipHttpPostIn">
    <wsdl:part name="zip" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByZipHttpPostOut">
    <wsdl:part name="Body" element="tns:bigZip" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByNameStateHttpPostIn">
    <wsdl:part name="place" type="s:string" />
    <wsdl:part name="state" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part1ByNameStateHttpPostOut">
    <wsdl:part name="Body" element="tns:bigName" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByNameStateHttpPostIn">
    <wsdl:part name="place" type="s:string" />
    <wsdl:part name="state" type="s:string" />
    <wsdl:part name="key" type="s:string" />
  </wsdl:message>
  <wsdl:message name="DeFactoSF1Part2ByNameStateHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfDefactoName2" />
  </wsdl:message>
  <wsdl:portType name="DeFactoSF1Soap">
    <wsdl:operation name="DeFactoSF1Part2ByZip">
      <wsdl:input message="tns:DeFactoSF1Part2ByZipSoapIn" />
      <wsdl:output message="tns:DeFactoSF1Part2ByZipSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByZip">
      <wsdl:input message="tns:DeFactoSF1Part1ByZipSoapIn" />
      <wsdl:output message="tns:DeFactoSF1Part1ByZipSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByNameState">
      <wsdl:input message="tns:DeFactoSF1Part1ByNameStateSoapIn" />
      <wsdl:output message="tns:DeFactoSF1Part1ByNameStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part2ByNameState">
      <wsdl:input message="tns:DeFactoSF1Part2ByNameStateSoapIn" />
      <wsdl:output message="tns:DeFactoSF1Part2ByNameStateSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="DeFactoSF1HttpGet">
    <wsdl:operation name="DeFactoSF1Part2ByZip">
      <wsdl:input message="tns:DeFactoSF1Part2ByZipHttpGetIn" />
      <wsdl:output message="tns:DeFactoSF1Part2ByZipHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByZip">
      <wsdl:input message="tns:DeFactoSF1Part1ByZipHttpGetIn" />
      <wsdl:output message="tns:DeFactoSF1Part1ByZipHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByNameState">
      <wsdl:input message="tns:DeFactoSF1Part1ByNameStateHttpGetIn" />
      <wsdl:output message="tns:DeFactoSF1Part1ByNameStateHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part2ByNameState">
      <wsdl:input message="tns:DeFactoSF1Part2ByNameStateHttpGetIn" />
      <wsdl:output message="tns:DeFactoSF1Part2ByNameStateHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="DeFactoSF1HttpPost">
    <wsdl:operation name="DeFactoSF1Part2ByZip">
      <wsdl:input message="tns:DeFactoSF1Part2ByZipHttpPostIn" />
      <wsdl:output message="tns:DeFactoSF1Part2ByZipHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByZip">
      <wsdl:input message="tns:DeFactoSF1Part1ByZipHttpPostIn" />
      <wsdl:output message="tns:DeFactoSF1Part1ByZipHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByNameState">
      <wsdl:input message="tns:DeFactoSF1Part1ByNameStateHttpPostIn" />
      <wsdl:output message="tns:DeFactoSF1Part1ByNameStateHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part2ByNameState">
      <wsdl:input message="tns:DeFactoSF1Part2ByNameStateHttpPostIn" />
      <wsdl:output message="tns:DeFactoSF1Part2ByNameStateHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="DeFactoSF1Soap" type="tns:DeFactoSF1Soap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="DeFactoSF1Part2ByZip">
      <soap:operation soapAction="http://reportingsales.com/DeFactoSF1Part2ByZip" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByZip">
      <soap:operation soapAction="http://reportingsales.com/DeFactoSF1Part1ByZip" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByNameState">
      <soap:operation soapAction="http://reportingsales.com/DeFactoSF1Part1ByNameState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part2ByNameState">
      <soap:operation soapAction="http://reportingsales.com/DeFactoSF1Part2ByNameState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DeFactoSF1Soap12" type="tns:DeFactoSF1Soap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="DeFactoSF1Part2ByZip">
      <soap12:operation soapAction="http://reportingsales.com/DeFactoSF1Part2ByZip" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByZip">
      <soap12:operation soapAction="http://reportingsales.com/DeFactoSF1Part1ByZip" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByNameState">
      <soap12:operation soapAction="http://reportingsales.com/DeFactoSF1Part1ByNameState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part2ByNameState">
      <soap12:operation soapAction="http://reportingsales.com/DeFactoSF1Part2ByNameState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DeFactoSF1HttpGet" type="tns:DeFactoSF1HttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="DeFactoSF1Part2ByZip">
      <http:operation location="/DeFactoSF1Part2ByZip" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByZip">
      <http:operation location="/DeFactoSF1Part1ByZip" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByNameState">
      <http:operation location="/DeFactoSF1Part1ByNameState" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part2ByNameState">
      <http:operation location="/DeFactoSF1Part2ByNameState" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DeFactoSF1HttpPost" type="tns:DeFactoSF1HttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="DeFactoSF1Part2ByZip">
      <http:operation location="/DeFactoSF1Part2ByZip" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByZip">
      <http:operation location="/DeFactoSF1Part1ByZip" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part1ByNameState">
      <http:operation location="/DeFactoSF1Part1ByNameState" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeFactoSF1Part2ByNameState">
      <http:operation location="/DeFactoSF1Part2ByNameState" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="DeFactoSF1">
    <wsdl:port name="DeFactoSF1Soap" binding="tns:DeFactoSF1Soap">
      <soap:address location="http://www.reportingsales.com/DeFactoSF1.asmx" />
    </wsdl:port>
    <wsdl:port name="DeFactoSF1Soap12" binding="tns:DeFactoSF1Soap12">
      <soap12:address location="http://www.reportingsales.com/DeFactoSF1.asmx" />
    </wsdl:port>
    <wsdl:port name="DeFactoSF1HttpGet" binding="tns:DeFactoSF1HttpGet">
      <http:address location="http://www.reportingsales.com/DeFactoSF1.asmx" />
    </wsdl:port>
    <wsdl:port name="DeFactoSF1HttpPost" binding="tns:DeFactoSF1HttpPost">
      <http:address location="http://www.reportingsales.com/DeFactoSF1.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>