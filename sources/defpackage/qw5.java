package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import defpackage.u20;
/* compiled from: LogEvent.java */
@AutoValue
/* renamed from: qw5  reason: default package */
/* loaded from: classes2.dex */
public abstract class qw5 {

    /* compiled from: LogEvent.java */
    @AutoValue.Builder
    /* renamed from: qw5$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract qw5 a();

        @NonNull
        public abstract a b(Integer num);

        @NonNull
        public abstract a c(long j);

        @NonNull
        public abstract a d(long j);

        @NonNull
        public abstract a e(zv6 zv6Var);

        @NonNull
        abstract a f(byte[] bArr);

        @NonNull
        abstract a g(String str);

        @NonNull
        public abstract a h(long j);
    }

    private static a a() {
        return new u20.b();
    }

    @NonNull
    public static a i(@NonNull String str) {
        return a().g(str);
    }

    @NonNull
    public static a j(@NonNull byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract zv6 e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
