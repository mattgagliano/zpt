package zodiac.zpt.shared.equipment.lights;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "zodiac.zpt.client.equipment.lights.HanriLightTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class HanriLightTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public HanriLightTableRowData addRow() {
		return (HanriLightTableRowData) super.addRow();
	}

	@Override
	public HanriLightTableRowData addRow(int rowState) {
		return (HanriLightTableRowData) super.addRow(rowState);
	}

	@Override
	public HanriLightTableRowData createRow() {
		return new HanriLightTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return HanriLightTableRowData.class;
	}

	@Override
	public HanriLightTableRowData[] getRows() {
		return (HanriLightTableRowData[]) super.getRows();
	}

	@Override
	public HanriLightTableRowData rowAt(int index) {
		return (HanriLightTableRowData) super.rowAt(index);
	}

	public void setRows(HanriLightTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class HanriLightTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
		public static final String hanriLightId = "hanriLightId";
		public static final String testSite = "testSite";
		public static final String installDate = "installDate";
		public static final String installerNames = "installerNames";
		public static final String serial = "serial";
		public static final String voltageGroup = "voltageGroup";
		public static final String nicheSizeBox = "nicheSizeBox";
		public static final String onAutomation = "onAutomation";
		public static final String runHours = "runHours";
		public static final String lightColor = "lightColor";
		public static final String sequenceCorrectBox = "sequenceCorrectBox";
		public static final String waterIntrusionBox = "waterIntrusionBox";
		public static final String notes = "notes";
		private String m_hanriLightId;
		private String m_testSite;
		private Date m_installDate;
		private String m_installerNames;
		private String m_serial;
		private String m_voltageGroup;
		private String m_nicheSizeBox;
		private Boolean m_onAutomation;
		private Integer m_runHours;
		private String m_lightColor;
		private String m_sequenceCorrectBox;
		private String m_waterIntrusionBox;
		private String m_notes;

		public String getHanriLightId() {
			return m_hanriLightId;
		}

		public void setHanriLightId(String newHanriLightId) {
			m_hanriLightId = newHanriLightId;
		}

		public String getTestSite() {
			return m_testSite;
		}

		public void setTestSite(String newTestSite) {
			m_testSite = newTestSite;
		}

		public Date getInstallDate() {
			return m_installDate;
		}

		public void setInstallDate(Date newInstallDate) {
			m_installDate = newInstallDate;
		}

		public String getInstallerNames() {
			return m_installerNames;
		}

		public void setInstallerNames(String newInstallerNames) {
			m_installerNames = newInstallerNames;
		}

		public String getSerial() {
			return m_serial;
		}

		public void setSerial(String newSerial) {
			m_serial = newSerial;
		}

		public String getVoltageGroup() {
			return m_voltageGroup;
		}

		public void setVoltageGroup(String newVoltageGroup) {
			m_voltageGroup = newVoltageGroup;
		}

		public String getNicheSizeBox() {
			return m_nicheSizeBox;
		}

		public void setNicheSizeBox(String newNicheSizeBox) {
			m_nicheSizeBox = newNicheSizeBox;
		}

		public Boolean getOnAutomation() {
			return m_onAutomation;
		}

		public void setOnAutomation(Boolean newOnAutomation) {
			m_onAutomation = newOnAutomation;
		}

		public Integer getRunHours() {
			return m_runHours;
		}

		public void setRunHours(Integer newRunHours) {
			m_runHours = newRunHours;
		}

		public String getLightColor() {
			return m_lightColor;
		}

		public void setLightColor(String newLightColor) {
			m_lightColor = newLightColor;
		}

		public String getSequenceCorrectBox() {
			return m_sequenceCorrectBox;
		}

		public void setSequenceCorrectBox(String newSequenceCorrectBox) {
			m_sequenceCorrectBox = newSequenceCorrectBox;
		}

		public String getWaterIntrusionBox() {
			return m_waterIntrusionBox;
		}

		public void setWaterIntrusionBox(String newWaterIntrusionBox) {
			m_waterIntrusionBox = newWaterIntrusionBox;
		}

		public String getNotes() {
			return m_notes;
		}

		public void setNotes(String newNotes) {
			m_notes = newNotes;
		}
	}
}
