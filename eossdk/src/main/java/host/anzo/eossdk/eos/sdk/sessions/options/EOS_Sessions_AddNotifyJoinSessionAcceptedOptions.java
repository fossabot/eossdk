package host.anzo.eossdk.eos.sdk.sessions.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_Sessions_AddNotifyJoinSessionAccepted function.
 *
 * @author Anton Lasevich
 * @since 9/7/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_Sessions_AddNotifyJoinSessionAcceptedOptions extends Structure {
	public static final int EOS_SESSIONS_ADDNOTIFYJOINSESSIONACCEPTED_API_LATEST = 1;

	/** API Version: Set this to EOS_SESSIONS_ADDNOTIFYJOINSESSIONACCEPTED_API_LATEST. */
	public int ApiVersion;

	public EOS_Sessions_AddNotifyJoinSessionAcceptedOptions() {
		super();
		ApiVersion = EOS_SESSIONS_ADDNOTIFYJOINSESSIONACCEPTED_API_LATEST;
	}

	public EOS_Sessions_AddNotifyJoinSessionAcceptedOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Sessions_AddNotifyJoinSessionAcceptedOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Sessions_AddNotifyJoinSessionAcceptedOptions implements Structure.ByValue {
	}
}