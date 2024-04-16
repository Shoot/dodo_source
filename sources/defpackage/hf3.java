package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter;
/* compiled from: EmailForChecksModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lhf3;", "", "", "email", "", "isSubscribedToNews", "Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hf3  reason: default package */
/* loaded from: classes3.dex */
public final class hf3 {
    public static final hf3 a = new hf3();

    private hf3() {
    }

    public final EmailForChecksPresenter a(String str, boolean z, f63 f63Var) {
        z65.h(str, "email");
        z65.h(f63Var, "router");
        return new EmailForChecksPresenter(str, z, f63Var);
    }
}
