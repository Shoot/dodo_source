package com.inappstory.sdk.network;

import com.inappstory.sdk.stories.api.models.StatisticSendObject;
/* loaded from: classes3.dex */
public class DumbApiInterface implements ApiInterface {
    @Override // com.inappstory.sdk.network.ApiInterface
    public Request getFeed(String str, String str2, Integer num, String str3, String str4) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request getGameByInstanceId(String str) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request getOnboardingFeed(String str, Integer num, String str2) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request getStories(String str, Integer num, String str2, String str3) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request getStoryById(String str, Integer num, String str2) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request getUgcStories(String str, String str2, String str3) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request getUgcStoryById(String str, Integer num, String str2) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request onboardingStories(String str) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request removeAllFavorites() {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sendBaseStat(String str, String str2, String str3, Long l, Integer num, String str4, String str5, Integer num2, Integer num3, Long l2, Long l3) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sendException(String str, Long l, String str2, String str3, Integer num, String str4) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sendGameData(String str, String str2) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sendStat(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, Integer num, Integer num2, Long l2, String str8, String str9, String str10, Integer num3, String str11, Integer num4, Integer num5, String str12, Integer num6) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sendStoryData(String str, String str2, String str3) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sessionClose(StatisticSendObject statisticSendObject) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sessionOpen(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request sessionUpdate(StatisticSendObject statisticSendObject) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request share(String str, String str2) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request storyFavorite(String str, Integer num) {
        return new DumbRequest();
    }

    @Override // com.inappstory.sdk.network.ApiInterface
    public Request storyLike(String str, Integer num) {
        return new DumbRequest();
    }
}
