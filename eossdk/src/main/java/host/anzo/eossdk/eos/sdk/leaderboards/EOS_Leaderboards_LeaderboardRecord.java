package host.anzo.eossdk.eos.sdk.leaderboards;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import host.anzo.eossdk.eos.sdk.EOS_Leaderboards_Interface;
import host.anzo.eossdk.eos.sdk.common.EOS_ProductUserId;

import static com.sun.jna.Structure.FieldOrder;

/**
 * Contains information about a single leaderboard record
 *
 * @author Anton Lasevich
 * @since 8/21/2023
 */
@FieldOrder({"ApiVersion", "UserId", "Rank", "Score", "UserDisplayName"})
public class EOS_Leaderboards_LeaderboardRecord extends Structure implements AutoCloseable {
	public static final int EOS_LEADERBOARDS_LEADERBOARDRECORD_API_LATEST = 2;

	/** API Version: Set this to EOS_LEADERBOARDS_LEADERBOARDRECORD_API_LATEST. */
	public int ApiVersion;
	/** The Product User ID associated with this record */
	public EOS_ProductUserId UserId;
	/** Sorted position on leaderboard */
	public int Rank;
	/** Leaderboard score */
	public int Score;
	/** The latest display name seen for the user since they last time logged in. This is empty if the user does not have a display name set. */
	public String UserDisplayName;

	public EOS_Leaderboards_LeaderboardRecord() {
		super();
		ApiVersion = EOS_LEADERBOARDS_LEADERBOARDRECORD_API_LATEST;
	}

	public EOS_Leaderboards_LeaderboardRecord(Pointer peer) {
		super(peer);
	}

	public void release() {
		EOS_Leaderboards_Interface.releaseLeaderboardRecord(this);
	}

	@Override
	public void close() throws Exception {
		release();
	}

	public static class ByReference extends EOS_Leaderboards_LeaderboardRecord implements Structure.ByReference {
	}

	public static class ByValue extends EOS_Leaderboards_LeaderboardRecord implements Structure.ByValue {
	}
}