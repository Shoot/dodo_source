package defpackage;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateTimePrintContext.java */
/* renamed from: dn2  reason: default package */
/* loaded from: classes3.dex */
public final class dn2 {
    private q8b a;
    private Locale b;
    private oo2 c;
    private int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimePrintContext.java */
    /* renamed from: dn2$a */
    /* loaded from: classes3.dex */
    public class a extends lq2 {
        final /* synthetic */ i71 a;
        final /* synthetic */ q8b b;
        final /* synthetic */ p71 c;
        final /* synthetic */ vcc d;

        a(i71 i71Var, q8b q8bVar, p71 p71Var, vcc vccVar) {
            this.a = i71Var;
            this.b = q8bVar;
            this.c = p71Var;
            this.d = vccVar;
        }

        @Override // defpackage.q8b
        public boolean G(u8b u8bVar) {
            if (this.a != null && u8bVar.a()) {
                return this.a.G(u8bVar);
            }
            return this.b.G(u8bVar);
        }

        @Override // defpackage.lq2, defpackage.q8b
        public kwb K(u8b u8bVar) {
            if (this.a != null && u8bVar.a()) {
                return this.a.K(u8bVar);
            }
            return this.b.K(u8bVar);
        }

        @Override // defpackage.lq2, defpackage.q8b
        public <R> R M(w8b<R> w8bVar) {
            if (w8bVar == v8b.a()) {
                return (R) this.c;
            }
            if (w8bVar == v8b.g()) {
                return (R) this.d;
            }
            if (w8bVar == v8b.e()) {
                return (R) this.b.M(w8bVar);
            }
            return w8bVar.a(this);
        }

        @Override // defpackage.q8b
        public long q(u8b u8bVar) {
            if (this.a != null && u8bVar.a()) {
                return this.a.q(u8bVar);
            }
            return this.b.q(u8bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dn2(q8b q8bVar, an2 an2Var) {
        this.a = a(q8bVar, an2Var);
        this.b = an2Var.f();
        this.c = an2Var.e();
    }

    private static q8b a(q8b q8bVar, an2 an2Var) {
        p71 p71Var;
        h71[] values;
        p71 d = an2Var.d();
        vcc g = an2Var.g();
        if (d == null && g == null) {
            return q8bVar;
        }
        p71 p71Var2 = (p71) q8bVar.M(v8b.a());
        vcc vccVar = (vcc) q8bVar.M(v8b.g());
        i71 i71Var = null;
        if (g95.c(p71Var2, d)) {
            d = null;
        }
        if (g95.c(vccVar, g)) {
            g = null;
        }
        if (d == null && g == null) {
            return q8bVar;
        }
        if (d != null) {
            p71Var = d;
        } else {
            p71Var = p71Var2;
        }
        if (g != null) {
            vccVar = g;
        }
        if (g != null) {
            if (q8bVar.G(h71.S4)) {
                if (p71Var == null) {
                    p71Var = t75.e;
                }
                return p71Var.P(b55.Q(q8bVar), g);
            }
            vcc x = g.x();
            wcc wccVar = (wcc) q8bVar.M(v8b.d());
            if ((x instanceof wcc) && wccVar != null && !x.equals(wccVar)) {
                throw new DateTimeException("Invalid override zone for temporal: " + g + " " + q8bVar);
            }
        }
        if (d != null) {
            if (q8bVar.G(h71.y)) {
                i71Var = p71Var.k(q8bVar);
            } else if (d != t75.e || p71Var2 != null) {
                for (h71 h71Var : h71.values()) {
                    if (h71Var.a() && q8bVar.G(h71Var)) {
                        throw new DateTimeException("Invalid override chronology for temporal: " + d + " " + q8bVar);
                    }
                }
            }
        }
        return new a(i71Var, q8bVar, p71Var, vccVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.d--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public oo2 d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q8b e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long f(u8b u8bVar) {
        try {
            return Long.valueOf(this.a.q(u8bVar));
        } catch (DateTimeException e) {
            if (this.d > 0) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <R> R g(w8b<R> w8bVar) {
        R r = (R) this.a.M(w8bVar);
        if (r == null && this.d == 0) {
            throw new DateTimeException("Unable to extract value: " + this.a.getClass());
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.d++;
    }

    public String toString() {
        return this.a.toString();
    }
}
