package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: wrappers.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\"\u0010\f\u001a\u00020\t*\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n¨\u0006\r"}, d2 = {"Landroidx/fragment/app/p;", "", "containerViewId", "Lm58;", "uiConfig", "a", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function1;", "Ljava/io/File;", "", "Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonResultListener;", "listener", "b", "controlling_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: w8c  reason: default package */
/* loaded from: classes.dex */
public final class w8c {
    public static final p a(p pVar, int i, m58 m58Var) {
        z65.h(pVar, "<this>");
        z65.h(m58Var, "uiConfig");
        p w = pVar.w(i, j58.class, j58.f.b(m58Var), null);
        z65.g(w, "replace(containerViewId, F::class.java, args, tag)");
        return w;
    }

    public static final void b(Fragment fragment, Function1<? super File, Unit> function1) {
        z65.h(fragment, "<this>");
        z65.h(function1, "listener");
        j58.f.d(fragment, function1);
    }
}
