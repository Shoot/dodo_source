package com.dodopizza.order.feature.personaloffer.presentantion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.personaloffer.presentantion.RecyclerViewWithSwipeEnd;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: RecyclerViewWithSwipeEnd.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001JB!\b\u0007\u0012\u0006\u0010\u007f\u001a\u00020~\u0012\f\b\u0002\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J+\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J*\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010%\u001a\u00020\bH\u0002J\u0012\u0010'\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\bH\u0002J\u0010\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0002J0\u00100\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0002J!\u00102\u001a\u00020\n2\u0012\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0002\"\u00020\u0016¢\u0006\u0004\b2\u00103J\b\u00104\u001a\u00020\nH\u0014J0\u0010;\u001a\u00020\n2\u0006\u00105\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u000206H\u0014J\u0012\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010@\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010?H\u0016J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\bH\u0016J\u0012\u0010C\u001a\u00020\n2\b\b\u0002\u0010-\u001a\u00020+H\u0007J\u0010\u0010D\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010E\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010H\u001a\u00020\b2\u0006\u0010F\u001a\u0002062\u0006\u0010G\u001a\u000206H\u0016J\u0006\u0010I\u001a\u00020\nR\u0014\u0010K\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010#R\u0014\u0010N\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010V\u001a\n S*\u0004\u0018\u00010R0R8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR#\u0010[\u001a\n S*\u0004\u0018\u00010W0W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\\R\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010^R\u0016\u0010`\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010#R\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010^R\u0016\u0010c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\\R\u0016\u0010e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\\R\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\\R\u0016\u0010h\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010gR\u0016\u0010i\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010#R\u0016\u0010j\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#R\u0018\u0010m\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00160p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010qR\"\u0010w\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\\\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\\R\u0014\u0010{\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010z¨\u0006\u0084\u0001"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/RecyclerViewWithSwipeEnd;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "initialCoordinates", MessageAttributes.COORDINATES, "l", "([Ljava/lang/Float;[Ljava/lang/Float;)F", "", "w", "", "v", "Landroid/view/MotionEvent;", com.huawei.hms.push.e.a, "z", "q", Image.TYPE_SMALL, "Landroid/view/View;", "getLastItemView", "B", "view", "Lkotlin/Function2;", "Lo3b;", "animatorAction", "f", "t", Image.TYPE_MEDIUM, "A", "E", "x", "y", "C", "swipeDistance", "u", "prVisible", "F", "r", "swipedRight", "stopPress", "o", "isCompleted", "D", "targetTranslationX", "", "duration", "startDelay", "Lkotlin/Function0;", "onEnd", Image.TYPE_HIGH, "animators", "g", "([Lo3b;)V", "onFinishInflate", "changed", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "onLayout", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "performClick", "performLongClick", "j", "onInterceptTouchEvent", "onTouchEvent", "velocityX", "velocityY", "fling", "n", "a", "progresUpdateGap", "b", "I", "touchSlop", com.huawei.hms.opendevice.c.a, "J", "pressedStateDuration", "Landroid/view/VelocityTracker;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Landroid/view/VelocityTracker;", "velocityTracker", "Landroid/animation/ObjectAnimator;", "Lrn5;", "getScrollAnimator", "()Landroid/animation/ObjectAnimator;", "scrollAnimator", "Z", "canPerformSwipeAction", "[Ljava/lang/Float;", "initialRawXArray", "initialRawY", "i", "lastXArray", "dragging", "k", "inLongPress", "isTouchValid", "Landroid/view/View;", "container", "maxLeftSwipeDistance", "maxRightSwipeDistance", "p", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "", "Ljava/util/List;", "swipeActionListeners", "getUseDraggingForLastItem", "()Z", "setUseDraggingForLastItem", "(Z)V", "useDraggingForLastItem", "shouldUseTouch", "getMinLeftActivationDistance", "()F", "minLeftActivationDistance", "getMinRightActivationDistance", "minRightActivationDistance", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RecyclerViewWithSwipeEnd extends RecyclerView {
    public static final a u = new a(null);
    public static final int v = 8;
    private static final float w = kx9.a(20);
    private static float x = 0.8f;
    private static long y = 200;
    private final float a;
    private final int b;
    private final long c;
    @SuppressLint({"Recycle"})
    private final VelocityTracker d;
    private final rn5 e;
    private boolean f;
    private Float[] g;
    private float h;
    private Float[] i;
    private boolean j;
    private boolean k;
    private boolean l;
    private View m;
    private float n;
    private float o;
    private View.OnClickListener p;
    private View.OnLongClickListener q;
    private final List<o3b> r;
    private boolean s;
    private boolean t;

    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/order/feature/personaloffer/presentantion/RecyclerViewWithSwipeEnd$a;", "", "", "resetDelay", "J", "a", "()J", "setResetDelay", "(J)V", "", "COEF_ACTIVATION", "D", "", "DEFAULT_VELOCITY", "I", "FINGER_SIZE", "", "ZERO", "F", "edgeSlop", "minActivationSpeed", "swipeAnimationDuration", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return RecyclerViewWithSwipeEnd.y;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RecyclerViewWithSwipeEnd.this.j(RecyclerViewWithSwipeEnd.u.a());
        }
    }

    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/dodopizza/order/feature/personaloffer/presentantion/RecyclerViewWithSwipeEnd$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends AnimatorListenerAdapter {
        final /* synthetic */ Function0<Unit> a;

        c(Function0<Unit> function0) {
            this.a = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z65.h(animator, "animation");
            this.a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RecyclerViewWithSwipeEnd.this.f = true;
        }
    }

    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "a", "()Landroid/animation/ObjectAnimator;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<ObjectAnimator> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ObjectAnimator invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(RecyclerViewWithSwipeEnd.this, "scrollByX", 0.0f);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            return ofFloat;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo3b;", "animator", "Landroid/view/View;", "view", "", "a", "(Lo3b;Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function2<o3b, View, Unit> {
        public static final f a = new f();

        f() {
            super(2);
        }

        public final void a(o3b o3bVar, View view) {
            z65.h(o3bVar, "animator");
            z65.h(view, "view");
            o3bVar.d(view);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(o3b o3bVar, View view) {
            a(o3bVar, view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecyclerViewWithSwipeEnd.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo3b;", "animator", "Landroid/view/View;", "item", "", "a", "(Lo3b;Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function2<o3b, View, Unit> {
        final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(float f) {
            super(2);
            this.a = f;
        }

        public final void a(o3b o3bVar, View view) {
            z65.h(o3bVar, "animator");
            z65.h(view, "item");
            o3bVar.c(view, this.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(o3b o3bVar, View view) {
            a(o3bVar, view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewWithSwipeEnd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        rn5 b2;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = kx9.a(20);
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = ViewConfiguration.getPressedStateDuration();
        this.d = VelocityTracker.obtain();
        b2 = yn5.b(new e());
        this.e = b2;
        this.f = true;
        Float[] fArr = new Float[10];
        for (int i = 0; i < 10; i++) {
            fArr[i] = Float.valueOf(0.0f);
        }
        this.g = fArr;
        Float[] fArr2 = new Float[10];
        for (int i2 = 0; i2 < 10; i2++) {
            fArr2[i2] = Float.valueOf(0.0f);
        }
        this.i = fArr2;
        this.r = new ArrayList();
        this.s = true;
        this.t = true;
    }

    private final void A() {
        if (isPressed()) {
            E();
        }
    }

    private final void B() {
        View lastItemView = getLastItemView();
        if (lastItemView != null) {
            f(lastItemView, f.a);
        }
    }

    private final void C(float f2, float f3) {
        drawableHotspotChanged(f2, f3);
        setPressed(true);
    }

    private final void D(boolean z) {
        for (o3b o3bVar : this.r) {
            o3bVar.a(z);
        }
    }

    private final void E() {
        setPressed(false);
    }

    private final void F(View view, float f2) {
        f(view, new g(f2));
    }

    private final void e(boolean z) {
        float f2;
        if (!this.f) {
            k(this, 0L, 1, null);
            return;
        }
        this.f = false;
        if (z) {
            f2 = this.o;
        } else {
            f2 = -this.n;
        }
        i(this, f2, 250L, 0L, new b(), 4, null);
    }

    private final void f(View view, Function2<? super o3b, ? super View, Unit> function2) {
        for (o3b o3bVar : this.r) {
            function2.invoke(o3bVar, view);
        }
    }

    private final View getLastItemView() {
        RecyclerView.p layoutManager = getLayoutManager();
        z65.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (getChildCount() <= 0) {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return null;
        }
        return linearLayoutManager.S(getChildCount() - 1);
    }

    private final float getMinLeftActivationDistance() {
        return x * this.n;
    }

    private final float getMinRightActivationDistance() {
        return x * this.o;
    }

    private final ObjectAnimator getScrollAnimator() {
        return (ObjectAnimator) this.e.getValue();
    }

    private final void h(float f2, long j, long j2, Function0<Unit> function0) {
        ObjectAnimator scrollAnimator = getScrollAnimator();
        scrollAnimator.setStartDelay(j2);
        scrollAnimator.setDuration(j);
        scrollAnimator.setFloatValues(f2);
        scrollAnimator.removeAllListeners();
        scrollAnimator.addListener(new c(function0));
        scrollAnimator.start();
    }

    static /* synthetic */ void i(RecyclerViewWithSwipeEnd recyclerViewWithSwipeEnd, float f2, long j, long j2, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        recyclerViewWithSwipeEnd.h(f2, j, j2, function0);
    }

    public static /* synthetic */ void k(RecyclerViewWithSwipeEnd recyclerViewWithSwipeEnd, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        recyclerViewWithSwipeEnd.j(j);
    }

    private final float l(Float[] fArr, Float[] fArr2) {
        int length = fArr2.length;
        float f2 = 0.0f;
        for (int i = 0; i < length; i++) {
            f2 += fArr2[i].floatValue() - fArr[i].floatValue();
        }
        return f2;
    }

    private final boolean m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f2 += motionEvent.getX(i) - this.g[i].floatValue();
        }
        if (Math.abs(f2) <= this.b || !this.l) {
            return false;
        }
        return true;
    }

    private final void o(boolean z) {
        if (z) {
            E();
        }
        if (this.j) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.j = false;
            D(false);
        }
        this.k = false;
    }

    static /* synthetic */ void p(RecyclerViewWithSwipeEnd recyclerViewWithSwipeEnd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        recyclerViewWithSwipeEnd.o(z);
    }

    private final void q(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float x2 = motionEvent.getX();
        float f2 = w;
        boolean z3 = false;
        if (x2 > f2) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getX() < getWidth() - f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        this.l = z3;
    }

    private final void r() {
        boolean z;
        boolean z2 = false;
        o(false);
        this.d.computeCurrentVelocity(100);
        if (Math.abs(this.d.getXVelocity()) > 200.0f) {
            z = true;
        } else {
            z = false;
        }
        View view = null;
        if (z) {
            k(this, 0L, 1, null);
            return;
        }
        View view2 = this.m;
        if (view2 == null) {
            z65.z("container");
            view2 = null;
        }
        if (!u(view2.getTranslationX()) && !z) {
            k(this, 0L, 1, null);
            return;
        }
        View view3 = this.m;
        if (view3 == null) {
            z65.z("container");
        } else {
            view = view3;
        }
        if (view.getTranslationX() > 0.0f) {
            z2 = true;
        }
        e(z2);
    }

    private final boolean s(MotionEvent motionEvent) {
        if (this.k) {
            return false;
        }
        if (!this.j) {
            if (t(motionEvent)) {
                return false;
            }
            this.j = m(motionEvent);
            B();
        }
        if (this.j) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.d.addMovement(motionEvent);
            A();
            y(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            this.i[i] = Float.valueOf(motionEvent.getX(i));
        }
        return this.j;
    }

    private final boolean t(MotionEvent motionEvent) {
        if (Math.abs(motionEvent.getRawY() - this.h) >= this.b) {
            return true;
        }
        return false;
    }

    private final boolean u(float f2) {
        if (f2 < 0.0f) {
            if (f2 < (-getMinLeftActivationDistance())) {
                return true;
            }
        } else if (f2 > 0.0f && f2 > getMinRightActivationDistance()) {
            return true;
        }
        return false;
    }

    private final void v() {
        Float[] fArr = new Float[10];
        for (int i = 0; i < 10; i++) {
            fArr[i] = Float.valueOf(0.0f);
        }
        this.i = fArr;
        Float[] fArr2 = new Float[10];
        for (int i2 = 0; i2 < 10; i2++) {
            fArr2[i2] = Float.valueOf(0.0f);
        }
        this.g = fArr2;
    }

    private final boolean w() {
        int i;
        RecyclerView.p layoutManager = getLayoutManager();
        z65.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int k2 = ((LinearLayoutManager) layoutManager).k2();
        RecyclerView.h adapter = getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount() - 1;
        } else {
            i = 0;
        }
        if (k2 == i && this.t) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(RecyclerViewWithSwipeEnd recyclerViewWithSwipeEnd) {
        z65.h(recyclerViewWithSwipeEnd, "this$0");
        recyclerViewWithSwipeEnd.E();
    }

    private final void y(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        double d2 = 0.0d;
        for (int i = 0; i < pointerCount; i++) {
            d2 += this.i[i].floatValue() - motionEvent.getX(i);
        }
        View lastItemView = getLastItemView();
        if (lastItemView != null) {
            int right = lastItemView.getRight() - getWidth();
            int width = getWidth() - lastItemView.getLeft();
            float a2 = 1 - (right / z99.a(lastItemView));
            if (Math.abs(a2) > 0.8d) {
                this.t = false;
                D(true);
            } else if (width > this.a) {
                F(lastItemView, a2);
            }
        }
        scrollBy((int) d2, 0);
    }

    private final void z(MotionEvent motionEvent) {
        q(motionEvent);
        this.d.clear();
        this.d.addMovement(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            this.i[i] = Float.valueOf(motionEvent.getX(i));
            this.g[i] = Float.valueOf(motionEvent.getX(i));
        }
        this.h = motionEvent.getRawY();
        getScrollAnimator().cancel();
        stopScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        int h;
        h = i.h(i, 1500);
        return super.fling(h, i2);
    }

    public final void g(o3b... o3bVarArr) {
        z65.h(o3bVarArr, "animators");
        for (o3b o3bVar : o3bVarArr) {
            this.r.add(o3bVar);
        }
    }

    public final boolean getUseDraggingForLastItem() {
        return this.s;
    }

    public final void j(long j) {
        h(0.0f, 250L, j, new d());
        smoothScrollBy((int) l(this.g, this.i), 0);
    }

    public final void n() {
        for (o3b o3bVar : this.r) {
            o3bVar.b();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.m = this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        z65.h(motionEvent, com.huawei.hms.push.e.a);
        if (this.s && !w()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action == 5) {
                                z(motionEvent);
                            }
                        }
                    } else {
                        return s(motionEvent);
                    }
                }
                p(this, false, 1, null);
                k(this, 0L, 1, null);
            } else {
                v();
                z(motionEvent);
            }
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.m;
        View view2 = null;
        if (view == null) {
            z65.z("container");
            view = null;
        }
        this.n = z99.a(view) / 2.0f;
        View view3 = this.m;
        if (view3 == null) {
            z65.z("container");
        } else {
            view2 = view3;
        }
        this.o = z99.a(view2) / 2.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        z65.h(motionEvent, com.huawei.hms.push.e.a);
        if (this.s && !w()) {
            int actionMasked = motionEvent.getActionMasked();
            boolean z2 = true;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                z(motionEvent);
                                return true;
                            }
                        } else {
                            p(this, false, 1, null);
                            k(this, 0L, 1, null);
                        }
                    } else {
                        return s(motionEvent);
                    }
                } else {
                    if (isClickable() && this.l) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = (this.j || this.k || t(motionEvent)) ? false : false;
                    if (z && z2) {
                        C(motionEvent.getX(), motionEvent.getY());
                        performClick();
                    }
                    if (isPressed() && !postDelayed(new Runnable() { // from class: y99
                        @Override // java.lang.Runnable
                        public final void run() {
                            RecyclerViewWithSwipeEnd.x(RecyclerViewWithSwipeEnd.this);
                        }
                    }, this.c)) {
                        E();
                    }
                    r();
                }
                return this.j;
            }
            v();
            z(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        View.OnClickListener onClickListener = this.p;
        if (onClickListener == null) {
            return super.performClick();
        }
        super.setOnClickListener(onClickListener);
        boolean performClick = super.performClick();
        super.setOnClickListener(null);
        return performClick;
    }

    @Override // android.view.View
    public boolean performLongClick() {
        View.OnLongClickListener onLongClickListener = this.q;
        if (onLongClickListener == null) {
            return super.performLongClick();
        }
        super.setOnLongClickListener(onLongClickListener);
        boolean performLongClick = super.performLongClick();
        super.setOnLongClickListener(null);
        return performLongClick;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        setClickable(z);
        this.p = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        boolean z;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        setLongClickable(z);
        this.q = onLongClickListener;
    }

    public final void setUseDraggingForLastItem(boolean z) {
        this.s = z;
    }
}
