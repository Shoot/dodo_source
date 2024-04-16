package io.realm;

import android.content.Context;
import io.realm.annotations.RealmModule;
import io.realm.d0;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.Util;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: RealmConfiguration.java */
/* loaded from: classes3.dex */
public class j0 {
    private static final Object r;
    protected static final t89 s;
    private final File a;
    private final String b;
    private final String c;
    private final String d;
    private final byte[] e;
    private final long f;
    private final boolean g;
    private final OsRealmConfig.c h;
    private final t89 i;
    private final up9 j;
    private final vz3 k;
    private final boolean l;
    private final CompactOnLaunchCallback m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    /* compiled from: RealmConfiguration.java */
    /* loaded from: classes3.dex */
    public static class a {
        private File a;
        private String b;
        private String c;
        private byte[] d;
        private long e;
        private boolean f;
        private OsRealmConfig.c g;
        private HashSet<Object> h;
        private HashSet<Class<? extends o89>> i;
        private boolean j;
        private up9 k;
        private vz3 l;
        private boolean m;
        private CompactOnLaunchCallback n;
        private long o;
        private boolean p;
        private boolean q;

        public a() {
            this(io.realm.a.h);
        }

        private void c(Object obj) {
            if (obj.getClass().isAnnotationPresent(RealmModule.class)) {
                return;
            }
            throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not a RealmModule. Add @RealmModule to the class definition.");
        }

        private void f(Context context) {
            this.a = context.getFilesDir();
            this.b = "default.realm";
            this.d = null;
            this.e = 0L;
            this.f = false;
            this.g = OsRealmConfig.c.FULL;
            this.m = false;
            this.n = null;
            if (j0.r != null) {
                this.h.add(j0.r);
            }
            this.p = false;
            this.q = true;
        }

        public final a a(Object obj) {
            if (obj != null) {
                c(obj);
                this.h.add(obj);
            }
            return this;
        }

        public j0 b() {
            if (this.m) {
                if (this.c != null) {
                    if (!this.f) {
                        if (this.n != null) {
                            throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                        }
                    } else {
                        throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                    }
                } else {
                    throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                }
            }
            if (this.k == null && Util.g()) {
                this.k = new s89(true);
            }
            if (this.l == null && Util.e()) {
                this.l = new l89(Boolean.TRUE);
            }
            return new j0(new File(this.a, this.b), this.c, this.d, this.e, null, this.f, this.g, j0.b(this.h, this.i, this.j), this.k, this.l, null, this.m, this.n, false, this.o, this.p, this.q);
        }

        public a d() {
            String str = this.c;
            if (str != null && str.length() != 0) {
                throw new IllegalStateException("Realm cannot clear its schema when previously configured to use an asset file by calling assetFile().");
            }
            this.f = true;
            return this;
        }

        public a e() {
            if (Util.f(this.c)) {
                this.g = OsRealmConfig.c.MEM_ONLY;
                return this;
            }
            throw new RealmException("Realm can not use in-memory configuration if asset file is present.");
        }

