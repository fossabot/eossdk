package host.anzo.eossdk.eos.sdk.sessions.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_Sessions_DestroySession function.
 *
 * @author Anton Lasevich
 * @since 9/7/2023
 */
@FieldOrder({"ApiVersion", "SessionName"})
public class EOS_Sessions_DestroySessionOptions extends Structure {
	public static final int EOS_SESSIONS_DESTROYSESSION_API_LATEST = 1;

	/** API Version: Set this to EOS_SESSIONS_DESTROYSESSION_API_LATEST. */
	public int ApiVersion;
	/** Name of the session to destroy */
	public String SessionName;

	public EOS_Sessions_DestroySessionOptions() {
		super();
		ApiVersion = EOS_SESSIONS_DESTROYSESSION_API_LATEST;
	}

	public EOS_Sessions_DestroySessionOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Sessions_DestroySessionOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Sessions_DestroySessionOptions implements Structure.ByValue {
	}
}
