package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: OrderRatingData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Leh7;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "orderId", "Lqd7;", "Lqd7;", "()Lqd7;", "feedbackValue", "Lqd;", c.a, "Lqd;", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Lqd7;Lqd;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eh7  reason: default package */
/* loaded from: classes.dex */
public final class eh7 implements Serializable {
    private final String a;
    private final qd7 b;
    private final qd c;

    public eh7(String str, qd7 qd7Var, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = qd7Var;
        this.c = qdVar;
    }

    public final qd7 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final qd c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh7)) {
            return false;
        }
        eh7 eh7Var = (eh7) obj;
        if (z65.c(this.a, eh7Var.a) && z65.c(this.b, eh7Var.b) && z65.c(this.c, eh7Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        qd7 qd7Var = this.b;
        if (qd7Var == null) {
            hashCode = 0;
        } else {
            hashCode = qd7Var.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        qd7 qd7Var = this.b;
        qd qdVar = this.c;
        return "OrderRatingData(orderId=" + str + ", feedbackValue=" + qd7Var + ", sender=" + qdVar + ")";
    }
}
