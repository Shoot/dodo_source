package defpackage;

import com.dodopizza.persistence.entity.CountryEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CountryRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lsy1;", "Lbk1;", "Lay1;", "Lcom/dodopizza/persistence/entity/CountryEntity;", "Lry1;", "", LocalityEntity.FIELD_COUNTRY_CODE, "q", "Ljk2;", "daoFactory", "<init>", "(Ljk2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sy1  reason: default package */
/* loaded from: classes4.dex */
public final class sy1 extends bk1<ay1, CountryEntity> implements ry1 {

    /* compiled from: CountryRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/CountryEntity;", "q", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sy1$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<vu8<CountryEntity>, vu8<CountryEntity>> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<CountryEntity> invoke(vu8<CountryEntity> vu8Var) {
            z65.h(vu8Var, "q");
            return vu8Var.b("code", this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy1(jk2 jk2Var) {
        super(jk2Var, bc9.b(CountryEntity.class), new jr2(bz1.b(), bz1.a()));
        z65.h(jk2Var, "daoFactory");
    }

    @Override // defpackage.ry1
    public ay1 q(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return x(new a(str));
    }
}
