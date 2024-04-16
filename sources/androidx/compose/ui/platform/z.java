package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\b\u0010\r\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002\"\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Ld1;", "Ldo1;", "parent", "Lkotlin/Function0;", "", RemoteMessageConst.Notification.CONTENT, "Lco1;", DateTokenConverter.CONVERTER_KEY, "(Ld1;Ldo1;Lkotlin/jvm/functions/Function2;)Lco1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Ldo1;Lkotlin/jvm/functions/Function2;)Lco1;", "b", "", com.huawei.hms.opendevice.c.a, "", "Ljava/lang/String;", "TAG", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class z {
    private static final String a = "Wrapper";
    private static final ViewGroup.LayoutParams b = new ViewGroup.LayoutParams(-2, -2);

    private static final co1 a(AndroidComposeView androidComposeView, do1 do1Var, Function2<? super qn1, ? super Integer, Unit> function2) {
        WrappedComposition wrappedComposition;
        if (c(androidComposeView)) {
            androidComposeView.setTag(ly8.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            b();
        }
        co1 a2 = jo1.a(new ypb(androidComposeView.getRoot()), do1Var);
        View view = androidComposeView.getView();
        int i = ly8.wrapped_composition_tag;
        Object tag = view.getTag(i);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        } else {
            wrappedComposition = null;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a2);
            androidComposeView.getView().setTag(i, wrappedComposition);
        }
        wrappedComposition.j(function2);
        return wrappedComposition;
    }

    private static final void b() {
        if (!r45.c()) {
            try {
                Field declaredField = r45.class.getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, true);
            } catch (Exception unused) {
                Log.w(a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
    }

    private static final boolean c(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT >= 29 && (!r8c.a.a(androidComposeView).isEmpty())) {
            return true;
        }
        return false;
    }

    public static final co1 d(d1 d1Var, do1 do1Var, Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(d1Var, "<this>");
        z65.h(do1Var, "parent");
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        r.a.a();
        AndroidComposeView androidComposeView = null;
        if (d1Var.getChildCount() > 0) {
            View childAt = d1Var.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            d1Var.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = d1Var.getContext();
            z65.g(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            androidComposeView = new AndroidComposeView(context, do1Var.g());
            d1Var.addView(androidComposeView.getView(), b);
        }
        return a(androidComposeView, do1Var, function2);
    }
}
