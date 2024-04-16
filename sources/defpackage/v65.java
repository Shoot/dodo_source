package defpackage;

import android.graphics.Path;
import android.view.animation.Interpolator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: InterpolatorProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0010"}, d2 = {"Lv65;", "", "Landroid/view/animation/Interpolator;", "b", "Landroid/view/animation/Interpolator;", "()Landroid/view/animation/Interpolator;", "rect1TranslateInterpolator", c.a, "a", "rect1ScaleInterpolator", DateTokenConverter.CONVERTER_KEY, "rect2TranslateInterpolator", e.a, "rect2ScaleInterpolator", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v65  reason: default package */
/* loaded from: classes.dex */
public final class v65 {
    public static final v65 a = new v65();
    private static final Interpolator b;
    private static final Interpolator c;
    private static final Interpolator d;
    private static final Interpolator e;

    static {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.2f, 0.0f);
        path.cubicTo(0.39583334f, 0.0f, 0.47484508f, 0.20679761f, 0.59166664f, 0.41708294f);
        path.cubicTo(0.715161f, 0.6393796f, 0.81625f, 0.9745569f, 1.0f, 1.0f);
        Interpolator b2 = tr7.b(path);
        z65.g(b2, "create(...)");
        b = b2;
        Path path2 = new Path();
        path2.moveTo(0.0f, 0.0f);
        path2.lineTo(0.3665f, 0.0f);
        path2.cubicTo(0.4725262f, 0.06240991f, 0.6154161f, 0.5f, 0.68325f, 0.5f);
        path2.cubicTo(0.7547506f, 0.5f, 0.7572583f, 0.8145101f, 1.0f, 1.0f);
        Interpolator b3 = tr7.b(path2);
        z65.g(b3, "create(...)");
        c = b3;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.cubicTo(0.0375f, 0.0f, 0.12876461f, 0.0895381f, 0.25f, 0.21855351f);
        path3.cubicTo(0.32241032f, 0.2956106f, 0.43666667f, 0.41759142f, 0.48333332f, 0.48982617f);
        path3.cubicTo(0.69f, 0.80972296f, 0.79333335f, 0.95001614f, 1.0f, 1.0f);
        Interpolator b4 = tr7.b(path3);
        z65.g(b4, "create(...)");
        d = b4;
        Path path4 = new Path();
        path4.moveTo(0.0f, 0.0f);
        path4.cubicTo(0.06834272f, 0.019925667f, 0.19220331f, 0.15855429f, 0.33333334f, 0.3492616f);
        path4.cubicTo(0.38410434f, 0.41477913f, 0.5494579f, 0.6813603f, 0.6666667f, 0.68279964f);
        path4.cubicTo(0.75258625f, 0.6817962f, 0.73725396f, 0.8788962f, 1.0f, 1.0f);
        Interpolator b5 = tr7.b(path4);
        z65.g(b5, "create(...)");
        e = b5;
    }

    private v65() {
    }

    public final Interpolator a() {
        return c;
    }

    public final Interpolator b() {
        return b;
    }

    public final Interpolator c() {
        return e;
    }

    public final Interpolator d() {
        return d;
    }
}
