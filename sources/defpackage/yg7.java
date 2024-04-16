package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderProductCustomizationDto.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0018"}, d2 = {"Lyg7;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "setHalvesImagesUrl", "(Ljava/util/List;)V", "halvesImagesUrl", "b", c.a, "setToppingsNames", "toppingsNames", "setRemovedIngredientNames", "removedIngredientNames", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yg7  reason: default package */
/* loaded from: classes2.dex */
public final class yg7 {
    @uca("pizzaHalvesImageUrls")
    private List<String> a;
    @uca("toppingsNames")
    private List<String> b;
    @uca("removedIngredientNames")
    private List<String> c;

    public yg7() {
        this(null, null, null, 7, null);
    }

    public final List<String> a() {
        return this.a;
    }

    public final List<String> b() {
        return this.c;
    }

    public final List<String> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg7)) {
            return false;
        }
        yg7 yg7Var = (yg7) obj;
        if (z65.c(this.a, yg7Var.a) && z65.c(this.b, yg7Var.b) && z65.c(this.c, yg7Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        List<String> list = this.a;
        List<String> list2 = this.b;
        List<String> list3 = this.c;
        return "OrderProductCustomizationDto(halvesImagesUrl=" + list + ", toppingsNames=" + list2 + ", removedIngredientNames=" + list3 + ")";
    }

    public yg7(List<String> list, List<String> list2, List<String> list3) {
        z65.h(list, "halvesImagesUrl");
        z65.h(list2, "toppingsNames");
        z65.h(list3, "removedIngredientNames");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public /* synthetic */ yg7(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kc1.l() : list, (i & 2) != 0 ? kc1.l() : list2, (i & 4) != 0 ? kc1.l() : list3);
    }
}
