/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.anticheat.common.enums;

import com.sun.jna.FromNativeContext;
import com.sun.jna.NativeMapped;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Types supported for custom gameplay behavior event parameters
 *
 * @author Anton Lasevich
 * @since 8/5/2023
 */
public @Getter enum EOS_EAntiCheatCommonEventParamType implements NativeMapped {
	/** Not used */
	EOS_ACCEPT_Invalid(0),
	/** EOS_AntiCheatCommon_ClientHandle */
	EOS_ACCEPT_ClientHandle(1),
	/** const char* */
	EOS_ACCEPT_String(2),
	/** uint32_t */
	EOS_ACCEPT_UInt32(3),
	/** int32_t */
	EOS_ACCEPT_Int32(4),
	/** uint64_t */
	EOS_ACCEPT_UInt64(5),
	/** int64_t */
	EOS_ACCEPT_Int64(6),
	/** EOS_AntiCheatCommon_Vec3f */
	EOS_ACCEPT_Vector3f(7),
	/** EOS_AntiCheatCommon_Quat */
	EOS_ACCEPT_Quat(8);

	private final int id;

	private static final Map<Integer, EOS_EAntiCheatCommonEventParamType> values = new HashMap<>();

	static {
		for (EOS_EAntiCheatCommonEventParamType result : values()) {
			values.put(result.id, result);
		}
	}

	EOS_EAntiCheatCommonEventParamType(int id) {
		this.id = id;
	}

	@Override
	public Object fromNative(Object nativeValue, FromNativeContext context) {
		return values.getOrDefault((int)nativeValue, EOS_ACCEPT_Invalid);
	}

	@Override
	public Object toNative() {
		return id;
	}

	@Override
	public Class<?> nativeType() {
		return Integer.class;
	}
}