/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package zodiac.zpt.server.sql;

//tag::createDB[]
//tag::organizationListing[]
public interface SQLs {
  //end::organizationListing[]

  String SELECT_TABLE_NAMES = ""
      + "SELECT   UPPER(tablename) "
      + "FROM     sys.systables "
      + "INTO     :result"; // <1>

  String HANRILIGHT_CREATE_TABLE = ""
		  + "CREATE   TABLE HANRILIGHT "
		  + "		  (hanrilightid VARCHAR(64) NOT NULL CONSTRAINT HANRILIGHT_PK PRIMARY KEY,"
		  + "          testsite VARCHAR(64), "
		  + "          installdate TIMESTAMP, "
		  + "          installernames VARCHAR(64), "
		  + "          serial VARCHAR(64), "
		  + "          voltage VARCHAR(64), "
		  + "          nichesize VARCHAR(64), "
		  + "          onautomation VARCHAR(64), "
		  + "          runhours VARCHAR(64), "
		  + "          lightcolor VARCHAR(64), "
		  + "          sequencecorrect VARCHAR(64), "
		  + "          waterintrusion VARCHAR(64), "
		  + "          notes VARCHAR(64) "
		  + "          )";
		  
  String TESTSITES_CREATE_TABLE = ""
      + "CREATE   TABLE TESTSITES "
      + "         (siteid VARCHAR(64) NOT NULL CONSTRAINT TESTSITES_PK PRIMARY KEY,"
      + "          lastname VARCHAR(64), "
      + "          firstname VARCHAR(64), "
      + "          street VARCHAR(64), "
      + "          city VARCHAR(64), "
      + "          state VARCHAR(64), "
      + "          zip VARCHAR(64), "
      + "          email VARCHAR(64), "
      + "          phone VARCHAR(64), "
      + "          assignedtech VARCHAR(64), "
      + "          ndaissuedate TIMESTAMP, "
      + "          poolpicurl VARCHAR(128), "
      + "          equippicurl VARCHAR(128), "
      + "          poollayout VARCHAR(64), "
      + "          poolvolume VARCHAR(64), "
      + "          poolshape VARCHAR(64), "
      + "          pooldimensions VARCHAR(64), "
      + "          poolfinish VARCHAR(64), "
      + "          marketingpool VARCHAR(64), "
      + "          eqindooroutdoor VARCHAR(64), "
      + "          eqabovebelowwater VARCHAR(64), "
      + "          servicecontact VARCHAR(64), "
      + "          poolnotes VARCHAR(64), "
      + "          hasautomation VARCHAR(64), "
      + "          automationtype VARCHAR(64), "
      + "          hasiaqualink VARCHAR(64), "
      + "          iaqualinkdevicenumber VARCHAR(64), "
      + "          automationnotes VARCHAR(64), "
      + "          hasinfloors VARCHAR(64), "
      + "          pressuretype VARCHAR(64), "
      + "          suctiontype VARCHAR(64), "
      + "          pressureref VARCHAR(64), "
      + "          roboticref VARCHAR(64), "
      + "          suctionref VARCHAR(64), "
      + "          cleanernotes VARCHAR(64), "
      + "          hassolar VARCHAR(64), "
      + "          gastype VARCHAR(64), "
      + "          heaternotes VARCHAR(64), "
      + "          sitenotes VARCHAR(64) "
      + "         )";

  String TESTSITES_INSERT = ""
	  + "INSERT   INTO "
	  + "TESTSITES  (siteid) "
	  + "VALUES   (:siteId)";
  
  String HANRILIGHT_INSERT = ""
	  + "INSERT   INTO "
	  + "HANRILIGHT  (hanrilightid) "
	  + "VALUES     (:HanriLightId)";
  
  String HANRILIGHT_PAGE_SELECT = ""
		  + "SELECT   hanrilightid, "
		  + "         testsite, "
		  + "         installdate, "
		  + "         installernames, "
		  + "         serial, "
		  + "         voltage, "
		  + "         nichesize, "
		  + "         onautomation, "
		  + "         runhours, "
		  + "         lightcolor, "
		  + "         sequencecorrect, "
		  + "         waterintrusion, "
	      + "         notes "
	      + "FROM     HANRILIGHT ";
  
