package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.nb6;
import kotlin.Metadata;
/* compiled from: ProductExtensions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a&\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u001a(\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\t0\t*\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002\u001a \u0010\u0010\u001a\n \r*\u0004\u0018\u00010\t0\t*\u00060\tj\u0002`\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0012"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkl8;", "category", "", "productName", "Lkm8;", "productSize", c.a, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sizeValue", "unit", "kotlin.jvm.PlatformType", "b", "textPortion", "a", DateTokenConverter.CONVERTER_KEY, "feature-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ql8  reason: default package */
/* loaded from: classes.dex */
public final class ql8 {

    /* compiled from: ProductExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ql8$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kl8.values().length];
            try {
                iArr[kl8.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl8.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kl8.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final StringBuilder a(StringBuilder sb, String str) {
        if (str.length() > 0) {
            sb.append(", ");
            sb.append(str);
        }
        return sb;
    }

    private static final StringBuilder b(StringBuilder sb, String str, String str2) {
        sb.append(", ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb;
    }

    public static final String c(Context context, kl8 kl8Var, String str, km8 km8Var) {
        Integer k;
        int i;
        Integer k2;
        Float j;
        float f;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(kl8Var, "category");
        z65.h(str, "productName");
        z65.h(km8Var, "productSize");
        String value = km8Var.getValue();
        nb6.a aVar = nb6.a;
        k = k0b.k(km8Var.a());
        if (k != null) {
            i = k.intValue();
        } else {
            i = -1;
        }
        nb6 a2 = aVar.a(i);
        StringBuilder sb = new StringBuilder(str);
        int i2 = a.$EnumSwitchMapping$0[kl8Var.ordinal()];
        if (i2 == 1 || i2 == 2) {
            k2 = k0b.k(value);
            if (k2 != null && k2.intValue() > 1 && a2 == nb6.b) {
                String string = context.getString(pb6.a(a2).a());
                z65.g(string, "getString(...)");
                b(sb, value, string);
            } else if (a2 == nb6.g) {
                a(sb, d(value, context));
            }
        } else if (i2 == 3) {
            j = j0b.j(value);
            if (j != null) {
                f = j.floatValue();
            } else {
                f = 0.0f;
            }
            if (f > 0.0f && a2 == nb6.c) {
                String string2 = context.getString(pb6.a(a2).a());
                z65.g(string2, "getString(...)");
                b(sb, value, string2);
            }
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    public static final String d(String str, Context context) {
        String str2 = "";
        z65.h(str, "sizeValue");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            int parseFloat = (int) Float.parseFloat(str);
            if (parseFloat != 1) {
                if (parseFloat == 2) {
                    str2 = context.getString(n09.large_portion);
                }
            } else {
                str2 = context.getString(n09.small_portion);
            }
        } catch (NumberFormatException unused) {
        }
        z65.e(str2);
        return str2;
    }
}
