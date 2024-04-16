package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.i;
/* compiled from: VariableMenuItemEnricher.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lpwb;", "Lbe6;", "Lqd6$f;", "menuItem", c.a, "Lzf6;", "a", "Lzf6;", "menuPersonalPriceInfoRepository", "Lkotlin/Function1;", "Lqja;", "Lvf6;", "b", "Lkotlin/jvm/functions/Function1;", "toMenuPersonalPriceInfo", "<init>", "(Lzf6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pwb  reason: default package */
/* loaded from: classes4.dex */
public final class pwb implements be6<qd6.f> {
    private final zf6 a;
    private final Function1<qja, vf6> b;

    /* compiled from: VariableMenuItemEnricher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqja;", "shoppingInfo", "Lvf6;", "a", "(Lqja;)Lvf6;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pwb$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<qja, vf6> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vf6 invoke(qja qjaVar) {
            z65.h(qjaVar, "shoppingInfo");
            return pwb.this.a.find(qjaVar.t());
        }
    }

    public pwb(zf6 zf6Var) {
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        this.a = zf6Var;
        this.b = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.be6
    /* renamed from: c */
    public qd6.f a(qd6.f fVar) {
        int w;
        int e;
        int e2;
        int w2;
        qja a2;
        z65.h(fVar, "menuItem");
        Function1<qja, vf6> function1 = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : fVar.t()) {
            Object invoke = function1.invoke(obj);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        w = lc1.w(arrayList, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((vf6) obj2).g(), obj2);
        }
        if (!linkedHashMap.isEmpty()) {
            Collection<qja> t = fVar.t();
            w2 = lc1.w(t, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (qja qjaVar : t) {
                vf6 vf6Var = (vf6) linkedHashMap.get(qjaVar.t());
                if (vf6Var != null && (a2 = ph6.a(qjaVar, vf6Var.h(), ph6.b(vf6Var))) != null) {
                    qjaVar = a2;
                }
                arrayList2.add(qjaVar);
            }
            vf6 vf6Var2 = (vf6) Collections.min(linkedHashMap.values(), wf6.a);
            z65.e(vf6Var2);
            return qd6.f.s(fVar, null, null, null, null, null, null, null, 0, arrayList2, null, null, false, null, ph6.b(vf6Var2), false, 24319, null);
        }
        return fVar;
    }
}
