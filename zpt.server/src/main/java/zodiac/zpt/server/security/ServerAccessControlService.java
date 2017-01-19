package zodiac.zpt.server.security;

import java.security.AllPermission;
import java.security.Permissions;

import zodiac.zpt.shared.security.AccessControlService;
import org.eclipse.scout.rt.platform.Replace;
import org.eclipse.scout.rt.shared.security.RemoteServiceAccessPermission;

/**
 * <h3>{@link AccessControlService}</h3>
 *
 * @author gagli
 */
@Replace
public class ServerAccessControlService extends AccessControlService {

	@Override
	protected Permissions execLoadPermissions(String userId) {
		Permissions permissions = new Permissions();
		permissions.add(new RemoteServiceAccessPermission("*.shared.*", "*"));

		// TODO [gagli]: Fill access control service
		permissions.add(new AllPermission());
		return permissions;
	}
}
