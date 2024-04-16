package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.v34;
import kotlin.Metadata;
/* compiled from: AndroidFontUtils.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\"\u0018\u0010\u000e\u001a\u00020\u0000*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lv34;", "fontWeight", "Lq34;", "fontStyle", "", c.a, "(Lv34;I)I", "", "isBold", "isItalic", "b", "Lv34$a;", "a", "(Lv34$a;)Lv34;", "AndroidBold", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: xg  reason: default package */
/* loaded from: classes.dex */
public final class xg {
    public static final v34 a(v34.a aVar) {
        z65.h(aVar, "<this>");
        return aVar.l();
    }

    public static final int b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return 0;
    }

    public static final int c(v34 v34Var, int i) {
        boolean z;
        z65.h(v34Var, "fontWeight");
        if (v34Var.compareTo(a(v34.b)) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return b(z, q34.f(i, q34.b.a()));
    }
}
