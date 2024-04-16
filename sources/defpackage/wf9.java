package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidComposeView;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: RenderNodeApi29.android.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\bw\u0010xJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001f\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00100R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u0010\n\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u00100R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00100R\u0014\u00106\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00100R$\u0010=\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010@\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R$\u0010C\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R$\u0010F\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010:\"\u0004\bE\u0010<R$\u0010I\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R$\u0010M\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u00100\"\u0004\bK\u0010LR$\u0010P\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u00100\"\u0004\bO\u0010LR$\u0010S\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010:\"\u0004\bR\u0010<R$\u0010V\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010:\"\u0004\bU\u0010<R$\u0010Y\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010:\"\u0004\bX\u0010<R$\u0010\\\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010:\"\u0004\b[\u0010<R$\u0010_\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010:\"\u0004\b^\u0010<R$\u0010b\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010:\"\u0004\ba\u0010<R$\u0010g\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010j\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010d\"\u0004\bi\u0010fR$\u0010k\u001a\u0002072\u0006\u00108\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010:\"\u0004\b,\u0010<R(\u0010q\u001a\u0004\u0018\u00010l2\b\u00108\u001a\u0004\u0018\u00010l8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR-\u0010t\u001a\u00020+2\u0006\u00108\u001a\u00020+8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\br\u00100\"\u0004\bs\u0010LR\u0014\u0010v\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"Lwf9;", "La23;", "Landroid/graphics/Outline;", "outline", "", "M", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "", "x", "offset", "H", "A", "Lun0;", "canvasHolder", "Lor7;", "clipPath", "Lkotlin/Function1;", "Lqn0;", "drawBlock", "L", "Landroid/graphics/Matrix;", "matrix", "G", "Landroid/graphics/Canvas;", "canvas", "v", "hasOverlappingRendering", "F", "y", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroid/graphics/RenderNode;", "b", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/a;", c.a, "I", "internalCompositingStrategy", e.a, "()I", "D", "u", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "i", "(F)V", "scaleX", "getScaleY", "o", "scaleY", "getTranslationX", "t", "translationX", "getTranslationY", "f", "translationY", "Q", "z", "elevation", "getAmbientShadowColor", "N", "(I)V", "ambientShadowColor", "getSpotShadowColor", "P", "spotShadowColor", "getRotationZ", "n", "rotationZ", "getRotationX", "k", "rotationX", "getRotationY", "l", "rotationY", "getCameraDistance", "j", "cameraDistance", "getPivotX", "J", "pivotX", "getPivotY", "K", "pivotY", "E", "()Z", "O", "(Z)V", "clipToOutline", "C", "w", "clipToBounds", "alpha", "Lfe9;", "getRenderEffect", "()Lfe9;", "g", "(Lfe9;)V", "renderEffect", "getCompositingStrategy--NrFUSI", Image.TYPE_HIGH, "compositingStrategy", "B", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wf9  reason: default package */
/* loaded from: classes.dex */
public final class wf9 implements a23 {
    private final AndroidComposeView a;
    private final RenderNode b;
    private int c;

    public wf9(AndroidComposeView androidComposeView) {
        z65.h(androidComposeView, "ownerView");
        this.a = androidComposeView;
        this.b = of9.a("Compose");
        this.c = a.a.a();
    }

    @Override // defpackage.a23
    public void A(int i) {
        this.b.offsetTopAndBottom(i);
    }

    @Override // defpackage.a23
    public boolean B() {
        boolean hasDisplayList;
        hasDisplayList = this.b.hasDisplayList();
        return hasDisplayList;
    }

    @Override // defpackage.a23
    public boolean C() {
        boolean clipToBounds;
        clipToBounds = this.b.getClipToBounds();
        return clipToBounds;
    }

    @Override // defpackage.a23
    public int D() {
        int top;
        top = this.b.getTop();
        return top;
    }

    @Override // defpackage.a23
    public boolean E() {
        boolean clipToOutline;
        clipToOutline = this.b.getClipToOutline();
        return clipToOutline;
    }

    @Override // defpackage.a23
    public boolean F(boolean z) {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.b.setHasOverlappingRendering(z);
        return hasOverlappingRendering;
    }

    @Override // defpackage.a23
    public void G(Matrix matrix) {
        z65.h(matrix, "matrix");
        this.b.getMatrix(matrix);
    }

