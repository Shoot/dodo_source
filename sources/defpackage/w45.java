package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import defpackage.s20;
/* compiled from: InstallationResponse.java */
@AutoValue
/* renamed from: w45  reason: default package */
/* loaded from: classes2.dex */
public abstract class w45 {

    /* compiled from: InstallationResponse.java */
    @AutoValue.Builder
    /* renamed from: w45$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract w45 a();

        @NonNull
        public abstract a b(@NonNull rib ribVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(@NonNull b bVar);

        @NonNull
        public abstract a f(@NonNull String str);
    }

    /* compiled from: InstallationResponse.java */
    /* renamed from: w45$b */
    /* loaded from: classes2.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    @NonNull
    public static a a() {
        return new s20.b();
    }

    public abstract rib b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
