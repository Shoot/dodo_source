package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidComposeView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b3\b\u0001\u0018\u0000 P2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010*\u001a\u00020%¢\u0006\u0004\b~\u0010\u007fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J.\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0002H\u0016R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001f\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010.\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\f\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010.\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\"\u0010\r\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u00102\"\u0004\b9\u00104R\"\u0010\u000e\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010.\u001a\u0004\b.\u00102\"\u0004\b0\u00104R*\u0010B\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00102R\u0014\u0010F\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00102R$\u0010H\u001a\u0004\u0018\u00010G8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\b:\u0010LR$\u0010R\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR$\u0010X\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR$\u0010Z\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010O\"\u0004\b7\u0010QR$\u0010]\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010O\"\u0004\b\\\u0010QR$\u0010`\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u00102\"\u0004\b_\u00104R$\u0010c\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u00102\"\u0004\bb\u00104R$\u0010f\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR$\u0010i\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010O\"\u0004\bh\u0010QR$\u0010l\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bj\u0010O\"\u0004\bk\u0010QR$\u0010o\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010O\"\u0004\bn\u0010QR$\u0010r\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bp\u0010O\"\u0004\bq\u0010QR$\u0010u\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010O\"\u0004\bt\u0010QR$\u0010x\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010?\"\u0004\bw\u0010AR$\u0010y\u001a\u00020M2\u0006\u0010;\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010O\"\u0004\b-\u0010QR-\u0010{\u001a\u00020,2\u0006\u0010;\u001a\u00020,8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bz\u00102\"\u0004\b<\u00104R\u0014\u0010}\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010?\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"Lie9;", "La23;", "", "b", "Landroid/view/RenderNode;", "renderNode", "r", "Landroid/graphics/Outline;", "outline", "M", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "", "x", "offset", "H", "A", "Lun0;", "canvasHolder", "Lor7;", "clipPath", "Lkotlin/Function1;", "Lqn0;", "drawBlock", "L", "Landroid/graphics/Matrix;", "matrix", "G", "Landroid/graphics/Canvas;", "canvas", "v", "hasOverlappingRendering", "F", "y", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/a;", c.a, "I", "internalCompositingStrategy", DateTokenConverter.CONVERTER_KEY, e.a, "()I", Image.TYPE_MEDIUM, "(I)V", "D", "q", "f", "u", "p", "g", "value", Image.TYPE_HIGH, "Z", "C", "()Z", "w", "(Z)V", "clipToBounds", "getWidth", "width", "getHeight", "height", "Lfe9;", "renderEffect", "Lfe9;", "getRenderEffect", "()Lfe9;", "(Lfe9;)V", "", "getScaleX", "()F", "i", "(F)V", "scaleX", "getScaleY", "o", "scaleY", "getTranslationX", "t", "translationX", "getTranslationY", "translationY", "Q", "z", "elevation", "getAmbientShadowColor", "N", "ambientShadowColor", "getSpotShadowColor", "P", "spotShadowColor", "getRotationZ", "n", "rotationZ", "getRotationX", "k", "rotationX", "getRotationY", "l", "rotationY", "getCameraDistance", "j", "cameraDistance", "getPivotX", "J", "pivotX", "getPivotY", "K", "pivotY", "E", "O", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "compositingStrategy", "B", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ie9  reason: default package */
/* loaded from: classes.dex */
public final class ie9 implements a23 {
    private static boolean j;
    private final AndroidComposeView a;
    private final RenderNode b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    public static final a i = new a(null);
    private static boolean k = true;

