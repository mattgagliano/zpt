package zodiac.zpt.client.equipment.lights;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractRadioButton;
import org.eclipse.scout.rt.client.ui.form.fields.datefield.AbstractDateField;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.integerfield.AbstractIntegerField;
import org.eclipse.scout.rt.client.ui.form.fields.radiobuttongroup.AbstractRadioButtonGroup;
import org.eclipse.scout.rt.client.ui.form.fields.smartfield.AbstractSmartField;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.CancelButton;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.InstallDateField;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.InstallerNamesField;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.LightColorField;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.NicheSizeBox;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.NotesField;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.OkButton;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.OnAutomationBox;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.RunHoursField;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.SequenceCorrectBox;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.SerialField;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.TestSiteField;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.VoltageGroup;
import zodiac.zpt.client.equipment.lights.HanriInstallLogForm.MainBox.WaterIntrusionBox;
import zodiac.zpt.shared.equipment.lights.HanriInstallLogFormData;
import zodiac.zpt.shared.equipment.lights.HanriLightColorLookupCall;
import zodiac.zpt.shared.equipment.lights.IHanriInstallLogService;
import zodiac.zpt.shared.testsites.TestSitesLookupCall;

@FormData(value = HanriInstallLogFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class HanriInstallLogForm extends AbstractForm {

	private String hanrilightId;

	@FormData 
	public String getHanriLightId() {
	    return hanrilightId;
	}

	@FormData 
	public void setHanriLightId(String equipId) {
	    this.hanrilightId = equipId;
	}

	@Override
	public Object computeExclusiveKey() {               //compute exclusive hanrilightid key for derby db
	    return getHanriLightId();
	}

	@Override
	protected int getConfiguredDisplayHint() { 
	    return IForm.DISPLAY_HINT_VIEW;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("HanriLightInstallLog");
	}

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}

	public void startNew() {
		startInternal(new NewHandler());
	}

	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public TestSiteField getTestSiteField() {
		return getFieldByClass(TestSiteField.class);
	}

	public InstallDateField getInstallDateField() {
		return getFieldByClass(InstallDateField.class);
	}

	public InstallerNamesField getInstallerNamesField() {
		return getFieldByClass(InstallerNamesField.class);
	}

	public SerialField getSerialField() {
		return getFieldByClass(SerialField.class);
	}

	public RunHoursField getRunHoursField() {
		return getFieldByClass(RunHoursField.class);
	}

	public VoltageGroup getVoltageGroup() {
		return getFieldByClass(VoltageGroup.class);
	}

	public OnAutomationBox getOnAutomationBox() {
		return getFieldByClass(OnAutomationBox.class);
	}

	public LightColorField getLightColorField() {
		return getFieldByClass(LightColorField.class);
	}

	public SequenceCorrectBox getSequenceCorrectBox() {
		return getFieldByClass(SequenceCorrectBox.class);
	}

	public WaterIntrusionBox getWaterIntrusionBox() {
		return getFieldByClass(WaterIntrusionBox.class);
	}

	public NotesField getNotesField() {
		return getFieldByClass(NotesField.class);
	}

	public NicheSizeBox getNicheSizeBox() {
		return getFieldByClass(NicheSizeBox.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		//change back to smart field string
		@Order(1000)
		public class TestSiteField extends AbstractSmartField<String> {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("TestSite");
			}

			@Override
			protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
				return TestSitesLookupCall.class;
			}
		}

		
		@Order(2000)
		public class InstallDateField extends AbstractDateField {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("InstallDate");
			}
		}

		@Order(3000)
		public class InstallerNamesField extends AbstractStringField { //AbstractListBox<String> {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("InstallerNames");
			}
			
		/*	@Override
			protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
				return AssignedTechLookupCall.class;
			}
			
			@Override
			protected int getConfiguredGridH() {
				return 3;
			}*/
		}

		@Order(4000)
		public class SerialField extends AbstractStringField {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("Serial");
			}

			@Override
			protected int getConfiguredMaxLength() {
				return 128;
			}
		}

		@Order(5000)
		public class VoltageGroup extends AbstractRadioButtonGroup<String> {
			
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("Voltage");
			}

			@Order(1000)
			public class LowVButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "Low - 12V";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Low-12V");
				}
			}

			@Order(2000)
			public class HighVButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "High - 120V";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("High-120V");
				}
			}			
		}

		@Order(6000)
		public class NicheSizeBox extends AbstractRadioButtonGroup<String> {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("NicheSize");
			}

			@Order(1000)
			public class PoolSizeButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "PoolSize";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Pool");
				}
			}

			@Order(2000)
			public class SpaSizeButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "SpaSize";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Spa");
				}
			}
		}

		@Order(7000)
		public class OnAutomationBox extends AbstractRadioButtonGroup<String> {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("OnAutomation");
			}

			@Order(1000)
			public class YesAutomationButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "OnAuto";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Yes");
				}
			}

			@Order(2000)
			public class NoAutomationButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "NoAuto";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("No-SeeNotes");
				}
			}
		}

		@Order(8000)
		public class RunHoursField extends AbstractIntegerField {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("DailyRunHours");
			}

			@Override
			protected Integer getConfiguredMinValue() {
				return 0;
			}

			@Override
			protected Integer getConfiguredMaxValue() {
				return 24;
			}
		}

		@Order(9000)
		public class LightColorField extends AbstractSmartField<String> {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("ColorSetting");
			}

			@Override
			protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
				return HanriLightColorLookupCall.class;
			}
		}

		@Order(10000)
		public class SequenceCorrectBox extends AbstractRadioButtonGroup<String> {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("SyncSequence0");
			}

			@Order(1000)
			public class CorrectButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "SeqGood";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Working");
				}
			}

			@Order(2000)
			public class HasIssueButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "SeqBad";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("HasIssue");
				}
			}
		}

		@Order(11000)
		public class WaterIntrusionBox extends AbstractRadioButtonGroup<String> {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("WaterIntrusion");
			}

			@Order(1000)
			public class NoSignButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "NoIntrusion";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("NoSigns");
				}
			}

			@Order(2000)
			public class HasIssueButton extends AbstractRadioButton<String> {
				@Override
				protected String getConfiguredRadioValue() {
					return "YesIntrusion";
				}
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("HasIssue");
				}
			}
		}

		@Order(12000)
		public class NotesField extends AbstractStringField {
			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("InstallNotes");
			}

			@Override
			protected boolean getConfiguredMultilineText() {
				return true;
			}
			
			@Override
			protected int getConfiguredGridH() {
				return 3;
			}
		}
		
		

		@Order(100000)
		public class OkButton extends AbstractOkButton {
		}

		@Order(101000)
		public class CancelButton extends AbstractCancelButton {
		}
	}

	public class ModifyHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			IHanriInstallLogService service = BEANS.get(IHanriInstallLogService.class);
			HanriInstallLogFormData formData = new HanriInstallLogFormData();
			exportFormData(formData);
			formData = service.load(formData);
			importFormData(formData);

			getForm().setSubTitle(calculateSubTitle());
		}

		@Override
		protected void execStore() {
			IHanriInstallLogService service = BEANS.get(IHanriInstallLogService.class);
			HanriInstallLogFormData formData = new HanriInstallLogFormData();
			exportFormData(formData);
			service.store(formData);
		}
	}

	public class NewHandler extends AbstractFormHandler {

		@Override
		protected void execStore() {
			IHanriInstallLogService service = BEANS.get(IHanriInstallLogService.class);
			HanriInstallLogFormData formData = new HanriInstallLogFormData();
			exportFormData(formData);
			service.create(formData);
		}
	}
	
	private String calculateSubTitle() {
	    return (getTestSiteField().getValue());
	}
}
