package host.anzo.eossdk.eos.exceptions;

import host.anzo.eossdk.eos.sdk.common.enums.EOS_EResult;

/**
 * @author Anton Lasevich
 * @since 9/23/2023
 */
public class EOSEcomCatalogOfferStaleException extends EOSException {
	public EOSEcomCatalogOfferStaleException() {
		super(EOS_EResult.EOS_Ecom_CatalogOfferStale);
	}
}