        public a g(Object obj, Object... objArr) {
            this.h.clear();
            a(obj);
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    a(obj2);
                }
            }
            return this;
        }

        public a h(String str) {
            if (str != null && !str.isEmpty()) {
                this.b = str;
                return this;
            }
            throw new IllegalArgumentException("A non-empty filename must be provided");
        }

        public a i(long j) {
            if (j >= 0) {
                this.e = j;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context) {
            this.h = new HashSet<>();
            this.i = new HashSet<>();
            this.j = false;
            this.o = Long.MAX_VALUE;
            if (context != null) {
                e89.a(context);
                f(context);
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }
    }

    static {
        Object z0 = d0.z0();
        r = z0;
        if (z0 != null) {
            t89 j = j(z0.getClass().getCanonicalName());
            if (j.t()) {
                s = j;
                return;
            }
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin");
        }
        s = null;
    }

    protected j0(File file, String str, byte[] bArr, long j, n89 n89Var, boolean z, OsRealmConfig.c cVar, t89 t89Var, up9 up9Var, vz3 vz3Var, d0.b bVar, boolean z2, CompactOnLaunchCallback compactOnLaunchCallback, boolean z3, long j2, boolean z4, boolean z5) {
        this.a = file.getParentFile();
        this.b = file.getName();
        this.c = file.getAbsolutePath();
        this.d = str;
        this.e = bArr;
        this.f = j;
        this.g = z;
        this.h = cVar;
        this.i = t89Var;
        this.j = up9Var;
        this.k = vz3Var;
        this.l = z2;
        this.m = compactOnLaunchCallback;
        this.q = z3;
        this.n = j2;
        this.o = z4;
        this.p = z5;
    }

    protected static t89 b(Set<Object> set, Set<Class<? extends o89>> set2, boolean z) {
        if (set2.size() > 0) {
            return new av3(s, set2, z);
        }
        if (set.size() == 1) {
            return j(set.iterator().next().getClass().getCanonicalName());
        }
        t89[] t89VarArr = new t89[set.size()];
        int i = 0;
        for (Object obj : set) {
            t89VarArr[i] = j(obj.getClass().getCanonicalName());
            i++;
        }
        return new xn1(t89VarArr);
    }

    private static t89 j(String str) {
        String[] split = str.split("\\.");
        String format = String.format(Locale.US, "io.realm.%s%s", split[split.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (t89) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new RealmException("Could not find " + format, e);
        } catch (IllegalAccessException e2) {
            throw new RealmException("Could not create an instance of " + format, e2);
        } catch (InstantiationException e3) {
            throw new RealmException("Could not create an instance of " + format, e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Could not create an instance of " + format, e4);
        }
    }

    public String c() {
        return this.d;
    }

    public CompactOnLaunchCallback d() {
        return this.m;
    }

    public OsRealmConfig.c e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f != j0Var.f || this.g != j0Var.g || this.l != j0Var.l || this.q != j0Var.q) {
            return false;
        }
        File file = this.a;
        if (file == null ? j0Var.a != null : !file.equals(j0Var.a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? j0Var.b != null : !str.equals(j0Var.b)) {
            return false;
        }
        if (!this.c.equals(j0Var.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null ? j0Var.d != null : !str2.equals(j0Var.d)) {
            return false;
        }
        if (!Arrays.equals(this.e, j0Var.e) || this.h != j0Var.h || !this.i.equals(j0Var.i)) {
            return false;
        }
        up9 up9Var = this.j;
        if (up9Var == null ? j0Var.j != null : !up9Var.equals(j0Var.j)) {
            return false;
        }
        CompactOnLaunchCallback compactOnLaunchCallback = this.m;
        if (compactOnLaunchCallback == null ? j0Var.m != null : !compactOnLaunchCallback.equals(j0Var.m)) {
            return false;
        }
        if (this.n == j0Var.n) {
            return true;
        }
        return false;
    }

    public byte[] f() {
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d0.b g() {
        return null;
    }

    public long h() {
        return this.n;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        File file = this.a;
        int i5 = 0;
        if (file != null) {
            i = file.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((i6 + i2) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j = this.f;
        int hashCode2 = (((((((((((hashCode + i3) * 31) + Arrays.hashCode(this.e)) * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.g ? 1 : 0)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        up9 up9Var = this.j;
        if (up9Var != null) {
            i4 = up9Var.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (((hashCode2 + i4) * 961) + (this.l ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.m;
        if (compactOnLaunchCallback != null) {
            i5 = compactOnLaunchCallback.hashCode();
        }
        long j2 = this.n;
        return ((((i7 + i5) * 31) + (this.q ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public n89 i() {
        return null;
    }

    public String k() {
        return this.c;
    }

    public File l() {
        return this.a;
    }

    public String m() {
        return this.b;
    }

    public up9 n() {
        up9 up9Var = this.j;
        if (up9Var != null) {
            return up9Var;
        }
        throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/realm/realm-java/tree/master/examples/rxJavaExample for more details.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t89 o() {
        return this.i;
    }

    public long p() {
        return this.f;
    }

    public boolean q() {
        return !Util.f(this.d);
    }

    public boolean r() {
        return this.p;
    }

    public boolean s() {
        return this.l;
    }

    public boolean t() {
        return this.q;
    }

    public String toString() {
        String str;
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        File file = this.a;
        if (file != null) {
            str = file.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.b);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.c);
        sb.append("\n");
        sb.append("key: ");
        sb.append("[length: ");
        if (this.e == null) {
            i = 0;
        } else {
            i = 64;
        }
        sb.append(i);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.f));
        sb.append("\n");
        sb.append("migration: ");
        sb.append((Object) null);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.g);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.h);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.i);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.l);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.m);
        sb.append("\n");
        sb.append("maxNumberOfActiveVersions: ");
        sb.append(this.n);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean v() {
        return new File(this.c).exists();
    }

    public boolean w() {
        return this.g;
    }
}
