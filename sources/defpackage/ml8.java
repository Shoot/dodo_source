package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ProductCategoryCacheRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Lml8;", "Lll8;", "", "Lkl8;", "b", "models", "", "save", "", "Ljava/util/Set;", "cache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ml8  reason: default package */
/* loaded from: classes4.dex */
public final class ml8 implements ll8 {
    public static final ml8 a = new ml8();
    private static Set<? extends kl8> b;

    static {
        Set<? extends kl8> e;
        e = sfa.e();
        b = e;
    }

    private ml8() {
    }

    @Override // defpackage.ll8
    public Collection<kl8> b() {
        return b;
    }

    @Override // defpackage.ll8
    public void save(Collection<? extends kl8> collection) {
        Set<? extends kl8> K0;
        z65.h(collection, "models");
        K0 = sc1.K0(collection);
        b = K0;
    }
}
