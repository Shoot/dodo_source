package defpackage;

import android.graphics.Path;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PathProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\r\u0010\u0005\"\u0004\b\u000e\u0010\u0007R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\t\u0010\u0005\"\u0004\b\u0011\u0010\u0007¨\u0006\u0015"}, d2 = {"Lgs7;", "", "Landroid/graphics/Path;", "b", "Landroid/graphics/Path;", "()Landroid/graphics/Path;", "setRect1TranslatePath", "(Landroid/graphics/Path;)V", "rect1TranslatePath", c.a, "a", "setRect1ScalePath", "rect1ScalePath", DateTokenConverter.CONVERTER_KEY, "setRect2TranslatePath", "rect2TranslatePath", e.a, "setRect2ScalePath", "rect2ScalePath", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gs7  reason: default package */
/* loaded from: classes.dex */
public final class gs7 {
    public static final gs7 a = new gs7();
    private static Path b;
    private static Path c;
    private static Path d;
    private static Path e;

    static {
        Path path = new Path();
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        b = path;
        Path path2 = new Path();
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        c = path2;
        Path path3 = new Path();
        path3.moveTo(-228.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        d = path3;
        Path path4 = new Path();
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
        e = path4;
    }

    private gs7() {
    }

    public final Path a() {
        return c;
    }

    public final Path b() {
        return b;
    }

    public final Path c() {
        return e;
    }

    public final Path d() {
        return d;
    }
}
