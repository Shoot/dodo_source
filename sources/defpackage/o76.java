package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.osmdroid.tileprovider.tilesource.a;
/* compiled from: MapTileProviderArray.java */
/* renamed from: o76  reason: default package */
/* loaded from: classes3.dex */
public class o76 extends p76 implements f76 {
    private final Map<Long, Integer> g;
    private rs4 h;
    protected final List<m76> i;

    /* JADX INFO: Access modifiers changed from: protected */
    public o76(a aVar, rs4 rs4Var) {
        this(aVar, rs4Var, new m76[0]);
    }

    private void A(long j) {
        synchronized (this.g) {
            this.g.remove(Long.valueOf(j));
        }
    }

    private void B(r76 r76Var) {
        Integer num;
        m76 x = x(r76Var);
        if (x != null) {
            x.k(r76Var);
            return;
        }
        synchronized (this.g) {
            num = this.g.get(Long.valueOf(r76Var.b()));
        }
        if (num != null && num.intValue() == 0) {
            super.e(r76Var);
        }
        A(r76Var.b());
    }

    @Override // defpackage.p76, defpackage.ds4
    public void a(r76 r76Var, Drawable drawable) {
        super.a(r76Var, drawable);
        A(r76Var.b());
    }

    @Override // defpackage.p76, defpackage.ds4
    public void b(r76 r76Var, Drawable drawable) {
        super.b(r76Var, drawable);
        synchronized (this.g) {
            this.g.put(Long.valueOf(r76Var.b()), 1);
        }
        B(r76Var);
    }

    @Override // defpackage.ds4
    public void c(r76 r76Var) {
        super.e(r76Var);
        A(r76Var.b());
    }

    @Override // defpackage.f76
    public boolean d(long j) {
        boolean containsKey;
        synchronized (this.g) {
            containsKey = this.g.containsKey(Long.valueOf(j));
        }
        return containsKey;
    }

    @Override // defpackage.p76, defpackage.ds4
    public void e(r76 r76Var) {
        B(r76Var);
    }

    @Override // defpackage.p76
    public void i() {
        synchronized (this.i) {
            try {
                for (m76 m76Var : this.i) {
                    m76Var.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.g.clear();
        }
        rs4 rs4Var = this.h;
        if (rs4Var != null) {
            rs4Var.destroy();
            this.h = null;
        }
        super.i();
    }

    @Override // defpackage.p76
    public Drawable k(long j) {
        Drawable e = this.a.e(j);
        if (e != null) {
            if (jn3.a(e) == -1) {
                return e;
            }
            if (z(j)) {
                return e;
            }
        }
        synchronized (this.g) {
            try {
                if (this.g.containsKey(Long.valueOf(j))) {
                    return e;
                }
                this.g.put(Long.valueOf(j), 0);
                B(new r76(j, this.i, this));
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p76
    public int l() {
        int i;
        synchronized (this.i) {
            try {
                i = 0;
                for (m76 m76Var : this.i) {
                    if (m76Var.d() > i) {
                        i = m76Var.d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // defpackage.p76
    public int m() {
        int u = cgb.u();
        synchronized (this.i) {
            try {
                for (m76 m76Var : this.i) {
                    if (m76Var.e() < u) {
                        u = m76Var.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u;
    }

    @Override // defpackage.p76
    public void u(a aVar) {
        super.u(aVar);
        synchronized (this.i) {
            try {
                for (m76 m76Var : this.i) {
                    m76Var.m(aVar);
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected m76 x(r76 r76Var) {
        m76 c;
        boolean z;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            c = r76Var.c();
            if (c != null) {
                boolean z5 = true;
                z2 = !y(c);
                if (!w() && c.i()) {
                    z = true;
                } else {
                    z = false;
                }
                int e = k76.e(r76Var.b());
                if (e <= c.d() && e >= c.e()) {
                    z5 = false;
                }
                boolean z6 = z;
                z4 = z5;
                z3 = z6;
            }
            if (c == null || (!z2 && !z3 && !z4)) {
                break;
            }
        }
        return c;
    }

    public boolean y(m76 m76Var) {
        return this.i.contains(m76Var);
    }

    protected boolean z(long j) {
        throw null;
    }

    public o76(a aVar, rs4 rs4Var, m76[] m76VarArr) {
        super(aVar);
        this.g = new HashMap();
        this.h = rs4Var;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        Collections.addAll(arrayList, m76VarArr);
    }
}
