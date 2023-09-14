package host.anzo.eossdk.eos.sdk.achievements.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_Achievements_AddNotifyAchievementsUnlocked function.
 *
 * @author Anton Lasevich
 * @since 8/19/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_Achievements_AddNotifyAchievementsUnlockedOptions extends Structure {
	/** The most recent version of the EOS_Achievements_AddNotifyAchievementsUnlocked API. */
	public static final int EOS_ACHIEVEMENTS_ADDNOTIFYACHIEVEMENTSUNLOCKED_API_LATEST = 1;

	/** API Version: Set this to EOS_ACHIEVEMENTS_ADDNOTIFYACHIEVEMENTSUNLOCKED_API_LATEST. */
	public int ApiVersion;

	public EOS_Achievements_AddNotifyAchievementsUnlockedOptions() {
		super();
		ApiVersion = EOS_ACHIEVEMENTS_ADDNOTIFYACHIEVEMENTSUNLOCKED_API_LATEST;
	}

	public EOS_Achievements_AddNotifyAchievementsUnlockedOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Achievements_AddNotifyAchievementsUnlockedOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Achievements_AddNotifyAchievementsUnlockedOptions implements Structure.ByValue {
	}
}