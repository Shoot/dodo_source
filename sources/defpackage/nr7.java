package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Path.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u000e\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b/\u00100J\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\rJ\u0011\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u001a\u0010\u0019\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010'\u001a\u0004\u0018\u00010$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010,\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010.\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b-\u0010\u001b¨\u00062"}, d2 = {"Lnr7;", "", "", "child", "u", "(Ljava/lang/String;)Lnr7;", "", "normalize", "t", "other", Image.TYPE_SMALL, "Ljava/io/File;", "w", "Ljava/nio/file/Path;", "x", "", "a", "", "equals", "hashCode", "toString", "Llk0;", "Llk0;", "g", "()Llk0;", "bytes", Image.TYPE_HIGH, "()Lnr7;", "root", "", "i", "()Ljava/util/List;", "segmentsBytes", "k", "()Z", "isAbsolute", "", "z", "()Ljava/lang/Character;", "volumeLetter", "p", "nameBytes", "o", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "q", "parent", "<init>", "(Llk0;)V", "b", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: nr7  reason: default package */
/* loaded from: classes3.dex */
public final class nr7 implements Comparable<nr7> {
    public static final a b = new a(null);
    public static final String c;
    private final lk0 a;

    /* compiled from: Path.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u0005*\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u0005*\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lnr7$a;", "", "", "", "normalize", "Lnr7;", "b", "(Ljava/lang/String;Z)Lnr7;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)Lnr7;", "Ljava/nio/file/Path;", c.a, "(Ljava/nio/file/Path;Z)Lnr7;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nr7$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ nr7 d(a aVar, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.a(file, z);
        }

        public static /* synthetic */ nr7 e(a aVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.b(str, z);
        }

        public static /* synthetic */ nr7 f(a aVar, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.c(path, z);
        }

        public final nr7 a(File file, boolean z) {
            z65.h(file, "<this>");
            String file2 = file.toString();
            z65.g(file2, "toString(...)");
            return b(file2, z);
        }

        public final nr7 b(String str, boolean z) {
            z65.h(str, "<this>");
            return g.k(str, z);
        }

