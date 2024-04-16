package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.eb0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FeedbackButtonsInteractor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Luq3;", "", "Lb59;", "Lar3;", "g", "Lqd7;", Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, e.a, "", "orderId", "f", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lo69;", "a", "Lo69;", "ratingService", "Leb0;", "b", "Leb0;", "binaryFeedbackFeatureState", "Lkx1;", c.a, "Lkx1;", "ioDispatcher", "<init>", "(Lo69;Leb0;Lkx1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uq3  reason: default package */
/* loaded from: classes.dex */
public final class uq3 {
    private final o69 a;
    private final eb0 b;
    private final kx1 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackButtonsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lar3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsInteractor$getFeedbackButtonsVO$2", f = "FeedbackButtonsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: uq3$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super ar3>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super ar3> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    return uq3.this.g(uq3.this.a.a(this.c));
                } catch (Exception unused) {
                    return uq3.this.d();
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public uq3(o69 o69Var, eb0 eb0Var, kx1 kx1Var) {
        z65.h(o69Var, "ratingService");
        z65.h(eb0Var, "binaryFeedbackFeatureState");
        z65.h(kx1Var, "ioDispatcher");
        this.a = o69Var;
        this.b = eb0Var;
        this.c = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ar3 d() {
        return new ar3(e(), true);
    }

    private final qd7 e() {
        if (z65.c(this.b, eb0.b.a)) {
            return new hb0(null);
        }
        return new g69(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ar3 g(b59 b59Var) {
        return new ar3(h(b59Var), b59Var.h());
    }

    private final qd7 h(b59 b59Var) {
        if (fb0.a(this.b) && (b59Var.c() != null || !b59Var.i())) {
            return new hb0(b59Var.c());
        }
        return new g69(b59Var.g());
    }

    public final Object f(String str, cv1<? super ar3> cv1Var) {
        return qh0.g(this.c, new a(str, null), cv1Var);
    }

    public /* synthetic */ uq3(o69 o69Var, eb0 eb0Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(o69Var, eb0Var, (i & 4) != 0 ? v33.b() : kx1Var);
    }
}
