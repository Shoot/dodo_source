package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: VariableMenuItemCopyMaker.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lmwb;", "Lxd6;", "Lqd6$f;", "menuItem", c.a, "Lzf6;", "a", "Lzf6;", "menuPersonalPriceInfoRepository", "Lkotlin/Function1;", "Lqja;", "Lvf6;", "b", "Lkotlin/jvm/functions/Function1;", "toMenuPersonalPriceInfo", "<init>", "(Lzf6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mwb  reason: default package */
/* loaded from: classes4.dex */
public final class mwb implements xd6<qd6.f> {
    private final zf6 a;
    private final Function1<qja, vf6> b;

    /* compiled from: VariableMenuItemCopyMaker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqja;", "shoppingInfo", "Lvf6;", "a", "(Lqja;)Lvf6;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mwb$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<qja, vf6> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vf6 invoke(qja qjaVar) {
            z65.h(qjaVar, "shoppingInfo");
            return mwb.this.a.find(qjaVar.t());
        }
    }

    public mwb(zf6 zf6Var) {
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        this.a = zf6Var;
        this.b = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xd6
    /* renamed from: c */
    public qd6.f a(qd6.f fVar) {
        Object b0;
        List l;
        z65.h(fVar, "menuItem");
        Function1<qja, vf6> function1 = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : fVar.t()) {
            Object invoke = function1.invoke(obj);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        b0 = sc1.b0(arrayList);
        vf6 vf6Var = (vf6) b0;
        if (vf6Var != null && !z65.c(vf6Var.e(), fVar.h())) {
            l = kc1.l();
            return qd6.f.s(fVar, null, null, null, null, null, null, null, vf6Var.f(), null, vf6Var.e(), null, false, l, null, false, 28031, null);
        }
        return null;
    }
}
