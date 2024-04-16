package com.inappstory.sdk.network;

import com.inappstory.sdk.stories.api.models.StatisticSendObject;
/* loaded from: classes3.dex */
public interface ApiInterface {
    @GET("v2/feed/{feed}")
    Request getFeed(@Path("feed") String str, @Query("test") String str2, @Query("favorite") Integer num, @Query("tags") String str3, @Query("fields") String str4);

    @POST("v2/game/{id}/launch")
    Request getGameByInstanceId(@Path("id") String str);

    @GET("v2/feed/{feed}/onboarding")
    Request getOnboardingFeed(@Path("feed") String str, @Query("limit") Integer num, @Query("tags") String str2);

    @GET("v2/story")
    Request getStories(@Query("test") String str, @Query("favorite") Integer num, @Query("tags") String str2, @Query("fields") String str3);

    @GET("v2/story/{id}")
    Request getStoryById(@Path("id") String str, @Query("src_list") Integer num, @Query("expand") String str2);

    @GET("v2/ugc/feed")
    Request getUgcStories(@QueryObject("f") String str, @Query("fields") String str2, @Query("expand") String str3);

    @GET("v2/ugc/story/{id}")
    Request getUgcStoryById(@Path("id") String str, @Query("src_list") Integer num, @Query("expand") String str2);

    @GET("v2/story-onboarding")
    Request onboardingStories(@Query("tags") String str);

    @DELETE("v2/story-favorite")
    Request removeAllFavorites();

    @GET("stat/{event_name}")
    Request sendBaseStat(@Path("event_name") String str, @Query("s") String str2, @Query("u") String str3, @Query("ts") Long l, @Query("i") Integer num, @Query("w") String str4, @Query("c") String str5, @Query("si") Integer num2, @Query("st") Integer num3, @Query("d") Long l2, @Query("spend_ms") Long l3);

    @POST("exception")
    @FormUrlEncoded
    Request sendException(@Query("s") String str, @Query("ts") Long l, @Field("m") String str2, @Field("f") String str3, @Field("l") Integer num, @Field("t") String str4);

    @FormUrlEncoded
    @PUT("v2/game/{id}/instance-user-data")
    Request sendGameData(@Path("id") String str, @Field("data") String str2);

    @GET("stat/{event_name}")
    Request sendStat(@Path("event_name") String str, @Query("s") String str2, @Query("u") String str3, @Query("ts") Long l, @Query("f") String str4, @Query("i") String str5, @Query("w") String str6, @Query("c") String str7, @Query("si") Integer num, @Query("st") Integer num2, @Query("d") Long l2, @Query("wi") String str8, @Query("wl") String str9, @Query("wv") String str10, @Query("wa") Integer num3, @Query("wal") String str11, @Query("was") Integer num4, @Query("li") Integer num5, @Query("t") String str12, @Query("m") Integer num6);

    @FormUrlEncoded
    @PUT("v2/story-data/{id}")
    Request sendStoryData(@Path("id") String str, @Field("data") String str2, @Query("session_id") String str3);

    @POST("v2/session/close")
    Request sessionClose(@Body StatisticSendObject statisticSendObject);

    @POST("v2/session/open")
    @FormUrlEncoded
    Request sessionOpen(@Query("expand") String str, @Field("features") String str2, @Field("platform") String str3, @Field("device_id") String str4, @Field("model") String str5, @Field("manufacturer") String str6, @Field("brand") String str7, @Field("screen_width") String str8, @Field("screen_height") String str9, @Field("screen_dpi") String str10, @Field("os_version") String str11, @Field("os_sdk_version") String str12, @Field("app_package_id") String str13, @Field("app_version") String str14, @Field("app_build") String str15, @Field("user_id") String str16);

    @POST("v2/session/update")
    Request sessionUpdate(@Body StatisticSendObject statisticSendObject);

    @GET("v2/story-share/{id}")
    Request share(@Path("id") String str, @Query("expand") String str2);

    @POST("v2/story-favorite/{id}")
    Request storyFavorite(@Path("id") String str, @Query("value") Integer num);

    @POST("v2/story-like/{id}")
    Request storyLike(@Path("id") String str, @Query("value") Integer num);
}
