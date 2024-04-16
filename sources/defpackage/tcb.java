package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.oab;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: TextStyle.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a'\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lrcb;", "style", "Lqm5;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, c.a, "layoutDirection", "Loab;", "textDirection", DateTokenConverter.CONVERTER_KEY, "(Lqm5;Loab;)I", "Lkc8;", "platformSpanStyle", "Lhc8;", "platformParagraphStyle", "Lrc8;", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tcb  reason: default package */
/* loaded from: classes.dex */
public final class tcb {

    /* compiled from: TextStyle.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tcb$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[qm5.values().length];
            try {
                iArr[qm5.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qm5.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rc8 b(kc8 kc8Var, hc8 hc8Var) {
        if (hc8Var == null) {
            return null;
        }
        return yi.a(kc8Var, hc8Var);
    }

    public static final rcb c(rcb rcbVar, qm5 qm5Var) {
        z65.h(rcbVar, "style");
        z65.h(qm5Var, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        return new rcb(wqa.d(rcbVar.y()), kq7.c(rcbVar.v(), qm5Var), rcbVar.w());
    }

    public static final int d(qm5 qm5Var, oab oabVar) {
        z65.h(qm5Var, "layoutDirection");
        oab.a aVar = oab.b;
        int a2 = aVar.a();
        if (oabVar != null && oab.i(oabVar.l(), a2)) {
            int i = a.$EnumSwitchMapping$0[qm5Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return aVar.c();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.b();
        } else if (oabVar == null) {
            int i2 = a.$EnumSwitchMapping$0[qm5Var.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return aVar.e();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.d();
        } else {
            return oabVar.l();
        }
    }
}
