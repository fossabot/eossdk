/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.anticheat.server.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.anticheat.common.EOS_AntiCheatCommon_ClientHandle;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/5/2023
 */
@FieldOrder({"ApiVersion", "ClientHandle", "DataLengthBytes", "Data"})
public class EOS_AntiCheatServer_ReceiveMessageFromClientOptions extends Structure {
	public static int EOS_ANTICHEATSERVER_RECEIVEMESSAGEFROMCLIENT_API_LATEST = 1;

	/** API Version: Set this to EOS_ANTICHEATSERVER_RECEIVEMESSAGEFROMCLIENT_API_LATEST. */
	public int ApiVersion;
	/** Locally unique value describing the corresponding remote user, as previously passed to RegisterClient */
	public EOS_AntiCheatCommon_ClientHandle ClientHandle;
	/** The size of the data received */
	public int DataLengthBytes;
	/** The data received */
	public Pointer Data;

	public EOS_AntiCheatServer_ReceiveMessageFromClientOptions() {
		super();
		ApiVersion = EOS_ANTICHEATSERVER_RECEIVEMESSAGEFROMCLIENT_API_LATEST;
	}

	public EOS_AntiCheatServer_ReceiveMessageFromClientOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_AntiCheatServer_ReceiveMessageFromClientOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_AntiCheatServer_ReceiveMessageFromClientOptions implements Structure.ByValue {
	}
}