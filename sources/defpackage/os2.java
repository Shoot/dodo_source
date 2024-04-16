package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DeferredIntervalsVO.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Los2;", "", "", "information", "", "Lms2;", "items", "a", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: os2  reason: default package */
/* loaded from: classes4.dex */
public final class os2 {
    private final String a;
    private final List<ms2> b;

    public os2(String str, List<ms2> list) {
        z65.h(list, "items");
        this.a = str;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ os2 b(os2 os2Var, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = os2Var.a;
        }
        if ((i & 2) != 0) {
            list = os2Var.b;
        }
        return os2Var.a(str, list);
    }

    public final os2 a(String str, List<ms2> list) {
        z65.h(list, "items");
        return new os2(str, list);
    }

    public final String c() {
        return this.a;
    }

    public final List<ms2> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os2)) {
            return false;
        }
        os2 os2Var = (os2) obj;
        if (z65.c(this.a, os2Var.a) && z65.c(this.b, os2Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        List<ms2> list = this.b;
        return "DeferredIntervalsVO(information=" + str + ", items=" + list + ")";
    }
}
