package com.inappstory.sdk.network;

import java.lang.reflect.Type;
/* loaded from: classes3.dex */
public interface SimpleApiCallback<T> {
    Type getType();

    void onError(String str);

    void onSuccess(T t, Object... objArr);
}
