package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
/* compiled from: CanvasUtils.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lwn0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", "a", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", c.a, "inorderBarrierMethod", DateTokenConverter.CONVERTER_KEY, "Z", "orderMethodsFetched", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wn0  reason: default package */
/* loaded from: classes.dex */
public final class wn0 {
    public static final wn0 a = new wn0();
    private static Method b;
    private static Method c;
    private static boolean d;

    private wn0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(Canvas canvas, boolean z) {
        Method method;
        z65.h(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            zn0.a.a(canvas, z);
            return;
        }
        if (!d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            d = true;
        }
        if (z) {
            try {
                Method method4 = b;
                if (method4 != null) {
                    z65.e(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = c) != null) {
            z65.e(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
