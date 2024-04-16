package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import defpackage.yy7;
import defpackage.z20;
/* compiled from: PersistedInstallationEntry.java */
@AutoValue
/* renamed from: zy7  reason: default package */
/* loaded from: classes2.dex */
public abstract class zy7 {
    @NonNull
    public static zy7 a = a().a();

    /* compiled from: PersistedInstallationEntry.java */
    @AutoValue.Builder
    /* renamed from: zy7$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @NonNull
        public abstract zy7 a();

        @NonNull
        public abstract a b(String str);

        @NonNull
        public abstract a c(long j);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(String str);

        @NonNull
        public abstract a f(String str);

        @NonNull
        public abstract a g(@NonNull yy7.a aVar);

        @NonNull
        public abstract a h(long j);
    }

    @NonNull
    public static a a() {
        return new z20.b().h(0L).g(yy7.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    @NonNull
    public abstract yy7.a g();

    public abstract long h();

    public boolean i() {
        if (g() == yy7.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() != yy7.a.NOT_GENERATED && g() != yy7.a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (g() == yy7.a.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == yy7.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == yy7.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    @NonNull
    public abstract a n();

    @NonNull
    public zy7 o(@NonNull String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    @NonNull
    public zy7 p() {
        return n().b(null).a();
    }

    @NonNull
    public zy7 q(@NonNull String str) {
        return n().e(str).g(yy7.a.REGISTER_ERROR).a();
    }

    @NonNull
    public zy7 r() {
        return n().g(yy7.a.NOT_GENERATED).a();
    }

    @NonNull
    public zy7 s(@NonNull String str, @NonNull String str2, long j, String str3, long j2) {
        return n().d(str).g(yy7.a.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    @NonNull
    public zy7 t(@NonNull String str) {
        return n().d(str).g(yy7.a.UNREGISTERED).a();
    }
}
