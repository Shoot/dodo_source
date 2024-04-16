package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\"\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u000f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u001a\u0010\u0014\u001a\u00020\u00128\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u001a\u0010\u0019\u001a\u00020\u00158\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u001a8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\n\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"", "pathStr", "", "Lzr7;", "a", "Ljava/util/List;", e.a, "()Ljava/util/List;", "EmptyPath", "Lq0b;", "b", "I", c.a, "()I", "DefaultStrokeLineCap", "Ls0b;", DateTokenConverter.CONVERTER_KEY, "DefaultStrokeLineJoin", "Lpc0;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "Luc1;", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Lsr7;", "f", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: oxb  reason: default package */
/* loaded from: classes.dex */
public final class oxb {
    private static final List<zr7> a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final long e;
    private static final int f;

    static {
        List<zr7> l;
        l = kc1.l();
        a = l;
        b = q0b.b.a();
        c = s0b.b.b();
        d = pc0.b.z();
        e = uc1.b.d();
        f = sr7.b.b();
    }

    public static final List<zr7> a(String str) {
        if (str == null) {
            return a;
        }
        return new es7().a(str).b();
    }

    public static final int b() {
        return f;
    }

    public static final int c() {
        return b;
    }

    public static final int d() {
        return c;
    }

    public static final List<zr7> e() {
        return a;
    }
}
