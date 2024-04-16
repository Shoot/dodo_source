package androidx.compose.ui.graphics;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0094\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\u0006\u0010&\u001a\u00020\u000f\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\u0006\u0010,\u001a\u00020\u000f\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\u0006\u00105\u001a\u000200\u0012\u0006\u0010;\u001a\u000206\u0012\u0006\u0010@\u001a\u00020\r\u0012\b\u0010O\u001a\u0004\u0018\u00010N\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010G\u001a\u00020A\u0012\u0006\u0010M\u001a\u00020Hø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010#\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u0017\u0010&\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u0017\u0010)\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013R\u0017\u0010,\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\u0013R\u0017\u0010/\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010\u0011\u001a\u0004\b.\u0010\u0013R \u00105\u001a\u0002008\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010D\u001a\u00020A8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bC\u00104R \u0010G\u001a\u00020A8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104R \u0010M\u001a\u00020H8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lfn6;", "Landroidx/compose/ui/graphics/e;", "t", "node", "", "u", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "getScaleX", "()F", "scaleX", DateTokenConverter.CONVERTER_KEY, "getScaleY", "scaleY", com.huawei.hms.push.e.a, "getAlpha", "alpha", "f", "getTranslationX", "translationX", "g", "getTranslationY", "translationY", Image.TYPE_HIGH, "getShadowElevation", "shadowElevation", "i", "getRotationX", "rotationX", "j", "getRotationY", "rotationY", "k", "getRotationZ", "rotationZ", "l", "getCameraDistance", "cameraDistance", "Landroidx/compose/ui/graphics/f;", Image.TYPE_MEDIUM, "J", "getTransformOrigin-SzJe1aQ", "()J", "transformOrigin", "Ltga;", "n", "Ltga;", "getShape", "()Ltga;", "shape", "o", "Z", "getClip", "()Z", "clip", "Luc1;", "p", "getAmbientShadowColor-0d7_KjU", "ambientShadowColor", "q", "getSpotShadowColor-0d7_KjU", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "r", "I", "getCompositingStrategy--NrFUSI", "()I", "compositingStrategy", "Lfe9;", "renderEffect", "<init>", "(FFFFFFFFFFJLtga;ZLfe9;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class GraphicsLayerElement extends fn6<e> {
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private final long m;
    private final tga n;
    private final boolean o;
    private final long p;
    private final long q;
    private final int r;

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tga tgaVar, boolean z, fe9 fe9Var, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, tgaVar, z, fe9Var, j2, j3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.c, graphicsLayerElement.c) == 0 && Float.compare(this.d, graphicsLayerElement.d) == 0 && Float.compare(this.e, graphicsLayerElement.e) == 0 && Float.compare(this.f, graphicsLayerElement.f) == 0 && Float.compare(this.g, graphicsLayerElement.g) == 0 && Float.compare(this.h, graphicsLayerElement.h) == 0 && Float.compare(this.i, graphicsLayerElement.i) == 0 && Float.compare(this.j, graphicsLayerElement.j) == 0 && Float.compare(this.k, graphicsLayerElement.k) == 0 && Float.compare(this.l, graphicsLayerElement.l) == 0 && f.c(this.m, graphicsLayerElement.m) && z65.c(this.n, graphicsLayerElement.n) && this.o == graphicsLayerElement.o && z65.c(null, null) && uc1.l(this.p, graphicsLayerElement.p) && uc1.l(this.q, graphicsLayerElement.q) && a.e(this.r, graphicsLayerElement.r)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int floatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + f.f(this.m)) * 31) + this.n.hashCode()) * 31;
        boolean z = this.o;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((floatToIntBits + i) * 961) + uc1.r(this.p)) * 31) + uc1.r(this.q)) * 31) + a.f(this.r);
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public e o() {
        return new e(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, null, this.p, this.q, this.r, null);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.c + ", scaleY=" + this.d + ", alpha=" + this.e + ", translationX=" + this.f + ", translationY=" + this.g + ", shadowElevation=" + this.h + ", rotationX=" + this.i + ", rotationY=" + this.j + ", rotationZ=" + this.k + ", cameraDistance=" + this.l + ", transformOrigin=" + ((Object) f.g(this.m)) + ", shape=" + this.n + ", clip=" + this.o + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) uc1.s(this.p)) + ", spotShadowColor=" + ((Object) uc1.s(this.q)) + ", compositingStrategy=" + ((Object) a.g(this.r)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(e eVar) {
        z65.h(eVar, "node");
        eVar.i(this.c);
        eVar.o(this.d);
        eVar.c(this.e);
        eVar.t(this.f);
        eVar.f(this.g);
        eVar.Z(this.h);
        eVar.k(this.i);
        eVar.l(this.j);
        eVar.n(this.k);
        eVar.j(this.l);
        eVar.P(this.m);
        eVar.m0(this.n);
        eVar.M(this.o);
        eVar.g(null);
        eVar.H(this.p);
        eVar.Q(this.q);
        eVar.h(this.r);
        eVar.o1();
    }

    private GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tga tgaVar, boolean z, fe9 fe9Var, long j2, long j3, int i) {
        z65.h(tgaVar, "shape");
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = f10;
        this.m = j;
        this.n = tgaVar;
        this.o = z;
        this.p = j2;
        this.q = j3;
        this.r = i;
    }
}
