package com.example.apimodelclass;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.apimodelclass.api.ModelApi;
import com.example.apimodelclass.api.ModelApiService;
import com.example.apimodelclass.api.Shop;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);}

    @Test
    public void getModelApis() throws IOException {

        ModelApi modelApi = new ModelApi();
        ModelApiService service = modelApi.createModelApiService();
        Call<List<Shop>> call = service.fetchModelApis();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}