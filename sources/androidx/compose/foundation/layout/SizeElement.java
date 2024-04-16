package androidx.compose.foundation.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BN\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u001aø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lfn6;", "Landroidx/compose/foundation/layout/e;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", "Li73;", com.huawei.hms.opendevice.c.a, "F", "minWidth", DateTokenConverter.CONVERTER_KEY, "minHeight", com.huawei.hms.push.e.a, "maxWidth", "f", "maxHeight", "g", "Z", "enforceIncoming", "Lkotlin/Function1;", "Lt45;", Image.TYPE_HIGH, "Lkotlin/jvm/functions/Function1;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SizeElement extends fn6<e> {
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final boolean g;
    private final Function1<t45, Unit> h;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (i73.q(this.c, sizeElement.c) && i73.q(this.d, sizeElement.d) && i73.q(this.e, sizeElement.e) && i73.q(this.f, sizeElement.f) && this.g == sizeElement.g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((i73.s(this.c) * 31) + i73.s(this.d)) * 31) + i73.s(this.e)) * 31) + i73.s(this.f)) * 31) + a91.a(this.g);
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public e o() {
        return new e(this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(e eVar) {
        z65.h(eVar, "node");
        eVar.k1(this.c);
        eVar.j1(this.d);
        eVar.i1(this.e);
        eVar.h1(this.f);
        eVar.g1(this.g);
    }

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? i73.b.b() : f, (i & 2) != 0 ? i73.b.b() : f2, (i & 4) != 0 ? i73.b.b() : f3, (i & 8) != 0 ? i73.b.b() : f4, z, function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f, float f2, float f3, float f4, boolean z, Function1<? super t45, Unit> function1) {
        z65.h(function1, "inspectorInfo");
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = function1;
    }
}
