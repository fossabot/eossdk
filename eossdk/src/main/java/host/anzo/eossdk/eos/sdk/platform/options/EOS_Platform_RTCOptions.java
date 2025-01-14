/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.platform.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/5/2023
 */
@FieldOrder({ "ApiVersion", "PlatformSpecificOptions" })
public class EOS_Platform_RTCOptions extends Structure {
	public static int EOS_PLATFORM_RTCOPTIONS_API_LATEST = 1;

	/** API Version: Set this to EOS_PLATFORM_RTCOPTIONS_API_LATEST. */
	public int ApiVersion;
	/**
	 * This field is for platform specific initialization if any.
	 * <p>
	 * If provided then the structure will be located in System/eos_System.h.
	 * The structure will be named EOS_(System)_RTCOptions.
	 */
	public Pointer PlatformSpecificOptions;

	public EOS_Platform_RTCOptions() {
		super();
		ApiVersion = EOS_PLATFORM_RTCOPTIONS_API_LATEST;
	}

	public EOS_Platform_RTCOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Platform_RTCOptions implements Structure.ByReference {
	}
	public static class ByValue extends EOS_Platform_RTCOptions implements Structure.ByValue {
	}
}