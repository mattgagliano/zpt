package zodiac.zpt.client.common;

import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

import zodiac.zpt.client.common.PictureUrlForm.MainBox.CancelButton;
import zodiac.zpt.client.common.PictureUrlForm.MainBox.OkButton;
import zodiac.zpt.client.common.PictureUrlForm.MainBox.UrlBox;
import zodiac.zpt.client.common.PictureUrlForm.MainBox.UrlBox.UrlField;

public class PictureUrlForm extends AbstractForm {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("PictureURL");
	}

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}
	
	public UrlField getUrlField() {
		return getFieldByClass(UrlField.class);
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

	public UrlBox getUrlBox() {
		return getFieldByClass(UrlBox.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(1000)
		public class UrlBox extends AbstractGroupBox {

			@Order(1000)
			public class UrlField extends AbstractStringField {
				
				@Override
				protected boolean getConfiguredLabelVisible() {
					return false;
				}
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
		}

		@Override
		protected void execStore() {
		}
	}

	public class NewHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
		}

		@Override
		protected void execStore() {
		}
	}
}
