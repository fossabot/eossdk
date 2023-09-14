package host.anzo.eossdk.eos.sdk.friends.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_EpicAccountId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_Friends_GetBlockedUsersCount function.
 *
 * @author Anton Lasevich
 * @since 8/20/2023
 */
@FieldOrder({"ApiVersion", "LocalUserId"})
public class EOS_Friends_GetBlockedUsersCountOptions extends Structure {
	public static final int EOS_FRIENDS_GETBLOCKEDUSERSCOUNT_API_LATEST = 1;

	/** API Version: Set this to EOS_FRIENDS_GETBLOCKEDUSERSCOUNT_API_LATEST. */
	public int ApiVersion;
	/** The Epic Account ID of the user whose blocked users should be counted. */
	public EOS_EpicAccountId LocalUserId;

	public EOS_Friends_GetBlockedUsersCountOptions() {
		super();
		ApiVersion = EOS_FRIENDS_GETBLOCKEDUSERSCOUNT_API_LATEST;
	}

	public EOS_Friends_GetBlockedUsersCountOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Friends_GetBlockedUsersCountOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Friends_GetBlockedUsersCountOptions implements Structure.ByValue {
	}
}