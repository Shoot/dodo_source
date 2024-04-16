package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CustomizationInfo.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u000e"}, d2 = {"Lx52;", "Ljava/io/Serializable;", "", "", "a", "Ljava/util/List;", c.a, "()Ljava/util/List;", "toppingNames", "b", "removedIngredientsNames", "halvesImagesUrls", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x52  reason: default package */
/* loaded from: classes2.dex */
public final class x52 implements Serializable {
    private final List<String> a;
    private final List<String> b;
    private final List<String> c;

    public x52(List<String> list, List<String> list2, List<String> list3) {
        z65.h(list, "toppingNames");
        z65.h(list2, "removedIngredientsNames");
        z65.h(list3, "halvesImagesUrls");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List<String> a() {
        return this.c;
    }

    public final List<String> b() {
        return this.b;
    }

    public final List<String> c() {
        return this.a;
    }
}
