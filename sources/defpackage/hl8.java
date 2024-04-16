package defpackage;

import com.dodopizza.order.feature.product.card.presentation.pizza.c;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.product.card.variable.b;
/* compiled from: ProductCardScreenFactory.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lhl8;", "", "Lre6;", "menuItemType", "", "menuItemId", "Lym$d;", "screen", "", "isHeroProduct", "menuItemIdV5", "Lyw9;", "a", "Low;", "Low;", "assistantWelcomeDataInteractor", "<init>", "(Low;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hl8  reason: default package */
/* loaded from: classes4.dex */
public final class hl8 {
    private final ow a;

    /* compiled from: ProductCardScreenFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hl8$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[re6.values().length];
            try {
                iArr[re6.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[re6.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[re6.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[re6.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[re6.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[re6.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hl8(ow owVar) {
        z65.h(owVar, "assistantWelcomeDataInteractor");
        this.a = owVar;
    }

    public static /* synthetic */ yw9 b(hl8 hl8Var, re6 re6Var, String str, ym.d dVar, boolean z, String str2, int i, Object obj) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        return hl8Var.a(re6Var, str, dVar, z2, str2);
    }

    public final yw9 a(re6 re6Var, String str, ym.d dVar, boolean z, String str2) {
        z65.h(re6Var, "menuItemType");
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        switch (a.$EnumSwitchMapping$0[re6Var.ordinal()]) {
            case 1:
                return b.a(new uwb(null, str, null, 0, dVar, z, 13, null));
            case 2:
                return c.a(new o78(str, null, null, 0, dVar, z, 14, null));
            case 3:
                return ru.dodopizza.app.presentation.product.card.combo.c.a(new th1(str, null, dVar, 0, null, z, 26, null));
            case 4:
                return ooa.a(new hoa(str, 0, dVar, z, str2, 2, null));
            case 5:
                return new com.dodopizza.order.feature.halves.constructor.presentation.b(new ek4(str, dVar, null, null, z, 12, null));
            case 6:
                return vw.a(this.a.a(str, z, dVar));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
