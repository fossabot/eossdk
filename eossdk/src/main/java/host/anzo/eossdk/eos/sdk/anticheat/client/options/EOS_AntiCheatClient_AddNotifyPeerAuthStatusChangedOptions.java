package host.anzo.eossdk.eos.sdk.anticheat.client.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/15/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_AntiCheatClient_AddNotifyPeerAuthStatusChangedOptions extends Structure {
	public static final int EOS_ANTICHEATCLIENT_ADDNOTIFYPEERAUTHSTATUSCHANGED_API_LATEST = 1;

	/** API Version: Set this to EOS_ANTICHEATCLIENT_ADDNOTIFYPEERAUTHSTATUSCHANGED_API_LATEST. */
	public int ApiVersion;

	public EOS_AntiCheatClient_AddNotifyPeerAuthStatusChangedOptions() {
		super();
		ApiVersion = EOS_ANTICHEATCLIENT_ADDNOTIFYPEERAUTHSTATUSCHANGED_API_LATEST;
	}

	public EOS_AntiCheatClient_AddNotifyPeerAuthStatusChangedOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_AntiCheatClient_AddNotifyPeerAuthStatusChangedOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_AntiCheatClient_AddNotifyPeerAuthStatusChangedOptions implements Structure.ByValue {
	}
}
