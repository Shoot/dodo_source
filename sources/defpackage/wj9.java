package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nr7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
/* compiled from: ResourceFileSystem.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 02\u00020\u0001:\u00011B#\b\u0000\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010-\u001a\u00020\u0017\u0012\b\b\u0002\u0010(\u001a\u00020\u0001¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\t0\b*\u00020\u0007H\u0002J\u001a\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t*\u00020\u000bH\u0002J\u001a\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t*\u00020\u000bH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R-\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+¨\u00062"}, d2 = {"Lwj9;", "Liu3;", "Lnr7;", "path", "v", "", "A", "Ljava/lang/ClassLoader;", "", "Lkotlin/Pair;", "x", "Ljava/net/URL;", "y", "z", "dir", "k", Action.FILE_ATTRIBUTE, "Lwt3;", "n", "Lbu3;", Image.TYPE_MEDIUM, "Lpqa;", "q", "", "mustCreate", "Lzma;", "p", "mustExist", "b", "", "g", KustoStorage.KustoTable.COLUMN_SOURCE, "target", com.huawei.hms.opendevice.c.a, "i", e.a, "Ljava/lang/ClassLoader;", "classLoader", "f", "Liu3;", "systemFileSystem", "Lrn5;", "w", "()Ljava/util/List;", "roots", "indexEagerly", "<init>", "(Ljava/lang/ClassLoader;ZLiu3;)V", Image.TYPE_HIGH, "a", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: wj9  reason: default package */
/* loaded from: classes3.dex */
public final class wj9 extends iu3 {
    private static final a h = new a(null);
    private static final nr7 i = nr7.a.e(nr7.b, "/", false, 1, null);
    private final ClassLoader e;
    private final iu3 f;
    private final rn5 g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceFileSystem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lwj9$a;", "", "Lnr7;", "path", "", com.huawei.hms.opendevice.c.a, "base", DateTokenConverter.CONVERTER_KEY, Logger.ROOT_LOGGER_NAME, "Lnr7;", "b", "()Lnr7;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wj9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(nr7 nr7Var) {
            boolean t;
            t = l0b.t(nr7Var.o(), ".class", true);
            return !t;
        }

        public final nr7 b() {
            return wj9.i;
        }

