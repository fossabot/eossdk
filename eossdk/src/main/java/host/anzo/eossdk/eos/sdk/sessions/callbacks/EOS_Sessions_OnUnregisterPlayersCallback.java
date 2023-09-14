package host.anzo.eossdk.eos.sdk.sessions.callbacks;

import com.sun.jna.Callback;
import host.anzo.eossdk.eos.sdk.sessions.callbackresults.EOS_Sessions_UnregisterPlayersCallbackInfo;

/**
 * @author Anton Lasevich
 * @since 9/7/2023
 */
public interface EOS_Sessions_OnUnregisterPlayersCallback extends Callback {
	/**
	 * Function prototype definition for callbacks passed to EOS_Sessions_UnregisterPlayers
	 * @param data A EOS_Sessions_UnregisterPlayersCallbackInfo containing the output information and result
	 */
	void apply(EOS_Sessions_UnregisterPlayersCallbackInfo data);
}