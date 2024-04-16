package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: RatingVO.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lw69;", "", "", "orderId", "Lqd7;", "value", "comment", "", "selectedRatingTagsIds", "a", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Lqd7;", "f", "()Lqd7;", c.a, "Ljava/util/Collection;", e.a, "()Ljava/util/Collection;", "<init>", "(Ljava/lang/String;Lqd7;Ljava/lang/String;Ljava/util/Collection;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w69  reason: default package */
/* loaded from: classes.dex */
public final class w69 {
    private final String a;
    private final qd7 b;
    private final String c;
    private final Collection<String> d;

    public w69(String str, qd7 qd7Var, String str2, Collection<String> collection) {
        z65.h(str, "orderId");
        z65.h(qd7Var, "value");
        z65.h(str2, "comment");
        z65.h(collection, "selectedRatingTagsIds");
        this.a = str;
        this.b = qd7Var;
        this.c = str2;
        this.d = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ w69 b(w69 w69Var, String str, qd7 qd7Var, String str2, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w69Var.a;
        }
        if ((i & 2) != 0) {
            qd7Var = w69Var.b;
        }
        if ((i & 4) != 0) {
            str2 = w69Var.c;
        }
        if ((i & 8) != 0) {
            collection = w69Var.d;
        }
        return w69Var.a(str, qd7Var, str2, collection);
    }

    public final w69 a(String str, qd7 qd7Var, String str2, Collection<String> collection) {
        z65.h(str, "orderId");
        z65.h(qd7Var, "value");
        z65.h(str2, "comment");
        z65.h(collection, "selectedRatingTagsIds");
        return new w69(str, qd7Var, str2, collection);
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final Collection<String> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w69)) {
            return false;
        }
        w69 w69Var = (w69) obj;
        if (z65.c(this.a, w69Var.a) && z65.c(this.b, w69Var.b) && z65.c(this.c, w69Var.c) && z65.c(this.d, w69Var.d)) {
            return true;
        }
        return false;
    }

    public final qd7 f() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        qd7 qd7Var = this.b;
        String str2 = this.c;
        Collection<String> collection = this.d;
        return "RatingVO(orderId=" + str + ", value=" + qd7Var + ", comment=" + str2 + ", selectedRatingTagsIds=" + collection + ")";
    }
}
