package com.example.reubrotest.Activity;

import android.util.Log;

import com.example.reubrotest.Activity.MainContract;
import com.example.reubrotest.model.NoticeList;
import com.example.reubrotest.my_interface.GetNoticeDataService;
import com.example.reubrotest.network.RetroFitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetNoticeIntractorImpl implements MainContract.GetNoticeIntractor {

    @Override
    public void getNoticeArrayList(final OnFinishedListener onFinishedListener) {


        /** Create handle for the RetrofitInstance interface*/
        GetNoticeDataService service = RetroFitInstance.getRetrofitInstance().create(GetNoticeDataService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<NoticeList> call = service.getNoticeData();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<NoticeList>() {
            @Override
            public void onResponse(Call<NoticeList> call, Response<NoticeList> response) {
                onFinishedListener.onFinished(response.body().getData());

            }

            @Override
            public void onFailure(Call<NoticeList> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });

    }

}