package defpackage;

import com.dodopizza.persistence.entity.locality.FeatureEntity;
import com.huawei.hms.opendevice.c;
import defpackage.bq3;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: FeatureRepositoryImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lgq3;", "Lfq3;", "", "Lbq3;", "features", "", "save", "getAll", "clear", "Lgk2;", "Lcom/dodopizza/persistence/entity/locality/FeatureEntity;", "a", "Lgk2;", "dao", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "toEntity", c.a, "toModel", "<init>", "(Lgk2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gq3  reason: default package */
/* loaded from: classes4.dex */
public final class gq3 implements fq3 {
    private final gk2<FeatureEntity> a;
    private final Function1<bq3, FeatureEntity> b;
    private final Function1<FeatureEntity, bq3> c;

    /* compiled from: FeatureRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbq3;", "feature", "Lcom/dodopizza/persistence/entity/locality/FeatureEntity;", "a", "(Lbq3;)Lcom/dodopizza/persistence/entity/locality/FeatureEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gq3$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bq3, FeatureEntity> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final FeatureEntity invoke(bq3 bq3Var) {
            z65.h(bq3Var, "feature");
            return new FeatureEntity(bq3Var.getValue());
        }
    }

    /* compiled from: FeatureRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/FeatureEntity;", "entity", "Lbq3;", "a", "(Lcom/dodopizza/persistence/entity/locality/FeatureEntity;)Lbq3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gq3$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<FeatureEntity, bq3> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bq3 invoke(FeatureEntity featureEntity) {
            z65.h(featureEntity, "entity");
            bq3.a aVar = bq3.c;
            String code = featureEntity.getCode();
            if (code == null) {
                code = "";
            }
            return aVar.a(code);
        }
    }

    public gq3(gk2<FeatureEntity> gk2Var) {
        z65.h(gk2Var, "dao");
        this.a = gk2Var;
        this.b = a.a;
        this.c = b.a;
    }

    @Override // defpackage.fq3
    public void clear() {
        this.a.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fq3
    public Collection<bq3> getAll() {
        Function1<FeatureEntity, bq3> function1 = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a.b()) {
            Object invoke = function1.invoke(obj);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fq3
    public void save(Collection<? extends bq3> collection) {
        int w;
        z65.h(collection, "features");
        gk2<FeatureEntity> gk2Var = this.a;
        Collection<? extends bq3> collection2 = collection;
        Function1<bq3, FeatureEntity> function1 = this.b;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Object obj : collection2) {
            arrayList.add(function1.invoke(obj));
        }
        gk2Var.save(arrayList);
    }
}
