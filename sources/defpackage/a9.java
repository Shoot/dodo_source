package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: AddressListSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lz8;", "Lqd;", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: a9  reason: default package */
/* loaded from: classes4.dex */
public final class a9 {

    /* compiled from: AddressListSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: a9$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[z8.values().length];
            try {
                iArr[z8.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z8.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z8.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final qd a(z8 z8Var) {
        z65.h(z8Var, "<this>");
        int i = a.$EnumSwitchMapping$0[z8Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ck1.q;
                }
                throw new NoWhenBranchMatchedException();
            }
            return ck1.o;
        }
        return ck1.e;
    }
}
