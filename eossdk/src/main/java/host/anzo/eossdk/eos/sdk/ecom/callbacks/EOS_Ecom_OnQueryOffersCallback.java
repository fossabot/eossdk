package host.anzo.eossdk.eos.sdk.ecom.callbacks;

import com.sun.jna.Callback;
import host.anzo.eossdk.eos.sdk.ecom.callbackresults.EOS_Ecom_QueryOffersCallbackInfo;

/**
 * @author Anton Lasevich
 * @since 8/20/2023
 */
public interface EOS_Ecom_OnQueryOffersCallback extends Callback {
	/**
	 * Function prototype definition for callbacks passed to EOS_Ecom_QueryOffers
	 * @param data A EOS_Ecom_QueryOffersCallbackInfo containing the output information and result
	 */
	void apply(EOS_Ecom_QueryOffersCallbackInfo data);
}