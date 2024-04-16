package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: ImageFormatV5.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Llu4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "template", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "values", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: lu4  reason: default package */
/* loaded from: classes.dex */
public final class lu4 {
    @uca("template")
    private final String a;
    @uca("values")
    private final List<String> b;

    public final String a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu4)) {
            return false;
        }
        lu4 lu4Var = (lu4) obj;
        if (z65.c(this.a, lu4Var.a) && z65.c(this.b, lu4Var.b)) {
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
        return "ImageFormatV5(template=" + str + ", values=" + list + ")";
    }
}