        public final nr7 d(nr7 nr7Var, nr7 nr7Var2) {
            String p0;
            String E;
            z65.h(nr7Var, "<this>");
            z65.h(nr7Var2, "base");
            String nr7Var3 = nr7Var2.toString();
            nr7 b = b();
            p0 = m0b.p0(nr7Var.toString(), nr7Var3);
            E = l0b.E(p0, CoreConstants.ESCAPE_CHAR, '/', false, 4, null);
            return b.u(E);
        }
    }

    /* compiled from: ResourceFileSystem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/Pair;", "Liu3;", "Lnr7;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wj9$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function0<List<? extends Pair<? extends iu3, ? extends nr7>>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Pair<? extends iu3, ? extends nr7>> invoke() {
            wj9 wj9Var = wj9.this;
            return wj9Var.x(wj9Var.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceFileSystem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrcc;", "entry", "", "a", "(Lrcc;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: wj9$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function1<rcc, Boolean> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(rcc rccVar) {
            z65.h(rccVar, "entry");
            return Boolean.valueOf(wj9.h.c(rccVar.a()));
        }
    }

    public /* synthetic */ wj9(ClassLoader classLoader, boolean z, iu3 iu3Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z, (i2 & 4) != 0 ? iu3.b : iu3Var);
    }

    private final String A(nr7 nr7Var) {
        return v(nr7Var).s(i).toString();
    }

    private final nr7 v(nr7 nr7Var) {
        return i.t(nr7Var, true);
    }

    private final List<Pair<iu3, nr7>> w() {
        return (List) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<iu3, nr7>> x(ClassLoader classLoader) {
        List<Pair<iu3, nr7>> q0;
        Enumeration<URL> resources = classLoader.getResources("");
        z65.g(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        z65.g(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            z65.e(url);
            Pair<iu3, nr7> y = y(url);
            if (y != null) {
                arrayList.add(y);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        z65.g(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        z65.g(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            z65.e(url2);
            Pair<iu3, nr7> z = z(url2);
            if (z != null) {
                arrayList2.add(z);
            }
        }
        q0 = sc1.q0(arrayList, arrayList2);
        return q0;
    }

    private final Pair<iu3, nr7> y(URL url) {
        if (!z65.c(url.getProtocol(), Action.FILE_ATTRIBUTE)) {
            return null;
        }
        return lnb.a(this.f, nr7.a.d(nr7.b, new File(url.toURI()), false, 1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        r0 = defpackage.m0b.e0(r9, "!", 0, false, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Pair<defpackage.iu3, defpackage.nr7> z(java.net.URL r9) {
        /*
            r8 = this;
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "toString(...)"
            defpackage.z65.g(r9, r0)
            java.lang.String r0 = "jar:file:"
            r6 = 0
            r1 = 2
            r7 = 0
            boolean r0 = defpackage.c0b.J(r9, r0, r6, r1, r7)
            if (r0 != 0) goto L15
            return r7
        L15:
            java.lang.String r1 = "!"
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r9
            int r0 = defpackage.c0b.e0(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r0 != r1) goto L24
            return r7
        L24:
            nr7$a r1 = defpackage.nr7.b
            java.io.File r2 = new java.io.File
            r3 = 4
            java.lang.String r9 = r9.substring(r3, r0)
            java.lang.String r0 = "substring(...)"
            defpackage.z65.g(r9, r0)
            java.net.URI r9 = java.net.URI.create(r9)
            r2.<init>(r9)
            r9 = 1
            nr7 r9 = defpackage.nr7.a.d(r1, r2, r6, r9, r7)
            iu3 r0 = r8.f
            wj9$c r1 = defpackage.wj9.c.a
            tcc r9 = defpackage.ucc.d(r9, r0, r1)
            nr7 r0 = defpackage.wj9.i
            kotlin.Pair r9 = defpackage.lnb.a(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj9.z(java.net.URL):kotlin.Pair");
    }

    @Override // defpackage.iu3
    public zma b(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.iu3
    public void c(nr7 nr7Var, nr7 nr7Var2) {
        z65.h(nr7Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(nr7Var2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.iu3
    public void g(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.iu3
    public void i(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.iu3
    public List<nr7> k(nr7 nr7Var) {
        List<nr7> F0;
        int w;
        z65.h(nr7Var, "dir");
        String A = A(nr7Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair<iu3, nr7> pair : w()) {
            iu3 a2 = pair.a();
            nr7 b2 = pair.b();
            try {
                ArrayList<nr7> arrayList = new ArrayList();
                for (Object obj : a2.k(b2.u(A))) {
                    if (h.c((nr7) obj)) {
                        arrayList.add(obj);
                    }
                }
                w = lc1.w(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (nr7 nr7Var2 : arrayList) {
                    arrayList2.add(h.d(nr7Var2, b2));
                }
                pc1.C(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            F0 = sc1.F0(linkedHashSet);
            return F0;
        }
        throw new FileNotFoundException("file not found: " + nr7Var);
    }

    @Override // defpackage.iu3
    public bu3 m(nr7 nr7Var) {
        z65.h(nr7Var, "path");
        if (!h.c(nr7Var)) {
            return null;
        }
        String A = A(nr7Var);
        for (Pair<iu3, nr7> pair : w()) {
            bu3 m = pair.a().m(pair.b().u(A));
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    @Override // defpackage.iu3
    public wt3 n(nr7 nr7Var) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        if (h.c(nr7Var)) {
            String A = A(nr7Var);
            for (Pair<iu3, nr7> pair : w()) {
                try {
                    return pair.a().n(pair.b().u(A));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + nr7Var);
        }
        throw new FileNotFoundException("file not found: " + nr7Var);
    }

    @Override // defpackage.iu3
    public zma p(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.iu3
    public pqa q(nr7 nr7Var) {
        pqa j;
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        if (h.c(nr7Var)) {
            nr7 nr7Var2 = i;
            InputStream resourceAsStream = this.e.getResourceAsStream(nr7.v(nr7Var2, nr7Var, false, 2, null).s(nr7Var2).toString());
            if (resourceAsStream != null && (j = c77.j(resourceAsStream)) != null) {
                return j;
            }
            throw new FileNotFoundException("file not found: " + nr7Var);
        }
        throw new FileNotFoundException("file not found: " + nr7Var);
    }

    public wj9(ClassLoader classLoader, boolean z, iu3 iu3Var) {
        rn5 b2;
        z65.h(classLoader, "classLoader");
        z65.h(iu3Var, "systemFileSystem");
        this.e = classLoader;
        this.f = iu3Var;
        b2 = yn5.b(new b());
        this.g = b2;
        if (z) {
            w().size();
        }
    }
}