        public final nr7 c(Path path, boolean z) {
            z65.h(path, "<this>");
            return b(path.toString(), z);
        }
    }

    static {
        String str = File.separator;
        z65.g(str, "separator");
        c = str;
    }

    public nr7(lk0 lk0Var) {
        z65.h(lk0Var, "bytes");
        this.a = lk0Var;
    }

    public static /* synthetic */ nr7 v(nr7 nr7Var, nr7 nr7Var2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nr7Var.t(nr7Var2, z);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(nr7 nr7Var) {
        z65.h(nr7Var, "other");
        return g().compareTo(nr7Var.g());
    }

    public boolean equals(Object obj) {
        if ((obj instanceof nr7) && z65.c(((nr7) obj).g(), g())) {
            return true;
        }
        return false;
    }

    public final lk0 g() {
        return this.a;
    }

    public final nr7 h() {
        int o;
        o = g.o(this);
        if (o == -1) {
            return null;
        }
        return new nr7(g().p0(0, o));
    }

    public int hashCode() {
        return g().hashCode();
    }

    public final List<lk0> i() {
        int o;
        ArrayList arrayList = new ArrayList();
        o = g.o(this);
        if (o == -1) {
            o = 0;
        } else if (o < g().n0() && g().s(o) == 92) {
            o++;
        }
        int n0 = g().n0();
        int i = o;
        while (o < n0) {
            if (g().s(o) == 47 || g().s(o) == 92) {
                arrayList.add(g().p0(i, o));
                i = o + 1;
            }
            o++;
        }
        if (i < g().n0()) {
            arrayList.add(g().p0(i, g().n0()));
        }
        return arrayList;
    }

    public final boolean k() {
        int o;
        o = g.o(this);
        if (o != -1) {
            return true;
        }
        return false;
    }

    public final String o() {
        return p().z0();
    }

    public final lk0 p() {
        int l;
        l = g.l(this);
        if (l != -1) {
            return lk0.q0(g(), l + 1, 0, 2, null);
        }
        if (z() != null && g().n0() == 2) {
            return lk0.e;
        }
        return g();
    }

    public final nr7 q() {
        lk0 lk0Var;
        lk0 lk0Var2;
        lk0 lk0Var3;
        boolean n;
        int l;
        nr7 nr7Var;
        lk0 lk0Var4;
        lk0 lk0Var5;
        lk0 g = g();
        lk0Var = g.d;
        if (z65.c(g, lk0Var)) {
            return null;
        }
        lk0 g2 = g();
        lk0Var2 = g.a;
        if (z65.c(g2, lk0Var2)) {
            return null;
        }
        lk0 g3 = g();
        lk0Var3 = g.b;
        if (!z65.c(g3, lk0Var3)) {
            n = g.n(this);
            if (!n) {
                l = g.l(this);
                if (l == 2 && z() != null) {
                    if (g().n0() == 3) {
                        return null;
                    }
                    nr7Var = new nr7(lk0.q0(g(), 0, 3, 1, null));
                } else {
                    if (l == 1) {
                        lk0 g4 = g();
                        lk0Var5 = g.b;
                        if (g4.o0(lk0Var5)) {
                            return null;
                        }
                    }
                    if (l == -1 && z() != null) {
                        if (g().n0() == 2) {
                            return null;
                        }
                        nr7Var = new nr7(lk0.q0(g(), 0, 2, 1, null));
                    } else if (l == -1) {
                        lk0Var4 = g.d;
                        return new nr7(lk0Var4);
                    } else if (l == 0) {
                        nr7Var = new nr7(lk0.q0(g(), 0, 1, 1, null));
                    } else {
                        return new nr7(lk0.q0(g(), 0, l, 1, null));
                    }
                }
                return nr7Var;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
        r9 = defpackage.g.m(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nr7 s(defpackage.nr7 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            defpackage.z65.h(r9, r0)
            nr7 r0 = r8.h()
            nr7 r1 = r9.h()
            boolean r0 = defpackage.z65.c(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.i()
            java.util.List r2 = r9.i()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = 0
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = defpackage.z65.c(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            lk0 r3 = r8.g()
            int r3 = r3.n0()
            lk0 r6 = r9.g()
            int r6 = r6.n0()
            if (r3 != r6) goto L5d
            nr7$a r9 = defpackage.nr7.b
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            nr7 r9 = defpackage.nr7.a.e(r9, r0, r4, r2, r1)
            goto Lb4
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            lk0 r6 = defpackage.g.c()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lb5
            yg0 r1 = new yg0
            r1.<init>()
            lk0 r9 = defpackage.g.f(r9)
            if (r9 != 0) goto L87
            lk0 r9 = defpackage.g.f(r8)
            if (r9 != 0) goto L87
            java.lang.String r9 = defpackage.nr7.c
            lk0 r9 = defpackage.g.i(r9)
        L87:
            int r2 = r2.size()
            r3 = r5
        L8c:
            if (r3 >= r2) goto L9b
            lk0 r6 = defpackage.g.c()
            r1.d0(r6)
            r1.d0(r9)
            int r3 = r3 + 1
            goto L8c
        L9b:
            int r2 = r0.size()
        L9f:
            if (r5 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r5)
            lk0 r3 = (defpackage.lk0) r3
            r1.d0(r3)
            r1.d0(r9)
            int r5 = r5 + 1
            goto L9f
        Lb0:
            nr7 r9 = defpackage.g.q(r1, r4)
        Lb4:
            return r9
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Ld6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr7.s(nr7):nr7");
    }

    public final nr7 t(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, "child");
        return g.j(this, nr7Var, z);
    }

    public String toString() {
        return g().z0();
    }

    public final nr7 u(String str) {
        z65.h(str, "child");
        return g.j(this, g.q(new yg0().a0(str), false), false);
    }

    public final File w() {
        return new File(toString());
    }

    public final Path x() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        z65.g(path, "get(...)");
        return path;
    }

    public final Character z() {
        lk0 lk0Var;
        lk0 g = g();
        lk0Var = g.a;
        if (lk0.L(g, lk0Var, 0, 2, null) != -1 || g().n0() < 2 || g().s(1) != 58) {
            return null;
        }
        char s = (char) g().s(0);
        if (('a' > s || s >= '{') && ('A' > s || s >= '[')) {
            return null;
        }
        return Character.valueOf(s);
    }
}
