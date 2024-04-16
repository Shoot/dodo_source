package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.blockstore.LocalityBlockStoreDataSource;
/* compiled from: LocalityRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B/\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lgv5;", "Lbk1;", "Ldt5;", "Lcom/dodopizza/persistence/entity/locality/LocalityEntity;", "Ldv5;", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "j", "models", "", "g", DateTokenConverter.CONVERTER_KEY, "locality", "k", "p", "id", "f", "", c.a, "Lci8;", "Lci8;", "preferencesAssetsDataSource", "Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource;", "Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource;", "blockStoreDataSource", "Lht5;", e.a, "Lht5;", "localityIdConverter", "Ljk2;", "daoFactory", "Lev5;", "localityRepositoryConverter", "<init>", "(Ljk2;Lci8;Lru/dodopizza/app/domain/blockstore/LocalityBlockStoreDataSource;Lht5;Lev5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gv5  reason: default package */
/* loaded from: classes4.dex */
public final class gv5 extends bk1<dt5, LocalityEntity> implements dv5 {
    private final ci8 c;
    private final LocalityBlockStoreDataSource d;
    private final ht5 e;

    /* compiled from: LocalityRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/locality/LocalityEntity;", "q", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv5$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<vu8<LocalityEntity>, vu8<LocalityEntity>> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<LocalityEntity> invoke(vu8<LocalityEntity> vu8Var) {
            z65.h(vu8Var, "q");
            return vu8Var.b(LocalityEntity.FIELD_COUNTRY_CODE, this.a);
        }
    }

    /* compiled from: LocalityRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/locality/LocalityEntity;", "it", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv5$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<vu8<LocalityEntity>, vu8<LocalityEntity>> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<LocalityEntity> invoke(vu8<LocalityEntity> vu8Var) {
            z65.h(vu8Var, "it");
            return vu8Var.b(LocalityEntity.FIELD_COUNTRY_CODE, this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv5(jk2 jk2Var, ci8 ci8Var, LocalityBlockStoreDataSource localityBlockStoreDataSource, ht5 ht5Var, ev5 ev5Var) {
        super(jk2Var, bc9.b(LocalityEntity.class), ev5Var);
        z65.h(jk2Var, "daoFactory");
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(localityBlockStoreDataSource, "blockStoreDataSource");
        z65.h(ht5Var, "localityIdConverter");
        z65.h(ev5Var, "localityRepositoryConverter");
        this.c = ci8Var;
        this.d = localityBlockStoreDataSource;
        this.e = ht5Var;
    }

    @Override // defpackage.dv5
    public boolean c() {
        boolean z;
        dt5 d = d();
        dt5 findSelectedLocality = this.d.findSelectedLocality();
        if (d == null && findSelectedLocality != null) {
            k(findSelectedLocality);
            z = true;
        } else {
            z = false;
        }
        if (d != null) {
            this.d.saveSelectedLocality(d);
        }
        return z;
    }

    @Override // defpackage.dv5
    public dt5 d() {
        dt5 t = this.c.t();
        if (t != null) {
            dt5 f = f(t.getId(), t.a());
            if (f != null) {
                return f;
            }
            return t;
        }
        return null;
    }

    @Override // defpackage.dv5
    public dt5 f(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        return (dt5) super.w(this.e.a(str, str2));
    }

    @Override // defpackage.dv5
    public void g(String str, Collection<? extends dt5> collection) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(collection, "models");
        A(new b(str), collection);
    }

    @Override // defpackage.dv5
    public Collection<dt5> j(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return v(new a(str));
    }

    @Override // defpackage.dv5
    public void k(dt5 dt5Var) {
        z65.h(dt5Var, "locality");
        this.c.G(dt5Var);
        this.d.saveSelectedLocality(dt5Var);
    }

    @Override // defpackage.dv5
    public void p() {
        this.c.i();
        this.d.deleteSelectedLocality();
    }
}
