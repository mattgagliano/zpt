package zodiac.zpt.client.equipment.lights;

import java.util.Set;

import org.eclipse.scout.rt.client.dto.PageData;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractBooleanColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractIntegerColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.client.ui.form.FormEvent;
import org.eclipse.scout.rt.client.ui.form.FormListener;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.shared.equipment.lights.HanriLightTablePageData;
import zodiac.zpt.shared.equipment.lights.IHanriLightService;

@PageData(HanriLightTablePageData.class)
public class HanriLightTablePage extends AbstractPageWithTable<HanriLightTablePage.Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("HanriLightMSL2");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IHanriLightService.class).getHanriLightTableData(filter));
	}
	
	@Override 
	protected boolean getConfiguredLeaf() {
	    return true;
	}

	public class Table extends AbstractTable {

		public InstallDateColumn getInstallDateColumn() {
			return getColumnSet().getColumnByClass(InstallDateColumn.class);
		}

		public InstallerNamesColumn getInstallerNamesColumn() {
			return getColumnSet().getColumnByClass(InstallerNamesColumn.class);
		}

		public VoltageGroupColumn getVoltageGroupColumn() {
			return getColumnSet().getColumnByClass(VoltageGroupColumn.class);
		}

		public OnAutomationColumn getOnAutomationColumn() {
			return getColumnSet().getColumnByClass(OnAutomationColumn.class);
		}

		public RunHoursColumn getRunHoursColumn() {
			return getColumnSet().getColumnByClass(RunHoursColumn.class);
		}

		public LightColorColumn getLightColorColumn() {
			return getColumnSet().getColumnByClass(LightColorColumn.class);
		}

		public SequenceCorrectBoxColumn getSequenceCorrectBoxColumn() {
			return getColumnSet().getColumnByClass(SequenceCorrectBoxColumn.class);
		}

		public WaterIntrusionBoxColumn getWaterIntrusionBoxColumn() {
			return getColumnSet().getColumnByClass(WaterIntrusionBoxColumn.class);
		}

		public NotesColumn getNotesColumn() {
			return getColumnSet().getColumnByClass(NotesColumn.class);
		}

		public NicheSizeBoxColumn getNicheSizeBoxColumn() {
			return getColumnSet().getColumnByClass(NicheSizeBoxColumn.class);
		}

		public SerialColumn getSerialColumn() {
			return getColumnSet().getColumnByClass(SerialColumn.class);
		}

		public TestSiteColumn getTestSiteColumn() {
			return getColumnSet().getColumnByClass(TestSiteColumn.class);
		}

		public HanriLightIdColumn getEquipIdColumn() {
			return getColumnSet().getColumnByClass(HanriLightIdColumn.class);
		}

		@Order(1000)
		public class HanriLightIdColumn extends AbstractStringColumn {
			@Override 
		    protected boolean getConfiguredDisplayable() {
		        return false;
		    }

		    @Override 
		    protected boolean getConfiguredPrimaryKey() {
		        return true;
		    }
		}

		@Order(2000)
		public class TestSiteColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("TestSite");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(3000)
		public class InstallDateColumn extends AbstractDateColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("InstallDate");
			}

			@Override
			protected int getConfiguredWidth() {
				return 88;
			}
		}

		@Order(4000)
		public class InstallerNamesColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Installer");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(5000)
		public class SerialColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Serial0");
			}

			@Override
			protected int getConfiguredWidth() {
				return 88;
			}
		}

		@Order(6000)
		public class VoltageGroupColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Voltage");
			}

			@Override
			protected int getConfiguredWidth() {
				return 62;
			}
		}

		@Order(7000)
		public class NicheSizeBoxColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Niche");
			}

			@Override
			protected int getConfiguredWidth() {
				return 68;
			}
		}

		@Order(8000)
		public class OnAutomationColumn extends AbstractBooleanColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("OnAuto");
			}

			@Override
			protected int getConfiguredWidth() {
				return 78;
			}
		}

		
		@Order(9000)
		public class RunHoursColumn extends AbstractIntegerColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("RunHrDay");
			}

			@Override
			protected int getConfiguredWidth() {
				return 88;
			}
		}

		@Order(10000)
		public class LightColorColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("ColorSetting");
			}

			@Override
			protected int getConfiguredWidth() {
				return 122;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(11000)
		public class SequenceCorrectBoxColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("SyncSeq");
			}

			@Override
			protected int getConfiguredWidth() {
				return 88;
			}
		}

		@Order(12000)
		public class WaterIntrusionBoxColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("WaterIntrusion");
			}

			@Override
			protected int getConfiguredWidth() {
				return 112;
			}
		}

		@Order(13000)
		public class NotesColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Notes");
			}

			@Override
			protected int getConfiguredWidth() {
				return 355;
			}
		}	
		
		@Override
		protected Class<? extends IMenu> getConfiguredDefaultMenu() {
			return EditMenu.class;
		}

		@Order(1000)
		public class EditMenu extends AbstractMenu {
			@Override
			protected String getConfiguredText() {
				return TEXTS.get("Edit");
			}

			@Override
			protected void execAction() {
				HanriInstallLogForm form = new HanriInstallLogForm();
				form.setHanriLightId(getEquipIdColumn().getSelectedValue());
				form.addFormListener(new HanriInstallLogFormListener());
				form.startModify();
			}
		}

		@Order(2000)
		public class NewMenu extends AbstractMenu {
			@Override
			protected String getConfiguredText() {
				return TEXTS.get("New");
			}

			@Override
		    protected Set<? extends IMenuType> getConfiguredMenuTypes() { 
		        return CollectionUtility.<IMenuType> hashSet(
		            TableMenuType.EmptySpace, TableMenuType.SingleSelection);
		    }

		    @Override
		    protected void execAction() {
		        HanriInstallLogForm form = new HanriInstallLogForm();
		        form.addFormListener(new HanriInstallLogFormListener());
		        // start the form using its new handler
		        form.startNew();
		    }
		}
		
		private class HanriInstallLogFormListener implements FormListener {

		    @Override
		    public void formChanged(FormEvent e) {
		        // reload page to reflect new/changed data after saving any changes
		        if (FormEvent.TYPE_CLOSED == e.getType() && e.getForm().isFormStored()) {
		        	reloadPage();
		        }
		    }
		}
	}
}
