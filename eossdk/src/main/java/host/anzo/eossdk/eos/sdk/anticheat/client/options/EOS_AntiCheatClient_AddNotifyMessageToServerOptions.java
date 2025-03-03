package host.anzo.eossdk.eos.sdk.anticheat.client.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/15/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_AntiCheatClient_AddNotifyMessageToServerOptions extends Structure {
	public int EOS_ANTICHEATCLIENT_ADDNOTIFYMESSAGETOSERVER_API_LATEST = 1;

	public int ApiVersion;

	public EOS_AntiCheatClient_AddNotifyMessageToServerOptions() {
		super();
		ApiVersion = EOS_ANTICHEATCLIENT_ADDNOTIFYMESSAGETOSERVER_API_LATEST;
	}

	public EOS_AntiCheatClient_AddNotifyMessageToServerOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_AntiCheatClient_AddNotifyMessageToServerOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_AntiCheatClient_AddNotifyMessageToServerOptions implements Structure.ByValue {
	}
}
