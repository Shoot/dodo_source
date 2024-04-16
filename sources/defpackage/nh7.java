package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter;
import com.dodopizza.controlling.feature.orderrating.presentation.b;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: OrderRatingModule.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007Jh\u0010!\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0018\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007J8\u00100\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010 \u001a\u00020\u001fH\u0007¨\u00063"}, d2 = {"Lnh7;", "", "Lfs1;", "a", "Lcom/dodopizza/controlling/feature/orderrating/presentation/b$a;", "b", "Ls69;", e.a, "Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingPresenter;", "presenter", "Lfz1;", "g", "Leh7;", "data", "Lmh7;", "interactor", "Lgc;", "analytics", "Lhp;", "appStateProvider", "Lwh7;", "orderRatingRouter", "contactMeSwitchVisibilityResolver", "Lcs1;", "contactMeSwitchFeatureState", "orderRatingChatMessageComposerFactory", "Lli7;", "orderService", "tagsResolver", "Ljc7;", "courierTipsFeatureState", "Lah7;", "orderRatingAutoSubmitFeatureState", DateTokenConverter.CONVERTER_KEY, "Lop5;", "lifecycleOwner", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxtb;", "f", "Lo69;", "ratingService", "Lk69;", "ratingPhotoService", "Lx49;", "rateAppService", "Leb0;", "binaryFeedbackFeatureState", c.a, "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nh7  reason: default package */
/* loaded from: classes.dex */
public final class nh7 {
    public static final nh7 a = new nh7();

    /* compiled from: OrderRatingModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nh7$a */
    /* loaded from: classes.dex */
    /* synthetic */ class a implements b.a, i94 {
        public static final a a = new a();

        a() {
        }

        @Override // com.dodopizza.controlling.feature.orderrating.presentation.b.a
        public final b a(dh7 dh7Var) {
            z65.h(dh7Var, "p0");
            return new b(dh7Var);
        }

        @Override // defpackage.i94
        public final b94<?> b() {
            return new m94(1, b.class, "<init>", "<init>(Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingChatMessageLinesBuilder;)V", 0);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b.a) || !(obj instanceof i94)) {
                return false;
            }
            return z65.c(b(), ((i94) obj).b());
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    private nh7() {
    }

    public final fs1 a() {
        return new fs1();
    }

    public final b.a b() {
        return a.a;
    }

    public final mh7 c(o69 o69Var, li7 li7Var, k69 k69Var, x49 x49Var, eb0 eb0Var, ah7 ah7Var) {
        z65.h(o69Var, "ratingService");
        z65.h(li7Var, "orderService");
        z65.h(k69Var, "ratingPhotoService");
        z65.h(x49Var, "rateAppService");
        z65.h(eb0Var, "binaryFeedbackFeatureState");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        return new mh7(o69Var, li7Var, k69Var, x49Var, eb0Var, ah7Var, null, 64, null);
    }

    public final OrderRatingPresenter d(eh7 eh7Var, mh7 mh7Var, gc gcVar, hp hpVar, wh7 wh7Var, fs1 fs1Var, cs1 cs1Var, b.a aVar, li7 li7Var, s69 s69Var, jc7 jc7Var, ah7 ah7Var) {
        z65.h(eh7Var, "data");
        z65.h(mh7Var, "interactor");
        z65.h(gcVar, "analytics");
        z65.h(hpVar, "appStateProvider");
        z65.h(wh7Var, "orderRatingRouter");
        z65.h(fs1Var, "contactMeSwitchVisibilityResolver");
        z65.h(cs1Var, "contactMeSwitchFeatureState");
        z65.h(aVar, "orderRatingChatMessageComposerFactory");
        z65.h(li7Var, "orderService");
        z65.h(s69Var, "tagsResolver");
        z65.h(jc7Var, "courierTipsFeatureState");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        return new OrderRatingPresenter(eh7Var, mh7Var, gcVar, hpVar, wh7Var, fs1Var, cs1Var, aVar, li7Var, s69Var, jc7Var, ah7Var);
    }

    public final s69 e() {
        return new s69();
    }

    public final xtb f(op5 op5Var, Context context) {
        z65.h(op5Var, "lifecycleOwner");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new h42(op5Var, context, new f42(context), new lg0(context));
    }

    public final fz1 g(OrderRatingPresenter orderRatingPresenter) {
        z65.h(orderRatingPresenter, "presenter");
        return orderRatingPresenter;
    }
}
