package host.anzo.eossdk.eos.sdk.kws.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_ProductUserId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_KWS_QueryPermissions function.
 *
 * @author Anton Lasevich
 * @since 8/21/2023
 */
@FieldOrder({"ApiVersion", "LocalUserId"})
public class EOS_KWS_QueryPermissionsOptions extends Structure {
	public static final int EOS_KWS_QUERYPERMISSIONS_API_LATEST = 1;

	/** API Version: Set this to EOS_KWS_QUERYPERMISSIONS_API_LATEST. */
	public int ApiVersion;
	/** Local user querying their permissions */
	public EOS_ProductUserId LocalUserId;

	public EOS_KWS_QueryPermissionsOptions() {
		super();
		ApiVersion = EOS_KWS_QUERYPERMISSIONS_API_LATEST;
	}

	public EOS_KWS_QueryPermissionsOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_KWS_QueryPermissionsOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_KWS_QueryPermissionsOptions implements Structure.ByValue {
	}
}