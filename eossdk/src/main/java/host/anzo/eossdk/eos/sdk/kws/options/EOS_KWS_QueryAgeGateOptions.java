package host.anzo.eossdk.eos.sdk.kws.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_KWS_QueryAgeGate function.
 *
 * @author Anton Lasevich
 * @since 8/21/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_KWS_QueryAgeGateOptions extends Structure {
	public static final int EOS_KWS_QUERYAGEGATE_API_LATEST = 1;

	/** API Version: Set this to EOS_KWS_QUERYAGEGATE_API_LATEST. */
	public int ApiVersion;

	public EOS_KWS_QueryAgeGateOptions() {
		super();
		ApiVersion = EOS_KWS_QUERYAGEGATE_API_LATEST;
	}

	public EOS_KWS_QueryAgeGateOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_KWS_QueryAgeGateOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_KWS_QueryAgeGateOptions implements Structure.ByValue {
	}
}