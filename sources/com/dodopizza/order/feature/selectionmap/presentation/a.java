package com.dodopizza.order.feature.selectionmap.presentation;

import com.dodopizza.order.feature.selectionmap.presentation.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: OnGetAddressResultReceived.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Laaa;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", "getAddressResult", "a", "order_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: OnGetAddressResultReceived.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0201a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f9.values().length];
            try {
                iArr[f9.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f9.l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final aaa a(aaa aaaVar, g.a aVar) {
        z65.h(aaaVar, "<this>");
        z65.h(aVar, "getAddressResult");
        int i = C0201a.$EnumSwitchMapping$0[aaaVar.l().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (aVar instanceof g.a.c) {
                    g.a.c cVar = (g.a.c) aVar;
                    return aaaVar.r(cVar.b(), cVar.a());
                } else if (aVar instanceof g.a.C0206a) {
                    return aaa.b(aaaVar, f9.o, null, oy2.b(jx2.f, aaaVar.j()), x7.a(aaaVar.c(), false), null, 18, null);
                } else {
                    if (aVar instanceof g.a.b) {
                        return aaa.b(aaaVar, f9.p, null, oy2.b(((g.a.b) aVar).a(), aaaVar.j()), x7.a(aaaVar.c(), false), null, 18, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return aaaVar;
        } else if (aVar instanceof g.a.c) {
            g.a.c cVar2 = (g.a.c) aVar;
            return aaa.b(aaaVar, null, cVar2.b(), cVar2.a(), null, null, 25, null);
        } else if ((aVar instanceof g.a.C0206a) || (aVar instanceof g.a.b)) {
            return aaaVar;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
