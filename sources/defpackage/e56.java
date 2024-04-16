package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.R;
/* compiled from: MainScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, d2 = {"Ln56;", "", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: e56  reason: default package */
/* loaded from: classes4.dex */
public final class e56 {

    /* compiled from: MainScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e56$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[n56.values().length];
            try {
                iArr[n56.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n56.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n56.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(n56 n56Var) {
        z65.h(n56Var, "<this>");
        int i = a.$EnumSwitchMapping$0[n56Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return R.id.shopping_cart_nav;
                }
                throw new NoWhenBranchMatchedException();
            }
            return R.id.store_nav;
        }
        return R.id.menu_nav;
    }
}
