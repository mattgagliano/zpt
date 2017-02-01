package zodiac.zpt.client.testsites;

import java.util.regex.Pattern;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.client.ui.form.fields.booleanfield.AbstractBooleanField;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractRadioButton;
import org.eclipse.scout.rt.client.ui.form.fields.datefield.AbstractDateField;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.integerfield.AbstractIntegerField;
import org.eclipse.scout.rt.client.ui.form.fields.radiobuttongroup.AbstractRadioButtonGroup;
import org.eclipse.scout.rt.client.ui.form.fields.sequencebox.AbstractSequenceBox;
import org.eclipse.scout.rt.client.ui.form.fields.smartfield.AbstractSmartField;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.client.ui.form.fields.tabbox.AbstractTabBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.util.StringUtility;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.lookup.ILookupCall;

import zodiac.zpt.client.common.AbstractUrlImageField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.AutomationBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.AutomationBox.AutomationNotesField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.AutomationBox.AutomationType;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.AutomationBox.HasAutomation;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.AutomationBox.HasIAqualink;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.AutomationBox.IAqualinkDeviceNumber;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.CleanerNotesField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.HasInfloors;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.PressureType;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.ReferenceTypeBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.ReferenceTypeBox.PressureRefField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.ReferenceTypeBox.RoboticRefField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.ReferenceTypeBox.SuctionRefField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.CleanerInfoBox.SuctionType;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.HeaterInfoBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.HeaterInfoBox.GasType;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.HeaterInfoBox.HasSolar;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.HeaterInfoBox.HeaterNotesField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.NotesBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.NotesBox.SiteNotesField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.EqAboveBelowWater;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.EqIndoorOutdoor;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.MarketingPoolGroup;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.PoolDimensionsField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.PoolFinishField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.PoolLayoutField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.PoolNotesField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.PoolShapeField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.PoolVolumeField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.BottomHalfBox.PoolInfoBox.ServiceContactField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.CancelButton;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.OkButton;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.PictureTabBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.PictureTabBox.EquipPicBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.PictureTabBox.EquipPicBox.EquipPicField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.PictureTabBox.PoolPicBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.PictureTabBox.PoolPicBox.PoolPicField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.AddressBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.AddressBox.CityStZipBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.AddressBox.CityStZipBox.CityField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.AddressBox.CityStZipBox.StateZipBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.AddressBox.CityStZipBox.StateZipBox.StateField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.AddressBox.CityStZipBox.StateZipBox.ZIPField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.AddressBox.StreetField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.NameBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.NameBox.FirstNameField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.NameBox.LastNameField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.PhoneEmailBox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.PhoneEmailBox.EmailField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.PhoneEmailBox.PhoneField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.TechNDABox;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.TechNDABox.AssignedTechField;
import zodiac.zpt.client.testsites.TestSiteForm.MainBox.TopHalfBox.TopInfoBox.TechNDABox.NDAIssueDateField;
import zodiac.zpt.shared.testsites.AssignedTechLookupCall;
import zodiac.zpt.shared.testsites.ITestSiteService;
import zodiac.zpt.shared.testsites.PoolFinishLookupCall;
import zodiac.zpt.shared.testsites.PoolLayoutLookupCall;
import zodiac.zpt.shared.testsites.TestSiteFormData;
import zodiac.zpt.shared.testsites.USStateCodesLookupCall;

