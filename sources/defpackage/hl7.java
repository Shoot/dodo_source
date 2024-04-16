package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d98;
import defpackage.su2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.selectordertype.a;
/* compiled from: OrderTypeSwitcherExternalRouterImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Lru/dodopizza/app/presentation/selectordertype/a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$c;", "f", "Lsu2;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$a;", DateTokenConverter.CONVERTER_KEY, "Ld98;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b;", e.a, "Lc8a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$c;", "g", "Ln9a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/c$b$d;", Image.TYPE_HIGH, "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: hl7  reason: default package */
/* loaded from: classes4.dex */
public final class hl7 {

    /* compiled from: OrderTypeSwitcherExternalRouterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hl7$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[c8a.values().length];
            try {
                iArr[c8a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c8a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[n9a.values().length];
            try {
                iArr2[n9a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n9a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final /* synthetic */ c.a a(su2 su2Var) {
        return d(su2Var);
    }

    public static final /* synthetic */ c.b b(d98 d98Var) {
        return e(d98Var);
    }

    public static final /* synthetic */ c.AbstractC0190c c(ru.dodopizza.app.presentation.selectordertype.a aVar) {
        return f(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c.a d(su2 su2Var) {
        if (su2Var instanceof su2.b) {
            return new c.a.b(((su2.b) su2Var).a());
        }
        if (su2Var instanceof su2.a) {
            return new c.a.C0186a(((su2.a) su2Var).a());
        }
        if (su2Var instanceof su2.c) {
            return c.a.C0187c.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c.b e(d98 d98Var) {
        if (d98Var instanceof d98.a) {
            d98.a aVar = (d98.a) d98Var;
            return new c.b.a(aVar.b(), g(aVar.a()), h(aVar.c()), aVar.d());
        } else if (d98Var instanceof d98.b) {
            return c.b.C0188b.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c.AbstractC0190c f(ru.dodopizza.app.presentation.selectordertype.a aVar) {
        if (aVar instanceof a.C0617a) {
            return c.AbstractC0190c.a.a;
        }
        if (aVar instanceof a.b) {
            return c.AbstractC0190c.b.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final c.b.EnumC0189c g(c8a c8aVar) {
        int i = a.$EnumSwitchMapping$0[c8aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c.b.EnumC0189c.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return c.b.EnumC0189c.a;
    }

    private static final c.b.d h(n9a n9aVar) {
        int i = a.$EnumSwitchMapping$1[n9aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c.b.d.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return c.b.d.a;
    }
}
