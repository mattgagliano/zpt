package zodiac.zpt.shared.testsites;

import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.lookup.ILookupService;

@TunnelToServer
public interface IAutomationModelsLookupService extends ILookupService<String> {
}
