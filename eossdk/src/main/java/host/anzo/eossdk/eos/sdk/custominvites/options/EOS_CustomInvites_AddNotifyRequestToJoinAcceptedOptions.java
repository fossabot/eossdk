package host.anzo.eossdk.eos.sdk.custominvites.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/20/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_CustomInvites_AddNotifyRequestToJoinAcceptedOptions extends Structure {
	public static final int EOS_CUSTOMINVITES_ADDNOTIFYREQUESTTOJOINACCEPTED_API_LATEST = 1;

	public int ApiVersion;

	public EOS_CustomInvites_AddNotifyRequestToJoinAcceptedOptions() {
		super();
		ApiVersion = EOS_CUSTOMINVITES_ADDNOTIFYREQUESTTOJOINACCEPTED_API_LATEST;
	}

	public EOS_CustomInvites_AddNotifyRequestToJoinAcceptedOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_CustomInvites_AddNotifyRequestToJoinAcceptedOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_CustomInvites_AddNotifyRequestToJoinAcceptedOptions implements Structure.ByValue {
	}
}