  String TESTSITES_PAGE_SELECT = ""
	      + "SELECT   siteid, "
	      + "         lastname, "
	      + "         firstname, "
	      + "         street, "
	      + "         city, "
	      + "         state, "
	      + "         zip, "
	      + "         email, "
	      + "         phone, "
	      + "         assignedtech, "
	      + "         ndaissuedate, "
	      + "         poolpicurl, "
	      + "         equippicurl, "
	      + "         poollayout, "
	      + "         poolvolume, "
	      + "         poolshape, "
	      + "         pooldimensions, "
	      + "         poolfinish, "
	      + "         marketingpool, "
	      + "         eqindooroutdoor, "
	      + "         eqabovebelowwater, "
	      + "         servicecontact, "
	      + "         poolnotes, "
	      + "         hasautomation, "
	      + "         automationtype, "
	      + "         hasiaqualink, "
	      + "         iaqualinkdevicenumber, "
	      + "         automationnotes, "
	      + "         hasinfloors, "
	      + "         pressuretype, "
	      + "         suctiontype, "
	      + "         pressureref, "
	      + "         roboticref, "
	      + "         suctionref, "
	      + "         cleanernotes, "
	      + "         hassolar, "
	      + "         gastype, "
	      + "         heaternotes, "
	      + "         sitenotes "
	      + "FROM     TESTSITES ";
  
  String HANRILIGHT_INSERT_SAMPLE = ""
		  + "INSERT  INTO HANRILIGHT "
		  + "        (hanrilightid, "
		  + "         testsite, "
		  + "         installdate, "
		  + "         installernames, "
		  + "         serial, "
		  + "         voltage, "
		  + "         nichesize, "
		  + "         onautomation, "
		  + "         runhours, "
		  + "         lightcolor, "
		  + "         sequencecorrect, "
		  + "         waterintrusion, "
	      + "         notes) ";
  
  String TESTSITES_INSERT_SAMPLE = ""
		  + "INSERT  INTO TESTSITES "
		  + "        (siteid, "
	      + "         lastname, "
	      + "         firstname, "
	      + "         street, "
	      + "         city, "
	      + "         state, "
	      + "         zip, "
	      + "         email, "
	      + "         phone, "
	      + "         assignedtech, "
	      + "         ndaissuedate, "
	      + "         poolpicurl, "
	      + "         equippicurl, "
	      + "         poollayout, "
	      + "         poolvolume, "
	      + "         poolshape, "
	      + "         pooldimensions, "
	      + "         poolfinish, "
	      + "         marketingpool, "
	      + "         eqindooroutdoor, "
	      + "         eqabovebelowwater, "
	      + "         servicecontact, "
	      + "         poolnotes, "
	      + "         hasautomation, "
	      + "         automationtype, "
	      + "         hasiaqualink, "
	      + "         iaqualinkdevicenumber, "
	      + "         automationnotes, "
	      + "         hasinfloors, "
	      + "         pressuretype, "
	      + "         suctiontype, "
	      + "         pressureref, "
	      + "         roboticref, "
	      + "         suctionref, "
	      + "         cleanernotes, "
	      + "         hassolar, "
	      + "         gastype, "
	      + "         heaternotes, "
	      + "         sitenotes) ";
  
  String HANRILIGHT_SELECT = ""
		  + "SELECT   testsite, "
		  + "         installdate, "
		  + "         installernames, "
		  + "         serial, "
		  + "         voltage, "
		  + "         nichesize, "
		  + "         onautomation, "
		  + "         runhours, "
		  + "         lightcolor, "
		  + "         sequencecorrect, "
		  + "         waterintrusion, "
	      + "         notes "
	      + "FROM     HANRILIGHT "
	      + "WHERE    hanrilightid = :HanriLightId "
	      + "INTO     :TestSite, "
		  + "         :InstallDate, "
		  + "         :InstallerNames, "
		  + "         :Serial, "
		  + "         :VoltageGroup, "
		  + "         :NicheSizeBox, "
		  + "         :OnAutomationBox, "
		  + "         :RunHours, "
		  + "         :LightColor, "
		  + "         :SequenceCorrectBox, "
		  + "         :WaterIntrusionBox, "
	      + "         :Notes";
  
