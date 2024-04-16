package defpackage;

import com.google.auto.value.AutoValue;
/* compiled from: StaticSessionData.java */
@AutoValue
/* renamed from: mwa  reason: default package */
/* loaded from: classes2.dex */
public abstract class mwa {

    /* compiled from: StaticSessionData.java */
    @AutoValue
    /* renamed from: mwa$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i, p13 p13Var) {
            return new j30(str, str2, str3, str4, i, p13Var);
        }

        public abstract String a();

        public abstract int c();

        public abstract p13 d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    /* compiled from: StaticSessionData.java */
    @AutoValue
    /* renamed from: mwa$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public static b c(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new k30(i, str, i2, j, j2, z, i3, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    /* compiled from: StaticSessionData.java */
    @AutoValue
    /* renamed from: mwa$c */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public static c a(String str, String str2, boolean z) {
            return new l30(str, str2, z);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static mwa b(a aVar, c cVar, b bVar) {
        return new i30(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
