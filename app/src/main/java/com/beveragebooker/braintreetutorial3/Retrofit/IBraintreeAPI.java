package com.beveragebooker.braintreetutorial3.Retrofit;

import com.beveragebooker.braintreetutorial3.Model.BraintreeToken;
import com.beveragebooker.braintreetutorial3.Model.BraintreeTransaction;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IBraintreeAPI {
    @GET("checkout/new")
    Observable<BraintreeToken> getToken();

    @POST("checkouts")
    @FormUrlEncoded
    Observable<BraintreeTransaction> submitPayment(@Field("amount") String amount,
                                                   @Field("payment_method_nonce") String nonce);
}
