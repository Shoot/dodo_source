package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import defpackage.m30;
/* compiled from: TokenResult.java */
@AutoValue
/* renamed from: rib  reason: default package */
/* loaded from: classes2.dex */
public abstract class rib {

    /* compiled from: TokenResult.java */
    @AutoValue.Builder
    /* renamed from: rib$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract rib a();

        @NonNull
        public abstract a b(@NonNull b bVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(long j);
    }

    /* compiled from: TokenResult.java */
    /* renamed from: rib$b */
    /* loaded from: classes2.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    public static a a() {
        return new m30.b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    @NonNull
    public abstract long d();
}
