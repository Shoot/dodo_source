package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: HotAndReadyRepositoryV5.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lep4;", "", "", "", "hotAndReadyItems", "", "b", "a", "Ljava/util/List;", "hotAndReadyProductIdsCache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ep4  reason: default package */
/* loaded from: classes4.dex */
public final class ep4 {
    private volatile List<String> a;

    public ep4() {
        List<String> l;
        l = kc1.l();
        this.a = l;
    }

    public final List<String> a() {
        return this.a;
    }

    public final void b(List<String> list) {
        z65.h(list, "hotAndReadyItems");
        this.a = list;
    }
}
