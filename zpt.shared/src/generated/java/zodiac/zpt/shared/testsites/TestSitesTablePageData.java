package zodiac.zpt.shared.testsites;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "zodiac.zpt.client.testsites.TestSitesTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class TestSitesTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public TestSitesTableRowData addRow() {
		return (TestSitesTableRowData) super.addRow();
	}

	@Override
	public TestSitesTableRowData addRow(int rowState) {
		return (TestSitesTableRowData) super.addRow(rowState);
	}

	@Override
	public TestSitesTableRowData createRow() {
		return new TestSitesTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return TestSitesTableRowData.class;
	}

	@Override
	public TestSitesTableRowData[] getRows() {
		return (TestSitesTableRowData[]) super.getRows();
	}

	@Override
	public TestSitesTableRowData rowAt(int index) {
		return (TestSitesTableRowData) super.rowAt(index);
	}

	public void setRows(TestSitesTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class TestSitesTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
		public static final String siteId = "siteId";
		public static final String lastName = "lastName";
		public static final String firstName = "firstName";
		public static final String street = "street";
		public static final String city = "city";
		public static final String state = "state";
		public static final String zIP = "zIP";
		public static final String email = "email";
		public static final String phone = "phone";
		public static final String assignedTech = "assignedTech";
		public static final String nDAIssueDate = "nDAIssueDate";
		public static final String poolPicURL = "poolPicURL";
		public static final String equipPicURL = "equipPicURL";
		public static final String poolLayout = "poolLayout";
		public static final String poolVolume = "poolVolume";
		public static final String poolShape = "poolShape";
		public static final String poolDimensions = "poolDimensions";
		public static final String poolFinish = "poolFinish";
		public static final String marketingPoolGroup = "marketingPoolGroup";
		public static final String eqIndoorOutdoor = "eqIndoorOutdoor";
		public static final String eqAboveBelowWater = "eqAboveBelowWater";
		public static final String serviceContact = "serviceContact";
		public static final String poolNotes = "poolNotes";
		public static final String hasAutomation = "hasAutomation";
		public static final String automationType = "automationType";
		public static final String hasIAqualink = "hasIAqualink";
		public static final String iAqualinkDeviceNumber = "iAqualinkDeviceNumber";
		public static final String automationNotes = "automationNotes";
		public static final String hasInfloors = "hasInfloors";
		public static final String pressureType = "pressureType";
		public static final String suctionType = "suctionType";
		public static final String pressureRef = "pressureRef";
		public static final String roboticRef = "roboticRef";
		public static final String suctionRef = "suctionRef";
		public static final String cleanerNotes = "cleanerNotes";
		public static final String hasSolar = "hasSolar";
		public static final String gasType = "gasType";
		public static final String heaterNotes = "heaterNotes";
		public static final String siteNotes = "siteNotes";
		private String m_siteId;
		private String m_lastName;
		private String m_firstName;
		private String m_street;
		private String m_city;
		private String m_state;
		private String m_zIP;
		private String m_email;
		private String m_phone;
		private String m_assignedTech;
		private String m_nDAIssueDate;
		private String m_poolPicURL;
		private String m_equipPicURL;
		private String m_poolLayout;
		private String m_poolVolume;
		private String m_poolShape;
		private String m_poolDimensions;
		private String m_poolFinish;
		private String m_marketingPoolGroup;
		private String m_eqIndoorOutdoor;
		private String m_eqAboveBelowWater;
		private String m_serviceContact;
		private String m_poolNotes;
		private String m_hasAutomation;
		private String m_automationType;
		private String m_hasIAqualink;
		private String m_iAqualinkDeviceNumber;
		private String m_automationNotes;
		private String m_hasInfloors;
		private String m_pressureType;
		private String m_suctionType;
		private String m_pressureRef;
		private String m_roboticRef;
		private String m_suctionRef;
		private String m_cleanerNotes;
		private String m_hasSolar;
		private String m_gasType;
		private String m_heaterNotes;
		private String m_siteNotes;

		public String getSiteId() {
			return m_siteId;
		}

		public void setSiteId(String newSiteId) {
			m_siteId = newSiteId;
		}

		public String getLastName() {
			return m_lastName;
		}

		public void setLastName(String newLastName) {
			m_lastName = newLastName;
		}

		public String getFirstName() {
			return m_firstName;
		}

		public void setFirstName(String newFirstName) {
			m_firstName = newFirstName;
		}

		public String getStreet() {
			return m_street;
		}

		public void setStreet(String newStreet) {
			m_street = newStreet;
		}

		public String getCity() {
			return m_city;
		}

		public void setCity(String newCity) {
			m_city = newCity;
		}

		public String getState() {
			return m_state;
		}

		public void setState(String newState) {
			m_state = newState;
		}

		public String getZIP() {
			return m_zIP;
		}

		public void setZIP(String newZIP) {
			m_zIP = newZIP;
		}

		public String getEmail() {
			return m_email;
		}

		public void setEmail(String newEmail) {
			m_email = newEmail;
		}

		public String getPhone() {
			return m_phone;
		}

		public void setPhone(String newPhone) {
			m_phone = newPhone;
		}

		public String getAssignedTech() {
			return m_assignedTech;
		}

		public void setAssignedTech(String newAssignedTech) {
			m_assignedTech = newAssignedTech;
		}

		public String getNDAIssueDate() {
			return m_nDAIssueDate;
		}

		public void setNDAIssueDate(String newNDAIssueDate) {
			m_nDAIssueDate = newNDAIssueDate;
		}

		public String getPoolPicURL() {
			return m_poolPicURL;
		}

		public void setPoolPicURL(String newPoolPicURL) {
			m_poolPicURL = newPoolPicURL;
		}

		public String getEquipPicURL() {
			return m_equipPicURL;
		}

		public void setEquipPicURL(String newEquipPicURL) {
			m_equipPicURL = newEquipPicURL;
		}

		public String getPoolLayout() {
			return m_poolLayout;
		}

		public void setPoolLayout(String newPoolLayout) {
			m_poolLayout = newPoolLayout;
		}

		public String getPoolVolume() {
			return m_poolVolume;
		}

		public void setPoolVolume(String newPoolVolume) {
			m_poolVolume = newPoolVolume;
		}

		public String getPoolShape() {
			return m_poolShape;
		}

		public void setPoolShape(String newPoolShape) {
			m_poolShape = newPoolShape;
		}

		public String getPoolDimensions() {
			return m_poolDimensions;
		}

		public void setPoolDimensions(String newPoolDimensions) {
			m_poolDimensions = newPoolDimensions;
		}

		public String getPoolFinish() {
			return m_poolFinish;
		}

		public void setPoolFinish(String newPoolFinish) {
			m_poolFinish = newPoolFinish;
		}

		public String getMarketingPoolGroup() {
			return m_marketingPoolGroup;
		}

		public void setMarketingPoolGroup(String newMarketingPoolGroup) {
			m_marketingPoolGroup = newMarketingPoolGroup;
		}

		public String getEqIndoorOutdoor() {
			return m_eqIndoorOutdoor;
		}

		public void setEqIndoorOutdoor(String newEqIndoorOutdoor) {
			m_eqIndoorOutdoor = newEqIndoorOutdoor;
		}

		public String getEqAboveBelowWater() {
			return m_eqAboveBelowWater;
		}

		public void setEqAboveBelowWater(String newEqAboveBelowWater) {
			m_eqAboveBelowWater = newEqAboveBelowWater;
		}

		public String getServiceContact() {
			return m_serviceContact;
		}

		public void setServiceContact(String newServiceContact) {
			m_serviceContact = newServiceContact;
		}

		public String getPoolNotes() {
			return m_poolNotes;
		}

		public void setPoolNotes(String newPoolNotes) {
			m_poolNotes = newPoolNotes;
		}

		public String getHasAutomation() {
			return m_hasAutomation;
		}

		public void setHasAutomation(String newHasAutomation) {
			m_hasAutomation = newHasAutomation;
		}

		public String getAutomationType() {
			return m_automationType;
		}

		public void setAutomationType(String newAutomationType) {
			m_automationType = newAutomationType;
		}

		public String getHasIAqualink() {
			return m_hasIAqualink;
		}

		public void setHasIAqualink(String newHasIAqualink) {
			m_hasIAqualink = newHasIAqualink;
		}

		public String getIAqualinkDeviceNumber() {
			return m_iAqualinkDeviceNumber;
		}

		public void setIAqualinkDeviceNumber(String newIAqualinkDeviceNumber) {
			m_iAqualinkDeviceNumber = newIAqualinkDeviceNumber;
		}

		public String getAutomationNotes() {
			return m_automationNotes;
		}

		public void setAutomationNotes(String newAutomationNotes) {
			m_automationNotes = newAutomationNotes;
		}

		public String getHasInfloors() {
			return m_hasInfloors;
		}

		public void setHasInfloors(String newHasInfloors) {
			m_hasInfloors = newHasInfloors;
		}

		public String getPressureType() {
			return m_pressureType;
		}

		public void setPressureType(String newPressureType) {
			m_pressureType = newPressureType;
		}

		public String getSuctionType() {
			return m_suctionType;
		}

		public void setSuctionType(String newSuctionType) {
			m_suctionType = newSuctionType;
		}

		public String getPressureRef() {
			return m_pressureRef;
		}

		public void setPressureRef(String newPressureRef) {
			m_pressureRef = newPressureRef;
		}

		public String getRoboticRef() {
			return m_roboticRef;
		}

		public void setRoboticRef(String newRoboticRef) {
			m_roboticRef = newRoboticRef;
		}

		public String getSuctionRef() {
			return m_suctionRef;
		}

		public void setSuctionRef(String newSuctionRef) {
			m_suctionRef = newSuctionRef;
		}

		public String getCleanerNotes() {
			return m_cleanerNotes;
		}

		public void setCleanerNotes(String newCleanerNotes) {
			m_cleanerNotes = newCleanerNotes;
		}

		public String getHasSolar() {
			return m_hasSolar;
		}

		public void setHasSolar(String newHasSolar) {
			m_hasSolar = newHasSolar;
		}

		public String getGasType() {
			return m_gasType;
		}

		public void setGasType(String newGasType) {
			m_gasType = newGasType;
		}

		public String getHeaterNotes() {
			return m_heaterNotes;
		}

		public void setHeaterNotes(String newHeaterNotes) {
			m_heaterNotes = newHeaterNotes;
		}

		public String getSiteNotes() {
			return m_siteNotes;
		}

		public void setSiteNotes(String newSiteNotes) {
			m_siteNotes = newSiteNotes;
		}
	}
}