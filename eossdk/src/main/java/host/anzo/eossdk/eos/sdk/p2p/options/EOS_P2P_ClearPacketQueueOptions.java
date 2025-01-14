package host.anzo.eossdk.eos.sdk.p2p.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.common.EOS_ProductUserId;
import host.anzo.eossdk.eos.sdk.p2p.EOS_P2P_SocketId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Structure containing information about the packet queue to be cleared
 *
 * @author Anton Lasevich
 * @since 8/21/2023
 */
@FieldOrder({"ApiVersion", "LocalUserId", "RemoteUserId", "SocketId"})
public class EOS_P2P_ClearPacketQueueOptions extends Structure {
	public static final int EOS_P2P_CLEARPACKETQUEUE_API_LATEST = 1;

	/** API Version: Set this to EOS_P2P_CLEARPACKETQUEUE_API_LATEST. */
	public int ApiVersion;
	/** The Product User ID of the local user for whom we want to clear the queued packets */
	public EOS_ProductUserId LocalUserId;
	/** The Product User ID to who (outgoing) or from who (incoming) packets are queued */
	public EOS_ProductUserId RemoteUserId;
	/** The socket used for packets to be cleared */
	public EOS_P2P_SocketId.ByReference SocketId;

	public EOS_P2P_ClearPacketQueueOptions() {
		super();
		ApiVersion = EOS_P2P_CLEARPACKETQUEUE_API_LATEST;
	}

	public EOS_P2P_ClearPacketQueueOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_P2P_ClearPacketQueueOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_P2P_ClearPacketQueueOptions implements Structure.ByValue {
	}
}