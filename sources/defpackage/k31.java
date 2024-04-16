package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CheckRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lk31;", "Lj31;", "", "Lz21;", "getAll", "check", "", "a", "clear", "", "Ljava/util/List;", "cache", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k31  reason: default package */
/* loaded from: classes2.dex */
public final class k31 implements j31 {
    private final List<z21> a = new ArrayList();

    @Override // defpackage.j31
    public void a(z21 z21Var) {
        z65.h(z21Var, "check");
        this.a.add(z21Var);
    }

    @Override // defpackage.j31
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.j31
    public List<z21> getAll() {
        List<z21> F0;
        F0 = sc1.F0(this.a);
        return F0;
    }
}
