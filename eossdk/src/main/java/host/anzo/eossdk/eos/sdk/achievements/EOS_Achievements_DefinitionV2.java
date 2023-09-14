package host.anzo.eossdk.eos.sdk.achievements;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.EOS_Achievements_Interface;

import static com.sun.jna.Structure.FieldOrder;

/**
 * @author Anton Lasevich
 * @since 8/19/2023
 */
@FieldOrder({"ApiVersion", "AchievementId", "UnlockedDisplayName", "UnlockedDescription", "LockedDisplayName", "LockedDescription", "FlavorText", "UnlockedIconURL", "LockedIconURL", "bIsHidden", "StatThresholdsCount", "StatThresholds"})
public class EOS_Achievements_DefinitionV2 extends Structure implements AutoCloseable {
	public static final int EOS_ACHIEVEMENTS_DEFINITIONV2_API_LATEST = 2;

	/** API Version: Set this to EOS_ACHIEVEMENTS_DEFINITIONV2_API_LATEST. */
	public int ApiVersion;
	/** Achievement ID that can be used to uniquely identify the achievement. */
	public String AchievementId;
	/** Localized display name for the achievement when it has been unlocked. */
	public String UnlockedDisplayName;
	/** Localized description for the achievement when it has been unlocked. */
	public String UnlockedDescription;
	/** Localized display name for the achievement when it is locked or hidden. */
	public String LockedDisplayName;
	/** Localized description for the achievement when it is locked or hidden. */
	public String LockedDescription;
	/** Localized flavor text that can be used by the game in an arbitrary manner. This may be null if there is no data configured in the dev portal. */
	public String FlavorText;
	/** URL of an icon to display for the achievement when it is unlocked. This may be null if there is no data configured in the dev portal. */
	public String UnlockedIconURL;
	/** URL of an icon to display for the achievement when it is locked or hidden. This may be null if there is no data configured in the dev portal. */
	public String LockedIconURL;
	/** EOS_TRUE if the achievement is hidden; EOS_FALSE otherwise. */
	public int bIsHidden;
	/** The number of stat thresholds used to monitor progress towards this achievement. */
	public int StatThresholdsCount;
	/** Array of `EOS_Achievements_StatThresholds` that need to be satisfied to unlock this achievement. Consists of Name and Threshold Value. */
	public EOS_Achievements_StatThresholds.ByReference[] StatThresholds;

	public EOS_Achievements_DefinitionV2() {
		super();
		ApiVersion = EOS_ACHIEVEMENTS_DEFINITIONV2_API_LATEST;
	}

	public EOS_Achievements_DefinitionV2(Pointer peer) {
		super(peer);
	}

	public void release() {
		EOS_Achievements_Interface.releaseDefinitionV2(this);
	}

	@Override
	public void close() throws Exception {
		release();
	}

	public static class ByReference extends EOS_Achievements_DefinitionV2 implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Achievements_DefinitionV2 implements Structure.ByValue {
	}
}