package com.example.retrofitbasics_6.restApi;

public class BaseManager {
    protected RestApi getRestApiClient() {
        RestApiClient restApiClient = new RestApiClient(BaseUrl.url);
        return restApiClient.getRestApi();
    }
}
