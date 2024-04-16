package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RatingCommentState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lb69;", "Ljava/io/Serializable;", "", "comment", "", "Lq58;", "attachedPhotos", "a", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Ljava/util/List;", c.a, "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b69  reason: default package */
/* loaded from: classes.dex */
public final class b69 implements Serializable {
    private final String a;
    private final List<q58> b;

    public b69(String str, List<q58> list) {
        z65.h(str, "comment");
        z65.h(list, "attachedPhotos");
        this.a = str;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b69 b(b69 b69Var, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b69Var.a;
        }
        if ((i & 2) != 0) {
            list = b69Var.b;
        }
        return b69Var.a(str, list);
    }

    public final b69 a(String str, List<q58> list) {
        z65.h(str, "comment");
        z65.h(list, "attachedPhotos");
        return new b69(str, list);
    }

    public final List<q58> c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b69)) {
            return false;
        }
        b69 b69Var = (b69) obj;
        if (z65.c(this.a, b69Var.a) && z65.c(this.b, b69Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        List<q58> list = this.b;
        return "RatingCommentState(comment=" + str + ", attachedPhotos=" + list + ")";
    }
}
