package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityInfoEntity;
import kotlin.Metadata;
/* compiled from: LocalityInfoRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lqt5;", "Lnt5;", "Lbk1;", "Ljt5;", "Lcom/dodopizza/persistence/entity/locality/LocalityInfoEntity;", "Ldt5;", "locality", "n", "Ljk2;", "daoFactory", "Lot5;", "converter", "<init>", "(Ljk2;Lot5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qt5  reason: default package */
/* loaded from: classes4.dex */
public final class qt5 extends bk1<jt5, LocalityInfoEntity> implements nt5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt5(jk2 jk2Var, ot5 ot5Var) {
        super(jk2Var, bc9.b(LocalityInfoEntity.class), ot5Var);
        z65.h(jk2Var, "daoFactory");
        z65.h(ot5Var, "converter");
    }

    @Override // defpackage.nt5
    public /* bridge */ /* synthetic */ jt5 i(jt5 jt5Var) {
        return C(jt5Var);
    }

    @Override // defpackage.nt5
    public jt5 n(dt5 dt5Var) {
        z65.h(dt5Var, "locality");
        return w(mt5.a.a(dt5Var));
    }
}
