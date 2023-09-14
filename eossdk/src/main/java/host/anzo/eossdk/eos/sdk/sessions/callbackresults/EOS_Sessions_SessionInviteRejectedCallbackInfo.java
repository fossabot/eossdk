package host.anzo.eossdk.eos.sdk.sessions.callbackresults;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_ProductUserId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Output parameters for the EOS_Sessions_OnSessionInviteRejectedCallback function.
 *
 * @author Anton Lasevich
 * @since 9/7/2023
 */
@FieldOrder({"ClientData", "InviteId", "LocalUserId", "TargetUserId", "SessionId"})
public class EOS_Sessions_SessionInviteRejectedCallbackInfo extends Structure {
	/** Context that was passed into EOS_Lobby_AddNotifySessionInviteRejected */
	public Pointer ClientData;
	/** The invite ID */
	public String InviteId;
	/** The Product User ID of the local user who rejected the invitation */
	public EOS_ProductUserId LocalUserId;
	/** The Product User ID of the user who sent the invitation */
	public EOS_ProductUserId TargetUserId;
	/** Optional session ID */
	public String SessionId;

	public EOS_Sessions_SessionInviteRejectedCallbackInfo() {
		super();
	}

	public EOS_Sessions_SessionInviteRejectedCallbackInfo(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Sessions_SessionInviteRejectedCallbackInfo implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Sessions_SessionInviteRejectedCallbackInfo implements Structure.ByValue {
	}
}