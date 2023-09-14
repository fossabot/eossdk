package host.anzo.eossdk.eos.sdk.mods.callbackresults;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_EpicAccountId;
import host.anzo.eossdk.eos.sdk.common.enums.EOS_EResult;
import host.anzo.eossdk.eos.sdk.mods.EOS_Mod_Identifier;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Output parameters for the EOS_Mods_InstallMod Function. These parameters are received through the callback provided to EOS_Mods_InstallMod
 *
 * @author Anton Lasevich
 * @since 8/15/2023
 */
@FieldOrder({"ResultCode", "LocalUserId", "ClientData", "Mod"})
public class EOS_Mods_InstallModCallbackInfo extends Structure {
	/** Result code for the operation. EOS_Success is returned if the installation was successful, otherwise one of the error codes is returned. */
	public EOS_EResult ResultCode;
	/** The Epic Account ID of the user for which mod installation was requested */
	public EOS_EpicAccountId LocalUserId;
	/** Context that is passed into EOS_Mods_InstallMod */
	public Pointer ClientData;
	/** Mod for which installation was requested */
	public EOS_Mod_Identifier.ByReference Mod;

	public EOS_Mods_InstallModCallbackInfo() {
		super();
	}

	public EOS_Mods_InstallModCallbackInfo(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Mods_InstallModCallbackInfo implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Mods_InstallModCallbackInfo implements Structure.ByValue {
	}
}