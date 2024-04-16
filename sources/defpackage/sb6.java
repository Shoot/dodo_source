package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: MeasureExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\t\u0010\u0005R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\r\u0010\u0005R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0010\u0010\u0005¨\u0006\u0016"}, d2 = {"Lsb6;", "", "Lrb6;", "b", "Lrb6;", "()Lrb6;", "gram", c.a, "kilogram", DateTokenConverter.CONVERTER_KEY, e.a, "piece", "liter", "f", "a", "centimeter", "g", "portion", Image.TYPE_HIGH, "unknown", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sb6  reason: default package */
/* loaded from: classes.dex */
public final class sb6 {
    public static final sb6 a = new sb6();
    private static final rb6 b = new rb6(n09.gram);
    private static final rb6 c = new rb6(n09.kilogram);
    private static final rb6 d = new rb6(n09.unit);
    private static final rb6 e = new rb6(n09.liter);
    private static final rb6 f = new rb6(n09.centimeter);
    private static final rb6 g;
    private static final rb6 h;

    static {
        int i = n09.e;
        g = new rb6(i);
        h = new rb6(i);
    }

    private sb6() {
    }

    public final rb6 a() {
        return f;
    }

    public final rb6 b() {
        return b;
    }

    public final rb6 c() {
        return c;
    }

    public final rb6 d() {
        return e;
    }

    public final rb6 e() {
        return d;
    }

    public final rb6 f() {
        return g;
    }

    public final rb6 g() {
        return h;
    }
}
