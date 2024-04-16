package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: HalvesAnalyticsEvents.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lyl4;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lmm8;", "Lmm8;", "getData", "()Lmm8;", "data", "Lck1;", "b", "Lck1;", "sender", c.a, "Ljava/lang/String;", "halfPosition", "<init>", "(Lmm8;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yl4  reason: default package */
/* loaded from: classes2.dex */
public final class yl4 implements dc {
    private final mm8 a;
    private final ck1 b;
    private final String c;

    /* compiled from: HalvesAnalyticsEvents.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yl4$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[zc.values().length];
            try {
                iArr[zc.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zc.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zc.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zc.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yl4(mm8 mm8Var) {
        ck1 ck1Var;
        String i;
        z65.h(mm8Var, "data");
        this.a = mm8Var;
        zc a2 = mm8Var.a();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[a2.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                ck1Var = ck1.X4;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ck1Var = ck1.W4;
        }
        this.b = ck1Var;
        int i3 = iArr[mm8Var.a().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i = "null";
            } else {
                i = zc.c.i();
            }
        } else {
            i = zc.b.i();
        }
        this.c = i;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(bc.e(bc.e(bc.e(bc.e(new bc("halves_tags_click"), "halvesPosition", this.c, false, 4, null), ShoppingInfoEntity.FIELD_PRODUCT_ID, this.a.b(), false, 4, null), "productName", this.a.c(), false, 4, null), "rawPrice", this.a.d(), false, 4, null), Action.NAME_ATTRIBUTE, this.a.e(), false, 4, null), this.b).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yl4) && z65.c(this.a, ((yl4) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        mm8 mm8Var = this.a;
        return "HalvesTagsClick(data=" + mm8Var + ")";
    }
}
