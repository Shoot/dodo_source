package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PrizotekaVO.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0017"}, d2 = {"Llk8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "title", "b", "subtitle", "", "Ljk8;", "Ljava/util/Collection;", "()Ljava/util/Collection;", "levels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lk8  reason: default package */
/* loaded from: classes2.dex */
public final class lk8 {
    private final String a;
    private final String b;
    private final Collection<jk8> c;

    public lk8(String str, String str2, Collection<jk8> collection) {
        z65.h(str, "title");
        z65.h(str2, "subtitle");
        z65.h(collection, "levels");
        this.a = str;
        this.b = str2;
        this.c = collection;
    }

    public final Collection<jk8> a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk8)) {
            return false;
        }
        lk8 lk8Var = (lk8) obj;
        if (z65.c(this.a, lk8Var.a) && z65.c(this.b, lk8Var.b) && z65.c(this.c, lk8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        Collection<jk8> collection = this.c;
        return "PrizotekaVO(title=" + str + ", subtitle=" + str2 + ", levels=" + collection + ")";
    }
}
