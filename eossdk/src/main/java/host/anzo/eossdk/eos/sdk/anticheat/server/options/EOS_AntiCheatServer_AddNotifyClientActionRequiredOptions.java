/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.anticheat.server.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/5/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_AntiCheatServer_AddNotifyClientActionRequiredOptions extends Structure {
	public static int EOS_ANTICHEATSERVER_ADDNOTIFYCLIENTACTIONREQUIRED_API_LATEST = 1;

	/** API Version: Set this to EOS_ANTICHEATSERVER_ADDNOTIFYCLIENTACTIONREQUIRED_API_LATEST. */
	public int ApiVersion;

	public EOS_AntiCheatServer_AddNotifyClientActionRequiredOptions() {
		super();
		ApiVersion = EOS_ANTICHEATSERVER_ADDNOTIFYCLIENTACTIONREQUIRED_API_LATEST;
	}

	public EOS_AntiCheatServer_AddNotifyClientActionRequiredOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_AntiCheatServer_AddNotifyClientActionRequiredOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_AntiCheatServer_AddNotifyClientActionRequiredOptions implements Structure.ByValue {
	}
}