  String TESTSITES_SELECT = ""
		  + "SELECT   lastname, "
	      + "         firstname, "
	      + "         street, "
	      + "         city, "
	      + "         state, "
	      + "         zip, "
	      + "         email, "
	      + "         phone, "
	      + "         assignedtech, "
	      + "         ndaissuedate, "
	      + "         poolpicurl, "
	      + "         equippicurl, "
	      + "         poollayout, "
	      + "         poolvolume, "
	      + "         poolshape, "
	      + "         pooldimensions, "
	      + "         poolfinish, "
	      + "         marketingpool, "
	      + "         eqindooroutdoor, "
	      + "         eqabovebelowwater, "
	      + "         servicecontact, "
	      + "         poolnotes, "
	      + "         hasautomation, "
	      + "         automationtype, "
	      + "         hasiaqualink, "
	      + "         iaqualinkdevicenumber, "
	      + "         automationnotes, "
	      + "         hasinfloors, "
	      + "         pressuretype, "
	      + "         suctiontype, "
	      + "         pressureref, "
	      + "         roboticref, "
	      + "         suctionref, "
	      + "         cleanernotes, "
	      + "         hassolar, "
	      + "         gastype, "
	      + "         heaternotes, "
	      + "         sitenotes "
	      + "FROM     TESTSITES "
	      + "WHERE    siteid = :siteId "
	      + "INTO     :LastName, "
	      + "         :FirstName, "
	      + "         :Street, "
	      + "         :City, "
	      + "         :State, "
	      + "         :ZIP, "
	      + "         :Email, "
	      + "         :Phone, "
	      + "         :AssignedTech, "
	      + "         :NDAIssueDate, "
	      + "         :PoolPic.url, "
	      + "         :EquipPic.url, "
	      + "         :PoolLayout, "
	      + "         :PoolVolume, "
	      + "         :PoolShape, "
	      + "         :PoolDimensions, "
	      + "         :PoolFinish, "
	      + "         :MarketingPoolGroup, "
	      + "         :EqIndoorOutdoor, "
	      + "         :EqAboveBelowWater, "
	      + "         :ServiceContact, "
	      + "         :PoolNotes, "
	      + "         :HasAutomation, "
	      + "         :AutomationType, "
	      + "         :HasIAqualink, "
	      + "         :IAqualinkDeviceNumber, "
	      + "         :AutomationNotes, "
	      + "         :HasInfloors, "
	      + "         :PressureType, "
	      + "         :SuctionType, "
	      + "         :PressureRef, "
	      + "         :RoboticRef, "
	      + "         :SuctionRef, "
	      + "         :CleanerNotes, "
	      + "         :HasSolar, "
	      + "         :GasType, "
	      + "         :HeaterNotes, "
	      + "         :SiteNotes";
  
  String HANRILIGHT_UPDATE = ""
		  + "UPDATE   HANRILIGHT "
		  + "SET      testsite = :TestSite, "
		  + "         installdate = :InstallDate, "
		  + "         installernames = :InstallerNames, "
		  + "         serial = :Serial, "
		  + "         voltage = :VoltageGroup, "
		  + "         nichesize = :NicheSizeBox, "
		  + "         onautomation = :OnAutomationBox, "
		  + "         runhours = :RunHours, "
		  + "         lightcolor = :LightColor, "
		  + "         sequencecorrect = :SequenceCorrectBox, "
		  + "         waterintrusion = :WaterIntrusionBox, "
	      + "         notes = :Notes "
	      + "WHERE    hanrilightid = :HanriLightId";
  
  String TESTSITES_UPDATE = ""
	      + "UPDATE   TESTSITES "
	      + "SET      lastname = :LastName, "
	      + "         firstname = :FirstName, "
	      + "         street = :Street, "
	      + "         city = :City, "
	      + "         state = :State, "
	      + "         zip = :ZIP, "
	      + "         email = :Email, "
	      + "         phone = :Phone, "
	      + "         assignedtech = :AssignedTech, "
	      + "         ndaissuedate = :NDAIssueDate, "
	      + "         poolpicurl = :PoolPic.url, "
	      + "         equippicurl = :EquipPic.url, "
	      + "         poollayout = :PoolLayout, "
	      + "         poolvolume = :PoolVolume, "
	      + "         poolshape = :PoolShape, "
	      + "         pooldimensions = :PoolDimensions, "
	      + "         poolfinish = :PoolFinish, "
	      + "         marketingpool = :MarketingPoolGroup, "
	      + "         eqindooroutdoor = :EqIndoorOutdoor, "
	      + "         eqabovebelowwater = :EqAboveBelowWater, "
	      + "         servicecontact = :ServiceContact, "
	      + "         poolnotes = :PoolNotes, "
	      + "         hasautomation = :HasAutomation, "
	      + "         automationtype = :AutomationType, "
	      + "         hasiaqualink = :HasIAqualink, "
	      + "         iaqualinkdevicenumber = :IAqualinkDeviceNumber, "
	      + "         automationnotes = :AutomationNotes, "
	      + "         hasinfloors = :HasInfloors, "
	      + "         pressuretype = :PressureType, "
	      + "         suctiontype = :SuctionType, "
	      + "         pressureref = :PressureRef, "
	      + "         roboticref = :RoboticRef, "
	      + "         suctionref = :SuctionRef, "
	      + "         cleanernotes = :CleanerNotes, "
	      + "         hassolar = :HasSolar, "
	      + "         gastype = :GasType, "
	      + "         heaternotes = :HeaterNotes, "
	      + "         sitenotes = :SiteNotes "
	      + "WHERE    siteid = :siteId";

