package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CaptchaProviderFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lqo0;", "", "Lyxb;", "verificationProvider", "Lso0;", "a", "Loj4;", "Loj4;", "hHCaptchaTokenProviderImpl", "Lkcc;", "b", "Lkcc;", "yaCaptchaTokenProviderImpl", "Lbo0;", "captchaActivityHolder", "<init>", "(Lbo0;)V", "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: qo0  reason: default package */
/* loaded from: classes.dex */
public final class qo0 {
    private final oj4 a;
    private final kcc b;

    /* compiled from: CaptchaProviderFactory.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: qo0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[yxb.values().length];
            try {
                iArr[yxb.H_CAPTCHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yxb.YA_CAPTCHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yxb.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qo0(bo0 bo0Var) {
        z65.h(bo0Var, "captchaActivityHolder");
        this.a = new oj4(bo0Var);
        this.b = new kcc(bo0Var);
    }

    public final so0 a(yxb yxbVar) {
        z65.h(yxbVar, "verificationProvider");
        int i = a.$EnumSwitchMapping$0[yxbVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("Unknown captcha provider");
            }
            return this.b;
        }
        return this.a;
    }
}
