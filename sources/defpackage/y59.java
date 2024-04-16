package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: RatingCommentResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Ly59;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "comment", "", "Ljava/util/List;", "()Ljava/util/List;", "attachedPhotosIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y59  reason: default package */
/* loaded from: classes.dex */
public final class y59 {
    private final String a;
    private final List<String> b;

    public y59(String str, List<String> list) {
        z65.h(str, "comment");
        z65.h(list, "attachedPhotosIds");
        this.a = str;
        this.b = list;
    }

    public final List<String> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y59)) {
            return false;
        }
        y59 y59Var = (y59) obj;
        if (z65.c(this.a, y59Var.a) && z65.c(this.b, y59Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        List<String> list = this.b;
        return "RatingCommentResult(comment=" + str + ", attachedPhotosIds=" + list + ")";
    }
}
