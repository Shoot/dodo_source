package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProductSegmentationResponseDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lim8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lem8;", "a", "Ljava/util/List;", "()Ljava/util/List;", "products", "b", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "status", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: im8  reason: default package */
/* loaded from: classes.dex */
public final class im8 {
    @uca("products")
    private final List<em8> a;
    @uca("status")
    private final String b;

    public final List<em8> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im8)) {
            return false;
        }
        im8 im8Var = (im8) obj;
        if (z65.c(this.a, im8Var.a) && z65.c(this.b, im8Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        List<em8> list = this.a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "ProductSegmentationResponseDto(products=" + this.a + ", status=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
