package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BitmapPainter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b/\u00100J%\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR+\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u0010.\u001a\u00020,8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010-\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00061"}, d2 = {"Lec0;", "Lsp7;", "Ls55;", "srcOffset", "Lw55;", "srcSize", "k", "(JJ)J", "Ly73;", "", "j", "", "alpha", "", "a", "Lwc1;", "colorFilter", "b", "", "other", "equals", "", "hashCode", "", "toString", "Leu4;", "g", "Leu4;", ElementGenerator.TYPE_IMAGE, Image.TYPE_HIGH, "J", "i", "Lyu3;", "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "()I", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "filterQuality", "size", "l", "F", Image.TYPE_MEDIUM, "Lwc1;", "Lcna;", "()J", "intrinsicSize", "<init>", "(Leu4;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ec0  reason: default package */
/* loaded from: classes.dex */
public final class ec0 extends sp7 {
    private final eu4 g;
    private final long h;
    private final long i;
    private int j;
    private final long k;
    private float l;
    private wc1 m;

    public /* synthetic */ ec0(eu4 eu4Var, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eu4Var, j, j2);
    }

    private final long k(long j, long j2) {
        if (s55.h(j) >= 0 && s55.i(j) >= 0 && w55.g(j2) >= 0 && w55.f(j2) >= 0 && w55.g(j2) <= this.g.getWidth() && w55.f(j2) <= this.g.getHeight()) {
            return j2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // defpackage.sp7
    protected boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override // defpackage.sp7
    protected boolean b(wc1 wc1Var) {
        this.m = wc1Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        if (z65.c(this.g, ec0Var.g) && s55.g(this.h, ec0Var.h) && w55.e(this.i, ec0Var.i) && yu3.d(this.j, ec0Var.j)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sp7
    public long h() {
        return x55.c(this.k);
    }

    public int hashCode() {
        return (((((this.g.hashCode() * 31) + s55.j(this.h)) * 31) + w55.h(this.i)) * 31) + yu3.e(this.j);
    }

    @Override // defpackage.sp7
    protected void j(y73 y73Var) {
        int c;
        int c2;
        z65.h(y73Var, "<this>");
        eu4 eu4Var = this.g;
        long j = this.h;
        long j2 = this.i;
        c = la6.c(cna.i(y73Var.s()));
        c2 = la6.c(cna.g(y73Var.s()));
        x73.d(y73Var, eu4Var, j, j2, 0L, x55.a(c, c2), this.l, null, this.m, 0, this.j, 328, null);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.g + ", srcOffset=" + ((Object) s55.k(this.h)) + ", srcSize=" + ((Object) w55.i(this.i)) + ", filterQuality=" + ((Object) yu3.f(this.j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ec0(eu4 eu4Var, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eu4Var, (i & 2) != 0 ? s55.b.a() : j, (i & 4) != 0 ? x55.a(eu4Var.getWidth(), eu4Var.getHeight()) : j2, null);
    }

    private ec0(eu4 eu4Var, long j, long j2) {
        z65.h(eu4Var, ElementGenerator.TYPE_IMAGE);
        this.g = eu4Var;
        this.h = j;
        this.i = j2;
        this.j = yu3.a.a();
        this.k = k(j, j2);
        this.l = 1.0f;
    }
}
