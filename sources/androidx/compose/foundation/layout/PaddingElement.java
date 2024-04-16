package androidx.compose.foundation.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BN\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\r\u0012\b\b\u0002\u0010 \u001a\u00020\r\u0012\u0006\u0010'\u001a\u00020\u000b\u0012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00050(ø\u0001\u0000¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R+\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R+\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R+\u0010 \u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\"\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R#\u0010.\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00050(8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lfn6;", "Landroidx/compose/foundation/layout/c;", "t", "node", "", "u", "", "hashCode", "", "other", "", "equals", "Li73;", com.huawei.hms.opendevice.c.a, "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "start", DateTokenConverter.CONVERTER_KEY, "getTop-D9Ej5fM", "setTop-0680j_4", "top", com.huawei.hms.push.e.a, "getEnd-D9Ej5fM", "setEnd-0680j_4", "end", "f", "getBottom-D9Ej5fM", "setBottom-0680j_4", "bottom", "g", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "rtlAware", "Lkotlin/Function1;", "Lt45;", Image.TYPE_HIGH, "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PaddingElement extends fn6<c> {
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final Function1<t45, Unit> h;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !i73.q(this.c, paddingElement.c) || !i73.q(this.d, paddingElement.d) || !i73.q(this.e, paddingElement.e) || !i73.q(this.f, paddingElement.f) || this.g != paddingElement.g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((i73.s(this.c) * 31) + i73.s(this.d)) * 31) + i73.s(this.e)) * 31) + i73.s(this.f)) * 31) + a91.a(this.g);
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public c o() {
        return new c(this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(c cVar) {
        z65.h(cVar, "node");
        cVar.l1(this.c);
        cVar.m1(this.d);
        cVar.j1(this.e);
        cVar.i1(this.f);
        cVar.k1(this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f, float f2, float f3, float f4, boolean z, Function1<? super t45, Unit> function1) {
        z65.h(function1, "inspectorInfo");
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = function1;
        if (f >= 0.0f || i73.q(f, i73.b.b())) {
            float f5 = this.d;
            if (f5 >= 0.0f || i73.q(f5, i73.b.b())) {
                float f6 = this.e;
                if (f6 >= 0.0f || i73.q(f6, i73.b.b())) {
                    float f7 = this.f;
                    if (f7 >= 0.0f || i73.q(f7, i73.b.b())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
}
