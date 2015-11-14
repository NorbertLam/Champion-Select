package client;

/**
 * Created by Norbert on 11/14/2015.
 */
public class LeagueClient {

    public static final String API_URL="https://na.api.pvp.net/api/lol/na/v1.4/summoner/by-name/Norbert?api_key=ac30a2a7-5f32-4a54-821b-e82d7a5672d6";

    public interface LCS {
        @GET("/api/lol/na/v1.2/champion")
        void getChampList(Callback<ChampList> cb);
    }
}
