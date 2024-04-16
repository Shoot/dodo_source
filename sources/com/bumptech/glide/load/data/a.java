package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
/* compiled from: DataRewinder.java */
/* loaded from: classes.dex */
public interface a<T> {

    /* compiled from: DataRewinder.java */
    /* renamed from: com.bumptech.glide.load.data.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0099a<T> {
        @NonNull
        Class<T> a();

        @NonNull
        a<T> b(@NonNull T t);
    }

    @NonNull
    T a() throws IOException;

    void b();
}
