package defpackage;

import defpackage.i34;
import defpackage.ly;
import defpackage.sk9;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\r"}, d2 = {"", "Lq24;", "Luob;", "typefaceRequest", "Lly;", "asyncTypefaceCache", "Lac8;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: h34  reason: default package */
/* loaded from: classes.dex */
public final class h34 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<List<q24>, Object> b(List<? extends q24> list, uob uobVar, ly lyVar, ac8 ac8Var, Function1<? super uob, ? extends Object> function1) {
        w3b w3bVar;
        h36 h36Var;
        Object c;
        vka vkaVar;
        w3b w3bVar2;
        h36 h36Var2;
        Object b;
        vka vkaVar2;
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            q24 q24Var = list.get(i);
            int a = q24Var.a();
            i34.a aVar = i34.a;
            if (i34.e(a, aVar.b())) {
                w3bVar = lyVar.d;
                synchronized (w3bVar) {
                    try {
                        ly.b bVar = new ly.b(q24Var, ac8Var.b());
                        h36Var = lyVar.b;
                        ly.a aVar2 = (ly.a) h36Var.d(bVar);
                        if (aVar2 == null) {
                            vkaVar = lyVar.c;
                            aVar2 = (ly.a) vkaVar.b(bVar);
                        }
                        if (aVar2 != null) {
                            c = aVar2.g();
                        } else {
                            Unit unit = Unit.a;
                            try {
                                c = ac8Var.c(q24Var);
                                ly.f(lyVar, q24Var, ac8Var, c, false, 8, null);
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + q24Var, e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c != null) {
                    return lnb.a(list2, s34.a(uobVar.e(), c, q24Var, uobVar.f(), uobVar.d()));
                }
                throw new IllegalStateException("Unable to load font " + q24Var);
            }
            if (i34.e(a, aVar.c())) {
                w3bVar2 = lyVar.d;
                synchronized (w3bVar2) {
                    try {
                        ly.b bVar2 = new ly.b(q24Var, ac8Var.b());
                        h36Var2 = lyVar.b;
                        ly.a aVar3 = (ly.a) h36Var2.d(bVar2);
                        if (aVar3 == null) {
                            vkaVar2 = lyVar.c;
                            aVar3 = (ly.a) vkaVar2.b(bVar2);
                        }
                        if (aVar3 != null) {
                            b = aVar3.g();
                        } else {
                            Unit unit2 = Unit.a;
                            try {
                                sk9.a aVar4 = sk9.b;
                                b = sk9.b(ac8Var.c(q24Var));
                            } catch (Throwable th2) {
                                sk9.a aVar5 = sk9.b;
                                b = sk9.b(vk9.a(th2));
                            }
                            if (sk9.f(b)) {
                                b = null;
                            }
                            ly.f(lyVar, q24Var, ac8Var, b, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (b != null) {
                    return lnb.a(list2, s34.a(uobVar.e(), b, q24Var, uobVar.f(), uobVar.d()));
                }
            } else if (i34.e(a, aVar.a())) {
                ly.a d = lyVar.d(q24Var, ac8Var);
                if (d == null) {
                    if (list2 == null) {
                        list2 = kc1.r(q24Var);
                    } else {
                        list2.add(q24Var);
                    }
                } else if (!ly.a.e(d.g()) && d.g() != null) {
                    return lnb.a(list2, s34.a(uobVar.e(), d.g(), q24Var, uobVar.f(), uobVar.d()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + q24Var);
            }
        }
        return lnb.a(list2, function1.invoke(uobVar));
    }
}
