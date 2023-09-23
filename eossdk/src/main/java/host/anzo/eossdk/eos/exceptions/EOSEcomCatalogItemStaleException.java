package host.anzo.eossdk.eos.exceptions;

import host.anzo.eossdk.eos.sdk.common.enums.EOS_EResult;

/**
 * @author Anton Lasevich
 * @since 9/23/2023
 */
public class EOSEcomCatalogItemStaleException extends EOSException {
	public EOSEcomCatalogItemStaleException() {
		super(EOS_EResult.EOS_Ecom_CatalogItemStale);
	}
}