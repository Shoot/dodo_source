package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: DeviceRenderNode.android.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH&J\b\u0010 \u001a\u00020\u0004H&R\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010\n\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0014\u0010'\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0014\u0010)\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u001c\u0010/\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00102\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001c\u00105\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001c\u00108\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001c\u0010;\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001c\u0010?\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010>R\u001c\u0010B\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010>R\u001c\u0010E\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\u001c\u0010H\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u001c\u0010K\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\u001c\u0010N\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R\u001c\u0010Q\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u0010,\"\u0004\bP\u0010.R\u001c\u0010T\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.R\u001c\u0010Y\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\\\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR\u001c\u0010_\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.R\u001e\u0010e\u001a\u0004\u0018\u00010`8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010VR%\u0010k\u001a\u00020h8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bi\u0010\"\"\u0004\bj\u0010>ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006lÀ\u0006\u0001"}, d2 = {"La23;", "", "Landroid/graphics/Outline;", "outline", "", "M", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "", "x", "offset", "H", "A", "Lun0;", "canvasHolder", "Lor7;", "clipPath", "Lkotlin/Function1;", "Lqn0;", "drawBlock", "L", "Landroid/graphics/Matrix;", "matrix", "G", "Landroid/graphics/Canvas;", "canvas", "v", "hasOverlappingRendering", "F", "y", e.a, "()I", "D", "u", "I", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "i", "(F)V", "scaleX", "getScaleY", "o", "scaleY", "getTranslationX", "t", "translationX", "getTranslationY", "f", "translationY", "Q", "z", "elevation", "getAmbientShadowColor", "N", "(I)V", "ambientShadowColor", "getSpotShadowColor", "P", "spotShadowColor", "getRotationZ", "n", "rotationZ", "getRotationX", "k", "rotationX", "getRotationY", "l", "rotationY", "getCameraDistance", "j", "cameraDistance", "getPivotX", "J", "pivotX", "getPivotY", "K", "pivotY", "E", "()Z", "O", "(Z)V", "clipToOutline", "C", "w", "clipToBounds", "a", c.a, "alpha", "Lfe9;", "getRenderEffect", "()Lfe9;", "g", "(Lfe9;)V", "renderEffect", "B", "hasDisplayList", "Landroidx/compose/ui/graphics/a;", "getCompositingStrategy--NrFUSI", Image.TYPE_HIGH, "compositingStrategy", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: a23  reason: default package */
/* loaded from: classes.dex */
public interface a23 {
    void A(int i);

    boolean B();

    boolean C();

    int D();

    boolean E();

    boolean F(boolean z);

    void G(Matrix matrix);

    void H(int i);

    int I();

    void J(float f);

    void K(float f);

    void L(un0 un0Var, or7 or7Var, Function1<? super qn0, Unit> function1);

    void M(Outline outline);

    void N(int i);

    void O(boolean z);

    void P(int i);

    float Q();

    float a();

    void c(float f);

    int e();

    void f(float f);

    void g(fe9 fe9Var);

    int getHeight();

    int getWidth();

    void h(int i);

    void i(float f);

    void j(float f);

    void k(float f);

    void l(float f);

    void n(float f);

    void o(float f);

    void t(float f);

    int u();

    void v(Canvas canvas);

    void w(boolean z);

    boolean x(int i, int i2, int i3, int i4);

    void y();

    void z(float f);
}
