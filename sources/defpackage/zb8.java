package defpackage;

import android.graphics.Typeface;
import defpackage.wob;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lzb8;", "", "Luob;", "typefaceRequest", "Lac8;", "platformFontLoader", "Lkotlin/Function1;", "Lwob$b;", "", "onAsyncCompletion", "createDefaultTypeface", "Lwob;", "a", "Luc8;", "Luc8;", "platformTypefaceResolver", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zb8  reason: default package */
/* loaded from: classes.dex */
public final class zb8 {
    private final uc8 a = yc8.a();

    public wob a(uob uobVar, ac8 ac8Var, Function1<? super wob.b, Unit> function1, Function1<? super uob, ? extends Object> function12) {
        Typeface a;
        z65.h(uobVar, "typefaceRequest");
        z65.h(ac8Var, "platformFontLoader");
        z65.h(function1, "onAsyncCompletion");
        z65.h(function12, "createDefaultTypeface");
        w24 c = uobVar.c();
        if (c == null || (c instanceof up2)) {
            a = this.a.a(uobVar.f(), uobVar.d());
        } else if (c instanceof jd4) {
            a = this.a.b((jd4) uobVar.c(), uobVar.f(), uobVar.d());
        } else if (!(c instanceof vr5)) {
            return null;
        } else {
            gob t = ((vr5) uobVar.c()).t();
            z65.f(t, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            a = ((bj) t).a(uobVar.f(), uobVar.d(), uobVar.e());
        }
        return new wob.b(a, false, 2, null);
    }
}
