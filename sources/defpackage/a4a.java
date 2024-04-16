package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ProductSegmentationRequestDto.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"La4a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lb4a;", "a", "Lb4a;", "()Lb4a;", "ids", "<init>", "(Lb4a;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: a4a  reason: default package */
/* loaded from: classes.dex */
public final class a4a {
    @uca("ids")
    private final b4a a;

    public a4a(b4a b4aVar) {
        z65.h(b4aVar, "ids");
        this.a = b4aVar;
    }

    public final b4a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a4a) && z65.c(this.a, ((a4a) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SegmentationRequestDto(ids=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