  String HANRILIGHT_PAGE_DATA_SELECT_INTO = ""
		  + "INTO     :{page.HanriLightId}, "
		  + "         :{page.TestSite}, "
		  + "         :{page.InstallDate}, "
		  + "         :{page.InstallerNames}, "
		  + "         :{page.Serial}, "
		  + "         :{page.VoltageGroup}, "
		  + "         :{page.NicheSizeBox}, "
		  + "         :{page.OnAutomationBox}, "
		  + "         :{page.RunHours}, "
		  + "         :{page.LightColor}, "
		  + "         :{page.SequenceCorrectBox}, "
		  + "         :{page.WaterIntrusionBox}, "
	      + "         :{page.Notes}";
  
  String HANRILIGHT_VALUES_01 = ""
		  + "VALUES  ('hanrilight01', "
		  + "         'DanLukasik', "
		  + "         '', "
		  + "         'MattGagliano', "
		  + "         's3r1alkhkj', "
		  + "         'Low-12V', "
		  + "         'SpaSize', "
		  + "         'Yes', "
		  + "         '9', "	  
		  + "         'AlpineWhite', "
		  + "         'NoIssue', "
		  + "         'NoIssue', "
		  + "         'Notesnotesnotes')";
  
  String TESTSITES_PAGE_DATA_SELECT_INTO = ""
		  + "INTO     :{page.siteId}, "
		  + "         :{page.LastName}, "
		  + "         :{page.FirstName}, "
		  + "         :{page.Street}, "
		  + "         :{page.City}, "
		  + "         :{page.State}, "
		  + "         :{page.ZIP}, "
		  + "         :{page.Email}, "
		  + "         :{page.Phone}, "
		  + "         :{page.AssignedTech}, "
		  + "         :{page.NDAIssueDate}, "
		  + "         :{page.PoolPicURL}, "
		  + "         :{page.EquipPicURL}, "
		  + "         :{page.PoolLayout}, "
		  + "         :{page.PoolVolume}, "
		  + "         :{page.PoolShape}, "
		  + "         :{page.PoolDimensions}, "
		  + "         :{page.PoolFinish}, "
		  + "         :{page.MarketingPoolGroup}, "
		  + "         :{page.EqIndoorOutdoor}, "
		  + "         :{page.EqAboveBelowWater}, "
		  + "         :{page.ServiceContact}, "
		  + "         :{page.PoolNotes}, "
		  + "         :{page.HasAutomation}, "
		  + "         :{page.AutomationType}, "
		  + "         :{page.HasIAqualink}, "
		  + "         :{page.IAqualinkDeviceNumber}, "
		  + "         :{page.AutomationNotes}, "
		  + "         :{page.HasInfloors}, "
		  + "         :{page.PressureType}, "
		  + "         :{page.SuctionType}, "
		  + "         :{page.PressureRef}, "
		  + "         :{page.RoboticRef}, "
		  + "         :{page.SuctionRef}, "
		  + "         :{page.CleanerNotes}, "
		  + "         :{page.HasSolar}, "
		  + "         :{page.GasType}, "
		  + "         :{page.HeaterNotes}, "
		  + "         :{page.SiteNotes}";
  

  String TESTSITES_VALUES_01 = ""
	  + "VALUES  ('site01', "
	  + "         'alastname', "
	  + "         'afirstname', "
	  + "         '4671 address St', "
	  + "         'acity', "
	  + "         'CA', "
	  + "         '92118', "
	  + "         'matt.gagliano@zodiac.com', "
	  + "         '9293843737', "	  
	  + "         'Ron Larson', "
	  + "         '', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         '50000', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'Yes', "
	  + "         'No')";

  String TESTSITES_DROP_TABLE = "DROP TABLE TESTSITES";
  String HANRILIGHT_DROP_TABLE = "DROP TABLE HANRILIGHT";


  // tag::organizationListing[]
  // tag::createDB[]
}
// end::createDB[]
// end::organizationListing[]