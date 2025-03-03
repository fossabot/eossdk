package host.anzo.eossdk.eos.sdk.custominvites.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_ProductUserId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/19/2023
 */
@FieldOrder({"ApiVersion", "LocalUserId", "TargetUserId"})
public class EOS_CustomInvites_SendRequestToJoinOptions extends Structure {
	public static final int EOS_CUSTOMINVITES_SENDREQUESTTOJOIN_API_LATEST = 1;

	/** API Version: Set this to EOS_CUSTOMINVITES_SENDREQUESTTOJOIN_API_LATEST. */
	public int ApiVersion;
	/** Local user Requesting an Invite */
	public EOS_ProductUserId LocalUserId;
	/** Recipient of Request Invite*/
	public EOS_ProductUserId TargetUserId;

	public EOS_CustomInvites_SendRequestToJoinOptions() {
		super();
		ApiVersion = EOS_CUSTOMINVITES_SENDREQUESTTOJOIN_API_LATEST;
	}

	public EOS_CustomInvites_SendRequestToJoinOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_CustomInvites_SendRequestToJoinOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_CustomInvites_SendRequestToJoinOptions implements Structure.ByValue {
	}
}