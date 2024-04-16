package defpackage;

import android.graphics.Typeface;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lxc8;", "Luc8;", "", "familyName", "Lv34;", "weight", "Lq34;", "style", "Landroid/graphics/Typeface;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lv34;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", c.a, "a", "(Lv34;I)Landroid/graphics/Typeface;", "Ljd4;", Action.NAME_ATTRIBUTE, "b", "(Ljd4;Lv34;I)Landroid/graphics/Typeface;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xc8  reason: default package */
/* loaded from: classes.dex */
final class xc8 implements uc8 {
    private final Typeface c(String str, v34 v34Var, int i) {
        if (q34.f(i, q34.b.b()) && z65.c(v34Var, v34.b.e()) && (str == null || str.length() == 0)) {
            Typeface typeface = Typeface.DEFAULT;
            z65.g(typeface, "DEFAULT");
            return typeface;
        }
        int c = xg.c(v34Var, i);
        if (str != null && str.length() != 0) {
            Typeface create = Typeface.create(str, c);
            z65.g(create, "{\n            Typeface.c…y, targetStyle)\n        }");
            return create;
        }
        Typeface defaultFromStyle = Typeface.defaultFromStyle(c);
        z65.g(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
        return defaultFromStyle;
    }

    private final Typeface d(String str, v34 v34Var, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface c = c(str, v34Var, i);
        if (z65.c(c, Typeface.create(Typeface.DEFAULT, xg.c(v34Var, i))) || z65.c(c, c(null, v34Var, i))) {
            return null;
        }
        return c;
    }

    @Override // defpackage.uc8
    public Typeface a(v34 v34Var, int i) {
        z65.h(v34Var, "fontWeight");
        return c(null, v34Var, i);
    }

    @Override // defpackage.uc8
    public Typeface b(jd4 jd4Var, v34 v34Var, int i) {
        z65.h(jd4Var, Action.NAME_ATTRIBUTE);
        z65.h(v34Var, "fontWeight");
        Typeface d = d(yc8.b(jd4Var.t(), v34Var), v34Var, i);
        if (d == null) {
            return c(jd4Var.t(), v34Var, i);
        }
        return d;
    }
}
