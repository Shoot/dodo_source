package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PoolingContainer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"(\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"\u0018\u0010\u0016\u001a\u00020\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "Lhf8;", "listener", "", "a", e.a, "", "I", "PoolingContainerListenerHolderTag", "b", "IsPoolingContainerTag", "", "value", c.a, "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isPoolingContainer", DateTokenConverter.CONVERTER_KEY, "isWithinPoolingContainer", "Lif8;", "(Landroid/view/View;)Lif8;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: gf8  reason: default package */
/* loaded from: classes.dex */
public final class gf8 {
    private static final int a = ry8.pooling_container_listener_holder_tag;
    private static final int b = ry8.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(View view, hf8 hf8Var) {
        z65.h(view, "<this>");
        z65.h(hf8Var, "listener");
        b(view).a(hf8Var);
    }

    private static final if8 b(View view) {
        int i = a;
        if8 if8Var = (if8) view.getTag(i);
        if (if8Var == null) {
            if8 if8Var2 = new if8();
            view.setTag(i, if8Var2);
            return if8Var2;
        }
        return if8Var;
    }

    public static final boolean c(View view) {
        Boolean bool;
        z65.h(view, "<this>");
        Object tag = view.getTag(b);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        z65.h(view, "<this>");
        for (ViewParent viewParent : mzb.a(view)) {
            if ((viewParent instanceof View) && c((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void e(View view, hf8 hf8Var) {
        z65.h(view, "<this>");
        z65.h(hf8Var, "listener");
        b(view).b(hf8Var);
    }
}
