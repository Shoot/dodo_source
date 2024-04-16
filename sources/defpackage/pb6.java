package defpackage;

import defpackage.nb6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: MeasureExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¨\u0006\u0005"}, d2 = {"Lnb6;", "Lrb6;", "a", "Lkm8;", "b", "feature-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: pb6  reason: default package */
/* loaded from: classes.dex */
public final class pb6 {

    /* compiled from: MeasureExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pb6$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[nb6.values().length];
            try {
                iArr[nb6.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nb6.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nb6.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[nb6.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[nb6.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[nb6.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[nb6.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final rb6 a(nb6 nb6Var) {
        z65.h(nb6Var, "<this>");
        switch (a.$EnumSwitchMapping$0[nb6Var.ordinal()]) {
            case 1:
                return sb6.a.e();
            case 2:
                return sb6.a.d();
            case 3:
                return sb6.a.a();
            case 4:
                return sb6.a.g();
            case 5:
                return sb6.a.b();
            case 6:
                return sb6.a.c();
            case 7:
                return sb6.a.f();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final nb6 b(km8 km8Var) {
        Integer k;
        z65.h(km8Var, "<this>");
        nb6.a aVar = nb6.a;
        k = k0b.k(km8Var.a());
        return aVar.a(((Number) mh5.c(k, -1)).intValue());
    }
}
