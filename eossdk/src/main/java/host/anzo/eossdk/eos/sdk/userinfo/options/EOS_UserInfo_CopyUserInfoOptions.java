package host.anzo.eossdk.eos.sdk.userinfo.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_EpicAccountId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_UserInfo_CopyUserInfo function.
 *
 * @author Anton Lasevich
 * @since 9/3/2023
 */
@FieldOrder({"ApiVersion", "LocalUserId", "TargetUserId"})
public class EOS_UserInfo_CopyUserInfoOptions extends Structure {
	public static final int EOS_USERINFO_COPYUSERINFO_API_LATEST = 3;

	/** API Version: Set this to EOS_USERINFO_COPYUSERINFO_API_LATEST. */
	public int ApiVersion;
	/** The Epic Account ID of the local player requesting the information */
	public EOS_EpicAccountId LocalUserId;
	/** The Epic Account ID of the player whose information is being retrieved */
	public EOS_EpicAccountId TargetUserId;

	public EOS_UserInfo_CopyUserInfoOptions() {
		super();
		ApiVersion = EOS_USERINFO_COPYUSERINFO_API_LATEST;
	}

	public EOS_UserInfo_CopyUserInfoOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_UserInfo_CopyUserInfoOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_UserInfo_CopyUserInfoOptions implements Structure.ByValue {
	}
}