package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: OrderRatingVO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\n\u0010\u0015R)\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001f"}, d2 = {"Lai7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lw69;", "a", "Lw69;", "b", "()Lw69;", "rating", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "isRatingAlreadySent", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "productsDescription", "", "", "Lq69;", "Ljava/util/Map;", "()Ljava/util/Map;", "tags", "<init>", "(Lw69;ZLjava/lang/String;Ljava/util/Map;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ai7  reason: default package */
/* loaded from: classes.dex */
public final class ai7 {
    private final w69 a;
    private final boolean b;
    private final String c;
    private final Map<Integer, Collection<q69>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ai7(w69 w69Var, boolean z, String str, Map<Integer, ? extends Collection<q69>> map) {
        z65.h(w69Var, "rating");
        z65.h(str, "productsDescription");
        z65.h(map, "tags");
        this.a = w69Var;
        this.b = z;
        this.c = str;
        this.d = map;
    }

    public final String a() {
        return this.c;
    }

    public final w69 b() {
        return this.a;
    }

    public final Map<Integer, Collection<q69>> c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai7)) {
            return false;
        }
        ai7 ai7Var = (ai7) obj;
        if (z65.c(this.a, ai7Var.a) && this.b == ai7Var.b && z65.c(this.c, ai7Var.c) && z65.c(this.d, ai7Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        w69 w69Var = this.a;
        boolean z = this.b;
        String str = this.c;
        Map<Integer, Collection<q69>> map = this.d;
        return "OrderRatingVO(rating=" + w69Var + ", isRatingAlreadySent=" + z + ", productsDescription=" + str + ", tags=" + map + ")";
    }
}
