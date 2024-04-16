package androidx.compose.ui.draw;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010+\u001a\u00020&\u0012\b\u00101\u001a\u0004\u0018\u00010,¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u00101\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lfn6;", "Landroidx/compose/ui/draw/b;", "t", "node", "", "u", "", "toString", "", "hashCode", "", "other", "", "equals", "Lsp7;", c.a, "Lsp7;", "getPainter", "()Lsp7;", "painter", DateTokenConverter.CONVERTER_KEY, "Z", "getSizeToIntrinsics", "()Z", "sizeToIntrinsics", "Lgb;", e.a, "Lgb;", "getAlignment", "()Lgb;", "alignment", "Lau1;", "f", "Lau1;", "getContentScale", "()Lau1;", "contentScale", "", "g", "F", "getAlpha", "()F", "alpha", "Lwc1;", Image.TYPE_HIGH, "Lwc1;", "getColorFilter", "()Lwc1;", "colorFilter", "<init>", "(Lsp7;ZLgb;Lau1;FLwc1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PainterElement extends fn6<b> {
    private final sp7 c;
    private final boolean d;
    private final gb e;
    private final au1 f;
    private final float g;
    private final wc1 h;

    public PainterElement(sp7 sp7Var, boolean z, gb gbVar, au1 au1Var, float f, wc1 wc1Var) {
        z65.h(sp7Var, "painter");
        z65.h(gbVar, "alignment");
        z65.h(au1Var, "contentScale");
        this.c = sp7Var;
        this.d = z;
        this.e = gbVar;
        this.f = au1Var;
        this.g = f;
        this.h = wc1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (z65.c(this.c, painterElement.c) && this.d == painterElement.d && z65.c(this.e, painterElement.e) && z65.c(this.f, painterElement.f) && Float.compare(this.g, painterElement.g) == 0 && z65.c(this.h, painterElement.h)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((((((hashCode2 + i) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + Float.floatToIntBits(this.g)) * 31;
        wc1 wc1Var = this.h;
        if (wc1Var == null) {
            hashCode = 0;
        } else {
            hashCode = wc1Var.hashCode();
        }
        return hashCode3 + hashCode;
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public b o() {
        return new b(this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public String toString() {
        return "PainterElement(painter=" + this.c + ", sizeToIntrinsics=" + this.d + ", alignment=" + this.e + ", contentScale=" + this.f + ", alpha=" + this.g + ", colorFilter=" + this.h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(b bVar) {
        boolean z;
        z65.h(bVar, "node");
        boolean h1 = bVar.h1();
        boolean z2 = this.d;
        if (h1 == z2 && (!z2 || cna.f(bVar.g1().h(), this.c.h()))) {
            z = false;
        } else {
            z = true;
        }
        bVar.p1(this.c);
        bVar.q1(this.d);
        bVar.m1(this.e);
        bVar.o1(this.f);
        bVar.c(this.g);
        bVar.n1(this.h);
        if (z) {
            cn5.b(bVar);
        }
        w73.a(bVar);
    }
}
