package host.anzo.eossdk.eos.sdk.lobby.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters to use with Lobby RTC Rooms.
 *
 * @author Anton Lasevich
 * @since 8/17/2023
 */
@FieldOrder({"ApiVersion", "Flags", "bUseManualAudioInput", "bUseManualAudioOutput", "bLocalAudioDeviceInputStartsMuted"})
public class EOS_Lobby_LocalRTCOptions extends Structure {
	public static final int EOS_LOBBY_LOCALRTCOPTIONS_API_LATEST = 1;

	/** API Version: Set this to EOS_LOBBY_LOCALRTCOPTIONS_API_LATEST. */
	public int ApiVersion;
	/** Flags for the local user in this room. The default is 0 if this struct is not specified. @see EOS_RTC_JoinRoomOptions::Flags */
	public int Flags;
	/**
	 * Set to EOS_TRUE to enable Manual Audio Input. If manual audio input is enabled, audio recording is not started and the audio buffers
	 * must be passed manually using EOS_RTCAudio_SendAudio. The default is EOS_FALSE if this struct is not specified.
	 */
	public int bUseManualAudioInput;
	/**
	 * Set to EOS_TRUE to enable Manual Audio Output. If manual audio output is enabled, audio rendering is not started and the audio buffers
	 * must be received with EOS_RTCAudio_AddNotifyAudioBeforeRender and rendered manually. The default is EOS_FALSE if this struct is not
	 * specified.
	 */
	public int bUseManualAudioOutput;
	/**
	 * Set to EOS_TRUE to start the audio input device's stream as muted when first connecting to the RTC room.
	 * <p>
	 * It must be manually unmuted with a call to EOS_RTCAudio_UpdateSending. If manual audio output is enabled, this value is ignored.
	 * The default value is EOS_FALSE if this struct is not specified.
	 */
	public int bLocalAudioDeviceInputStartsMuted;

	public EOS_Lobby_LocalRTCOptions() {
		super();
		ApiVersion = EOS_LOBBY_LOCALRTCOPTIONS_API_LATEST;
	}

	public EOS_Lobby_LocalRTCOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Lobby_LocalRTCOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Lobby_LocalRTCOptions implements Structure.ByValue {
	}
}