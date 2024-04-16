package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: PromoCodeStatusExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, d2 = {"Leq8;", "", "a", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: fq8  reason: default package */
/* loaded from: classes2.dex */
public final class fq8 {

    /* compiled from: PromoCodeStatusExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fq8$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[eq8.values().length];
            try {
                iArr[eq8.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eq8.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eq8.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eq8.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[eq8.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(eq8 eq8Var) {
        z65.h(eq8Var, "<this>");
        int i = a.$EnumSwitchMapping$0[eq8Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return r09.promocode_too_many_attempts;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return r09.promocode_failure_error;
                }
                return r09.promocode_input_error;
            }
            return r09.promocode_wrong_conditions_in_cart;
        }
        return r09.j1;
    }
}
