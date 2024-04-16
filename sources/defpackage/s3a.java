package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: SegmentationCheckResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Ls3a;", "", "Lrt4;", "component1", "ids", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lrt4;", "getIds", "()Lrt4;", "<init>", "(Lrt4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s3a  reason: default package */
/* loaded from: classes.dex */
public final class s3a {
    @uca("ids")
    private final rt4 ids;

    public s3a(rt4 rt4Var) {
        this.ids = rt4Var;
    }

    public static /* synthetic */ s3a copy$default(s3a s3aVar, rt4 rt4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rt4Var = s3aVar.ids;
        }
        return s3aVar.copy(rt4Var);
    }

    public final rt4 component1() {
        return this.ids;
    }

    public final s3a copy(rt4 rt4Var) {
        return new s3a(rt4Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s3a) && z65.c(this.ids, ((s3a) obj).ids)) {
            return true;
        }
        return false;
    }

    public final rt4 getIds() {
        return this.ids;
    }

    public int hashCode() {
        rt4 rt4Var = this.ids;
        if (rt4Var == null) {
            return 0;
        }
        return rt4Var.hashCode();
    }

    public String toString() {
        return "SegmentInAppResponse(ids=" + this.ids + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
