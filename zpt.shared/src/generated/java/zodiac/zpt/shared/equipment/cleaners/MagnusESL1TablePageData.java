package zodiac.zpt.shared.equipment.cleaners;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications
 * recommended.
 */
@Generated(value = "zodiac.zpt.client.equipment.cleaners.MagnusESL1TablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class MagnusESL1TablePageData extends AbstractTablePageData {

	private static final long serialVersionUID = 1L;

	@Override
	public MagnusESL1TableRowData addRow() {
		return (MagnusESL1TableRowData) super.addRow();
	}

	@Override
	public MagnusESL1TableRowData addRow(int rowState) {
		return (MagnusESL1TableRowData) super.addRow(rowState);
	}

	@Override
	public MagnusESL1TableRowData createRow() {
		return new MagnusESL1TableRowData();
	}

	@Override
	public Class<? extends AbstractTableRowData> getRowType() {
		return MagnusESL1TableRowData.class;
	}

	@Override
	public MagnusESL1TableRowData[] getRows() {
		return (MagnusESL1TableRowData[]) super.getRows();
	}

	@Override
	public MagnusESL1TableRowData rowAt(int index) {
		return (MagnusESL1TableRowData) super.rowAt(index);
	}

	public void setRows(MagnusESL1TableRowData[] rows) {
		super.setRows(rows);
	}

	public static class MagnusESL1TableRowData extends AbstractTableRowData {

		private static final long serialVersionUID = 1L;
	}
}