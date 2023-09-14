package host.anzo.eossdk.eos.sdk.sessions.callbacks;

import com.sun.jna.Callback;
import host.anzo.eossdk.eos.sdk.sessions.callbackresults.EOS_Sessions_QueryInvitesCallbackInfo;

/**
 * @author Anton Lasevich
 * @since 9/7/2023
 */
public interface EOS_Sessions_OnQueryInvitesCallback extends Callback {
	/**
	 * Function prototype definition for callbacks passed to EOS_Sessions_QueryInvites
	 * @param data A EOS_Sessions_QueryInvites CallbackInfo containing the output information and result
	 */
	void apply(EOS_Sessions_QueryInvitesCallbackInfo data);
}