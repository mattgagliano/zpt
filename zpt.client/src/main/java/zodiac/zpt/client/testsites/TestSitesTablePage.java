package zodiac.zpt.client.testsites;

import java.util.Set;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractBooleanColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.client.ui.form.FormEvent;
import org.eclipse.scout.rt.client.ui.form.FormListener;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import zodiac.zpt.client.testsites.TestSitesTablePage.Table;
import zodiac.zpt.shared.testsites.ITestSitesService;
import zodiac.zpt.shared.testsites.TestSitesTablePageData;

@Data(TestSitesTablePageData.class)
public class TestSitesTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("TestSites");
	}

	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}
	
	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ITestSitesService.class).getTestSitesTableData(filter));
	}

	public class Table extends AbstractTable {

		
		public LastNameColumn getLastNameColumn() {
			return getColumnSet().getColumnByClass(LastNameColumn.class);
		}

		public FirstNameColumn getFirstNameColumn() {
			return getColumnSet().getColumnByClass(FirstNameColumn.class);
		}

		public StreetColumn getStreetColumn() {
			return getColumnSet().getColumnByClass(StreetColumn.class);
		}

		public CityColumn getCityColumn() {
			return getColumnSet().getColumnByClass(CityColumn.class);
		}

		public StateColumn getStateColumn() {
			return getColumnSet().getColumnByClass(StateColumn.class);
		}

		public ZIPColumn getZIPColumn() {
			return getColumnSet().getColumnByClass(ZIPColumn.class);
		}

		public EmailColumn getEmailColumn() {
			return getColumnSet().getColumnByClass(EmailColumn.class);
		}

		public AssignedTechColumn getAssignedTechColumn() {
			return getColumnSet().getColumnByClass(AssignedTechColumn.class);
		}

		public PoolPicURLColumn getPoolPicURLColumn() {
			return getColumnSet().getColumnByClass(PoolPicURLColumn.class);
		}

		public EquipPicURLColumn getEquipPicURLColumn() {
			return getColumnSet().getColumnByClass(EquipPicURLColumn.class);
		}

		public PoolLayoutColumn getPoolLayoutColumn() {
			return getColumnSet().getColumnByClass(PoolLayoutColumn.class);
		}

		public PoolVolumeColumn getPoolVolumeColumn() {
			return getColumnSet().getColumnByClass(PoolVolumeColumn.class);
		}

		public PoolShapeColumn getPoolShapeColumn() {
			return getColumnSet().getColumnByClass(PoolShapeColumn.class);
		}

		public PoolDimensionsColumn getPoolDimensionsColumn() {
			return getColumnSet().getColumnByClass(PoolDimensionsColumn.class);
		}

		public PoolFinishColumn getPoolFinishColumn() {
			return getColumnSet().getColumnByClass(PoolFinishColumn.class);
		}

		public MarketingPoolGroup getMarketingPoolColumn() {
			return getColumnSet().getColumnByClass(MarketingPoolGroup.class);
		}

		public EqIndoorOutdoor getEqIndoorOutdoorColumn() {
			return getColumnSet().getColumnByClass(EqIndoorOutdoor.class);
		}

		public EqAboveBelowWaterColumn getEqAboveBelowWaterColumn() {
			return getColumnSet().getColumnByClass(EqAboveBelowWaterColumn.class);
		}

		public ServiceContactColumn getServiceContactColumn() {
			return getColumnSet().getColumnByClass(ServiceContactColumn.class);
		}

		public PoolNotesColumn getPoolNotesColumn() {
			return getColumnSet().getColumnByClass(PoolNotesColumn.class);
		}

		public HasAutomationColumn getHasAutomationColumn() {
			return getColumnSet().getColumnByClass(HasAutomationColumn.class);
		}

		public AutomationTypeColumn getAutomationTypeColumn() {
			return getColumnSet().getColumnByClass(AutomationTypeColumn.class);
		}

		public HasIAqualinkColumn getHasIAqualinkColumn() {
			return getColumnSet().getColumnByClass(HasIAqualinkColumn.class);
		}

		public IAqualinkDeviceNumberColumn getIAqualinkDeviceNumberColumn() {
			return getColumnSet().getColumnByClass(IAqualinkDeviceNumberColumn.class);
		}

		public AutomationNotesColumn getAutomationNotesColumn() {
			return getColumnSet().getColumnByClass(AutomationNotesColumn.class);
		}

		public HasInfloorsColumn getHasInfloorsColumn() {
			return getColumnSet().getColumnByClass(HasInfloorsColumn.class);
		}

		public PressureTypeColumn getPressureTypeColumn() {
			return getColumnSet().getColumnByClass(PressureTypeColumn.class);
		}

		public SuctionTypeColumn getSuctionTypeColumn() {
			return getColumnSet().getColumnByClass(SuctionTypeColumn.class);
		}

		public PressureRefColumn getPressureRefColumn() {
			return getColumnSet().getColumnByClass(PressureRefColumn.class);
		}

		public RoboticRefColumn getRoboticRefColumn() {
			return getColumnSet().getColumnByClass(RoboticRefColumn.class);
		}

		public SuctionRefColumn getSuctionRefColumn() {
			return getColumnSet().getColumnByClass(SuctionRefColumn.class);
		}

		public CleanerNotesColumn getCleanerNotesColumn() {
			return getColumnSet().getColumnByClass(CleanerNotesColumn.class);
		}

		public HasSolarColumn getHasSolarColumn() {
			return getColumnSet().getColumnByClass(HasSolarColumn.class);
		}

		public GasTypeColumn getGasTypeColumn() {
			return getColumnSet().getColumnByClass(GasTypeColumn.class);
		}

		public HeaterNotesColumn getHeaterNotesColumn() {
			return getColumnSet().getColumnByClass(HeaterNotesColumn.class);
		}

		public SiteNotesColumn getSiteNotesColumn() {
			return getColumnSet().getColumnByClass(SiteNotesColumn.class);
		}

		public NDAIssueDateColumn getNDAIssueDateColumn() {
			return getColumnSet().getColumnByClass(NDAIssueDateColumn.class);
		}

		public PhoneColumn getPhoneColumn() {
			return getColumnSet().getColumnByClass(PhoneColumn.class);
		}

		public SiteIdColumn getSiteIdColumn() {
			return getColumnSet().getColumnByClass(SiteIdColumn.class);
		}

		
		@Order(0)
		public class SiteIdColumn extends AbstractStringColumn {
			
			@Override 
		    protected boolean getConfiguredDisplayable() {
				return false;
		    }

			@Override 
		    protected boolean getConfiguredPrimaryKey() {
				return true;
		    }
		}

		@Order(1000)
		public class LastNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("LastName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 110;
			}
		}

		@Order(2000)
		public class FirstNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("FirstName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 110;
			}
		}

		@Order(3000)
		public class StreetColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Street");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(4000)
		public class CityColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("City");
			}

			@Override
			protected int getConfiguredWidth() {
				return 76;
			}
		}

		@Order(5000)
		public class StateColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("State");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		@Order(6000)
		public class ZIPColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("ZIP");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		@Order(7000)
		public class EmailColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Email");
			}

			@Override
			protected int getConfiguredWidth() {
				return 200;
			}
		}

		@Order(8000)
		public class PhoneColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Phone");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(9000)
		public class AssignedTechColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("AssignedTech");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
			
			/*@Override 
		      protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
		        return AssignedTechLookupCall.class;
		      }*/
		}

		@Order(10000)
		public class NDAIssueDateColumn extends AbstractDateColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("NDAIssueDate");
			}

			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		}

		@Order(11000)
		public class PoolPicURLColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolPicURL");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(12000)
		public class EquipPicURLColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("EquipPicURL");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(13000)
		public class PoolLayoutColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolLayout");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
			
		/*	@Override 
		    protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
		        return PoolLayoutLookupCall.class;
		    }*/
		}

		@Order(14000)
		public class PoolVolumeColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolVolume");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(15000)
		public class PoolShapeColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolShape");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(16000)
		public class PoolDimensionsColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolDimensions");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(17000)
		public class PoolFinishColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolFinish");
			}

			@Override
			protected int getConfiguredWidth() {
				return 135;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
			
		/*	@Override 
		    protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
		        return PoolFinishLookupCall.class;
		    }*/
		}

		@Order(18000)
		public class MarketingPoolGroup extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("MarketingPool");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(19000)
		public class EqIndoorOutdoor extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("EquipmentLocation");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(20000)
		public class EqAboveBelowWaterColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("EquipmentLevel");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(21000)
		public class ServiceContactColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolServiceContact");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(22000)
		public class PoolNotesColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PoolNotes");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(23000)
		public class HasAutomationColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("HasAutomation");
			}

			@Override
			protected int getConfiguredWidth() {
				return 126;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(24000)
		public class AutomationTypeColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("AutomationType");
			}

			@Override
			protected int getConfiguredWidth() {
				return 124;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(25000)
		public class HasIAqualinkColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("HasIAqualink");
			}

			@Override
			protected int getConfiguredWidth() {
				return 112;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(26000)
		public class IAqualinkDeviceNumberColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("IAqualinkDevice");
			}

			@Override
			protected int getConfiguredWidth() {
				return 133;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(27000)
		public class AutomationNotesColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("AutomationNotes");
			}

			@Override
			protected int getConfiguredWidth() {
				return 350;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(28000)
		public class HasInfloorsColumn extends AbstractBooleanColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("HasInfloors");
			}

			@Override
			protected int getConfiguredWidth() {
				return 103;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(29000)
		public class PressureTypeColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PressureType");
			}

			@Override
			protected int getConfiguredWidth() {
				return 110;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(30000)
		public class SuctionTypeColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("SuctionType");
			}

			@Override
			protected int getConfiguredWidth() {
				return 116;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(31000)
		public class PressureRefColumn extends AbstractBooleanColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PressureRef");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(32000)
		public class RoboticRefColumn extends AbstractBooleanColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("RoboticRef0");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(33000)
		public class SuctionRefColumn extends AbstractBooleanColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("SuctionRef");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(34000)
		public class CleanerNotesColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("CleanerNotes");
			}

			@Override
			protected int getConfiguredWidth() {
				return 300;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(35000)
		public class HasSolarColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("HasSolarHeat");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(36000)
		public class GasTypeColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("GasType");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(37000)
		public class HeaterNotesColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("HeaterNotes");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(38000)
		public class SiteNotesColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Notes");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		
		@Override
	    protected Class<? extends IMenu> getConfiguredDefaultMenu() { 
	      return EditMenu.class;
	    }

	    @Order(10)
	    public class EditMenu extends AbstractMenu {
	      @Override
	      protected String getConfiguredText() {
	        return TEXTS.get("Edit");
	      }

	      @Override
	      protected void execAction() {
	        TestSiteForm form = new TestSiteForm();
	        form.setSiteId(getSiteIdColumn().getSelectedValue()); 
	        form.addFormListener(new TestSiteFormListener());
	        // start the form using its modify handler
	        form.startModify();
	      }
	    }

	    @Order(20)
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
	        TestSiteForm form = new TestSiteForm();
	        form.addFormListener(new TestSiteFormListener());
	        // start the form using its new handler
	        form.startNew();
	      }
	    }

	    private class TestSiteFormListener implements FormListener {

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
