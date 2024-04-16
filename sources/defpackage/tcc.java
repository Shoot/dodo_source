package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nr7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ZipFileSystem.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001-B7\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0#\u0012\b\u0010*\u001a\u0004\u0018\u00010'¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Ltcc;", "Liu3;", "Lnr7;", "path", "r", "dir", "", "throwOnFailure", "", Image.TYPE_SMALL, "Lbu3;", Image.TYPE_MEDIUM, Action.FILE_ATTRIBUTE, "Lwt3;", "n", "k", "Lpqa;", "q", "mustCreate", "Lzma;", "p", "mustExist", "b", "", "g", KustoStorage.KustoTable.COLUMN_SOURCE, "target", c.a, "i", e.a, "Lnr7;", "zipPath", "f", "Liu3;", "fileSystem", "", "Lrcc;", "Ljava/util/Map;", "entries", "", Image.TYPE_HIGH, "Ljava/lang/String;", "comment", "<init>", "(Lnr7;Liu3;Ljava/util/Map;Ljava/lang/String;)V", "a", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: tcc  reason: default package */
/* loaded from: classes3.dex */
public final class tcc extends iu3 {
    private static final a i = new a(null);
    private static final nr7 j = nr7.a.e(nr7.b, "/", false, 1, null);
    private final nr7 e;
    private final iu3 f;
    private final Map<nr7, rcc> g;
    private final String h;

    /* compiled from: ZipFileSystem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltcc$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tcc$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public tcc(nr7 nr7Var, iu3 iu3Var, Map<nr7, rcc> map, String str) {
        z65.h(nr7Var, "zipPath");
        z65.h(iu3Var, "fileSystem");
        z65.h(map, "entries");
        this.e = nr7Var;
        this.f = iu3Var;
        this.g = map;
        this.h = str;
    }

    private final nr7 r(nr7 nr7Var) {
        return j.t(nr7Var, true);
    }

    private final List<nr7> s(nr7 nr7Var, boolean z) {
        List<nr7> F0;
        rcc rccVar = this.g.get(r(nr7Var));
        if (rccVar != null) {
            F0 = sc1.F0(rccVar.b());
            return F0;
        } else if (!z) {
            return null;
        } else {
            throw new IOException("not a directory: " + nr7Var);
        }
    }

    @Override // defpackage.iu3
    public zma b(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.iu3
    public void c(nr7 nr7Var, nr7 nr7Var2) {
        z65.h(nr7Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(nr7Var2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.iu3
    public void g(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.iu3
    public void i(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.iu3
    public List<nr7> k(nr7 nr7Var) {
        z65.h(nr7Var, "dir");
        List<nr7> s = s(nr7Var, true);
        z65.e(s);
        return s;
    }

    @Override // defpackage.iu3
    public bu3 m(nr7 nr7Var) {
        Long valueOf;
        bu3 bu3Var;
        z65.h(nr7Var, "path");
        rcc rccVar = this.g.get(r(nr7Var));
        Throwable th = null;
        if (rccVar == null) {
            return null;
        }
        boolean z = !rccVar.h();
        boolean h = rccVar.h();
        if (rccVar.h()) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(rccVar.g());
        }
        bu3 bu3Var2 = new bu3(z, h, null, valueOf, null, rccVar.e(), null, null, 128, null);
        if (rccVar.f() == -1) {
            return bu3Var2;
        }
        wt3 n = this.f.n(this.e);
        try {
            fh0 c = c77.c(n.o(rccVar.f()));
            bu3Var = ucc.h(c, bu3Var2);
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (n != null) {
                try {
                    n.close();
                } catch (Throwable th4) {
                    vl3.a(th3, th4);
                }
            }
            bu3Var = null;
            th = th3;
        }
        if (th == null) {
            z65.e(bu3Var);
            if (n != null) {
                try {
                    n.close();
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            if (th == null) {
                z65.e(bu3Var);
                return bu3Var;
            }
            throw th;
        }
        throw th;
    }

    @Override // defpackage.iu3
    public wt3 n(nr7 nr7Var) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.iu3
    public zma p(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.iu3
    public pqa q(nr7 nr7Var) throws IOException {
        fh0 fh0Var;
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        rcc rccVar = this.g.get(r(nr7Var));
        if (rccVar != null) {
            wt3 n = this.f.n(this.e);
            Throwable th = null;
            try {
                fh0Var = c77.c(n.o(rccVar.f()));
                if (n != null) {
                    try {
                        n.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (n != null) {
                    try {
                        n.close();
                    } catch (Throwable th4) {
                        vl3.a(th3, th4);
                    }
                }
                fh0Var = null;
                th = th3;
            }
            if (th == null) {
                z65.e(fh0Var);
                ucc.k(fh0Var);
                if (rccVar.d() == 0) {
                    return new qy3(fh0Var, rccVar.g(), true);
                }
                return new qy3(new a15(new qy3(fh0Var, rccVar.c(), true), new Inflater(true)), rccVar.g(), false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + nr7Var);
    }
}
