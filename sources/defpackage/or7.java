package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: Path.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H&J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H&J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH&J\b\u0010\"\u001a\u00020\u0005H&J\b\u0010#\u001a\u00020\u0005H&J\b\u0010$\u001a\u00020\u0005H\u0016J-\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+R%\u00101\u001a\u00020,8&@&X¦\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00104\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00103ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u00066À\u0006\u0003"}, d2 = {"Lor7;", "", "", "x", "y", "", "l", "dx", "dy", "b", "o", "n", "x1", "y1", "x2", "y2", DateTokenConverter.CONVERTER_KEY, "dx1", "dy1", "dx2", "dy2", e.a, "x3", "y3", Image.TYPE_MEDIUM, "dx3", "dy3", c.a, "Lk99;", "rect", "i", "Lgo9;", "roundRect", Image.TYPE_HIGH, "close", "reset", "g", "path1", "path2", "Lbs7;", "operation", "", "k", "(Lor7;Lor7;I)Z", "Lsr7;", "j", "()I", "f", "(I)V", "fillType", "a", "()Z", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: or7  reason: default package */
/* loaded from: classes.dex */
public interface or7 {
    boolean a();

    void b(float f, float f2);

    void c(float f, float f2, float f3, float f4, float f5, float f6);

    void close();

    void d(float f, float f2, float f3, float f4);

    void e(float f, float f2, float f3, float f4);

    void f(int i);

    void g();

    void h(go9 go9Var);

    void i(k99 k99Var);

    boolean isEmpty();

    int j();

    boolean k(or7 or7Var, or7 or7Var2, int i);

    void l(float f, float f2);

    void m(float f, float f2, float f3, float f4, float f5, float f6);

    void n(float f, float f2);

    void o(float f, float f2);

    void reset();
}
