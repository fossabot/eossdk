package host.anzo.eossdk.eos.sdk.lobby.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_LobbyDetails_GetLobbyOwner function.
 *
 * @author Anton Lasevich
 * @since 8/16/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_LobbyDetails_GetLobbyOwnerOptions extends Structure {
	public static final int EOS_LOBBYDETAILS_GETLOBBYOWNER_API_LATEST = 1;

	/** API Version: Set this to EOS_LOBBYDETAILS_GETLOBBYOWNER_API_LATEST. */
	public int ApiVersion;

	public EOS_LobbyDetails_GetLobbyOwnerOptions() {
		super();
		ApiVersion = EOS_LOBBYDETAILS_GETLOBBYOWNER_API_LATEST;
	}

	public EOS_LobbyDetails_GetLobbyOwnerOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_LobbyDetails_GetLobbyOwnerOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_LobbyDetails_GetLobbyOwnerOptions implements Structure.ByValue {
	}
}