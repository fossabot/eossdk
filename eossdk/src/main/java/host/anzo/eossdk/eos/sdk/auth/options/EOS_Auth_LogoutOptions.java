/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.auth.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_EpicAccountId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_Auth_Logout function.
 *
 * @author Anton Lasevich
 * @since 8/5/2023
 */
@FieldOrder({"ApiVersion", "LocalUserId"})
public class EOS_Auth_LogoutOptions extends Structure {
	public static int EOS_AUTH_LOGOUT_API_LATEST = 1;

	/** API Version: Set this to EOS_AUTH_LOGOUT_API_LATEST. */
	public int ApiVersion;
	/** The Epic Account ID of the local user who is being logged out */
	public EOS_EpicAccountId LocalUserId;

	public EOS_Auth_LogoutOptions() {
		super();
		ApiVersion = EOS_AUTH_LOGOUT_API_LATEST;
	}

	public EOS_Auth_LogoutOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Auth_LogoutOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Auth_LogoutOptions implements Structure.ByValue {
	}
}