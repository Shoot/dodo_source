package defpackage;

import android.graphics.Typeface;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import defpackage.q34;
import kotlin.Metadata;
/* compiled from: PlatformTypefaces.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lwc8;", "Luc8;", "", "genericFontFamily", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Landroid/graphics/Typeface;", c.a, "(Ljava/lang/String;Lv34;I)Landroid/graphics/Typeface;", "a", "(Lv34;I)Landroid/graphics/Typeface;", "Ljd4;", Action.NAME_ATTRIBUTE, "b", "(Ljd4;Lv34;I)Landroid/graphics/Typeface;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wc8  reason: default package */
/* loaded from: classes.dex */
final class wc8 implements uc8 {
    private final Typeface c(String str, v34 v34Var, int i) {
        Typeface create;
        Typeface create2;
        q34.a aVar = q34.b;
        if (q34.f(i, aVar.b()) && z65.c(v34Var, v34.b.e()) && (str == null || str.length() == 0)) {
            Typeface typeface = Typeface.DEFAULT;
            z65.g(typeface, "DEFAULT");
            return typeface;
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, v34Var.B(), q34.f(i, aVar.a()));
        z65.g(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
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
        return c(jd4Var.t(), v34Var, i);
    }
}
