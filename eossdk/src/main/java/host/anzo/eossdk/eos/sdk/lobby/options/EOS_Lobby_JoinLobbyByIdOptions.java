package host.anzo.eossdk.eos.sdk.lobby.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_ProductUserId;
import host.anzo.eossdk.eos.sdk.presence.options.EOS_PresenceModification_SetJoinInfoOptions;
import host.anzo.eossdk.eos.sdk.sessions.options.EOS_Sessions_CreateSessionModificationOptions;
import host.anzo.eossdk.eos.sdk.sessions.options.EOS_Sessions_JoinSessionOptions;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/17/2023
 */
@FieldOrder({"ApiVersion", "LobbyId", "LocalUserId", "bPresenceEnabled", "LocalRTCOptions", "bCrossplayOptOut"})
public class EOS_Lobby_JoinLobbyByIdOptions extends Structure {
	public static final int EOS_LOBBY_JOINLOBBYBYID_API_LATEST = 2;

	/** API Version: Set this to EOS_LOBBY_JOINLOBBYBYID_API_LATEST. */
	public int ApiVersion;
	/** The ID of the lobby */
	public String LobbyId;
	/** The Product User ID of the local user joining the lobby */
	public EOS_ProductUserId LocalUserId;
	/** If true, this lobby will be associated with the user's presence information. A user can only associate one lobby at a time with their presence information.
	 * This affects the ability of the Social Overlay to show game related actions to take in the user's social graph.<br>
	 * <b>The Social Overlay can handle only one of the following three options at a time:</b>
	 * <ul>
	 * <li>using the bPresenceEnabled flags within the Sessions interface
	 * <li>using the bPresenceEnabled flags within the Lobby interface
	 * <li>using EOS_PresenceModification_SetJoinInfo
	 * </ul>
	 * @see EOS_PresenceModification_SetJoinInfoOptions
	 * @see EOS_Lobby_CreateLobbyOptions
	 * @see EOS_Lobby_JoinLobbyOptions
	 * @see EOS_Lobby_JoinLobbyByIdOptions
	 * @see EOS_Sessions_CreateSessionModificationOptions
	 * @see EOS_Sessions_JoinSessionOptions
	 */
	public int bPresenceEnabled;
	/**
	 * (Optional) Set this value to override the default local options for the RTC Room, if it is enabled for this lobby. Set this to NULL if
	 * your application does not use the Lobby RTC Rooms feature, or if you would like to use the default settings. This option is ignored if
	 * the specified lobby does not have an RTC Room enabled and will not cause errors.
	 */
	public EOS_Lobby_LocalRTCOptions.ByReference LocalRTCOptions;
	/**
	 * This value indicates whether or not the local user allows crossplay interactions. If it is false, the local user
	 * will be treated as allowing crossplay.
	 */
	public int bCrossplayOptOut;

	public EOS_Lobby_JoinLobbyByIdOptions() {
		super();
		ApiVersion = EOS_LOBBY_JOINLOBBYBYID_API_LATEST;
	}

	public EOS_Lobby_JoinLobbyByIdOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Lobby_JoinLobbyByIdOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Lobby_JoinLobbyByIdOptions implements Structure.ByValue {
	}
}

