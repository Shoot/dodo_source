package defpackage;

import com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
/* compiled from: GeoChooseOrderTypeComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lnd4;", "", "Lod4;", "fragment", "", "a", "b", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nd4  reason: default package */
/* loaded from: classes2.dex */
public interface nd4 {
    public static final a a = a.a;

    /* compiled from: GeoChooseOrderTypeComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lnd4$a;", "", "Lnd4$b;", "b", "Lnd4$b;", "a", "()Lnd4$b;", "factory", "<init>", "()V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nd4$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = je2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: GeoChooseOrderTypeComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lnd4$b;", "", "Lcom/dodopizza/onboarding/feature/chooseordertype/GeoChooseOrderTypeFeatureDependencies;", "dependencies", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lnd4;", "a", "onboarding_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nd4$b */
    /* loaded from: classes2.dex */
    public interface b {
        nd4 a(GeoChooseOrderTypeFeatureDependencies geoChooseOrderTypeFeatureDependencies, String str);
    }

    void a(od4 od4Var);
}
