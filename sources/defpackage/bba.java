package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SemanticsNode.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0004H\u0002\u001a\f\u0010\u000b\u001a\u00020\t*\u00020\u0004H\u0002\"\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Len5;", "layoutNode", "", "mergingEnabled", "Laba;", "a", "Lkotlin/Function1;", "selector", "f", "", e.a, "i", "Lyaa;", "g", "(Len5;)Lyaa;", "outerMergingSemantics", "Lgn9;", Image.TYPE_HIGH, "(Laba;)Lgn9;", "role", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: bba  reason: default package */
/* loaded from: classes.dex */
public final class bba {
    public static final aba a(en5 en5Var, boolean z) {
        z65.h(en5Var, "layoutNode");
        mz6 e0 = en5Var.e0();
        int a = qz6.a(8);
        yaa yaaVar = null;
        if ((mz6.c(e0) & a) != 0) {
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
                            int i = 0;
                            for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                if ((g1.H0() & a) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
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
        sm6.c I = yaaVar.I();
        taa F = en5Var.F();
        z65.e(F);
        return new aba(I, z, en5Var, F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(aba abaVar) {
        return abaVar.m() + 2000000000;
    }

    public static final en5 f(en5 en5Var, Function1<? super en5, Boolean> function1) {
        z65.h(en5Var, "<this>");
        z65.h(function1, "selector");
        for (en5 h0 = en5Var.h0(); h0 != null; h0 = h0.h0()) {
            if (function1.invoke(h0).booleanValue()) {
                return h0;
            }
        }
        return null;
    }

    public static final yaa g(en5 en5Var) {
        z65.h(en5Var, "<this>");
        mz6 e0 = en5Var.e0();
        int a = qz6.a(8);
        yaa yaaVar = null;
        if ((mz6.c(e0) & a) != 0) {
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
                            if (((yaa) cVar).y0()) {
                                yaaVar = cVar;
                                break loop0;
                            }
                        } else if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                            int i = 0;
                            for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                if ((g1.H0() & a) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
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
        return yaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gn9 h(aba abaVar) {
        return (gn9) uaa.a(abaVar.u(), eba.a.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(aba abaVar) {
        return abaVar.m() + 1000000000;
    }
}
