package client.models;

import client.LeagueClient;
import retrofit.RestAdapter;

/**
 * Created by Norbert on 11/14/2015.
 */
public class LCSApiImpli {

    private static LeagueClient.LCS api;

    protected LCSApiImpli() {

    }

    public static LeagueClient.LCS getInstance() {
        if (api == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(LeagueClient.API_URL)
                    .build();
            api = restAdapter.create(LeagueClient.LCS.class);
        }
        return api;
    }
}
