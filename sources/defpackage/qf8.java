package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PopularProductRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lqf8;", "Lpf8;", "", "", "popularProductsIds", "", "save", "getAll", "a", "Ljava/util/Collection;", "cache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qf8  reason: default package */
/* loaded from: classes4.dex */
public final class qf8 implements pf8 {
    private Collection<String> a;

    public qf8() {
        Set e;
        e = sfa.e();
        this.a = e;
    }

    @Override // defpackage.pf8
    public Collection<String> getAll() {
        return this.a;
    }

    @Override // defpackage.pf8
    public void save(Collection<String> collection) {
        z65.h(collection, "popularProductsIds");
        this.a = collection;
    }
}
