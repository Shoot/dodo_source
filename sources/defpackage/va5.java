package defpackage;

import defpackage.ua5;
import java.io.IOException;
/* compiled from: JsonGeneratorImpl.java */
/* renamed from: va5  reason: default package */
/* loaded from: classes2.dex */
public abstract class va5 extends hd4 {
    protected static final int[] p = kw0.d();
    protected static final m85<yya> q = ua5.c;
    protected final ks4 k;
    protected int[] l;
    protected int m;
    protected mca n;
    protected boolean o;

    public va5(ks4 ks4Var, int i, q47 q47Var) {
        super(i, q47Var);
        this.l = p;
        this.n = ir2.h;
        this.k = ks4Var;
        if (ua5.b.ESCAPE_NON_ASCII.k(i)) {
            this.m = 127;
        }
        this.o = !ua5.b.QUOTE_FIELD_NAMES.k(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hd4
    public void D1(int i, int i2) {
        super.D1(i, i2);
        this.o = !ua5.b.QUOTE_FIELD_NAMES.k(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F1(String str) throws IOException {
        a(String.format("Can not %s, expecting field name (context: %s)", str, this.h.i()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G1(String str, int i) throws IOException {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            b();
                            return;
                        } else {
                            F1(str);
                            return;
                        }
                    }
                    this.a.i(this);
                    return;
                }
                this.a.m(this);
                return;
            }
            this.a.j(this);
        } else if (this.h.f()) {
            this.a.b(this);
        } else if (this.h.g()) {
            this.a.c(this);
        }
    }

    public ua5 H1(mca mcaVar) {
        this.n = mcaVar;
        return this;
    }

    @Override // defpackage.hd4, defpackage.ua5
    public ua5 l(ua5.b bVar) {
        super.l(bVar);
        if (bVar == ua5.b.QUOTE_FIELD_NAMES) {
            this.o = true;
        }
        return this;
    }

    @Override // defpackage.ua5
    public ua5 y(int i) {
        if (i < 0) {
            i = 0;
        }
        this.m = i;
        return this;
    }
}
