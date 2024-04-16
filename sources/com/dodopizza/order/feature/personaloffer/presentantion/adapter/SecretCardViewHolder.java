package com.dodopizza.order.feature.personaloffer.presentantion.adapter;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.order.feature.personaloffer.presentantion.adapter.SecretCardViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SecretCardViewHolder.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LB\u000f\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0014\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0006\u0010\u0013\u001a\u00020\u0006R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R#\u0010C\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR#\u0010F\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010B¨\u0006M"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/SecretCardViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Lta7;", "Landroid/view/View;", "visibleView", "inVisibleView", "", "flipCard", "flipToFrontSide", "flipToBackSide", "onOpened", "Lkotlin/Function0;", "clickListener", "setOnClickListener", "", "offerLocalImageResId", "showBackImage", "listener", "setOnOpenListener", "cancelAnimation", "Landroid/view/ViewGroup;", "bodyCardPart$delegate", "Lk79;", "getBodyCardPart", "()Landroid/view/ViewGroup;", "bodyCardPart", "tierCardPart$delegate", "getTierCardPart", "tierCardPart", "Landroidx/constraintlayout/widget/ConstraintLayout;", "secretCardContainer$delegate", "getSecretCardContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "secretCardContainer", "Landroid/widget/FrameLayout;", "offerCardContainer$delegate", "getOfferCardContainer", "()Landroid/widget/FrameLayout;", "offerCardContainer", "edgeBackground$delegate", "getEdgeBackground", "()Landroid/view/View;", "edgeBackground", "Landroid/widget/ImageView;", "secretOfferImage$delegate", "getSecretOfferImage", "()Landroid/widget/ImageView;", "secretOfferImage", "Landroid/view/ViewPropertyAnimator;", "splitAnimation", "Landroid/view/ViewPropertyAnimator;", "Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/PersonalOfferViewHolder;", "personalOfferViewHolder", "Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/PersonalOfferViewHolder;", "getPersonalOfferViewHolder", "()Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/PersonalOfferViewHolder;", "onSecretCardOpenListener", "Lkotlin/jvm/functions/Function0;", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Landroid/animation/Animator;", "kotlin.jvm.PlatformType", "flipOutAnimatorSet$delegate", "Lrn5;", "getFlipOutAnimatorSet", "()Landroid/animation/Animator;", "flipOutAnimatorSet", "flipInAnimatorSet$delegate", "getFlipInAnimatorSet", "flipInAnimatorSet", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "Companion", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SecretCardViewHolder extends SelfInflatingViewHolder implements ta7 {
    private static final long ANIMATION_DELAY = 300;
    private static final long DURATION = 1000;
    private static final float ROTATE_ANGLE = -20.0f;
    private static final long SPLIT_ANIMATION_DELAY = 100;
    private static final int TRANSLATE_BY_X = -100;
    private static final int cameraDist = 8000;
    private final AnimatorSet animatorSet;
    private final k79 bodyCardPart$delegate;
    private final k79 edgeBackground$delegate;
    private final rn5 flipInAnimatorSet$delegate;
    private final rn5 flipOutAnimatorSet$delegate;
    private final k79 offerCardContainer$delegate;
    private Function0<Unit> onSecretCardOpenListener;
    private final PersonalOfferViewHolder personalOfferViewHolder;
    private final k79 secretCardContainer$delegate;
    private final k79 secretOfferImage$delegate;
    private ViewPropertyAnimator splitAnimation;
    private final k79 tierCardPart$delegate;
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(SecretCardViewHolder.class, "bodyCardPart", "getBodyCardPart()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(SecretCardViewHolder.class, "tierCardPart", "getTierCardPart()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(SecretCardViewHolder.class, "secretCardContainer", "getSecretCardContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(SecretCardViewHolder.class, "offerCardContainer", "getOfferCardContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(SecretCardViewHolder.class, "edgeBackground", "getEdgeBackground()Landroid/view/View;", 0)), bc9.f(new ar8(SecretCardViewHolder.class, "secretOfferImage", "getSecretOfferImage()Landroid/widget/ImageView;", 0))};
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    /* compiled from: SecretCardViewHolder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/adapter/SecretCardViewHolder$a;", "", "", "ANIMATION_DELAY", "J", "DURATION", "", "ROTATE_ANGLE", "F", "SPLIT_ANIMATION_DELAY", "", "TRANSLATE_BY_X", "I", "cameraDist", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ View a;
        final /* synthetic */ View b;

        public b(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
            SecretCardViewHolder.flipCard$doOnEndAnimation(this.a, this.b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        final /* synthetic */ View a;
        final /* synthetic */ View b;

        public c(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animator");
            SecretCardViewHolder.flipCard$doOnEndAnimation(this.a, this.b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            z65.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z65.h(animator, "animator");
        }
    }

    /* compiled from: SecretCardViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/animation/Animator;", "kotlin.jvm.PlatformType", "a", "()Landroid/animation/Animator;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<Animator> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Animator invoke() {
            return AnimatorInflater.loadAnimator(SecretCardViewHolder.this.itemView.getContext(), lv8.animation_vertical_flip_in);
        }
    }

    /* compiled from: SecretCardViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/animation/Animator;", "kotlin.jvm.PlatformType", "a", "()Landroid/animation/Animator;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<Animator> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Animator invoke() {
            return AnimatorInflater.loadAnimator(SecretCardViewHolder.this.itemView.getContext(), lv8.animation_vertical_flip_out);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SecretCardViewHolder.this.onSecretCardOpenListener.invoke();
            ViewPropertyAnimator viewPropertyAnimator = SecretCardViewHolder.this.splitAnimation;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            SecretCardViewHolder secretCardViewHolder = SecretCardViewHolder.this;
            secretCardViewHolder.splitAnimation = secretCardViewHolder.getTierCardPart().animate().translationXBy(kx9.a(SecretCardViewHolder.TRANSLATE_BY_X)).rotationBy(SecretCardViewHolder.ROTATE_ANGLE).setDuration(1000L).withEndAction(new g()).withStartAction(new h());
            ViewPropertyAnimator viewPropertyAnimator2 = SecretCardViewHolder.this.splitAnimation;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.start();
            }
        }
    }

    /* compiled from: SecretCardViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class g implements Runnable {

        /* compiled from: View.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class a implements Runnable {
            final /* synthetic */ SecretCardViewHolder a;

            public a(SecretCardViewHolder secretCardViewHolder) {
                this.a = secretCardViewHolder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SecretCardViewHolder secretCardViewHolder = this.a;
                secretCardViewHolder.flipCard(secretCardViewHolder.getOfferCardContainer(), this.a.getSecretCardContainer());
            }
        }

        g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SecretCardViewHolder.this.getBodyCardPart().postDelayed(new a(SecretCardViewHolder.this), SecretCardViewHolder.ANIMATION_DELAY);
        }
    }

    /* compiled from: SecretCardViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            un3.e(SecretCardViewHolder.this.getEdgeBackground());
        }
    }

    /* compiled from: SecretCardViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function0<Unit> {
        public static final i a = new i();

        i() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecretCardViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_personal_offer_secret_card);
        rn5 b2;
        rn5 b3;
        z65.h(kzbVar, "viewInflater");
        this.bodyCardPart$delegate = kb0.g(this, gy8.secret_offer_body_part);
        this.tierCardPart$delegate = kb0.g(this, gy8.secret_offer_tier_part);
        this.secretCardContainer$delegate = kb0.g(this, gy8.secret_action_container);
        this.offerCardContainer$delegate = kb0.g(this, gy8.personal_offer);
        this.edgeBackground$delegate = kb0.g(this, gy8.edge_background_view);
        this.secretOfferImage$delegate = kb0.g(this, gy8.secret_offer_image);
        PersonalOfferViewHolder personalOfferViewHolder = new PersonalOfferViewHolder(kzbVar);
        this.personalOfferViewHolder = personalOfferViewHolder;
        this.onSecretCardOpenListener = i.a;
        getOfferCardContainer().addView(personalOfferViewHolder.itemView);
        this.animatorSet = new AnimatorSet();
        b2 = yn5.b(new e());
        this.flipOutAnimatorSet$delegate = b2;
        b3 = yn5.b(new d());
        this.flipInAnimatorSet$delegate = b3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flipCard(View view, View view2) {
        if (!this.animatorSet.isRunning()) {
            un3.k(view);
            un3.k(view2);
            view.setCameraDistance(kx9.a(8000));
            view2.setCameraDistance(kx9.a(8000));
            getFlipOutAnimatorSet().setTarget(view2);
            getFlipInAnimatorSet().setTarget(view);
            this.animatorSet.addListener(new b(view, view2));
            this.animatorSet.addListener(new c(view, view2));
            this.animatorSet.playTogether(getFlipInAnimatorSet(), getFlipOutAnimatorSet());
            this.animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flipCard$doOnEndAnimation(View view, View view2) {
        view.setAlpha(1.0f);
        un3.k(view);
        view2.setAlpha(1.0f);
        un3.e(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getBodyCardPart() {
        return (ViewGroup) this.bodyCardPart$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getEdgeBackground() {
        return (View) this.edgeBackground$delegate.a(this, $$delegatedProperties[4]);
    }

    private final Animator getFlipInAnimatorSet() {
        return (Animator) this.flipInAnimatorSet$delegate.getValue();
    }

    private final Animator getFlipOutAnimatorSet() {
        return (Animator) this.flipOutAnimatorSet$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getOfferCardContainer() {
        return (FrameLayout) this.offerCardContainer$delegate.a(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstraintLayout getSecretCardContainer() {
        return (ConstraintLayout) this.secretCardContainer$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getSecretOfferImage() {
        return (ImageView) this.secretOfferImage$delegate.a(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getTierCardPart() {
        return (ViewGroup) this.tierCardPart$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$1(Function0 function0, View view) {
        z65.h(function0, "$clickListener");
        function0.invoke();
    }

    public final void cancelAnimation() {
        this.animatorSet.cancel();
        ViewPropertyAnimator viewPropertyAnimator = this.splitAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void flipToBackSide() {
        un3.e(getSecretCardContainer());
        un3.k(getOfferCardContainer());
        getSecretCardContainer().setRotationX(0.0f);
        getOfferCardContainer().setRotationX(0.0f);
    }

    public final void flipToFrontSide() {
        un3.k(getSecretCardContainer());
        un3.e(getOfferCardContainer());
        getSecretCardContainer().setRotationX(0.0f);
        getOfferCardContainer().setRotationX(0.0f);
    }

    public final PersonalOfferViewHolder getPersonalOfferViewHolder() {
        return this.personalOfferViewHolder;
    }

    @Override // defpackage.ta7
    public void onOpened() {
        View view = this.itemView;
        z65.g(view, "itemView");
        view.postDelayed(new f(), SPLIT_ANIMATION_DELAY);
    }

    public final void setOnClickListener(final Function0<Unit> function0) {
        z65.h(function0, "clickListener");
        getBodyCardPart().setOnClickListener(new View.OnClickListener() { // from class: p2a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecretCardViewHolder.setOnClickListener$lambda$1(Function0.this, view);
            }
        });
    }

    public final void setOnOpenListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        this.onSecretCardOpenListener = function0;
    }

    public final void showBackImage(int i2) {
        com.bumptech.glide.b.u(getSecretOfferImage()).s(Integer.valueOf(i2)).d().a0(b09.gift).G0(getSecretOfferImage());
    }
}