    @Override // defpackage.a23
    public void H(int i) {
        this.b.offsetLeftAndRight(i);
    }

    @Override // defpackage.a23
    public int I() {
        int bottom;
        bottom = this.b.getBottom();
        return bottom;
    }

    @Override // defpackage.a23
    public void J(float f) {
        this.b.setPivotX(f);
    }

    @Override // defpackage.a23
    public void K(float f) {
        this.b.setPivotY(f);
    }

    @Override // defpackage.a23
    public void L(un0 un0Var, or7 or7Var, Function1<? super qn0, Unit> function1) {
        RecordingCanvas beginRecording;
        z65.h(un0Var, "canvasHolder");
        z65.h(function1, "drawBlock");
        beginRecording = this.b.beginRecording();
        z65.g(beginRecording, "renderNode.beginRecording()");
        Canvas q = un0Var.a().q();
        un0Var.a().r(beginRecording);
        sf a = un0Var.a();
        if (or7Var != null) {
            a.l();
            pn0.c(a, or7Var, 0, 2, null);
        }
        function1.invoke(a);
        if (or7Var != null) {
            a.g();
        }
        un0Var.a().r(q);
        this.b.endRecording();
    }

    @Override // defpackage.a23
    public void M(Outline outline) {
        this.b.setOutline(outline);
    }

    @Override // defpackage.a23
    public void N(int i) {
        this.b.setAmbientShadowColor(i);
    }

    @Override // defpackage.a23
    public void O(boolean z) {
        this.b.setClipToOutline(z);
    }

    @Override // defpackage.a23
    public void P(int i) {
        this.b.setSpotShadowColor(i);
    }

    @Override // defpackage.a23
    public float Q() {
        float elevation;
        elevation = this.b.getElevation();
        return elevation;
    }

    @Override // defpackage.a23
    public float a() {
        float alpha;
        alpha = this.b.getAlpha();
        return alpha;
    }

    @Override // defpackage.a23
    public void c(float f) {
        this.b.setAlpha(f);
    }

    @Override // defpackage.a23
    public int e() {
        int left;
        left = this.b.getLeft();
        return left;
    }

    @Override // defpackage.a23
    public void f(float f) {
        this.b.setTranslationY(f);
    }

    @Override // defpackage.a23
    public void g(fe9 fe9Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            yf9.a.a(this.b, fe9Var);
        }
    }

    @Override // defpackage.a23
    public int getHeight() {
        int height;
        height = this.b.getHeight();
        return height;
    }

    @Override // defpackage.a23
    public int getWidth() {
        int width;
        width = this.b.getWidth();
        return width;
    }

    @Override // defpackage.a23
    public void h(int i) {
        RenderNode renderNode = this.b;
        a.C0019a c0019a = a.a;
        if (a.e(i, c0019a.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.e(i, c0019a.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.c = i;
    }

    @Override // defpackage.a23
    public void i(float f) {
        this.b.setScaleX(f);
    }

    @Override // defpackage.a23
    public void j(float f) {
        this.b.setCameraDistance(f);
    }

    @Override // defpackage.a23
    public void k(float f) {
        this.b.setRotationX(f);
    }

    @Override // defpackage.a23
    public void l(float f) {
        this.b.setRotationY(f);
    }

    @Override // defpackage.a23
    public void n(float f) {
        this.b.setRotationZ(f);
    }

    @Override // defpackage.a23
    public void o(float f) {
        this.b.setScaleY(f);
    }

    @Override // defpackage.a23
    public void t(float f) {
        this.b.setTranslationX(f);
    }

    @Override // defpackage.a23
    public int u() {
        int right;
        right = this.b.getRight();
        return right;
    }

    @Override // defpackage.a23
    public void v(Canvas canvas) {
        z65.h(canvas, "canvas");
        canvas.drawRenderNode(this.b);
    }

    @Override // defpackage.a23
    public void w(boolean z) {
        this.b.setClipToBounds(z);
    }

    @Override // defpackage.a23
    public boolean x(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.b.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // defpackage.a23
    public void y() {
        this.b.discardDisplayList();
    }

    @Override // defpackage.a23
    public void z(float f) {
        this.b.setElevation(f);
    }
}
