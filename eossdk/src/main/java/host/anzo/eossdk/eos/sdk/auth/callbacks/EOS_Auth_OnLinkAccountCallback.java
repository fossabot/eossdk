/*
 * Copyright © 2016 BDO-Emu authors. All rights reserved.
 * Viewing, editing, running and distribution of this software strongly prohibited.
 * Author: xTz, Anton Lasevich, Tibald
 */

package host.anzo.eossdk.eos.sdk.auth.callbacks;

import com.sun.jna.Callback;
import host.anzo.eossdk.eos.sdk.auth.callbackresults.EOS_Auth_LinkAccountCallbackInfo;

/**
 * @author Anton Lasevich
 * @since 8/5/2023
 */
public interface EOS_Auth_OnLinkAccountCallback extends Callback {
	/**
	 * Function prototype definition for callbacks passed to EOS_Auth_LinkAccount
	 * @param data A EOS_Auth_LinkAccountCallbackInfo containing the output information and result
	 */
	void run(EOS_Auth_LinkAccountCallbackInfo data);
}