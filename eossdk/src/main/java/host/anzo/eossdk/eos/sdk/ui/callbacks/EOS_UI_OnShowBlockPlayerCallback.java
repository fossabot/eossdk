package host.anzo.eossdk.eos.sdk.ui.callbacks;

import com.sun.jna.Callback;
import host.anzo.eossdk.eos.sdk.ui.callbackresults.EOS_UI_OnShowBlockPlayerCallbackInfo;

/**
 * @author Anton Lasevich
 * @since 9/9/2023
 */
public interface EOS_UI_OnShowBlockPlayerCallback extends Callback {
	/**
	 * Function prototype definition for callbacks passed to EOS_UI_ShowBlockPlayer
	 * @param data A EOS_UI_OnShowBlockPlayerCallbackInfo containing the output information and result
	 */
	void apply(EOS_UI_OnShowBlockPlayerCallbackInfo data);
}