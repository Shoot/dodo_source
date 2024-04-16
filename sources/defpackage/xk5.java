package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies;
/* compiled from: LandingSMSInputComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lxk5;", "", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/a;", "fragment", "", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xk5  reason: default package */
/* loaded from: classes3.dex */
public interface xk5 {
    public static final a a = a.a;

    /* compiled from: LandingSMSInputComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lxk5$a;", "", "Lxk5$b;", "b", "Lxk5$b;", "a", "()Lxk5$b;", "factory", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xk5$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = bf2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: LandingSMSInputComponent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lxk5$b;", "", "Lru/dodopizza/app/di/modules/presentation/landing/smsinput/LandingSMSInputFeatureDependencies;", "dependencies", "", LocalityEntity.FIELD_COUNTRY_CODE, "phoneNumber", "localityUUID", "localityId", "address", "Lxk5;", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xk5$b */
    /* loaded from: classes3.dex */
    public interface b {
        xk5 a(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies, String str, String str2, String str3, String str4, String str5);
    }

    void a(ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a aVar);
}
