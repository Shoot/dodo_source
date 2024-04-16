package com.inappstory.sdk.network;

import java.lang.reflect.Type;
/* loaded from: classes3.dex */
public interface Callback<T> {
    Type getType();

    void onFailure(Response response);

    void onSuccess(T t);
}
