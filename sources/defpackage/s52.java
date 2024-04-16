package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: SegmentationCheckResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Ls52;", "", "Lz3a;", "component1", "Ls3a;", "component2", "segmentation", tmb.g.SEGMENT_JSON_NAME, "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lz3a;", "getSegmentation", "()Lz3a;", "Ls3a;", "getSegment", "()Ls3a;", "<init>", "(Lz3a;Ls3a;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s52  reason: default package */
/* loaded from: classes.dex */
public final class s52 {
    @uca(tmb.g.SEGMENT_JSON_NAME)
    private final s3a segment;
    @uca("segmentation")
    private final z3a segmentation;

    public s52(z3a z3aVar, s3a s3aVar) {
        this.segmentation = z3aVar;
        this.segment = s3aVar;
    }

    public static /* synthetic */ s52 copy$default(s52 s52Var, z3a z3aVar, s3a s3aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z3aVar = s52Var.segmentation;
        }
        if ((i & 2) != 0) {
            s3aVar = s52Var.segment;
        }
        return s52Var.copy(z3aVar, s3aVar);
    }

    public final z3a component1() {
        return this.segmentation;
    }

    public final s3a component2() {
        return this.segment;
    }

    public final s52 copy(z3a z3aVar, s3a s3aVar) {
        return new s52(z3aVar, s3aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s52)) {
            return false;
        }
        s52 s52Var = (s52) obj;
        if (z65.c(this.segmentation, s52Var.segmentation) && z65.c(this.segment, s52Var.segment)) {
            return true;
        }
        return false;
    }

    public final s3a getSegment() {
        return this.segment;
    }

    public final z3a getSegmentation() {
        return this.segmentation;
    }

    public int hashCode() {
        int hashCode;
        z3a z3aVar = this.segmentation;
        int i = 0;
        if (z3aVar == null) {
            hashCode = 0;
        } else {
            hashCode = z3aVar.hashCode();
        }
        int i2 = hashCode * 31;
        s3a s3aVar = this.segment;
        if (s3aVar != null) {
            i = s3aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "CustomerSegmentationInAppResponse(segmentation=" + this.segmentation + ", segment=" + this.segment + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
