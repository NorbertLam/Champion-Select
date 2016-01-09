package client;


import com.example.norbert.championselect.ChampionList;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Norbert on 11/14/2015.
 */
public class LeagueClient {

    public static final String API_URL="https://na.api.pvp.net/api/lol/na/v1.4/summoner/by-name/Norbert?api_key=[];

    public interface LCS {
        @GET("/api/lol/na/v1.2/champion")
        void getChampList(Callback<ChampionList> cb);
    }
}
