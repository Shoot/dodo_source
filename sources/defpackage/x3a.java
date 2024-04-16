package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SegmentationCheck.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0016"}, d2 = {"Lx3a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "status", "", "Lr52;", "b", "Ljava/util/List;", "()Ljava/util/List;", "customerSegmentations", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: x3a  reason: default package */
/* loaded from: classes.dex */
public final class x3a {
    private final String a;
    private final List<r52> b;

    public x3a(String str, List<r52> list) {
        z65.h(str, "status");
        z65.h(list, "customerSegmentations");
        this.a = str;
        this.b = list;
    }

    public final List<r52> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3a)) {
            return false;
        }
        x3a x3aVar = (x3a) obj;
        if (z65.c(this.a, x3aVar.a) && z65.c(this.b, x3aVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SegmentationCheckWrapper(status=" + this.a + ", customerSegmentations=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
