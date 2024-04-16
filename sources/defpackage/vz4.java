package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InMemoryFeatureRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lvz4;", "Lfq3;", "", "Lbq3;", "features", "", "save", "getAll", "clear", "a", "Ljava/util/Collection;", "cache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vz4  reason: default package */
/* loaded from: classes4.dex */
public final class vz4 implements fq3 {
    private Collection<? extends bq3> a;

    public vz4() {
        List l;
        l = kc1.l();
        this.a = l;
    }

    @Override // defpackage.fq3
    public void clear() {
        List l;
        l = kc1.l();
        this.a = l;
    }

    @Override // defpackage.fq3
    public Collection<bq3> getAll() {
        List F0;
        F0 = sc1.F0(this.a);
        return F0;
    }

    @Override // defpackage.fq3
    public void save(Collection<? extends bq3> collection) {
        List F0;
        z65.h(collection, "features");
        F0 = sc1.F0(collection);
        this.a = F0;
    }
}
