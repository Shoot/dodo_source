package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0018\u0010\u000b\u001a\u00020\u0001*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t¨\u0006\f"}, d2 = {"Landroid/view/ViewGroup;", "", c.a, DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "view", e.a, "", "b", "Lkotlin/Function0;", "function", "a", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: n1c  reason: default package */
/* loaded from: classes4.dex */
public final class n1c {

    /* compiled from: ViewUtils.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"n1c$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: n1c$a */
    /* loaded from: classes4.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View a;
        final /* synthetic */ Function0<Unit> b;

        a(View view, Function0<Unit> function0) {
            this.a = view;
            this.b = function0;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.b.invoke();
        }
    }

    public static final void a(View view, Function0<Unit> function0) {
        z65.h(view, "<this>");
        z65.h(function0, "function");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view, function0));
    }

    public static final boolean b(ViewGroup viewGroup, View view) {
        z65.h(viewGroup, "<this>");
        z65.h(view, "view");
        for (View view2 : dzb.b(viewGroup)) {
            if (z65.c(view2, view) || ((view2 instanceof ViewGroup) && b((ViewGroup) view2, view))) {
                return true;
            }
        }
        return false;
    }

    public static final void c(ViewGroup viewGroup) {
        z65.h(viewGroup, "<this>");
        for (View view : dzb.b(viewGroup)) {
            un3.e(view);
        }
    }

    public static final void d(ViewGroup viewGroup) {
        z65.h(viewGroup, "<this>");
        for (View view : dzb.b(viewGroup)) {
            un3.k(view);
        }
    }

    public static final void e(ViewGroup viewGroup, View view) {
        z65.h(viewGroup, "<this>");
        z65.h(view, "view");
        if (b(viewGroup, view)) {
            c(viewGroup);
            un3.k(view);
        }
    }
}
