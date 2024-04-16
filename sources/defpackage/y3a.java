package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: SegmentationCheckRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Ly3a;", "", "Lqt4;", "component1", "ids", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lqt4;", "getIds", "()Lqt4;", "<init>", "(Lqt4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: y3a  reason: default package */
/* loaded from: classes.dex */
public final class y3a {
    @uca("ids")
    private final qt4 ids;

    public y3a(qt4 qt4Var) {
        this.ids = qt4Var;
    }

    public static /* synthetic */ y3a copy$default(y3a y3aVar, qt4 qt4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            qt4Var = y3aVar.ids;
        }
        return y3aVar.copy(qt4Var);
    }

    public final qt4 component1() {
        return this.ids;
    }

    public final y3a copy(qt4 qt4Var) {
        return new y3a(qt4Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y3a) && z65.c(this.ids, ((y3a) obj).ids)) {
            return true;
        }
        return false;
    }

    public final qt4 getIds() {
        return this.ids;
    }

    public int hashCode() {
        qt4 qt4Var = this.ids;
        if (qt4Var == null) {
            return 0;
        }
        return qt4Var.hashCode();
    }

    public String toString() {
        return "SegmentationDataRequest(ids=" + this.ids + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
