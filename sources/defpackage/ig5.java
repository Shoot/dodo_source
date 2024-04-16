package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ig5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: KeyboardVisibilityHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, d2 = {"Lig5;", "", "Landroid/view/View;", "view", "Ljg5;", "listener", "", c.a, "b", DateTokenConverter.CONVERTER_KEY, "", "Llr5;", "Ljava/util/Map;", "viewsWithStateAndListener", "Lkotlin/Function1;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/jvm/functions/Function1;", "onGlobalLayoutListenerCreator", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ig5  reason: default package */
/* loaded from: classes4.dex */
public final class ig5 {
    public static final ig5 a = new ig5();
    private static final Map<View, lr5> b = new LinkedHashMap();
    private static final Function1<View, ViewTreeObserver.OnGlobalLayoutListener> c = a.a;

    /* compiled from: KeyboardVisibilityHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "contentView", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "b", "(Landroid/view/View;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ig5$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<View, ViewTreeObserver.OnGlobalLayoutListener> {
        public static final a a = new a();

        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(View view) {
            boolean z;
            z65.h(view, "$contentView");
            int height = view.getRootView().getHeight();
            int height2 = view.getRootView().getHeight();
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            Unit unit = Unit.a;
            int i = height2 - rect.bottom;
            lr5 lr5Var = (lr5) ig5.b.get(view);
            if (lr5Var != null) {
                if (i > height * 0.15d) {
                    z = true;
                } else {
                    z = false;
                }
                lr5Var.a(z);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final ViewTreeObserver.OnGlobalLayoutListener invoke(final View view) {
            z65.h(view, "contentView");
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: hg5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ig5.a.c(view);
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            return onGlobalLayoutListener;
        }
    }

    private ig5() {
    }

    private final void c(View view, jg5 jg5Var) {
        ViewTreeObserver.OnGlobalLayoutListener invoke = c.invoke(view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(invoke);
        b.put(view, new lr5(invoke, jg5Var));
    }

    public final void b(View view, jg5 jg5Var) {
        z65.h(view, "view");
        z65.h(jg5Var, "listener");
        if (b.containsKey(view)) {
            d(view);
        }
        c(view, jg5Var);
    }

    public final void d(View view) {
        z65.h(view, "view");
        Map<View, lr5> map = b;
        if (map.containsKey(view)) {
            lr5 lr5Var = map.get(view);
            z65.e(lr5Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(lr5Var.c());
            map.remove(view);
        }
    }
}
