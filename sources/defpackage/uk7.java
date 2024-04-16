package defpackage;

import kotlin.Metadata;
/* compiled from: OrderTypeDiscountService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Luk7;", "Ltk7;", "Lvk7;", "a", "Ldt5;", "Ldt5;", "locality", "Lrt5;", "b", "Lrt5;", "localityInfoService", "<init>", "(Ldt5;Lrt5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uk7  reason: default package */
/* loaded from: classes4.dex */
public final class uk7 implements tk7 {
    private final dt5 a;
    private final rt5 b;

    public uk7(dt5 dt5Var, rt5 rt5Var) {
        z65.h(dt5Var, "locality");
        z65.h(rt5Var, "localityInfoService");
        this.a = dt5Var;
        this.b = rt5Var;
    }

    @Override // defpackage.tk7
    public vk7 a() {
        jt5 a = this.b.a(this.a);
        return new vk7(a.g().b(), a.g().d(), a.g().c(), a.g().e());
    }
}
