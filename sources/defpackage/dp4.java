package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: HotAndReadyRepository.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Ldp4;", "Lcp4;", "", "Lbp4;", "hotAndReadyItems", "", "b", "getAll", "a", "Ljava/util/List;", "hotAndReadyProductsCache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dp4  reason: default package */
/* loaded from: classes4.dex */
public final class dp4 implements cp4 {
    private volatile List<bp4> a;

    public dp4() {
        List<bp4> l;
        l = kc1.l();
        this.a = l;
    }

    @Override // defpackage.cp4
    public void b(List<bp4> list) {
        z65.h(list, "hotAndReadyItems");
        this.a = list;
    }

    @Override // defpackage.cp4
    public List<bp4> getAll() {
        return this.a;
    }
}
