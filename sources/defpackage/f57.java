package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ep2;
import defpackage.pp2;
import defpackage.sr2;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ObjectMapper.java */
/* renamed from: f57  reason: default package */
/* loaded from: classes2.dex */
public class f57 extends q47 implements Serializable {
    protected static final ql m;
    protected static final i80 n;
    protected final ra5 a;
    protected rnb b;
    protected q1b c;
    protected final vp1 d;
    protected final ta1 e;
    protected mla f;
    protected pca g;
    protected sr2 h;
    protected zca i;
    protected w03 j;
    protected pp2 k;
    protected final ConcurrentHashMap<y85, na5<Object>> l;

    static {
        j85 j85Var = new j85();
        m = j85Var;
        n = new i80(null, j85Var, null, rnb.S(), null, vwa.m, null, Locale.getDefault(), null, w60.a(), dj5.a, new ep2.b());
    }

    public f57() {
        this(null, null, null);
    }

    private final void d(ua5 ua5Var, Object obj, pca pcaVar) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            c(pcaVar).b1(ua5Var, obj);
        } catch (Exception e) {
            e = e;
        }
        try {
            closeable.close();
            ua5Var.close();
        } catch (Exception e2) {
            e = e2;
            closeable = null;
            q81.i(ua5Var, closeable, e);
        }
    }

    private final void e(ua5 ua5Var, Object obj, pca pcaVar) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            c(pcaVar).b1(ua5Var, obj);
            if (pcaVar.K0(qca.FLUSH_AFTER_WRITE_VALUE)) {
                ua5Var.flush();
            }
            closeable.close();
        } catch (Exception e) {
            q81.i(null, closeable, e);
        }
    }

    @Override // defpackage.q47
    public void a(ua5 ua5Var, Object obj) throws IOException, StreamWriteException, DatabindException {
        b("g", ua5Var);
        pca l = l();
        if (l.K0(qca.INDENT_OUTPUT) && ua5Var.o() == null) {
            ua5Var.E(l.E0());
        }
        if (l.K0(qca.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            e(ua5Var, obj, l);
            return;
        }
        c(l).b1(ua5Var, obj);
        if (l.K0(qca.FLUSH_AFTER_WRITE_VALUE)) {
            ua5Var.flush();
        }
    }

    protected final void b(String str, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
    }

    protected sr2 c(pca pcaVar) {
        return this.h.a1(pcaVar, this.i);
    }

    protected final void f(ua5 ua5Var, Object obj) throws IOException {
        pca l = l();
        if (l.K0(qca.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            d(ua5Var, obj, l);
            return;
        }
        try {
            c(l).b1(ua5Var, obj);
            ua5Var.close();
        } catch (Exception e) {
            q81.j(ua5Var, e);
        }
    }

    @Deprecated
    public f57 i(y76 y76Var, boolean z) {
        pca x0;
        w03 x02;
        if (z) {
            x0 = this.g.r0(y76Var);
        } else {
            x0 = this.g.x0(y76Var);
        }
        this.g = x0;
        if (z) {
            x02 = this.j.r0(y76Var);
        } else {
            x02 = this.j.x0(y76Var);
        }
        this.j = x02;
        return this;
    }

    public ua5 j(Writer writer) throws IOException {
        b("w", writer);
        ua5 i = this.a.i(writer);
        this.g.I0(i);
        return i;
    }

    protected j81 k() {
        return new a90();
    }

    public pca l() {
        return this.g;
    }

    public String m(Object obj) throws JsonProcessingException {
        f4a f4aVar = new f4a(this.a.e());
        try {
            f(j(f4aVar), obj);
            return f4aVar.a();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.l(e2);
        }
    }

    public f57(ra5 ra5Var) {
        this(ra5Var, null, null);
    }

    public f57(ra5 ra5Var, sr2 sr2Var, pp2 pp2Var) {
        this.l = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (ra5Var == null) {
            this.a = new z76(this);
        } else {
            this.a = ra5Var;
            if (ra5Var.j() == null) {
                ra5Var.l(this);
            }
        }
        this.c = new dxa();
        bo9 bo9Var = new bo9();
        this.b = rnb.S();
        mla mlaVar = new mla(null);
        this.f = mlaVar;
        i80 o = n.o(k());
        vp1 vp1Var = new vp1();
        this.d = vp1Var;
        ta1 ta1Var = new ta1();
        this.e = ta1Var;
        this.g = new pca(o, this.c, mlaVar, bo9Var, vp1Var);
        this.j = new w03(o, this.c, mlaVar, bo9Var, vp1Var, ta1Var);
        boolean k = this.a.k();
        pca pcaVar = this.g;
        y76 y76Var = y76.SORT_PROPERTIES_ALPHABETICALLY;
        if (pcaVar.S(y76Var) ^ k) {
            i(y76Var, k);
        }
        this.h = sr2Var == null ? new sr2.a() : sr2Var;
        this.k = pp2Var == null ? new pp2.a(ga0.k) : pp2Var;
        this.i = oa0.d;
    }
}
