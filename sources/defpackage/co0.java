package defpackage;

import com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies;
import com.dodopizza.core.feature.captcha.presentation.CaptchaInitializer;
import kotlin.Metadata;
/* compiled from: CaptchaComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bá\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lco0;", "", "Lcom/dodopizza/core/feature/captcha/presentation/CaptchaInitializer;", "initializer", "", "a", "b", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: co0  reason: default package */
/* loaded from: classes.dex */
public interface co0 {
    public static final a a = a.a;

    /* compiled from: CaptchaComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lco0$a;", "", "Lco0$b;", "a", "()Lco0$b;", "factory", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: co0$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = vb2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: CaptchaComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lco0$b;", "", "Lcom/dodopizza/core/feature/captcha/CaptchaFeatureDependencies;", "dependencies", "Lco0;", "a", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: co0$b */
    /* loaded from: classes.dex */
    public interface b {
        co0 a(CaptchaFeatureDependencies captchaFeatureDependencies);
    }

    void a(CaptchaInitializer captchaInitializer);
}
