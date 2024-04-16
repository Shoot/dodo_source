package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: PersonalOffersSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¨\u0006\u0005"}, d2 = {"Lh18;", "Lcq8;", "b", "Lv27;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: i18  reason: default package */
/* loaded from: classes4.dex */
public final class i18 {

    /* compiled from: PersonalOffersSender.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: i18$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[h18.values().length];
            try {
                iArr[h18.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h18.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h18.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h18.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h18.b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[v27.values().length];
            try {
                iArr2[v27.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final h18 a(v27 v27Var) {
        z65.h(v27Var, "<this>");
        if (a.$EnumSwitchMapping$1[v27Var.ordinal()] == 1) {
            return h18.b;
        }
        return h18.c;
    }

    public static final cq8 b(h18 h18Var) {
        z65.h(h18Var, "<this>");
        int i = a.$EnumSwitchMapping$0[h18Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return cq8.d;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return cq8.c;
                }
                return cq8.h;
            }
            return cq8.h;
        }
        return cq8.g;
    }
}
