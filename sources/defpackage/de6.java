package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.qd6;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: MenuItemExtensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\b¨\u0006\n"}, d2 = {"Lqd6;", "Lre6;", "b", "Lkm8;", "a", "", "Lqja;", DateTokenConverter.CONVERTER_KEY, "Lte6;", c.a, "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: de6  reason: default package */
/* loaded from: classes4.dex */
public final class de6 {

    /* compiled from: MenuItemExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: de6$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[se6.values().length];
            try {
                iArr[se6.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[se6.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[se6.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[se6.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final km8 a(qd6 qd6Var) {
        z65.h(qd6Var, "<this>");
        if (qd6Var instanceof qd6.e) {
            return ((qd6.e) qd6Var).u();
        }
        if (!(qd6Var instanceof qd6.f) && !(qd6Var instanceof qd6.d)) {
            if (qd6Var instanceof qd6.c) {
                return ((qd6.c) qd6Var).v();
            }
            if (!(qd6Var instanceof qd6.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public static final re6 b(qd6 qd6Var) {
        z65.h(qd6Var, "<this>");
        if (qd6Var instanceof qd6.e) {
            return re6.a;
        }
        if (qd6Var instanceof qd6.f) {
            if (((qd6.f) qd6Var).u()) {
                return re6.b;
            }
            return re6.e;
        } else if (qd6Var instanceof qd6.d) {
            return re6.c;
        } else {
            if (qd6Var instanceof qd6.c) {
                return re6.d;
            }
            if (qd6Var instanceof qd6.b) {
                return re6.f;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final re6 c(te6 te6Var) {
        z65.h(te6Var, "<this>");
        int i = a.$EnumSwitchMapping$0[te6Var.k().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return re6.a;
                    }
                    if (te6Var.l().size() > 1) {
                        List<dxb> l = te6Var.l();
                        if (!(l instanceof Collection) || !l.isEmpty()) {
                            for (dxb dxbVar : l) {
                                if (!dxbVar.a().h().b()) {
                                    return re6.e;
                                }
                            }
                        }
                        return re6.b;
                    }
                    return re6.a;
                }
                return re6.d;
            }
            return re6.c;
        }
        return re6.f;
    }

    public static final Collection<qja> d(qd6 qd6Var) {
        z65.h(qd6Var, "<this>");
        if ((qd6Var instanceof qd6.e) || (qd6Var instanceof qd6.c)) {
            return null;
        }
        if (qd6Var instanceof qd6.f) {
            return ((qd6.f) qd6Var).t();
        }
        if (qd6Var instanceof qd6.d) {
            return ((qd6.d) qd6Var).v();
        }
        if (qd6Var instanceof qd6.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