@FormData(value = TestSiteFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class TestSiteForm extends AbstractForm {
	
private String siteId;
	
	@FormData
	public String getSiteId() {
		return siteId;
	}

	@FormData
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	
	@Override
	public Object computeExclusiveKey() {
		return siteId;
	}
	
	@Override
	protected int getConfiguredDisplayHint() {
		return IForm.DISPLAY_HINT_VIEW;
	}
	
	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("TestSite");
	}

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}

	public void startNew() {
		startInternal(new NewHandler());
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}
	
	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}
	
	public TopHalfBox getTopHalfBox() {
		return getFieldByClass(TopHalfBox.class);
	}

	public PoolPicBox getPoolPicBox() {
		return getFieldByClass(PoolPicBox.class);
	}

	public TopInfoBox getTopInfoBox() {
		return getFieldByClass(TopInfoBox.class);
	}

	public CityStZipBox getCityStZipBox() {
		return getFieldByClass(CityStZipBox.class);
	}

	public StateZipBox getStateZipBox() {
		return getFieldByClass(StateZipBox.class);
	}

	public PhoneEmailBox getPhoneEmailBox() {
		return getFieldByClass(PhoneEmailBox.class);
	}

	public TechNDABox getTechNDABox() {
		return getFieldByClass(TechNDABox.class);
	}

	public BottomHalfBox getBottomHalfBox() {
		return getFieldByClass(BottomHalfBox.class);
	}

	public PoolInfoBox getPoolInfoBox() {
		return getFieldByClass(PoolInfoBox.class);
	}

	public NotesBox getEqInfoBox() {
		return getFieldByClass(NotesBox.class);
	}

	public PoolPicField getPoolPicField() {
		return getFieldByClass(PoolPicField.class);
	}
	
	public LastNameField getLastNameField() {
		return getFieldByClass(LastNameField.class);
	}

	public FirstNameField getFirstNameField() {
		return getFieldByClass(FirstNameField.class);
	}

	public StreetField getStreetField() {
		return getFieldByClass(StreetField.class);
	}

	public CityField getCityField() {
		return getFieldByClass(CityField.class);
	}

	public StateField getStateField() {
		return getFieldByClass(StateField.class);
	}

	public ZIPField getZIPField() {
		return getFieldByClass(ZIPField.class);
	}

	public PhoneField getPhoneField() {
		return getFieldByClass(PhoneField.class);
	}

	public EmailField getEmailField() {
		return getFieldByClass(EmailField.class);
	}

	public AssignedTechField getAssignedTechField() {
		return getFieldByClass(AssignedTechField.class);
	}

	public AddressBox getAddressBox() {
		return getFieldByClass(AddressBox.class);
	}

	public PoolLayoutField getPoolLayoutField() {
		return getFieldByClass(PoolLayoutField.class);
	}

	public PoolVolumeField getPoolVolumeField() {
		return getFieldByClass(PoolVolumeField.class);
	}

	public PoolShapeField getPoolShapeField() {
		return getFieldByClass(PoolShapeField.class);
	}

	public PoolDimensionsField getPoolDimensionsField() {
		return getFieldByClass(PoolDimensionsField.class);
	}

	public PoolFinishField getPoolFinishField() {
		return getFieldByClass(PoolFinishField.class);
	}
	
	public MarketingPoolGroup getMarketingPoolGroup() {
		return getFieldByClass(MarketingPoolGroup.class);
	}

	public ServiceContactField getPoolServiceNotesField() {
		return getFieldByClass(ServiceContactField.class);
	}

	public PoolNotesField getPoolNotesField() {
		return getFieldByClass(PoolNotesField.class);
	}

	public CleanerInfoBox getEquipInfoBox() {
		return getFieldByClass(CleanerInfoBox.class);
	}

	public EqIndoorOutdoor getEqIndoorOutdoorBox() {
		return getFieldByClass(EqIndoorOutdoor.class);
	}

	public EqAboveBelowWater getEqAboveBelowWaterBox() {
		return getFieldByClass(EqAboveBelowWater.class);
	}

	public HasInfloors getHasInfloorsBox() {
		return getFieldByClass(HasInfloors.class);
	}

	public HasSolar getHasSolarBox() {
		return getFieldByClass(HasSolar.class);
	}

	public GasType getGasTypeBox() {
		return getFieldByClass(GasType.class);
	}

	public SuctionType getSuctionCleanerBox() {
		return getFieldByClass(SuctionType.class);
	}

	public PressureType getPressureTypeBox() {
		return getFieldByClass(PressureType.class);
	}

	public ReferenceTypeBox getReferenceTypeBox() {
		return getFieldByClass(ReferenceTypeBox.class);
	}

	public PressureRefField getPressureRefField() {
		return getFieldByClass(PressureRefField.class);
	}

	public RoboticRefField getRoboticRefField() {
		return getFieldByClass(RoboticRefField.class);
	}

	public SuctionRefField getSuctionField() {
		return getFieldByClass(SuctionRefField.class);
	}

	public CleanerNotesField getCleanerNotesField() {
		return getFieldByClass(CleanerNotesField.class);
	}

	public HeaterInfoBox getHeaterInfoBox() {
		return getFieldByClass(HeaterInfoBox.class);
	}

	public HeaterNotesField getHeaterNotesField() {
		return getFieldByClass(HeaterNotesField.class);
	}

	public SiteNotesField getSiteNotesField() {
		return getFieldByClass(SiteNotesField.class);
	}

	public AutomationBox getAutomationBox() {
		return getFieldByClass(AutomationBox.class);
	}

	public HasAutomation getHasAutomationBox() {
		return getFieldByClass(HasAutomation.class);
	}

	public AutomationType getAutomationTypeBox() {
		return getFieldByClass(AutomationType.class);
	}

	public HasIAqualink getHasIaqualinkBox() {
		return getFieldByClass(HasIAqualink.class);
	}

	public IAqualinkDeviceNumber getIaqualinkDevNumField() {
		return getFieldByClass(IAqualinkDeviceNumber.class);
	}

	public AutomationNotesField getAutomationNotesField() {
		return getFieldByClass(AutomationNotesField.class);
	}

	public PictureTabBox getPictureTabBox() {
		return getFieldByClass(PictureTabBox.class);
	}

	public EquipPicBox getEquipPictureBox() {
		return getFieldByClass(EquipPicBox.class);
	}

	public EquipPicField getEquipPicField() {
		return getFieldByClass(EquipPicField.class);
	}

	public NDAIssueDateField getNDAIssueDateField() {
		return getFieldByClass(NDAIssueDateField.class);
	}

	public NameBox getNameBox() {
		return getFieldByClass(NameBox.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}
	
	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(0)
		public class TopHalfBox extends AbstractGroupBox {
			
			@Override
	        protected int getConfiguredGridH() {
				return 5;
	        }
			
			@Override
	        protected int getConfiguredGridW() { 
	        	return 2;
	        }
	        
	        @Override
	        protected int getConfiguredGridColumnCount() { 
	        	return 3;
	        }

			@Order(0)
			public class PictureTabBox extends AbstractTabBox {			
	        
				@Override
		        protected int getConfiguredGridH() {
					return 5;
		        }
				
		        @Override
		        protected int getConfiguredGridW() { 
		        	return 1;
		        }
		        
				@Order(1000)
				public class PoolPicBox extends AbstractGroupBox {
			        
					@Override
			        protected int getConfiguredGridColumnCount() { 
			        	return 1;
			        }
					
			        @Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PoolPicture");
					}
	
					@Order(1000)
					public class PoolPicField extends AbstractUrlImageField {
					}		
				}

				@Order(2000)
				public class EquipPicBox extends AbstractGroupBox {
					
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("EquipSet");
					}
					
					@Override
			        protected int getConfiguredGridColumnCount() { 
			        	return 1;
			        }

					@Order(1000)
					public class EquipPicField extends AbstractUrlImageField {
					}
				}
			}
			
			@Order(2000)
			public class TopInfoBox extends AbstractGroupBox {
				
				@Override
		        protected int getConfiguredGridH() {
					return 5;
		        }
				
				@Override
				protected int getConfiguredGridW() { 
					return 2;
				}

		        @Override
		        protected int getConfiguredGridColumnCount() { 
		        	return 2;
		        }

				@Order(1000)
				public class NameBox extends AbstractSequenceBox {
									
					@Override
					protected int getConfiguredGridW() { 
						return 2;
					}
					
					@Override
					protected int getConfiguredGridH() { 
						return 1;
					}
					
					@Override
		            protected boolean getConfiguredAutoCheckFromTo() { 
						return false;
		            }
					
					@Order(1000)
					public class LastNameField extends AbstractStringField {
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("LastName");
						}
					}

					@Order(2000)
					public class FirstNameField extends AbstractStringField {
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("FirstName");
						}
					}
				}

				@Order(1500)
				public class AddressBox extends AbstractGroupBox {
					
					@Override
					protected int getConfiguredGridH() { 
						return 2;
					}
	
					@Override
					protected int getConfiguredGridW() { 
						return 2;
					}
								
					@Order(2000)
					public class StreetField extends AbstractStringField {
						
						@Override
						protected int getConfiguredGridW() { 
							return 2;
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Address");
						}
					}
				
					@Order(3000)
					public class CityStZipBox extends AbstractSequenceBox {
						
						@Override
						protected int getConfiguredGridH() { 
							return 1;
						}
		
						@Override
						protected int getConfiguredGridW() { 
							return 2;
						}
						
						@Override
			            protected boolean getConfiguredAutoCheckFromTo() { 
							return false;
			            }
						
						@Order(0)
						public class CityField extends AbstractStringField {
							
							@Override
							protected String getConfiguredLabel() {
								return TEXTS.get("City");
							}
							
							@Override
				            protected int getConfiguredLabelPosition() {
				                return LABEL_POSITION_ON_FIELD; 
				            }
						}
		
						@Order(1000)
						public class StateZipBox extends AbstractSequenceBox {
		
							@Override
							protected int getConfiguredGridH() { 
								return 1;
							}
			
							@Override
							protected int getConfiguredGridW() { 
								return 1;
							}
							
							@Override
				            protected boolean getConfiguredAutoCheckFromTo() { 
								return false;
				            }
							
							@Order(1000)
							public class StateField extends AbstractSmartField<String> {
								
								@Override
								protected String getConfiguredLabel() {
									return TEXTS.get("State");
								}
								
								@Override
					            protected int getConfiguredLabelPosition() {
					                return LABEL_POSITION_ON_FIELD; 
					            }
								
								@Override
								protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
									return USStateCodesLookupCall.class;
								}
							}
		
							@Order(2000)
							public class ZIPField extends AbstractIntegerField {
								
								@Override
								protected String getConfiguredLabel() {
									return TEXTS.get("ZIP");
								}
								
								@Override
					            protected int getConfiguredLabelPosition() {
					                return LABEL_POSITION_ON_FIELD; 
					            }
								
								@Override
								protected Integer getConfiguredMinValue() {
									return 11111;
								}
		
								@Override
								protected Integer getConfiguredMaxValue() {
									return 99999;
								}
							}
						}
					}
				}
				
				@Order(4000)
				public class PhoneEmailBox extends AbstractSequenceBox {
	
					@Override
					protected int getConfiguredGridH() { 
						return 1;
					}
	
					@Override
					protected int getConfiguredGridW() { 
						return 2;
					}
					
					@Override
		            protected boolean getConfiguredAutoCheckFromTo() { 
						return false;
		            }
					
					@Order(1000)
					public class EmailField extends AbstractStringField {
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("EmailAddress");
						}
						
						private static final String EMAIL_PATTERN = 
					              "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
					                  "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

					    @Override 
					    protected int getConfiguredMaxLength() {
					    	return 64;
					    }

					    @Override 
					    protected String execValidateValue(String rawValue) {
					    	if (rawValue != null && !Pattern.matches(EMAIL_PATTERN, rawValue)) {
					    		throw new VetoException(TEXTS.get("BadEmailAddress")); 
					        }

					        return rawValue; 
					    }
					}
					
					@Order(2000)
					public class PhoneField extends AbstractStringField {
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("PhoneNumber");
						}
					}
				}
	
				@Order(5000)
				public class TechNDABox extends AbstractSequenceBox {
	
					@Override
					protected int getConfiguredGridH() { 
						return 1;
					}
	
					@Override
					protected int getConfiguredGridW() { 
						return 2;
					}
					
					@Override
		            protected boolean getConfiguredAutoCheckFromTo() { 
						return false;
		            }
					
					@Order(1000)
					public class AssignedTechField extends AbstractSmartField<String> {
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("AssignedTech");
						}
									
						@Override
						protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
							return AssignedTechLookupCall.class;
						}
					}
	
					@Order(2000)
					public class NDAIssueDateField extends AbstractDateField {
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("NDAIssueDate");
						}
					}
				}
			}
		}
		
		@Order(500)
		public class BottomHalfBox extends AbstractTabBox {
			
			@Override
			protected int getConfiguredGridH() {
				return 8;
			}

			@Order(1000)
			public class PoolInfoBox extends AbstractGroupBox {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("GeneralPoolInfo");
				}
				
				@Order(1000)
				public class PoolLayoutField extends AbstractSmartField<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PoolLayout");
					}
					
					@Override
					protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
					    return PoolLayoutLookupCall.class;
					}
				}

				@Order(2000)
				public class PoolVolumeField extends AbstractIntegerField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PoolVolume");
					}

					@Override
					protected Integer getConfiguredMinValue() {
						return 0;
					}

					@Override
					protected Integer getConfiguredMaxValue() {
						return 999999;
					}
				}

				@Order(3000)
				public class PoolShapeField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PoolShape");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(4000)
				public class PoolDimensionsField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PoolDimensions");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(5000)
				public class PoolFinishField extends AbstractSmartField<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PoolFinish");
					}
					
					@Override
					protected Class<? extends ILookupCall<String>> getConfiguredLookupCall() {
					    return PoolFinishLookupCall.class;
					}
				}

				@Order(5500)		
				public class MarketingPoolGroup extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("MarketingPool");
					}

					@Order(1000)
					public class YesButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Yes";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Yes");
						}
					}

					@Order(2000)
					public class NoButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "No";
						}
										
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("No");
						}
					}
				}
				
				@Order(5600)
				public class EqIndoorOutdoor extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("EquipmentLocation");
					}
				
					@Order(2000)
					public class IndoorButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Indoors";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Indoors");
						}
					}
	
					@Order(3000)
					public class OutdoorButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Outdoors";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Outdoors");
						}
					}
				}

				@Order(5700)
				public class EqAboveBelowWater extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("EquipmentLevel");
					}

					@Order(1000)
					public class AboveWaterButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "AboveWater";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("AboveWater");
						}
					}

					@Order(2000)
					public class BelowWaterButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "BelowWater";
						}
										
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("BelowWater");
						}
					}
				}

				@Order(6000)
				public class ServiceContactField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PoolServiceContact");
					}

					@Override
					protected boolean getConfiguredMultilineText() {
						return true;
					}
					
					@Override
					protected int getConfiguredGridH() {
						return 2;
					}
					
					@Override
					protected int getConfiguredLabelPosition() {
						return LABEL_POSITION_TOP;
					}
				}

				@Order(7000)
				public class PoolNotesField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("AccessInfoAndNotes");
					}

					@Override
					protected boolean getConfiguredMultilineText() {
						return true;
					}
					
					@Override
					protected int getConfiguredGridH() {
						return 6;
					}
					
					@Override
					protected int getConfiguredLabelPosition() {
						return LABEL_POSITION_TOP;
					}
				}
			}

			@Order(1250)
			public class AutomationBox extends AbstractGroupBox {
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("AutomationInfo");
				}

				@Order(1000)
				public class HasAutomation extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("HasAutomation");
					}

					@Order(1000)
					public class JandyButton extends AbstractRadioButton<String> {

						@Override
						protected String getConfiguredRadioValue() {
							return "Jandy";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Jandy");
						}
					}

					@Order(2000)
					public class NonJandyButton extends AbstractRadioButton<String> {

						@Override
						protected String getConfiguredRadioValue() {
							return "Non-Jandy";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Non-Jandy");
						}
					}

					@Order(3000)
					public class NoneButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "None";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("None");
						}
					}
				}

				@Order(2000)
				public class AutomationType extends AbstractRadioButtonGroup<String> {

					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("AutomationType");
					}

					@Order(1000)
					public class InfinityButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Infinity";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Infinity");
						}
					}

					@Order(2000)
					public class PDAButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "PDA";
						}
										
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("PDA");
						}
					}

					@Order(3000)
					public class RSButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "RS";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("RS");
						}
					}

					@Order(4000)
					public class Z4Button extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Z4";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Z4");
						}
					}
				}

				@Order(3000)
				public class HasIAqualink extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("HasIAqualink");
					}

					@Order(1000)
					public class YesButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Yes";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Yes");
						}
					}

					@Order(2000)
					public class NoButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "No";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("No");
						}
					}
				}

				@Order(4000)
				public class IAqualinkDeviceNumber extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("IAqualinkDevice");
					}

					@Override
					protected int getConfiguredMaxLength() {
						return 128;
					}
				}

				@Order(5000)
				public class AutomationNotesField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Notes");
					}

					@Override
					protected int getConfiguredLabelPosition() {
						return LABEL_POSITION_TOP;
					}
					
					@Override
					protected boolean getConfiguredMultilineText() {
						return true;
					}
					
					@Override 
					protected int getConfiguredGridH() {
						return 8;
					}
				}
			}

			@Order(1500)
			public class CleanerInfoBox extends AbstractGroupBox {
				
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("CleanerInfo");
				}

				@Order(3000)
				public class HasInfloors extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("HasInfloorCleaners");
					}

					@Order(1000)
					public class YesButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Yes";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Yes");
						}
					}

					@Order(2000)
					public class NoButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "No";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("No");
						}
					}
				}

				@Order(3281)
				public class PressureType extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("PressureType");
					}

					@Order(1000)
					public class BoosterPumpButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "BoosterPump";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("BoosterPump");
						}
					}

					@Order(2000)
					public class NoBoosterButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "NoBooster";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("NoBooster");
						}
					}

					@Order(3000)
					public class NoneButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "None";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("None");
						}
					}
				}
				
				@Order(3375)
				public class SuctionType extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("SuctionType");
					}

					@Order(1000)
					public class DedicatedLineButton extends AbstractRadioButton<String> {
						
						@Override
						protected String getConfiguredRadioValue() {
							return "Dedicated";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("DedicatedLine");
						}
					}

					@Order(2000)
					public class ThruSkimmerButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "ThruSkimmer";
						}
										
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("ThroughSkimmer");
						}
					}
				}

				@Order(3437)
				public class ReferenceTypeBox extends AbstractSequenceBox {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("ReferencePoolType");
					}
					
					@Override
		            protected boolean getConfiguredAutoCheckFromTo() { 
						return false;
		            }

					@Order(1000)
					public class PressureRefField extends AbstractBooleanField {
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Pressure");
						}
					}

					@Order(2000)
					public class RoboticRefField extends AbstractBooleanField {
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Robotic");
						}
					}

					@Order(3000)
					public class SuctionRefField extends AbstractBooleanField {
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Suction");
						}
					}
				}

				@Order(3468)
				public class CleanerNotesField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Notes");
					}
					
					@Override 
					protected int getConfiguredGridH() {
						return 8;
					}

					@Override
					protected boolean getConfiguredMultilineText() {
						return true;
					}
					
					@Override
					protected int getConfiguredLabelPosition() {
						return LABEL_POSITION_TOP;
					}
				}
			}

			@Order(1750)
			public class HeaterInfoBox extends AbstractGroupBox {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("HeaterInfo");
				}
				

				@Order(3500)
				public class HasSolar extends AbstractRadioButtonGroup<String> {
					
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("HasSolarHeat");
					}
					
					@Order(1000)
					public class YesButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Yes";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Yes");
						}
					}

					@Order(2000)
					public class NoButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "No";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("No");
						}
					}
				}

				@Order(3750)
				public class GasType extends AbstractRadioButtonGroup<String> {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("GasType");
					}

					@Order(1000)
					public class NaturalGasButton extends AbstractRadioButton<String> {
						
						@Override
						protected String getConfiguredRadioValue() {
							return "NaturalGas";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("NaturalGas");
						}
					}

					@Order(2000)
					public class PropaneButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "Propane";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("Propane");
						}
					}

					@Order(3000)
					public class NoneButton extends AbstractRadioButton<String> {
						@Override
						protected String getConfiguredRadioValue() {
							return "NoGas";
						}
						
						@Override
						protected String getConfiguredLabel() {
							return TEXTS.get("None");
						}
					}
				}

				@Order(5000)
				public class HeaterNotesField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("Notes");
					}

					@Override 
					protected int getConfiguredGridH() {
						return 8;
					}

					@Override
					protected boolean getConfiguredMultilineText() {
						return true;
					}
					
					@Override
					protected int getConfiguredLabelPosition() {
						return LABEL_POSITION_TOP;
					}
				}
			}
			
			@Order(2000)
			public class NotesBox extends AbstractGroupBox {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Notes");
				}

				@Order(1000)
				public class SiteNotesField extends AbstractStringField {
					@Override
					protected String getConfiguredLabel() {
						return TEXTS.get("OtherNotes");
					}

					@Override
					protected int getConfiguredGridH() {
						return 8;
					}
					
					@Override
					protected boolean getConfiguredMultilineText() {
						return true;
					}
					
					@Override
					protected int getConfiguredLabelPosition() {
						return LABEL_POSITION_TOP;
					}
				}
			}
		}
		
		@Order(1000)
		public class OkButton extends AbstractOkButton {
		}

		@Order(1000)
		public class CancelButton extends AbstractCancelButton {
		}	
	}
	
	public class ModifyHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			ITestSiteService service = BEANS.get(ITestSiteService.class);
			TestSiteFormData formData = new TestSiteFormData();
			exportFormData(formData);
			formData = service.load(formData);
			importFormData(formData);
			
			getForm().setSubTitle(calculateSubTitle());
		}

		@Override
		protected void execStore() {
			ITestSiteService service = BEANS.get(ITestSiteService.class);
			TestSiteFormData formData = new TestSiteFormData();
			exportFormData(formData);
			service.store(formData);
		}
	}

	public class NewHandler extends AbstractFormHandler {

		@Override
		protected void execStore() {
			ITestSiteService service = BEANS.get(ITestSiteService.class);
			TestSiteFormData formData = new TestSiteFormData();
			exportFormData(formData);
			service.create(formData);
		}
	}
	
	private String calculateSubTitle() {
	    return StringUtility.join(" ", getFirstNameField().getValue(),
	        getLastNameField().getValue());
	}
}