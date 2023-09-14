package host.anzo.eossdk.eos.sdk.lobby.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/19/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_Lobby_AddNotifyLobbyInviteReceivedOptions extends Structure {
	public static final int EOS_LOBBY_ADDNOTIFYLOBBYINVITERECEIVED_API_LATEST = 1;

	/** API Version: Set this to EOS_LOBBY_ADDNOTIFYLOBBYINVITERECEIVED_API_LATEST. */
	public int ApiVersion;

	public EOS_Lobby_AddNotifyLobbyInviteReceivedOptions() {
		super();
		ApiVersion = EOS_LOBBY_ADDNOTIFYLOBBYINVITERECEIVED_API_LATEST;
	}

	public EOS_Lobby_AddNotifyLobbyInviteReceivedOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Lobby_AddNotifyLobbyInviteReceivedOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Lobby_AddNotifyLobbyInviteReceivedOptions implements Structure.ByValue {
	}
}