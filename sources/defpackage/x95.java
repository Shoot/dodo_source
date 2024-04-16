package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: JoinedKey.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lx95;", "", "value", "", "a", "hashCode", "", "toString", "other", "", "equals", "Ljava/lang/Object;", "getLeft", "()Ljava/lang/Object;", ElementGenerator.TEXT_ALIGN_LEFT, "b", "getRight", ElementGenerator.TEXT_ALIGN_RIGHT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: x95  reason: default package */
/* loaded from: classes.dex */
public final class x95 {
    private final Object a;
    private final Object b;

    public x95(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x95)) {
            return false;
        }
        x95 x95Var = (x95) obj;
        if (z65.c(this.a, x95Var.a) && z65.c(this.b, x95Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
