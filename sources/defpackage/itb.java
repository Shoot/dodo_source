package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.actions.SearchIntents;
import defpackage.mk2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: UpsaleStateRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Litb;", "Lhtb;", "Lgtb;", "upsaleState", "", "b", "a", "get", "r", "Lgk2;", "Lcom/dodopizza/persistence/entity/UpsaleStateEntity;", "Lgk2;", "getDao", "()Lgk2;", "dao", "Ljk2;", "daoFactory", "<init>", "(Ljk2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: itb  reason: default package */
/* loaded from: classes4.dex */
public final class itb implements htb {
    private final gk2<UpsaleStateEntity> a;

    /* compiled from: UpsaleStateRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/UpsaleStateEntity;", "q", "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: itb$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<vu8<UpsaleStateEntity>, vu8<UpsaleStateEntity>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<UpsaleStateEntity> invoke(vu8<UpsaleStateEntity> vu8Var) {
            z65.h(vu8Var, "q");
            return vu8Var;
        }
    }

    /* compiled from: UpsaleStateRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzl2;", "connection", "Lcj3;", "entityInformation", "", "a", "(Lzl2;Lcj3;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: itb$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function2<zl2, cj3, Unit> {
        final /* synthetic */ gtb a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: UpsaleStateRepository.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvu8;", "Lcom/dodopizza/persistence/entity/UpsaleStateEntity;", SearchIntents.EXTRA_QUERY, "a", "(Lvu8;)Lvu8;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: itb$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<vu8<UpsaleStateEntity>, vu8<UpsaleStateEntity>> {
            final /* synthetic */ gtb a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(gtb gtbVar) {
                super(1);
                this.a = gtbVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final vu8<UpsaleStateEntity> invoke(vu8<UpsaleStateEntity> vu8Var) {
                z65.h(vu8Var, SearchIntents.EXTRA_QUERY);
                return vu8Var.b(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, this.a.a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gtb gtbVar) {
            super(2);
            this.a = gtbVar;
        }

        public final void a(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            UpsaleStateEntity upsaleStateEntity = (UpsaleStateEntity) zl2Var.n(cj3Var, new a(this.a)).a();
            if (upsaleStateEntity != null) {
                upsaleStateEntity.setState(jtb.a(this.a).getState());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(zl2 zl2Var, cj3 cj3Var) {
            a(zl2Var, cj3Var);
            return Unit.a;
        }
    }

    public itb(jk2 jk2Var) {
        z65.h(jk2Var, "daoFactory");
        this.a = jk2Var.a(bc9.b(UpsaleStateEntity.class), mk2.b.a);
    }

    @Override // defpackage.htb
    public void a(gtb gtbVar) {
        z65.h(gtbVar, "upsaleState");
        this.a.f(new b(gtbVar));
    }

    @Override // defpackage.htb
    public void b(gtb gtbVar) {
        z65.h(gtbVar, "upsaleState");
        this.a.h(jtb.a(gtbVar));
    }

    @Override // defpackage.htb
    public gtb get() {
        UpsaleStateEntity d = this.a.d(a.a);
        if (d != null) {
            return jtb.b(d);
        }
        return null;
    }

    @Override // defpackage.htb
    public void r() {
        this.a.e();
    }
}
