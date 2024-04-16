package androidx.compose.foundation.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Lfn6;", "Lnn5;", "t", "node", "", "u", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "getWeight", "()F", "weight", DateTokenConverter.CONVERTER_KEY, "Z", "getFill", "()Z", "fill", "<init>", "(FZ)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutWeightElement extends fn6<nn5> {
    private final float c;
    private final boolean d;

    public LayoutWeightElement(float f, boolean z) {
        this.c = f;
        this.d = z;
    }

    public boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement != null && this.c == layoutWeightElement.c && this.d == layoutWeightElement.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.c) * 31) + a91.a(this.d);
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public nn5 o() {
        return new nn5(this.c, this.d);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(nn5 nn5Var) {
        z65.h(nn5Var, "node");
        nn5Var.h1(this.c);
        nn5Var.g1(this.d);
    }
}
