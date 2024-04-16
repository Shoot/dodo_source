package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: Paint.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&R\u001c\u0010\n\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR%\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR%\u0010\u0016\u001a\u00020\u00118&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R%\u0010\u001a\u001a\u00020\u00178&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u001d\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR%\u0010!\u001a\u00020\u001e8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R%\u0010%\u001a\u00020\"8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001c\u0010(\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR%\u0010,\u001a\u00020)8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R$\u00103\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00109\u001a\u0004\u0018\u0001048&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010?\u001a\u0004\u0018\u00010:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, d2 = {"Lpp7;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "p", "", "a", "()F", c.a, "(F)V", "alpha", "Luc1;", "b", "()J", "k", "(J)V", RemoteMessageConst.Notification.COLOR, "Lpc0;", Image.TYPE_MEDIUM, "()I", e.a, "(I)V", "blendMode", "Lup7;", "getStyle-TiuSbCo", "v", "style", "x", "w", "strokeWidth", "Lq0b;", "i", DateTokenConverter.CONVERTER_KEY, "strokeCap", "Ls0b;", "n", "j", "strokeJoin", "o", Image.TYPE_SMALL, "strokeMiterLimit", "Lyu3;", "u", Image.TYPE_HIGH, "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "r", "()Landroid/graphics/Shader;", "q", "(Landroid/graphics/Shader;)V", "shader", "Lwc1;", "f", "()Lwc1;", "t", "(Lwc1;)V", "colorFilter", "Lrr7;", "l", "()Lrr7;", "g", "(Lrr7;)V", "pathEffect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pp7  reason: default package */
/* loaded from: classes.dex */
public interface pp7 {
    float a();

    long b();

    void c(float f);

    void d(int i);

    void e(int i);

    wc1 f();

    void g(rr7 rr7Var);

    void h(int i);

    int i();

    void j(int i);

    void k(long j);

    rr7 l();

    int m();

    int n();

    float o();

    Paint p();

    void q(Shader shader);

    Shader r();

    void s(float f);

    void t(wc1 wc1Var);

    int u();

    void v(int i);

    void w(float f);

    float x();
}
