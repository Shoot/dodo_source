package defpackage;

import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import defpackage.hi9;
import defpackage.po0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CaptchaContractAdapterImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Leo0;", "Ldo0;", "", "responseBodyText", "Lro0;", c.a, "Lik9;", "response", "", "b", "Lhi9$a;", "requestBuilder", "token", "verificationKey", "a", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "jsonConverter", "<init>", "(Lcom/google/gson/Gson;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eo0  reason: default package */
/* loaded from: classes.dex */
public final class eo0 implements do0 {
    public static final a b = new a(null);
    private final Gson a;

    /* compiled from: CaptchaContractAdapterImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Leo0$a;", "", "", "REQUIRE_CAPTCHA_ERROR_CODE", "I", "", "VERIFICATION_KEY_HEADER", "Ljava/lang/String;", "VERIFICATION_TOKEN_HEADER", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eo0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public eo0(Gson gson) {
        z65.h(gson, "jsonConverter");
        this.a = gson;
    }

    @Override // defpackage.do0
    public hi9.a a(hi9.a aVar, String str, String str2) {
        z65.h(aVar, "requestBuilder");
        z65.h(str, "token");
        z65.h(str2, "verificationKey");
        return aVar.a("VerificationToken", str).a("VerificationKey", str2);
    }

    @Override // defpackage.do0
    public boolean b(ik9 ik9Var) {
        z65.h(ik9Var, "response");
        if (ik9Var.j() == 418) {
            return true;
        }
        return false;
    }

    @Override // defpackage.do0
    public ro0 c(String str) {
        String str2;
        z65.h(str, "responseBodyText");
        ev6 ev6Var = (ev6) this.a.k(str, ev6.class);
        Integer num = null;
        if (ev6Var != null) {
            str2 = ev6Var.b();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            po0.a aVar = po0.b;
            if (ev6Var != null) {
                num = Integer.valueOf(ev6Var.a());
            }
            po0 a2 = aVar.a(num);
            if (a2 == null) {
                a2 = po0.INVISIBLE;
            }
            yxb a3 = yxb.b.a(Integer.valueOf(ev6Var.c()));
            if (a3 == null) {
                a3 = yxb.UNKNOWN;
            }
            return new ro0(str2, a3, a2);
        }
        throw new IllegalArgumentException("No verification key provided".toString());
    }
}
