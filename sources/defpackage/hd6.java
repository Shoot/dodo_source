package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuCategoryRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lhd6;", "Lgd6;", "", "Ldd6;", "categories", "", "save", "", "getAll", "a", "Ljava/util/List;", "cache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hd6  reason: default package */
/* loaded from: classes4.dex */
public final class hd6 implements gd6 {
    private List<dd6> a;

    public hd6() {
        List<dd6> l;
        l = kc1.l();
        this.a = l;
    }

    @Override // defpackage.gd6
    public List<dd6> getAll() {
        List<dd6> F0;
        F0 = sc1.F0(this.a);
        return F0;
    }

    @Override // defpackage.gd6
    public void save(Collection<dd6> collection) {
        List<dd6> F0;
        z65.h(collection, "categories");
        F0 = sc1.F0(collection);
        this.a = F0;
    }
}
