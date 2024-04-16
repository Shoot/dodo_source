package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CaptchaDomainModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgo0;", "", "a", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: go0  reason: default package */
/* loaded from: classes.dex */
public interface go0 {
    public static final a a = a.a;

    /* compiled from: CaptchaDomainModule.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0007¨\u0006\u0010"}, d2 = {"Lgo0$a;", "", "Lqo0;", "captchaProviderFactory", "Ldo0;", "captchaContractAdapter", "Loo0;", "captchaListener", "Lno0;", c.a, "Lbo0;", "b", "captchaActivityHolder", "a", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: go0$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final qo0 a(bo0 bo0Var) {
            z65.h(bo0Var, "captchaActivityHolder");
            return new qo0(bo0Var);
        }

        public final bo0 b() {
            return new bo0();
        }

        public final no0 c(qo0 qo0Var, do0 do0Var, oo0 oo0Var) {
            z65.h(qo0Var, "captchaProviderFactory");
            z65.h(do0Var, "captchaContractAdapter");
            z65.h(oo0Var, "captchaListener");
            return new no0(qo0Var, do0Var, oo0Var);
        }
    }
}
