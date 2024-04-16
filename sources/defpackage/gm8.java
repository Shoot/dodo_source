package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProductSegmentationRequestDto.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lgm8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcm8;", "a", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "products", "La4a;", "b", "getSegmentations", "segmentations", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gm8  reason: default package */
/* loaded from: classes.dex */
public final class gm8 {
    @uca("products")
    private final List<cm8> a;
    @uca("segmentations")
    private final List<a4a> b;

    public gm8(List<cm8> list, List<a4a> list2) {
        z65.h(list, "products");
        z65.h(list2, "segmentations");
        this.a = list;
        this.b = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm8)) {
            return false;
        }
        gm8 gm8Var = (gm8) obj;
        if (z65.c(this.a, gm8Var.a) && z65.c(this.b, gm8Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ProductSegmentationRequestDto(products=" + this.a + ", segmentations=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
