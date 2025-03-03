package host.anzo.eossdk.eos.sdk.lobby.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_ProductUserId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_Lobby_DestroyLobby function.
 *
 * @author Anton Lasevich
 * @since 8/17/2023
 */
@FieldOrder({"ApiVersion", "LocalUserId", "LobbyId"})
public class EOS_Lobby_DestroyLobbyOptions extends Structure {
	public static final int EOS_LOBBY_DESTROYLOBBY_API_LATEST = 1;

	/** API Version: Set this to EOS_LOBBY_DESTROYLOBBY_API_LATEST. */
	public int ApiVersion;
	/** The Product User ID of the local user requesting destruction of the lobby; this user must currently own the lobby */
	public EOS_ProductUserId LocalUserId;
	/** The ID of the lobby to destroy */
	public String LobbyId;

	public EOS_Lobby_DestroyLobbyOptions() {
		super();
		ApiVersion = EOS_LOBBY_DESTROYLOBBY_API_LATEST;
	}

	public EOS_Lobby_DestroyLobbyOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Lobby_DestroyLobbyOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Lobby_DestroyLobbyOptions implements Structure.ByValue {
	}
}