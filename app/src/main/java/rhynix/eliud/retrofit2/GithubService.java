package rhynix.eliud.retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by eliud on 12/2/16.
 */

public interface GithubService {

    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> repoContributors(
            @Path("owner")String owner,
            @Path("repo")String repo);

    public  static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
/*
    GithubService gitHubService = GithubService.retrofit.create(GithubService.class);
    Call<List<Contributor>> call = gitHubService.repoContributors("square","retrofit");
    List<Contributor> result = call.execute().body();
    */
}
