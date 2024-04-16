package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderItemDto.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0010\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lag7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "", "b", "D", c.a, "()D", "setTotalPrice", "(D)V", "totalPrice", "I", DateTokenConverter.CONVERTER_KEY, "()I", "setType", "(I)V", MessageAttributes.TYPE, "", "Lzg7;", "Ljava/util/List;", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "products", "<init>", "(Ljava/lang/String;DILjava/util/List;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ag7  reason: default package */
/* loaded from: classes2.dex */
public final class ag7 {
    @uca(Action.NAME_ATTRIBUTE)
    private String a;
    @uca("totalPrice")
    private double b;
    @uca(MessageAttributes.TYPE)
    private int c;
    @uca("products")
    private List<zg7> d;

    public ag7() {
        this(null, 0.0d, 0, null, 15, null);
    }

    public final String a() {
        return this.a;
    }

    public final List<zg7> b() {
        return this.d;
    }

    public final double c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag7)) {
            return false;
        }
        ag7 ag7Var = (ag7) obj;
        if (z65.c(this.a, ag7Var.a) && Double.compare(this.b, ag7Var.b) == 0 && this.c == ag7Var.c && z65.c(this.d, ag7Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + nkb.a(this.b)) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        double d = this.b;
        int i = this.c;
        List<zg7> list = this.d;
        return "OrderItemDto(name=" + str + ", totalPrice=" + d + ", type=" + i + ", products=" + list + ")";
    }

    public ag7(String str, double d, int i, List<zg7> list) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "products");
        this.a = str;
        this.b = d;
        this.c = i;
        this.d = list;
    }

    public /* synthetic */ ag7(String str, double d, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? ic1.l() : list);
    }
}
