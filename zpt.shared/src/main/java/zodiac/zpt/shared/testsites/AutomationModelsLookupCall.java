package zodiac.zpt.shared.testsites;

import org.eclipse.scout.rt.shared.services.lookup.ILookupService;
import org.eclipse.scout.rt.shared.services.lookup.LookupCall;

public class AutomationModelsLookupCall extends LookupCall<String> {

	private static final long serialVersionUID = 1L;

	@Override
	protected Class<? extends ILookupService<String>> getConfiguredService() {
		return IAutomationModelsLookupService.class;
	}
}
