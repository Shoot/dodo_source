package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import defpackage.b30;
/* compiled from: RolloutAssignment.java */
@AutoValue
/* renamed from: in9  reason: default package */
/* loaded from: classes2.dex */
public abstract class in9 {
    public static final tk2 a = new ja5().j(a10.a).i();

    /* compiled from: RolloutAssignment.java */
    @AutoValue.Builder
    /* renamed from: in9$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract in9 a();

        @NonNull
        public abstract a b(@NonNull String str);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(long j);

        @NonNull
        public abstract a f(@NonNull String str);
    }

    @NonNull
    public static a a() {
        return new b30.b();
    }

    @NonNull
    public abstract String b();

    @NonNull
    public abstract String c();

    @NonNull
    public abstract String d();

    public abstract long e();

    @NonNull
    public abstract String f();
}