    /* compiled from: RenderNodeApi23.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lie9$a;", "", "", "needToValidateAccess", "Z", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ie9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ie9(AndroidComposeView androidComposeView) {
        z65.h(androidComposeView, "ownerView");
        this.a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        z65.g(create, "create(\"Compose\", ownerView)");
        this.b = create;
        this.c = androidx.compose.ui.graphics.a.a.a();
        if (k) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            r(create);
            b();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            k = false;
        }
        if (!j) {
            return;
        }
        throw new NoClassDefFoundError();
    }

    private final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            bg9.a.a(this.b);
        } else {
            ag9.a.a(this.b);
        }
    }

    private final void r(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            cg9 cg9Var = cg9.a;
            cg9Var.c(renderNode, cg9Var.a(renderNode));
            cg9Var.d(renderNode, cg9Var.b(renderNode));
        }
    }

    @Override // defpackage.a23
    public void A(int i2) {
        q(D() + i2);
        d(I() + i2);
        this.b.offsetTopAndBottom(i2);
    }

    @Override // defpackage.a23
    public boolean B() {
        return this.b.isValid();
    }

    @Override // defpackage.a23
    public boolean C() {
        return this.h;
    }

    @Override // defpackage.a23
    public int D() {
        return this.e;
    }

    @Override // defpackage.a23
    public boolean E() {
        return this.b.getClipToOutline();
    }

    @Override // defpackage.a23
    public boolean F(boolean z) {
        return this.b.setHasOverlappingRendering(z);
    }

    @Override // defpackage.a23
    public void G(Matrix matrix) {
        z65.h(matrix, "matrix");
        this.b.getMatrix(matrix);
    }

    @Override // defpackage.a23
    public void H(int i2) {
        m(e() + i2);
        p(u() + i2);
        this.b.offsetLeftAndRight(i2);
    }

    @Override // defpackage.a23
    public int I() {
        return this.g;
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
        z65.h(un0Var, "canvasHolder");
        z65.h(function1, "drawBlock");
        DisplayListCanvas start = this.b.start(getWidth(), getHeight());
        z65.g(start, "renderNode.start(width, height)");
        Canvas q = un0Var.a().q();
        un0Var.a().r((Canvas) start);
        sf a2 = un0Var.a();
        if (or7Var != null) {
            a2.l();
            pn0.c(a2, or7Var, 0, 2, null);
        }
        function1.invoke(a2);
        if (or7Var != null) {
            a2.g();
        }
        un0Var.a().r(q);
        this.b.end(start);
    }

    @Override // defpackage.a23
    public void M(Outline outline) {
        this.b.setOutline(outline);
    }

    @Override // defpackage.a23
    public void N(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            cg9.a.c(this.b, i2);
        }
    }

    @Override // defpackage.a23
    public void O(boolean z) {
        this.b.setClipToOutline(z);
    }

    @Override // defpackage.a23
    public void P(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            cg9.a.d(this.b, i2);
        }
    }

    @Override // defpackage.a23
    public float Q() {
        return this.b.getElevation();
    }

    @Override // defpackage.a23
    public float a() {
        return this.b.getAlpha();
    }

    @Override // defpackage.a23
    public void c(float f) {
        this.b.setAlpha(f);
    }

    public void d(int i2) {
        this.g = i2;
    }

    @Override // defpackage.a23
    public int e() {
        return this.d;
    }

    @Override // defpackage.a23
    public void f(float f) {
        this.b.setTranslationY(f);
    }

    @Override // defpackage.a23
    public int getHeight() {
        return I() - D();
    }

    @Override // defpackage.a23
    public int getWidth() {
        return u() - e();
    }

    @Override // defpackage.a23
    public void h(int i2) {
        a.C0019a c0019a = androidx.compose.ui.graphics.a.a;
        if (androidx.compose.ui.graphics.a.e(i2, c0019a.c())) {
            this.b.setLayerType(2);
            this.b.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i2, c0019a.b())) {
            this.b.setLayerType(0);
            this.b.setHasOverlappingRendering(false);
        } else {
            this.b.setLayerType(0);
            this.b.setHasOverlappingRendering(true);
        }
        this.c = i2;
    }

    @Override // defpackage.a23
    public void i(float f) {
        this.b.setScaleX(f);
    }

    @Override // defpackage.a23
    public void j(float f) {
        this.b.setCameraDistance(-f);
    }

    @Override // defpackage.a23
    public void k(float f) {
        this.b.setRotationX(f);
    }

    @Override // defpackage.a23
    public void l(float f) {
        this.b.setRotationY(f);
    }

    public void m(int i2) {
        this.d = i2;
    }

    @Override // defpackage.a23
    public void n(float f) {
        this.b.setRotation(f);
    }

    @Override // defpackage.a23
    public void o(float f) {
        this.b.setScaleY(f);
    }

    public void p(int i2) {
        this.f = i2;
    }

    public void q(int i2) {
        this.e = i2;
    }

    @Override // defpackage.a23
    public void t(float f) {
        this.b.setTranslationX(f);
    }

    @Override // defpackage.a23
    public int u() {
        return this.f;
    }

    @Override // defpackage.a23
    public void v(Canvas canvas) {
        z65.h(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.b);
    }

    @Override // defpackage.a23
    public void w(boolean z) {
        this.h = z;
        this.b.setClipToBounds(z);
    }

    @Override // defpackage.a23
    public boolean x(int i2, int i3, int i4, int i5) {
        m(i2);
        q(i3);
        p(i4);
        d(i5);
        return this.b.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // defpackage.a23
    public void y() {
        b();
    }

    @Override // defpackage.a23
    public void z(float f) {
        this.b.setElevation(f);
    }

    @Override // defpackage.a23
    public void g(fe9 fe9Var) {
    }
}
