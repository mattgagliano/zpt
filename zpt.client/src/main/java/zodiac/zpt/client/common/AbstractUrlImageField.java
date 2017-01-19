package zodiac.zpt.client.common;

import java.net.URL;

import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.form.fields.imagefield.AbstractImageField;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.status.IStatus;
import org.eclipse.scout.rt.platform.status.Status;
import org.eclipse.scout.rt.platform.util.IOUtility;
import org.eclipse.scout.rt.platform.util.StringUtility;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.shared.common.AbstractUrlImageFieldData;


@FormData(value = AbstractUrlImageFieldData.class,
		sdkCommand = FormData.SdkCommand.CREATE,
		defaultSubtypeSdkCommand = FormData.DefaultSubtypeSdkCommand.CREATE)
public class AbstractUrlImageField extends AbstractImageField {

	private String url;
	
	@FormData
	public String getUrl() {
		return url;
	}
	
	@FormData
	public void setUrl(String url) {
		this.url = url;
		updateImage();
	}
	
	@Override
	protected boolean getConfiguredLabelVisible() {
		return false;
	}
	
	@Override 
	protected int getConfiguredGridH() {
		return 5;
	}

	@Order(1000)
	public class EditURLMenu extends AbstractMenu {
		@Override
		protected String getConfiguredText() {
			return TEXTS.get("EditURL");
		}

		@Override
		protected void execAction() {
			PictureUrlForm form = new PictureUrlForm();
			String oldUrl = getUrl();
			
			if (StringUtility.hasText(oldUrl)) {
				form.getUrlField().parseAndSetValue(oldUrl);
			}
			
			form.startModify();
			form.waitFor();
			
			if (form.isFormStored()) {
				setUrl(form.getUrlField().getValue());
			}
		}
	}
	
	
	
	protected void updateImage() {
		clearErrorStatus();
		
		if (url == null) {
			setImage(null);		
		}
		else{
			try {
				setImage(IOUtility.readFromUrl(new URL((String) url)));
				setAutoFit(true);
			}
			catch (Exception e) {
				addErrorStatus(new Status(TEXTS.get("FailedToACcessImageFromUrl"), IStatus.WARNING));
			}			
		}
	}
}
