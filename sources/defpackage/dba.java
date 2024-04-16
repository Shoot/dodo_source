package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: SemanticsOwner.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Ldba;", "", "Len5;", "a", "Len5;", "rootNode", "Laba;", "()Laba;", "unmergedRootSemanticsNode", "<init>", "(Len5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dba  reason: default package */
/* loaded from: classes.dex */
public final class dba {
    private final en5 a;

    public dba(en5 en5Var) {
        z65.h(en5Var, "rootNode");
        this.a = en5Var;
    }

    public final aba a() {
        int i;
        mz6 e0 = this.a.e0();
        int a = qz6.a(8);
        i = e0.i();
        yaa yaaVar = null;
        if ((i & a) != 0) {
            sm6.c k = e0.k();
            loop0: while (true) {
                if (k == null) {
                    break;
                }
                if ((k.H0() & a) != 0) {
                    sm6.c cVar = k;
                    gr6 gr6Var = null;
                    while (cVar != null) {
                        if (cVar instanceof yaa) {
                            yaaVar = cVar;
                            break loop0;
                        }
                        if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                            int i2 = 0;
                            for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                if ((g1.H0() & a) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cVar = g1;
                                    } else {
                                        if (gr6Var == null) {
                                            gr6Var = new gr6(new sm6.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            gr6Var.b(cVar);
                                            cVar = null;
                                        }
                                        gr6Var.b(g1);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cVar = au2.g(gr6Var);
                    }
                }
                if ((k.C0() & a) == 0) {
                    break;
                }
                k = k.D0();
            }
        }
        z65.e(yaaVar);
        return new aba(yaaVar.I(), false, this.a, new taa());
    }
}
