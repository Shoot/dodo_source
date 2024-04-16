package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductTag.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lpm8;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Llm8;", "a", "Ljava/util/List;", "()Ljava/util/List;", "items", "<init>", "(Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pm8  reason: default package */
/* loaded from: classes2.dex */
public final class pm8 implements Serializable {
    @uca("tags")
    private final List<lm8> a;

    public pm8() {
        this(null, 1, null);
    }

    public final List<lm8> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pm8) && z65.c(this.a, ((pm8) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List<lm8> list = this.a;
        return "ProductTags(items=" + list + ")";
    }

    public pm8(List<lm8> list) {
        z65.h(list, "items");
        this.a = list;
    }

    public /* synthetic */ pm8(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
