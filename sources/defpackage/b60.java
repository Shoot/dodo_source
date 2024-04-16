package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.g10;
/* compiled from: BackendRequest.java */
@AutoValue
/* renamed from: b60  reason: default package */
/* loaded from: classes2.dex */
public abstract class b60 {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
    /* renamed from: b60$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract b60 a();

        public abstract a b(Iterable<wk3> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new g10.b();
    }

    public abstract Iterable<wk3> b();

    public abstract byte[] c();
}
