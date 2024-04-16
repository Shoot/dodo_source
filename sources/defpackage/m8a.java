package defpackage;

import com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.b;
import com.dodopizza.order.feature.menu.ordertypeswitcher.c;
import defpackage.lk7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: SelectPizzeriaResultListener.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/OrderTypeSwitcherPresenter;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", "result", "", "a", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$c;", "Llk7$d;", "b", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: m8a  reason: default package */
/* loaded from: classes2.dex */
public final class m8a {

    /* compiled from: SelectPizzeriaResultListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m8a$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.b.EnumC0189c.values().length];
            try {
                iArr[c.b.EnumC0189c.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.b.EnumC0189c.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(OrderTypeSwitcherPresenter orderTypeSwitcherPresenter, c.b bVar) {
        z65.h(orderTypeSwitcherPresenter, "<this>");
        z65.h(bVar, "result");
        boolean z = bVar instanceof c.b.a;
        if (z) {
            c.b.a aVar = (c.b.a) bVar;
            if (aVar.c() == c.b.d.a) {
                orderTypeSwitcherPresenter.w(new b.c(aVar.b(), b(aVar.a())));
                return;
            }
        }
        if (z) {
            c.b.a aVar2 = (c.b.a) bVar;
            if (aVar2.c() == c.b.d.b) {
                orderTypeSwitcherPresenter.w(new b.t(aVar2.b(), b(aVar2.a()), aVar2.d()));
                return;
            }
        }
        if (bVar instanceof c.b.C0188b) {
            orderTypeSwitcherPresenter.w(b.p.a);
        }
    }

    private static final lk7.d b(c.b.EnumC0189c enumC0189c) {
        int i = a.$EnumSwitchMapping$0[enumC0189c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return lk7.d.c;
            }
            throw new NoWhenBranchMatchedException();
        }
        return lk7.d.b;
    }
}
