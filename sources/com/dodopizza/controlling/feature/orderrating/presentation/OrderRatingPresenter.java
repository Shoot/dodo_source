package com.dodopizza.controlling.feature.orderrating.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.orderrating.presentation.a;
import com.dodopizza.controlling.feature.orderrating.presentation.b;
import com.dodopizza.controlling.feature.orderrating.presentation.c;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c59;
import defpackage.cs1;
import defpackage.l95;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: OrderRatingPresenter.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bi\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010^\u001a\u00020[\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020c\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010m\u001a\u00020k\u0012\u0006\u0010q\u001a\u00020n\u0012\u0006\u0010u\u001a\u00020r\u0012\u0006\u0010x\u001a\u00020v¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J4\u0010 \u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J0\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010&\u001a\u00020%H\u0002J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020%H\u0002J<\u00102\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u00100\u001a\u0018\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\"0,j\u0002`/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0002J \u00105\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020%H\u0002J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00106\u001a\u00020%H\u0002J\u0010\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0018H\u0002J\b\u0010:\u001a\u00020\u0004H\u0014J\u000e\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020%J\u0006\u0010=\u001a\u00020\u0004J\u0016\u0010@\u001a\u00020\u00042\u0006\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020%J\u000e\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020%J\u0016\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020#2\u0006\u0010*\u001a\u00020%J\u0012\u0010E\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0006\u0010F\u001a\u00020\u0004J\u000e\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020%J\u000e\u0010I\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010J\u001a\u00020\u00042\u0006\u0010;\u001a\u00020%H\u0016R\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010wR\u001c\u0010}\u001a\n z*\u0004\u0018\u00010y0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010DR\u0018\u0010\u0081\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010DR.\u00100\u001a\u0018\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\"0,j\u0002`/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001d\u00101\u001a\t\u0012\u0004\u0012\u00020\u00180\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020#0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0092\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010DR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u009d\u0001\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010DR\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001e\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020#0\u0095\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001¨\u0006§\u0001"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/presentation/OrderRatingPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lci7;", "Lfz1;", "", "h0", "l0", "f0", "Lw69;", "rating", "Ldc;", "c0", "e0", "(Lcv1;)Ljava/lang/Object;", "k0", "O", "Lcom/dodopizza/controlling/feature/orderrating/presentation/a;", "Ldj9;", "j0", "L", "Q", "Lqd7;", "feedbackValue", "P", "", "productsTitle", "K", "Lv1b;", "selectedTips", "contactType", "Ldh7;", "chatMessageLinesBuilder", "i0", "(Lw69;Lv1b;Ldj9;Ldh7;Lcv1;)Ljava/lang/Object;", "", "Lr69;", "selectedTagsVOs", "", "isAutoSubmission", "d0", "M", "ratingForUpdate", "isSelected", "m0", "", "", "Lq69;", "Lcom/dodopizza/controlling/feature/orderrating/presentation/TagsMap;", "tagsMap", "selectedTagIds", "S", "comment", "isAnyPhotoAttached", "N", "isAnyTipsOptionSelected", "R", "orderId", "g0", "onFirstViewAttach", "available", "a0", "U", "newRatingValue", "fromUser", "Y", "isFeedbackPositive", "V", "tagVo", "Z", "l", "W", "checked", "X", "b0", "i", "Leh7;", "a", "Leh7;", "data", "Lmh7;", "b", "Lmh7;", "interactor", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lhp;", DateTokenConverter.CONVERTER_KEY, "Lhp;", "appStateProvider", "Lwh7;", com.huawei.hms.push.e.a, "Lwh7;", "orderRatingRouter", "Lfs1;", "f", "Lfs1;", "contactMeSwitchVisibilityResolver", "Lcs1;", "g", "Lcs1;", "contactMeSwitchFeatureState", "Lcom/dodopizza/controlling/feature/orderrating/presentation/b$a;", Image.TYPE_HIGH, "Lcom/dodopizza/controlling/feature/orderrating/presentation/b$a;", "ratingChatMessageComposerFactory", "Lli7;", "Lli7;", "orderService", "Ls69;", "j", "Ls69;", "tagsResolver", "Ljc7;", "k", "Ljc7;", "orderCompletedCourierTipsState", "Lah7;", "Lah7;", "orderRatingAutoSubmitFeatureState", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "Lorg/slf4j/Logger;", "logger", "n", "isRatingSent", "o", "isRnDigitalCardConfigured", "p", "Ljava/util/Map;", "q", "Ljava/lang/String;", "productsDescription", "r", "Lw69;", "currentRating", "", Image.TYPE_SMALL, "Ljava/util/Set;", "Ll6;", "t", "Ll6;", "ratingTagVOs", "u", "tipsAvailable", "v", "Lv1b;", "", "w", "Ljava/util/List;", "attachedPhotosIds", "x", "Lcom/dodopizza/controlling/feature/orderrating/presentation/a;", "contactMeSwitchState", "y", "isRnDigitalCardEnabled", "Ll95;", "z", "Ll95;", "draftRatingSaving", "T", "()Ljava/util/List;", "selectedTagVOs", "<init>", "(Leh7;Lmh7;Lgc;Lhp;Lwh7;Lfs1;Lcs1;Lcom/dodopizza/controlling/feature/orderrating/presentation/b$a;Lli7;Ls69;Ljc7;Lah7;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class OrderRatingPresenter extends BasePresenter<ci7> implements fz1 {
    private final eh7 a;
    private final mh7 b;
    private final gc c;
    private final hp d;
    private final wh7 e;
    private final fs1 f;
    private final cs1 g;
    private final b.a h;
    private final li7 i;
    private final s69 j;
    private final jc7 k;
    private final ah7 l;
    private final Logger m;
    private boolean n;
    private boolean o;
    private Map<Integer, ? extends Collection<q69>> p;
    private String q;
    private w69 r;
    private final Set<String> s;
    private final l6<r69> t;
    private boolean u;
    private v1b v;
    private List<String> w;
    private com.dodopizza.controlling.feature.orderrating.presentation.a x;
    private final boolean y;
    private l95 z;

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[es1.values().length];
            try {
                iArr[es1.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[es1.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[es1.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$applyRating$1", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ci7) OrderRatingPresenter.this.getViewState()).N7();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lai7;", "orderRating", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$applyRating$2", f = "OrderRatingPresenter.kt", l = {391}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function2<ai7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ai7 ai7Var, cv1<? super Unit> cv1Var) {
            return ((c) create(ai7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            OrderRatingPresenter orderRatingPresenter;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    orderRatingPresenter = (OrderRatingPresenter) this.b;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ai7 ai7Var = (ai7) this.b;
                OrderRatingPresenter.this.p = ai7Var.c();
                OrderRatingPresenter.this.q = ai7Var.a();
                OrderRatingPresenter.this.n = ai7Var.d();
                qd7 a = OrderRatingPresenter.this.a.a();
                if (a == null) {
                    a = ai7Var.b().f();
                }
                OrderRatingPresenter.this.r = w69.b(ai7Var.b(), null, a, null, null, 13, null);
                if (a.g()) {
                    OrderRatingPresenter.this.h0();
                }
                OrderRatingPresenter orderRatingPresenter2 = OrderRatingPresenter.this;
                orderRatingPresenter2.g0(orderRatingPresenter2.a.b());
                OrderRatingPresenter.this.O();
                OrderRatingPresenter orderRatingPresenter3 = OrderRatingPresenter.this;
                mh7 mh7Var = orderRatingPresenter3.b;
                String b = OrderRatingPresenter.this.a.b();
                this.b = orderRatingPresenter3;
                this.a = 1;
                Object k = mh7Var.k(b, this);
                if (k == d) {
                    return d;
                }
                orderRatingPresenter = orderRatingPresenter3;
                obj = k;
            }
            orderRatingPresenter.w = (List) obj;
            OrderRatingPresenter.this.Q();
            ((ci7) OrderRatingPresenter.this.getViewState()).mo0if();
            OrderRatingPresenter.this.c.a(new c59.b(OrderRatingPresenter.this.a.b(), OrderRatingPresenter.this.u, OrderRatingPresenter.this.a.c()));
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$applyRating$3", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderRatingPresenter.this.m.error("Can't get OrderRating", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onBackButtonPressed$1", f = "OrderRatingPresenter.kt", l = {170}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class e extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                OrderRatingPresenter orderRatingPresenter = OrderRatingPresenter.this;
                this.a = 1;
                if (orderRatingPresenter.e0(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onBackButtonPressed$2", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ci7) OrderRatingPresenter.this.getViewState()).N7();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onBackButtonPressed$3", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class g extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new g(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((g) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderRatingPresenter.this.k0();
                OrderRatingPresenter.this.e.e(c.a.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onBackButtonPressed$4", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderRatingPresenter.this.m.error("Failed to save the draft order rating on back button press", (Throwable) this.b);
                OrderRatingPresenter.this.e.e(c.b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onCommentFieldPressed$1", f = "OrderRatingPresenter.kt", l = {271}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class i extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((i) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                wh7 wh7Var = OrderRatingPresenter.this.e;
                m59 m59Var = new m59(OrderRatingPresenter.this.a.b(), OrderRatingPresenter.this.r.c());
                this.a = 1;
                obj = wh7Var.b(m59Var, this);
                if (obj == d) {
                    return d;
                }
            }
            y59 y59Var = (y59) obj;
            OrderRatingPresenter.this.w = y59Var.a();
            OrderRatingPresenter orderRatingPresenter = OrderRatingPresenter.this;
            orderRatingPresenter.r = w69.b(orderRatingPresenter.r, null, null, y59Var.b(), null, 11, null);
            OrderRatingPresenter.this.Q();
            OrderRatingPresenter.this.O();
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onSendButtonPressed$1", f = "OrderRatingPresenter.kt", l = {334}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ w69 c;
        final /* synthetic */ List<String> d;
        final /* synthetic */ dj9 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(w69 w69Var, List<String> list, dj9 dj9Var, cv1<? super j> cv1Var) {
            super(1, cv1Var);
            this.c = w69Var;
            this.d = list;
            this.e = dj9Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(this.c, this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                mh7 mh7Var = OrderRatingPresenter.this.b;
                w69 w69Var = this.c;
                List<String> list = this.d;
                dj9 dj9Var = this.e;
                this.a = 1;
                if (mh7Var.m(w69Var, list, dj9Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onSendButtonPressed$2", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class k extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ci7) OrderRatingPresenter.this.getViewState()).Gd();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onSendButtonPressed$3", f = "OrderRatingPresenter.kt", l = {343}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class l extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ w69 c;
        final /* synthetic */ v1b d;
        final /* synthetic */ dj9 e;
        final /* synthetic */ dh7 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(w69 w69Var, v1b v1bVar, dj9 dj9Var, dh7 dh7Var, cv1<? super l> cv1Var) {
            super(2, cv1Var);
            this.c = w69Var;
            this.d = v1bVar;
            this.e = dj9Var;
            this.f = dh7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(this.c, this.d, this.e, this.f, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((l) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ((ci7) OrderRatingPresenter.this.getViewState()).e5();
                OrderRatingPresenter orderRatingPresenter = OrderRatingPresenter.this;
                w69 w69Var = this.c;
                v1b v1bVar = this.d;
                dj9 dj9Var = this.e;
                dh7 dh7Var = this.f;
                this.a = 1;
                if (orderRatingPresenter.i0(w69Var, v1bVar, dj9Var, dh7Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onSendButtonPressed$4", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderRatingPresenter.this.m.error("Failed to save the final order rating", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$onSendButtonPressed$5", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ci7) OrderRatingPresenter.this.getViewState()).Q3();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class o implements oz3<ep> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$scheduleDraftRatingSavingOnAppBackgroundState$$inlined$filter$1$2", f = "OrderRatingPresenter.kt", l = {223}, m = "emit")
            /* renamed from: com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$o$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0118a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0118a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter.o.a.C0118a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$o$a$a r0 = (com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter.o.a.C0118a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$o$a$a r0 = new com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$o$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L46
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    r2 = r6
                    ep r2 = (defpackage.ep) r2
                    ep r4 = defpackage.ep.b
                    if (r2 != r4) goto L46
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L46
                    return r1
                L46:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter.o.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public o(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super ep> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lep;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$scheduleDraftRatingSavingOnAppBackgroundState$2", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends f3b implements Function2<ep, cv1<? super Boolean>, Object> {
        int a;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new p(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ep epVar, cv1<? super Boolean> cv1Var) {
            return ((p) create(epVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                l95 l95Var = OrderRatingPresenter.this.z;
                boolean z = false;
                if (l95Var != null && l95Var.b()) {
                    z = true;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lep;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$scheduleDraftRatingSavingOnAppBackgroundState$3", f = "OrderRatingPresenter.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends f3b implements Function2<ep, cv1<? super Unit>, Object> {
        int a;

        q(cv1<? super q> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new q(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ep epVar, cv1<? super Unit> cv1Var) {
            return ((q) create(epVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                OrderRatingPresenter orderRatingPresenter = OrderRatingPresenter.this;
                this.a = 1;
                if (orderRatingPresenter.e0(this) == d) {
                    return d;
                }
            }
            OrderRatingPresenter.this.k0();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lep;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter$scheduleDraftRatingSavingOnAppBackgroundState$4", f = "OrderRatingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class r extends f3b implements y84<pz3<? super ep>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r(cv1<? super r> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ep> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            r rVar = new r(cv1Var);
            rVar.b = th;
            return rVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                OrderRatingPresenter.this.m.error("Failed to save the draft order rating from the background app state", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter", f = "OrderRatingPresenter.kt", l = {477}, m = "showSuccess")
    /* loaded from: classes.dex */
    public static final class s extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        int f;
        /* synthetic */ Object g;
        int i;

        s(cv1<? super s> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return OrderRatingPresenter.this.i0(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr69;", "ratingTagVO", "", "a", "(Lr69;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class t extends ej5 implements Function1<r69, Boolean> {
        final /* synthetic */ r69 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(r69 r69Var) {
            super(1);
            this.a = r69Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(r69 r69Var) {
            z65.h(r69Var, "ratingTagVO");
            return Boolean.valueOf(z65.c(r69Var, this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr69;", "ratingTagVO", "", "", "a", "(Lr69;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class u extends ej5 implements Function1<r69, List<? extends String>> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(r69 r69Var) {
            List<String> l;
            z65.h(r69Var, "ratingTagVO");
            r69Var.d(this.a);
            l = kc1.l();
            return l;
        }
    }

    public OrderRatingPresenter(eh7 eh7Var, mh7 mh7Var, gc gcVar, hp hpVar, wh7 wh7Var, fs1 fs1Var, cs1 cs1Var, b.a aVar, li7 li7Var, s69 s69Var, jc7 jc7Var, ah7 ah7Var) {
        Map<Integer, ? extends Collection<q69>> h2;
        List l2;
        List<String> l3;
        z65.h(eh7Var, "data");
        z65.h(mh7Var, "interactor");
        z65.h(gcVar, "analytics");
        z65.h(hpVar, "appStateProvider");
        z65.h(wh7Var, "orderRatingRouter");
        z65.h(fs1Var, "contactMeSwitchVisibilityResolver");
        z65.h(cs1Var, "contactMeSwitchFeatureState");
        z65.h(aVar, "ratingChatMessageComposerFactory");
        z65.h(li7Var, "orderService");
        z65.h(s69Var, "tagsResolver");
        z65.h(jc7Var, "orderCompletedCourierTipsState");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        this.a = eh7Var;
        this.b = mh7Var;
        this.c = gcVar;
        this.d = hpVar;
        this.e = wh7Var;
        this.f = fs1Var;
        this.g = cs1Var;
        this.h = aVar;
        this.i = li7Var;
        this.j = s69Var;
        this.k = jc7Var;
        this.l = ah7Var;
        this.m = LoggerFactory.getLogger("OrderRatingPresenter");
        h2 = g86.h();
        this.p = h2;
        this.q = "";
        String b2 = eh7Var.b();
        qd7 a2 = eh7Var.a();
        boolean z = false;
        a2 = a2 == null ? new g69(0) : a2;
        l2 = kc1.l();
        this.r = new w69(b2, a2, "", l2);
        this.s = new LinkedHashSet();
        this.t = new l6<>(null, 1, null);
        l3 = kc1.l();
        this.w = l3;
        this.x = new a.C0119a(true);
        if ((cs1Var instanceof cs1.c) && bh7.a(ah7Var)) {
            z = true;
        }
        this.y = z;
    }

    private final void K(qd7 qd7Var, String str) {
        if (!qd7Var.g() && str.length() > 0) {
            ((ci7) getViewState()).N4(str);
        } else {
            ((ci7) getViewState()).Rd();
        }
    }

    private final void L() {
        p(z77.a(y87.a(r77.a(this.b.i(this.a.b()), new b(null)), new c(null)), new d(null)));
    }

    private final String M(w69 w69Var, dh7 dh7Var) {
        int w;
        bc7 g2 = this.i.g(this.a.b());
        com.dodopizza.controlling.feature.orderrating.presentation.b a2 = this.h.a(dh7Var);
        List<r69> T = T();
        w = lc1.w(T, 10);
        ArrayList arrayList = new ArrayList(w);
        for (r69 r69Var : T) {
            arrayList.add(r69Var.b());
        }
        return a2.f(g2, w69Var, this.q, arrayList);
    }

    private final void N(qd7 qd7Var, String str, boolean z) {
        if (qd7Var.g()) {
            ((ci7) getViewState()).v6();
            ((ci7) getViewState()).Bd(str);
            ((ci7) getViewState()).sg(z);
            return;
        }
        ((ci7) getViewState()).Aa();
        ((ci7) getViewState()).sg(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        com.dodopizza.controlling.feature.orderrating.presentation.a c0119a;
        w69 w69Var = this.r;
        fs1 fs1Var = this.f;
        int b2 = kw1.b(w69Var.f());
        boolean z = true;
        boolean z2 = !T().isEmpty();
        boolean z3 = !this.w.isEmpty();
        if (w69Var.c().length() <= 0) {
            z = false;
        }
        boolean a2 = fs1Var.a(b2, z2, z3, z);
        cs1 cs1Var = this.g;
        if (a2 && (cs1Var instanceof cs1.b)) {
            c0119a = new a.b(((cs1.b) cs1Var).a(), this.x.a());
        } else {
            c0119a = new a.C0119a(this.x.a());
        }
        this.x = c0119a;
        if (c0119a instanceof a.b) {
            ((ci7) getViewState()).Ze(((a.b) c0119a).b(), c0119a.a());
        } else if (c0119a instanceof a.C0119a) {
            ((ci7) getViewState()).Ue();
        }
    }

    private final void P(qd7 qd7Var) {
        if (qd7Var instanceof g69) {
            ((ci7) getViewState()).B0();
            ((ci7) getViewState()).s8();
            ((ci7) getViewState()).W0(((g69) qd7Var).a());
            if (qd7Var.g()) {
                ((ci7) getViewState()).pg(((g69) qd7Var).a());
            } else {
                ((ci7) getViewState()).p3();
            }
        }
        if (qd7Var instanceof hb0) {
            ((ci7) getViewState()).v0();
            if (qd7Var.g()) {
                ((ci7) getViewState()).B0();
                ((ci7) getViewState()).s8();
                ((ci7) getViewState()).g1();
                return;
            }
            ((ci7) getViewState()).g0();
            ((ci7) getViewState()).p3();
            ((ci7) getViewState()).N5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        w69 w69Var = this.r;
        qd7 f2 = w69Var.f();
        P(f2);
        K(f2, this.q);
        S(f2, this.p, this.s);
        boolean z = true;
        N(f2, w69Var.c(), !this.w.isEmpty());
        if (this.v == null) {
            z = false;
        }
        R(f2, z);
    }

    private final void R(qd7 qd7Var, boolean z) {
        if (!qd7Var.g() && !z) {
            ((ci7) getViewState()).zd();
        } else {
            ((ci7) getViewState()).Vb();
        }
    }

    private final void S(qd7 qd7Var, Map<Integer, ? extends Collection<q69>> map, Collection<String> collection) {
        int w;
        Collection<q69> a2 = this.j.a(map, qd7Var);
        if (qd7Var.g() && a2 != null && (!a2.isEmpty())) {
            Collection<q69> collection2 = a2;
            w = lc1.w(collection2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (q69 q69Var : collection2) {
                arrayList.add(new r69(q69Var.a(), q69Var.b(), collection.contains(q69Var.a())));
            }
            this.t.r();
            this.t.addAll(arrayList);
            ((ci7) getViewState()).ka();
            if (!(qd7Var instanceof hb0)) {
                ((ci7) getViewState()).ba();
                return;
            }
            hb0 hb0Var = (hb0) qd7Var;
            if (z65.c(hb0Var.a(), Boolean.TRUE)) {
                ((ci7) getViewState()).oa();
                return;
            } else if (z65.c(hb0Var.a(), Boolean.FALSE)) {
                ((ci7) getViewState()).O6();
                return;
            } else {
                return;
            }
        }
        ((ci7) getViewState()).cd();
        ((ci7) getViewState()).ba();
        this.t.r();
    }

    private final List<r69> T() {
        l6<r69> l6Var = this.t;
        ArrayList arrayList = new ArrayList();
        for (r69 r69Var : l6Var) {
            if (r69Var.c()) {
                arrayList.add(r69Var);
            }
        }
        return arrayList;
    }

    private final dc c0(w69 w69Var) {
        qd7 f2 = w69Var.f();
        if (f2 instanceof hb0) {
            return c59.a.h(w69Var.d(), ((hb0) f2).a());
        }
        if (f2 instanceof g69) {
            return c59.a.g(w69Var.d(), ((g69) f2).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final dc d0(w69 w69Var, Collection<r69> collection, v1b v1bVar, boolean z) {
        int w;
        Integer num;
        Collection<r69> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (r69 r69Var : collection2) {
            arrayList.add(r69Var.b());
        }
        if (v1bVar != null) {
            num = Integer.valueOf(v1bVar.a());
        } else {
            num = null;
        }
        int intValue = ((Number) mh5.c(num, 0)).intValue();
        qd7 f2 = w69Var.f();
        if (f2 instanceof hb0) {
            return c59.a.j(w69Var.d(), ((hb0) f2).a(), arrayList, this.u, intValue, w69Var.c(), z);
        }
        if (f2 instanceof g69) {
            return c59.a.i(w69Var.d(), ((g69) f2).a(), arrayList, this.u, intValue, w69Var.c(), z);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e0(cv1<? super Unit> cv1Var) {
        Object d2;
        Object l2 = this.b.l(this.r, this.w, j0(this.x), cv1Var);
        d2 = c75.d();
        if (l2 == d2) {
            return l2;
        }
        return Unit.a;
    }

    private final void f0() {
        o(wz3.h(wz3.F(wz3.p(new o(this.d.getState()), new p(null)), new q(null)), new r(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(String str) {
        if (kc7.a(this.k)) {
            return;
        }
        ((ci7) getViewState()).t0(new ez1(str, ck1.z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        if (this.y && !this.n && !this.o) {
            this.o = true;
            ((ci7) getViewState()).s(new vm9(this.a.b(), false, ck1.z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(defpackage.w69 r8, defpackage.v1b r9, defpackage.dj9 r10, defpackage.dh7 r11, defpackage.cv1<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter.i0(w69, v1b, dj9, dh7, cv1):java.lang.Object");
    }

    private final dj9 j0(com.dodopizza.controlling.feature.orderrating.presentation.a aVar) {
        if (!(aVar instanceof a.b)) {
            return null;
        }
        if (aVar.a()) {
            int i2 = a.$EnumSwitchMapping$0[((a.b) aVar).b().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return dj9.b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return dj9.b;
            }
            return dj9.c;
        }
        return dj9.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        if (bh7.a(this.l)) {
            this.c.a(d0(this.r, T(), this.v, true));
        }
    }

    private final void l0() {
        if (!(this.g instanceof cs1.c)) {
            this.c.a(c59.a.l(this.a.b()));
        }
    }

    private final void m0(r69 r69Var, boolean z) {
        this.t.S(new t(r69Var), new u(z));
    }

    public final void U() {
        this.c.a(c0(this.r));
        l95 l95Var = this.z;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        this.z = p(z77.a(y87.a(r77.a(hy.a(new e(null)), new f(null)), new g(null)), new h(null)));
    }

    public final void V(boolean z) {
        this.r = w69.b(this.r, null, new hb0(Boolean.valueOf(z)), null, null, 13, null);
        O();
        Q();
        h0();
        this.c.a(c59.a.f(ck1.z, this.a.b(), z));
    }

    public final void W() {
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    public final void X(boolean z) {
        boolean z2;
        if (this.x.a() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x.setChecked(z);
        O();
        if (z2) {
            this.c.a(c59.a.c(z, this.a.b()));
        }
    }

    public final void Y(int i2, boolean z) {
        if (z) {
            this.r = w69.b(this.r, null, new g69(i2), null, null, 13, null);
            O();
            Q();
            h0();
            this.c.a(c59.a.e(ck1.z, this.a.b(), i2));
        }
    }

    public final void Z(r69 r69Var, boolean z) {
        z65.h(r69Var, "tagVo");
        if (z) {
            this.s.add(r69Var.a());
        } else {
            this.s.remove(r69Var.a());
        }
        m0(r69Var, z);
        O();
    }

    public final void a0(boolean z) {
        if (this.y) {
            ((ci7) getViewState()).H(z);
            return;
        }
        throw new IllegalStateException("Unexpected RnDigital form availability change".toString());
    }

    public final void b0(dh7 dh7Var) {
        z65.h(dh7Var, "chatMessageLinesBuilder");
        w69 w69Var = this.r;
        dj9 j0 = j0(this.x);
        p(o77.a(z77.a(y87.a(r77.a(hy.a(new j(w69Var, this.w, j0, null)), new k(null)), new l(w69Var, this.v, j0, dh7Var, null)), new m(null)), new n(null)));
    }

    @Override // defpackage.fz1
    public void i(boolean z) {
        this.u = z;
        ((ci7) getViewState()).q0(z);
    }

    @Override // defpackage.fz1
    public void l(v1b v1bVar) {
        this.v = v1bVar;
        Q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        ((ci7) getViewState()).d3(this.t);
        l0();
        f0();
        O();
        Q();
        L();
    }
}
