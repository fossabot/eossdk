package host.anzo.eossdk.eos.sdk.achievements.options;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Input parameters for the EOS_Achievements_GetAchievementDefinitionCount function.
 *
 * @author Anton Lasevich
 * @since 8/19/2023
 */
@FieldOrder({"ApiVersion"})
public class EOS_Achievements_GetAchievementDefinitionCountOptions extends Structure {
	/** The most recent version of the EOS_Achievements_GetAchievementDefinitionCount API. */
	public static final int EOS_ACHIEVEMENTS_GETACHIEVEMENTDEFINITIONCOUNT_API_LATEST = 1;

	/** API Version: Set this to EOS_ACHIEVEMENTS_GETACHIEVEMENTDEFINITIONCOUNT_API_LATEST. */
	public int ApiVersion;

	public EOS_Achievements_GetAchievementDefinitionCountOptions() {
		super();
		ApiVersion = EOS_ACHIEVEMENTS_GETACHIEVEMENTDEFINITIONCOUNT_API_LATEST;
	}

	public EOS_Achievements_GetAchievementDefinitionCountOptions(Pointer peer) {
		super(peer);
	}

	public static class ByReference extends EOS_Achievements_GetAchievementDefinitionCountOptions implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Achievements_GetAchievementDefinitionCountOptions implements Structure.ByValue {
	}
}