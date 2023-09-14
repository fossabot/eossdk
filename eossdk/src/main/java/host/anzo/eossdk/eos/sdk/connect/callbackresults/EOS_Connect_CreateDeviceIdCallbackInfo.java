/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.connect.callbackresults;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.enums.EOS_EResult;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Output parameters for the EOS_Connect_CreateDeviceId function.
 *
 * @author Anton Lasevich
 * @since 8/5/2023
 */
@FieldOrder({"ResultCode", "ClientData"})
public class EOS_Connect_CreateDeviceIdCallbackInfo extends Structure {
	/** The EOS_EResult code for the operation. EOS_Success indicates that the operation succeeded; other codes indicate errors. */
	private EOS_EResult ResultCode;
	/** Context that was passed into EOS_Connect_CreateDeviceId. */
	public Pointer ClientData;

	public EOS_Connect_CreateDeviceIdCallbackInfo() {
		super();
	}

	public EOS_Connect_CreateDeviceIdCallbackInfo(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Connect_CreateDeviceIdCallbackInfo implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Connect_CreateDeviceIdCallbackInfo implements Structure.ByValue {
	}
}