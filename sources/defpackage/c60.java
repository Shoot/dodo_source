package defpackage;

import com.google.auto.value.AutoValue;
/* compiled from: BackendResponse.java */
@AutoValue
/* renamed from: c60  reason: default package */
/* loaded from: classes2.dex */
public abstract class c60 {

    /* compiled from: BackendResponse.java */
    /* renamed from: c60$a */
    /* loaded from: classes2.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static c60 a() {
        return new h10(a.FATAL_ERROR, -1L);
    }

    public static c60 d() {
        return new h10(a.INVALID_PAYLOAD, -1L);
    }

    public static c60 e(long j) {
        return new h10(a.OK, j);
    }

    public static c60 f() {
        return new h10(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
