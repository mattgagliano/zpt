package zodiac.zpt.shared.config;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "zodiac.zpt.client.config.ProjectPhasesConfigTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ProjectPhasesConfigTablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public ProjectPhasesConfigTableRowData addRow() {
		return (ProjectPhasesConfigTableRowData) super.addRow();
	}

	@Override
	public ProjectPhasesConfigTableRowData addRow(int rowState) {
		return (ProjectPhasesConfigTableRowData) super.addRow(rowState);
	}

	@Override
	public ProjectPhasesConfigTableRowData createRow() {
		return new ProjectPhasesConfigTableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return ProjectPhasesConfigTableRowData.class;
	}

	@Override
	public ProjectPhasesConfigTableRowData[] getRows() {
		return (ProjectPhasesConfigTableRowData[]) super.getRows();
	}

	@Override
	public ProjectPhasesConfigTableRowData rowAt(int index) {
		return (ProjectPhasesConfigTableRowData) super.rowAt(index);
	}

	public void setRows(ProjectPhasesConfigTableRowData[] rows) {
		super.setRows(rows);
	}

	public static class ProjectPhasesConfigTableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
	}
}
