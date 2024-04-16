package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: Canvas.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH&J\u001d\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u0010%\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J@\u0010(\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H&JM\u00102\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020,2\b\b\u0002\u00101\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\b\u00104\u001a\u00020\u0002H&J\b\u00105\u001a\u00020\u0002H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00066À\u0006\u0003"}, d2 = {"Lqn0;", "", "", "l", "g", "Lk99;", "bounds", "Lpp7;", "paint", "o", "", "dx", "dy", "a", "sx", "sy", c.a, "Loa6;", "matrix", "n", "([F)V", "rect", "Lp91;", "clipOp", DateTokenConverter.CONVERTER_KEY, "(Lk99;I)V", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "f", "(FFFFI)V", "Lor7;", "path", "b", "(Lor7;I)V", "i", "p", "radiusX", "radiusY", "j", "k", "Leu4;", ElementGenerator.TYPE_IMAGE, "Ls55;", "srcOffset", "Lw55;", "srcSize", "dstOffset", "dstSize", e.a, "(Leu4;JJJJLpp7;)V", Image.TYPE_HIGH, Image.TYPE_MEDIUM, "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qn0  reason: default package */
/* loaded from: classes.dex */
public interface qn0 {
    void a(float f, float f2);

    void b(or7 or7Var, int i);

    void c(float f, float f2);

    void d(k99 k99Var, int i);

    void e(eu4 eu4Var, long j, long j2, long j3, long j4, pp7 pp7Var);

    void f(float f, float f2, float f3, float f4, int i);

    void g();

    void h();

    void i(k99 k99Var, pp7 pp7Var);

    void j(float f, float f2, float f3, float f4, float f5, float f6, pp7 pp7Var);

    void k(or7 or7Var, pp7 pp7Var);

    void l();

    void m();

    void n(float[] fArr);

    void o(k99 k99Var, pp7 pp7Var);

    void p(float f, float f2, float f3, float f4, pp7 pp7Var);
}
