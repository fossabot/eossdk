package host.anzo.eossdk.eos.sdk.sessions.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_ActiveSession_CopyInfo function.
 *
 * @author Anton Lasevich
 * @since 9/6/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_ActiveSession_CopyInfoOptions extends Structure {
	/** The most recent version of the EOS_ActiveSession_CopyInfo function. */
	public static final int EOS_ACTIVESESSION_COPYINFO_API_LATEST = 1;

	/** API Version: Set this to EOS_ACTIVESESSION_COPYINFO_API_LATEST. */
	public int ApiVersion;

	public EOS_ActiveSession_CopyInfoOptions() {
		super();
		ApiVersion = EOS_ACTIVESESSION_COPYINFO_API_LATEST;
	}

	public EOS_ActiveSession_CopyInfoOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_ActiveSession_CopyInfoOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_ActiveSession_CopyInfoOptions implements Structure.ByValue {
	}
}