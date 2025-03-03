/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.anticheat.common.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Flags describing a remote client. These can be updated during a play session
 *
 * @author Anton Lasevich
 * @since 8/5/2023
 */
public @Getter enum EOS_EAntiCheatCommonClientAuthStatus {
	/** Not used */
	EOS_ACCCAS_Invalid(0),
	/** The client/peer's anti-cheat functionality has been validated by this game server */
	EOS_ACCCAS_LocalAuthComplete(1),
	/** The client/peer's anti-cheat functionality has been validated by the anti-cheat backend service */
	EOS_ACCCAS_RemoteAuthComplete(2);

	private final int id;

	private static final Map<Integer, EOS_EAntiCheatCommonClientAuthStatus> values = new HashMap<>();

	static {
		for (EOS_EAntiCheatCommonClientAuthStatus result : values()) {
			values.put(result.id, result);
		}
	}

	EOS_EAntiCheatCommonClientAuthStatus(int id) {
		this.id = id;
	}

	@SuppressWarnings("unused")
	public static EOS_EAntiCheatCommonClientAuthStatus fromId(Integer id) {
		return values.getOrDefault(id, EOS_ACCCAS_Invalid);
	}
}