package defpackage;

import kotlin.Metadata;
/* compiled from: PreferredOrderLocationRepository.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lpi8;", "Loi8;", "Lni8;", "get", "cache", "", "a", "Lni8;", "getCache", "()Lni8;", "setCache", "(Lni8;)V", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pi8  reason: default package */
/* loaded from: classes4.dex */
public final class pi8 implements oi8 {
    private ni8 a;

    @Override // defpackage.oi8
    public void a(ni8 ni8Var) {
        z65.h(ni8Var, "cache");
        this.a = ni8Var;
    }

    @Override // defpackage.oi8
    public ni8 get() {
        return this.a;
    }
}
