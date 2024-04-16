package im.threads.ui.views.recordview;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.R;
import im.threads.business.utils.ThreadsPermissionChecker;
import im.threads.databinding.EccVoiceRecordViewLayoutBinding;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.views.recordview.VoiceRecordView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VoiceRecordView.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0001qB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010>\u001a\u00020\u00112\u0006\u0010<\u001a\u00020=2\u0006\u0010?\u001a\u00020\rH\u0002J\b\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020AJ\b\u0010C\u001a\u00020AH\u0002J\u0006\u0010D\u001a\u00020AJ\u0006\u0010E\u001a\u00020\rJ\u0006\u0010F\u001a\u00020\u001aJ\u0012\u0010G\u001a\u0004\u0018\u00010\u000f2\u0006\u0010H\u001a\u00020\u0011H\u0002J\"\u0010I\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010J\u001a\u00020AH\u0002J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u001aH\u0002J\u0006\u0010%\u001a\u00020\u0011J\u0017\u0010M\u001a\u0004\u0018\u00010\u000f2\u0006\u0010N\u001a\u00020-H\u0000¢\u0006\u0002\bOJ\u001f\u0010P\u001a\u0004\u0018\u00010\u000f2\u0006\u0010N\u001a\u00020-2\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\bQJ\r\u0010R\u001a\u00020AH\u0000¢\u0006\u0002\bSJ\b\u0010T\u001a\u00020AH\u0016J\b\u0010U\u001a\u00020AH\u0002J\u0014\u0010V\u001a\u0004\u0018\u00010\u000f2\b\u0010N\u001a\u0004\u0018\u00010-H\u0002J\u000e\u0010W\u001a\u00020A2\u0006\u0010\u0012\u001a\u00020\rJ\u0018\u0010W\u001a\u00020A2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010X\u001a\u00020\u0011H\u0002J\u0012\u0010Y\u001a\u0004\u0018\u00010\u000f2\u0006\u0010Z\u001a\u00020\nH\u0002J\u0012\u0010[\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\\\u001a\u00020\nH\u0002J\u000e\u0010]\u001a\u00020A2\u0006\u0010^\u001a\u00020\u0011J\u0012\u0010_\u001a\u0004\u0018\u00010\u000f2\u0006\u0010Z\u001a\u00020\nH\u0002J\u0010\u0010`\u001a\u00020A2\b\u0010a\u001a\u0004\u0018\u00010bJ\u0010\u0010c\u001a\u00020A2\b\u0010/\u001a\u0004\u0018\u000100J\u0017\u0010d\u001a\u00020A2\b\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0002\beJ\u000e\u0010f\u001a\u00020A2\u0006\u0010g\u001a\u00020\u0011J\u0012\u0010h\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\\\u001a\u00020\nH\u0002J\u0012\u0010i\u001a\u0004\u0018\u00010\u000f2\b\u0010j\u001a\u0004\u0018\u00010kJ\u0010\u0010l\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\\\u001a\u00020\nJ\u0010\u0010m\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\\\u001a\u00020\nJ\u000e\u0010n\u001a\u00020A2\u0006\u00108\u001a\u00020\u001aJ\n\u0010o\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010p\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u000e\u0010'\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006r"}, d2 = {"Lim/threads/ui/views/recordview/VoiceRecordView;", "Landroid/widget/RelativeLayout;", "Lim/threads/ui/views/recordview/VoiceRecordLockViewListener;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "basketInitialY", "", "binding", "Lim/threads/databinding/EccVoiceRecordViewLayoutBinding;", "canRecord", "", "cancelBounds", "getCancelBounds$threads_release", "()F", "setCancelBounds$threads_release", "(F)V", "currentYFraction", "difX", "elapsedTime", "", "fractionReached", "handler", "Landroid/os/Handler;", "initialRecordButtonX", "initialRecordButtonY", "isLessThanSecondAllowed", "isLockAndRecordButtonHaveSameParent", "()Z", "isLockEnabled", "isLockInSameParent", "isRecordButtonGrowingAnimationEnabled", "isRecordPermissionGranted", "isShimmerEffectEnabled", "isSwiped", "isTimeLimitValid", "player", "Landroid/media/MediaPlayer;", "recordButton", "Lim/threads/ui/views/recordview/VoiceRecordButton;", "recordButtonYInWindow", "recordListener", "Lim/threads/ui/views/recordview/VoiceOnRecordListener;", "recordLockView", "Lim/threads/ui/views/recordview/VoiceRecordLockView;", "recordLockXInWindow", "recordLockYInWindow", "runnable", "Ljava/lang/Runnable;", "startTime", "timeLimit", "voiceRecordAnimationHelper", "Lim/threads/ui/views/recordview/VoiceRecordAnimationHelper;", "canMoveX", "motionEvent", "Landroid/view/MotionEvent;", "canMoveY", "dif", "cancelAndDeleteRecord", "", "cancelRecord", "finishAndSaveRecord", "finishRecord", "getCancelBounds", "getTimeLimit", "hideViews", "hideSmallMic", "init", "initTimeLimitHandler", "isLessThanOneSecond", CrashHianalyticsData.TIME, "onActionDown", "recordBtn", "onActionDown$threads_release", "onActionMove", "onActionMove$threads_release", "onActionUp", "onActionUp$threads_release", "onFractionReached", "removeTimeLimitCallbacks", "resetRecord", "setCancelBounds", "convertDpToPixel", "setCancelMarginRight", "marginRight", "setChronometerCounterTimeColor", RemoteMessageConst.Notification.COLOR, "setLessThanSecondAllowed", "isAllowed", "setMarginRight", "setOnBasketAnimationEndListener", "onBasketAnimationEndListener", "Lim/threads/ui/views/recordview/VoiceRecordOnBasketAnimationEnd;", "setOnRecordListener", "setRecordButton", "setRecordButton$threads_release", "setRecordButtonGrowingAnimationEnabled", "recordButtonGrowingAnimationEnabled", "setSlideToCancelArrowColor", "setSlideToCancelText", "text", "", "setSlideToCancelTextColor", "setSmallMicColor", "setTimeLimit", "showViews", "switchToLockedMode", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VoiceRecordView extends RelativeLayout implements VoiceRecordLockViewListener {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_CANCEL_BOUNDS = 8;
    private float basketInitialY;
    private EccVoiceRecordViewLayoutBinding binding;
    private boolean canRecord;
    private float cancelBounds;
    private Context context;
    private float currentYFraction;
    private float difX;
    private long elapsedTime;
    private boolean fractionReached;
    private Handler handler;
    private float initialRecordButtonX;
    private float initialRecordButtonY;
    private boolean isLessThanSecondAllowed;
    private boolean isLockEnabled;
    private boolean isLockInSameParent;
    private boolean isRecordButtonGrowingAnimationEnabled;
    private boolean isShimmerEffectEnabled;
    private boolean isSwiped;
    private final MediaPlayer player;
    private VoiceRecordButton recordButton;
    private float recordButtonYInWindow;
    private VoiceOnRecordListener recordListener;
    private VoiceRecordLockView recordLockView;
    private float recordLockXInWindow;
    private float recordLockYInWindow;
    private Runnable runnable;
    private long startTime;
    private long timeLimit;
    private VoiceRecordAnimationHelper voiceRecordAnimationHelper;

    /* compiled from: VoiceRecordView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lim/threads/ui/views/recordview/VoiceRecordView$Companion;", "", "()V", "DEFAULT_CANCEL_BOUNDS", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordView(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.cancelBounds = 8.0f;
        this.isRecordButtonGrowingAnimationEnabled = true;
        this.isShimmerEffectEnabled = true;
        this.timeLimit = -1L;
        this.canRecord = true;
        this.context = context;
        init(context, null, 0);
    }

    private final boolean canMoveX(MotionEvent motionEvent) {
        if (motionEvent.getRawX() >= this.initialRecordButtonX) {
            return false;
        }
        if (this.isLockEnabled && this.currentYFraction > 0.3d) {
            return false;
        }
        return true;
    }

    private final boolean canMoveY(MotionEvent motionEvent, float f) {
        if (!this.isLockEnabled) {
            return false;
        }
        if (this.isLockInSameParent) {
            if (motionEvent.getRawY() >= this.initialRecordButtonY || motionEvent.getRawX() < this.recordLockXInWindow) {
                return false;
            }
        } else if (f > this.initialRecordButtonY || motionEvent.getRawX() < this.recordLockXInWindow) {
            return false;
        }
        return true;
    }

    private final void cancelAndDeleteRecord() {
        if (isTimeLimitValid()) {
            removeTimeLimitCallbacks();
        }
        this.isSwiped = true;
        VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
        if (voiceRecordAnimationHelper != null) {
            voiceRecordAnimationHelper.setStartRecorded(false);
        }
        VoiceOnRecordListener voiceOnRecordListener = this.recordListener;
        if (voiceOnRecordListener != null) {
            voiceOnRecordListener.onCancel();
        }
        resetRecord(this.recordButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAndSaveRecord() {
        long currentTimeMillis = System.currentTimeMillis() - this.startTime;
        this.elapsedTime = currentTimeMillis;
        if (!this.isLessThanSecondAllowed && isLessThanOneSecond(currentTimeMillis) && !this.isSwiped) {
            VoiceOnRecordListener voiceOnRecordListener = this.recordListener;
            if (voiceOnRecordListener != null) {
                voiceOnRecordListener.onLessThanSecond();
            }
            removeTimeLimitCallbacks();
            VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
            if (voiceRecordAnimationHelper != null) {
                voiceRecordAnimationHelper.setStartRecorded(false);
            }
        } else {
            VoiceOnRecordListener voiceOnRecordListener2 = this.recordListener;
            if (voiceOnRecordListener2 != null && !this.isSwiped) {
                z65.e(voiceOnRecordListener2);
                voiceOnRecordListener2.onFinish(this.elapsedTime, false);
            }
            removeTimeLimitCallbacks();
            VoiceRecordAnimationHelper voiceRecordAnimationHelper2 = this.voiceRecordAnimationHelper;
            if (voiceRecordAnimationHelper2 != null) {
                voiceRecordAnimationHelper2.setStartRecorded(false);
            }
        }
        resetRecord(this.recordButton);
    }

    private final EccVoiceRecordViewLayoutBinding hideViews(boolean z) {
        VoiceRecordLockView voiceRecordLockView;
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.slideToCancelLayout.setVisibility(8);
            eccVoiceRecordViewLayoutBinding.counterTime.setVisibility(8);
            eccVoiceRecordViewLayoutBinding.cancelTextView.setVisibility(8);
            if (this.isLockEnabled && (voiceRecordLockView = this.recordLockView) != null && voiceRecordLockView != null) {
                voiceRecordLockView.setVisibility(8);
            }
            if (z) {
                eccVoiceRecordViewLayoutBinding.smallBlinkingMic.setVisibility(8);
                return eccVoiceRecordViewLayoutBinding;
            }
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    private final void init(Context context, AttributeSet attributeSet, int i) {
        EccVoiceRecordViewLayoutBinding inflate = EccVoiceRecordViewLayoutBinding.inflate(LayoutInflater.from(context));
        this.binding = inflate;
        if (inflate != null) {
            addView(inflate.getRoot());
            ViewParent parent = inflate.getRoot().getParent();
            z65.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setClipChildren(false);
            hideViews(true);
            if (attributeSet != null && i == 0) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.VoiceRecordView, i, 0);
                z65.g(obtainStyledAttributes, "context.obtainStyledAttr…      0\n                )");
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.VoiceRecordView_slide_to_cancel_arrow, -1);
                String string = obtainStyledAttributes.getString(R.styleable.VoiceRecordView_slide_to_cancel_text);
                int dimension = (int) obtainStyledAttributes.getDimension(R.styleable.VoiceRecordView_slide_to_cancel_margin_right, 30.0f);
                int color = obtainStyledAttributes.getColor(R.styleable.VoiceRecordView_counter_time_color, -1);
                int color2 = obtainStyledAttributes.getColor(R.styleable.VoiceRecordView_slide_to_cancel_arrow_color, -1);
                String string2 = obtainStyledAttributes.getString(R.styleable.VoiceRecordView_cancel_text);
                int dimension2 = (int) obtainStyledAttributes.getDimension(R.styleable.VoiceRecordView_cancel_text_margin_right, 30.0f);
                int color3 = obtainStyledAttributes.getColor(R.styleable.VoiceRecordView_cancel_text_color, -1);
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.VoiceRecordView_slide_to_cancel_bounds, -1);
                if (dimensionPixelSize != -1) {
                    setCancelBounds(dimensionPixelSize, false);
                }
                if (resourceId != -1) {
                    inflate.arrow.setImageDrawable(on.b(getContext(), resourceId));
                }
                if (string != null) {
                    inflate.slideToCancel.setText(string);
                }
                if (color != -1) {
                    setChronometerCounterTimeColor(color);
                }
                if (color2 != -1) {
                    setSlideToCancelArrowColor(color2);
                }
                if (string2 != null) {
                    inflate.cancelTextView.setText(string2);
                }
                if (color3 != -1) {
                    inflate.cancelTextView.setTextColor(color3);
                }
                setMarginRight(dimension);
                setCancelMarginRight(dimension2);
                obtainStyledAttributes.recycle();
            }
            this.voiceRecordAnimationHelper = new VoiceRecordAnimationHelper(context, inflate.basketImg, inflate.smallBlinkingMic, this.isRecordButtonGrowingAnimationEnabled);
            inflate.cancelTextView.setOnClickListener(new View.OnClickListener() { // from class: h2c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceRecordView.init$lambda$1$lambda$0(VoiceRecordView.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1$lambda$0(VoiceRecordView voiceRecordView, View view) {
        z65.h(voiceRecordView, "this$0");
        VoiceRecordAnimationHelper voiceRecordAnimationHelper = voiceRecordView.voiceRecordAnimationHelper;
        if (voiceRecordAnimationHelper != null) {
            voiceRecordAnimationHelper.animateBasket(voiceRecordView.basketInitialY);
        }
        voiceRecordView.cancelAndDeleteRecord();
    }

    private final void initTimeLimitHandler() {
        this.handler = new Handler(Looper.getMainLooper());
        this.runnable = new Runnable() { // from class: g2c
            @Override // java.lang.Runnable
            public final void run() {
                VoiceRecordView.initTimeLimitHandler$lambda$2(VoiceRecordView.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTimeLimitHandler$lambda$2(VoiceRecordView voiceRecordView) {
        VoiceOnRecordListener voiceOnRecordListener;
        z65.h(voiceRecordView, "this$0");
        if (!voiceRecordView.isSwiped && (voiceOnRecordListener = voiceRecordView.recordListener) != null) {
            voiceOnRecordListener.onFinish(voiceRecordView.elapsedTime, true);
        }
        voiceRecordView.removeTimeLimitCallbacks();
        VoiceRecordAnimationHelper voiceRecordAnimationHelper = voiceRecordView.voiceRecordAnimationHelper;
        if (voiceRecordAnimationHelper != null) {
            voiceRecordAnimationHelper.setStartRecorded(false);
        }
        VoiceRecordButton voiceRecordButton = voiceRecordView.recordButton;
        if (voiceRecordButton != null) {
            voiceRecordView.resetRecord(voiceRecordButton);
        }
        voiceRecordView.isSwiped = true;
    }

    private final boolean isLessThanOneSecond(long j) {
        if (j <= 1000) {
            return true;
        }
        return false;
    }

    private final boolean isLockAndRecordButtonHaveSameParent() {
        ViewParent viewParent;
        VoiceRecordLockView voiceRecordLockView = this.recordLockView;
        if (voiceRecordLockView == null) {
            return false;
        }
        ViewParent viewParent2 = null;
        if (voiceRecordLockView != null) {
            viewParent = voiceRecordLockView.getParent();
        } else {
            viewParent = null;
        }
        VoiceRecordButton voiceRecordButton = this.recordButton;
        if (voiceRecordButton != null) {
            viewParent2 = voiceRecordButton.getParent();
        }
        if (viewParent == null || viewParent2 == null || viewParent != viewParent2) {
            return false;
        }
        return true;
    }

    private final boolean isRecordPermissionGranted() {
        return ThreadsPermissionChecker.isRecordAudioPermissionGranted(this.context);
    }

    private final boolean isTimeLimitValid() {
        if (this.timeLimit > 0) {
            return true;
        }
        return false;
    }

    private final void removeTimeLimitCallbacks() {
        Runnable runnable;
        Handler handler;
        if (isTimeLimitValid() && (runnable = this.runnable) != null && (handler = this.handler) != null) {
            z65.e(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    private final EccVoiceRecordViewLayoutBinding resetRecord(VoiceRecordButton voiceRecordButton) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            hideViews(!this.isSwiped);
            this.fractionReached = false;
            if (!this.isSwiped) {
                VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
                z65.e(voiceRecordAnimationHelper);
                voiceRecordAnimationHelper.clearAlphaAnimation(true);
            }
            VoiceRecordAnimationHelper voiceRecordAnimationHelper2 = this.voiceRecordAnimationHelper;
            if (voiceRecordAnimationHelper2 != null) {
                voiceRecordAnimationHelper2.moveRecordButtonAndSlideToCancelBack(voiceRecordButton, eccVoiceRecordViewLayoutBinding.slideToCancelLayout, this.initialRecordButtonX, this.initialRecordButtonY, this.difX, this.isLockEnabled);
            }
            eccVoiceRecordViewLayoutBinding.counterTime.stop();
            if (this.isShimmerEffectEnabled) {
                eccVoiceRecordViewLayoutBinding.slideToCancelLayout.stopShimmerAnimation();
            }
            if (this.isLockEnabled) {
                VoiceRecordLockView voiceRecordLockView = this.recordLockView;
                if (voiceRecordLockView != null) {
                    voiceRecordLockView.reset();
                }
                if (voiceRecordButton != null) {
                    voiceRecordButton.changeIconToRecord();
                }
            }
            eccVoiceRecordViewLayoutBinding.cancelTextView.setVisibility(8);
            if (voiceRecordButton != null) {
                voiceRecordButton.setListenForRecord(true);
            }
            if (voiceRecordButton != null) {
                voiceRecordButton.setInLockMode(false);
                return eccVoiceRecordViewLayoutBinding;
            }
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    private final EccVoiceRecordViewLayoutBinding setCancelMarginRight(int i) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            ViewGroup.LayoutParams layoutParams = eccVoiceRecordViewLayoutBinding.slideToCancelLayout.getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.rightMargin = (int) ViewExtensionsKt.dpToPx(this.context, i);
            eccVoiceRecordViewLayoutBinding.cancelTextView.setLayoutParams(layoutParams2);
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    private final EccVoiceRecordViewLayoutBinding setChronometerCounterTimeColor(int i) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.counterTime.setTextColor(i);
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    private final EccVoiceRecordViewLayoutBinding setMarginRight(int i) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            ViewGroup.LayoutParams layoutParams = eccVoiceRecordViewLayoutBinding.slideToCancelLayout.getLayoutParams();
            z65.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.rightMargin = (int) ViewExtensionsKt.dpToPx(this.context, i);
            eccVoiceRecordViewLayoutBinding.slideToCancelLayout.setLayoutParams(layoutParams2);
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    private final EccVoiceRecordViewLayoutBinding setSlideToCancelArrowColor(int i) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.arrow.setColorFilter(i);
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    private final EccVoiceRecordViewLayoutBinding showViews() {
        VoiceRecordLockView voiceRecordLockView;
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.slideToCancelLayout.setVisibility(0);
            eccVoiceRecordViewLayoutBinding.smallBlinkingMic.setVisibility(0);
            eccVoiceRecordViewLayoutBinding.counterTime.setVisibility(0);
            if (this.isLockEnabled && (voiceRecordLockView = this.recordLockView) != null) {
                voiceRecordLockView.setVisibility(0);
                return eccVoiceRecordViewLayoutBinding;
            }
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    private final EccVoiceRecordViewLayoutBinding switchToLockedMode() {
        VoiceRecordButton voiceRecordButton;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator x;
        ViewPropertyAnimator y;
        ViewPropertyAnimator duration;
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.cancelTextView.setVisibility(0);
            eccVoiceRecordViewLayoutBinding.slideToCancelLayout.setVisibility(8);
            VoiceRecordButton voiceRecordButton2 = this.recordButton;
            if (voiceRecordButton2 != null && (animate = voiceRecordButton2.animate()) != null && (x = animate.x(this.initialRecordButtonX)) != null && (y = x.y(this.initialRecordButtonY)) != null && (duration = y.setDuration(100L)) != null) {
                duration.start();
            }
            if (this.isRecordButtonGrowingAnimationEnabled && (voiceRecordButton = this.recordButton) != null) {
                voiceRecordButton.stopScale();
            }
            VoiceRecordButton voiceRecordButton3 = this.recordButton;
            if (voiceRecordButton3 != null) {
                voiceRecordButton3.setListenForRecord(false);
            }
            VoiceRecordButton voiceRecordButton4 = this.recordButton;
            if (voiceRecordButton4 != null) {
                voiceRecordButton4.setInLockMode(true);
            }
            VoiceRecordButton voiceRecordButton5 = this.recordButton;
            if (voiceRecordButton5 != null) {
                voiceRecordButton5.changeIconToSend();
                return eccVoiceRecordViewLayoutBinding;
            }
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    public final void cancelRecord() {
        hideViews(true);
        VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
        z65.e(voiceRecordAnimationHelper);
        voiceRecordAnimationHelper.clearAlphaAnimation(false);
        cancelAndDeleteRecord();
    }

    public final void finishRecord() {
        finishAndSaveRecord();
    }

    public final float getCancelBounds() {
        return this.cancelBounds;
    }

    public final float getCancelBounds$threads_release() {
        return this.cancelBounds;
    }

    public final long getTimeLimit() {
        return this.timeLimit;
    }

    public final boolean isRecordButtonGrowingAnimationEnabled() {
        return this.isRecordButtonGrowingAnimationEnabled;
    }

    public final EccVoiceRecordViewLayoutBinding onActionDown$threads_release(VoiceRecordButton voiceRecordButton) {
        float f;
        float f2;
        float f3;
        z65.h(voiceRecordButton, "recordBtn");
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            if (isRecordPermissionGranted()) {
                VoiceOnRecordListener voiceOnRecordListener = this.recordListener;
                if (voiceOnRecordListener != null) {
                    voiceOnRecordListener.onStart();
                }
                if (isTimeLimitValid() && this.runnable != null) {
                    removeTimeLimitCallbacks();
                    Handler handler = this.handler;
                    if (handler != null) {
                        Runnable runnable = this.runnable;
                        z65.e(runnable);
                        handler.postDelayed(runnable, this.timeLimit);
                    }
                }
                VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
                if (voiceRecordAnimationHelper != null) {
                    voiceRecordAnimationHelper.setStartRecorded(true);
                }
                VoiceRecordAnimationHelper voiceRecordAnimationHelper2 = this.voiceRecordAnimationHelper;
                if (voiceRecordAnimationHelper2 != null) {
                    voiceRecordAnimationHelper2.resetBasketAnimation();
                }
                VoiceRecordAnimationHelper voiceRecordAnimationHelper3 = this.voiceRecordAnimationHelper;
                if (voiceRecordAnimationHelper3 != null) {
                    voiceRecordAnimationHelper3.resetSmallMic();
                }
                if (this.isRecordButtonGrowingAnimationEnabled) {
                    voiceRecordButton.startScale();
                }
                if (this.isShimmerEffectEnabled) {
                    eccVoiceRecordViewLayoutBinding.slideToCancelLayout.ensureAnimationStarted();
                }
                this.initialRecordButtonX = voiceRecordButton.getX();
                int[] iArr = new int[2];
                voiceRecordButton.getLocationInWindow(iArr);
                VoiceRecordButton voiceRecordButton2 = this.recordButton;
                if (voiceRecordButton2 != null) {
                    f = voiceRecordButton2.getY();
                } else {
                    f = 0.0f;
                }
                this.initialRecordButtonY = f;
                if (this.isLockEnabled && this.recordLockView != null) {
                    this.isLockInSameParent = isLockAndRecordButtonHaveSameParent();
                    int[] iArr2 = new int[2];
                    VoiceRecordLockView voiceRecordLockView = this.recordLockView;
                    if (voiceRecordLockView != null) {
                        voiceRecordLockView.getLocationInWindow(iArr2);
                    }
                    this.recordLockXInWindow = iArr2[0];
                    if (this.isLockInSameParent) {
                        VoiceRecordLockView voiceRecordLockView2 = this.recordLockView;
                        if (voiceRecordLockView2 != null) {
                            f2 = voiceRecordLockView2.getY();
                        } else {
                            f2 = 0.0f;
                        }
                    } else {
                        f2 = iArr2[1];
                    }
                    this.recordLockYInWindow = f2;
                    if (this.isLockInSameParent) {
                        VoiceRecordButton voiceRecordButton3 = this.recordButton;
                        if (voiceRecordButton3 != null) {
                            f3 = voiceRecordButton3.getY();
                        } else {
                            f3 = 0.0f;
                        }
                    } else {
                        f3 = iArr[1];
                    }
                    this.recordButtonYInWindow = f3;
                }
                this.basketInitialY = eccVoiceRecordViewLayoutBinding.basketImg.getY() + 90;
                showViews();
                VoiceRecordAnimationHelper voiceRecordAnimationHelper4 = this.voiceRecordAnimationHelper;
                if (voiceRecordAnimationHelper4 != null) {
                    voiceRecordAnimationHelper4.animateSmallMicAlpha();
                }
                eccVoiceRecordViewLayoutBinding.counterTime.setBase(SystemClock.elapsedRealtime());
                this.startTime = System.currentTimeMillis();
                eccVoiceRecordViewLayoutBinding.counterTime.start();
                this.isSwiped = false;
                this.currentYFraction = 0.0f;
                return eccVoiceRecordViewLayoutBinding;
            }
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    public final EccVoiceRecordViewLayoutBinding onActionMove$threads_release(VoiceRecordButton voiceRecordButton, MotionEvent motionEvent) {
        float rawY;
        ViewPropertyAnimator x;
        ViewPropertyAnimator duration;
        z65.h(voiceRecordButton, "recordBtn");
        z65.h(motionEvent, "motionEvent");
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            if (this.canRecord && !this.fractionReached) {
                long currentTimeMillis = System.currentTimeMillis() - this.startTime;
                if (!this.isSwiped) {
                    float x2 = eccVoiceRecordViewLayoutBinding.slideToCancelLayout.getX();
                    int right = eccVoiceRecordViewLayoutBinding.counterTime.getRight();
                    if (x2 != 0.0f && x2 <= right + this.cancelBounds) {
                        if (isLessThanOneSecond(currentTimeMillis)) {
                            hideViews(true);
                            VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
                            if (voiceRecordAnimationHelper != null) {
                                voiceRecordAnimationHelper.clearAlphaAnimation(false);
                            }
                            VoiceRecordAnimationHelper voiceRecordAnimationHelper2 = this.voiceRecordAnimationHelper;
                            if (voiceRecordAnimationHelper2 != null) {
                                voiceRecordAnimationHelper2.onAnimationEnd();
                            }
                        } else {
                            hideViews(false);
                            VoiceRecordAnimationHelper voiceRecordAnimationHelper3 = this.voiceRecordAnimationHelper;
                            if (voiceRecordAnimationHelper3 != null) {
                                voiceRecordAnimationHelper3.animateBasket(this.basketInitialY);
                            }
                        }
                        VoiceRecordAnimationHelper voiceRecordAnimationHelper4 = this.voiceRecordAnimationHelper;
                        if (voiceRecordAnimationHelper4 != null) {
                            voiceRecordAnimationHelper4.moveRecordButtonAndSlideToCancelBack(voiceRecordButton, eccVoiceRecordViewLayoutBinding.slideToCancelLayout, this.initialRecordButtonX, this.initialRecordButtonY, this.difX, this.isLockEnabled);
                        }
                        eccVoiceRecordViewLayoutBinding.counterTime.stop();
                        if (this.isShimmerEffectEnabled) {
                            eccVoiceRecordViewLayoutBinding.slideToCancelLayout.stopShimmerAnimation();
                        }
                        this.isSwiped = true;
                        VoiceRecordAnimationHelper voiceRecordAnimationHelper5 = this.voiceRecordAnimationHelper;
                        if (voiceRecordAnimationHelper5 != null) {
                            voiceRecordAnimationHelper5.setStartRecorded(false);
                        }
                        VoiceOnRecordListener voiceOnRecordListener = this.recordListener;
                        if (voiceOnRecordListener != null) {
                            voiceOnRecordListener.onCancel();
                        }
                        if (isTimeLimitValid()) {
                            removeTimeLimitCallbacks();
                            return eccVoiceRecordViewLayoutBinding;
                        }
                        return eccVoiceRecordViewLayoutBinding;
                    }
                    if (canMoveX(motionEvent)) {
                        voiceRecordButton.animate().x(motionEvent.getRawX()).setDuration(0L).start();
                        if (this.difX == 0.0f) {
                            this.difX = this.initialRecordButtonX - x2;
                        }
                        ViewPropertyAnimator animate = eccVoiceRecordViewLayoutBinding.slideToCancelLayout.animate();
                        if (animate != null && (x = animate.x(motionEvent.getRawX() - this.difX)) != null && (duration = x.setDuration(0L)) != null) {
                            duration.start();
                        }
                    }
                    if (this.isLockInSameParent) {
                        rawY = motionEvent.getRawY();
                    } else {
                        rawY = motionEvent.getRawY() - this.recordButtonYInWindow;
                    }
                    if (canMoveY(motionEvent, rawY)) {
                        voiceRecordButton.animate().y(rawY).setDuration(0L).start();
                        float rawY2 = motionEvent.getRawY();
                        float f = this.recordLockYInWindow;
                        float f2 = 1;
                        float f3 = f2 - ((rawY2 - f) / (this.recordButtonYInWindow - f));
                        this.currentYFraction = f3;
                        VoiceRecordLockView voiceRecordLockView = this.recordLockView;
                        if (voiceRecordLockView != null) {
                            voiceRecordLockView.animateLock(f3);
                        }
                        if (this.isRecordButtonGrowingAnimationEnabled) {
                            float f4 = (f2 - f3) + f2;
                            voiceRecordButton.animate().scaleX(f4).scaleY(f4).setDuration(0L).start();
                            return eccVoiceRecordViewLayoutBinding;
                        }
                        return eccVoiceRecordViewLayoutBinding;
                    }
                    return eccVoiceRecordViewLayoutBinding;
                }
                return eccVoiceRecordViewLayoutBinding;
            }
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    public final void onActionUp$threads_release() {
        if (this.canRecord && !this.fractionReached) {
            finishAndSaveRecord();
        }
    }

    @Override // im.threads.ui.views.recordview.VoiceRecordLockViewListener
    public void onFractionReached() {
        this.fractionReached = true;
        switchToLockedMode();
        VoiceOnRecordListener voiceOnRecordListener = this.recordListener;
        if (voiceOnRecordListener != null) {
            voiceOnRecordListener.onLock();
        }
    }

    public final void setCancelBounds(float f) {
        setCancelBounds(f, true);
    }

    public final void setCancelBounds$threads_release(float f) {
        this.cancelBounds = f;
    }

    public final void setLessThanSecondAllowed(boolean z) {
        this.isLessThanSecondAllowed = z;
    }

    public final void setOnBasketAnimationEndListener(VoiceRecordOnBasketAnimationEnd voiceRecordOnBasketAnimationEnd) {
        VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
        if (voiceRecordAnimationHelper != null) {
            voiceRecordAnimationHelper.setOnBasketAnimationEndListener(voiceRecordOnBasketAnimationEnd);
        }
    }

    public final void setOnRecordListener(VoiceOnRecordListener voiceOnRecordListener) {
        this.recordListener = voiceOnRecordListener;
    }

    public final void setRecordButton$threads_release(VoiceRecordButton voiceRecordButton) {
        this.recordButton = voiceRecordButton;
        if (voiceRecordButton != null) {
            voiceRecordButton.setSendClickListener(new VoiceRecordOnRecordClickListener() { // from class: im.threads.ui.views.recordview.VoiceRecordView$setRecordButton$1
                @Override // im.threads.ui.views.recordview.VoiceRecordOnRecordClickListener
                public void onClick(View view) {
                    VoiceRecordView.this.finishAndSaveRecord();
                }
            });
        }
    }

    public final void setRecordButtonGrowingAnimationEnabled(boolean z) {
        this.isRecordButtonGrowingAnimationEnabled = z;
        VoiceRecordAnimationHelper voiceRecordAnimationHelper = this.voiceRecordAnimationHelper;
        z65.e(voiceRecordAnimationHelper);
        voiceRecordAnimationHelper.setRecordButtonGrowingAnimationEnabled(z);
    }

    public final EccVoiceRecordViewLayoutBinding setSlideToCancelText(String str) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.slideToCancel.setText(str);
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    public final EccVoiceRecordViewLayoutBinding setSlideToCancelTextColor(int i) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.slideToCancel.setTextColor(i);
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    public final EccVoiceRecordViewLayoutBinding setSmallMicColor(int i) {
        EccVoiceRecordViewLayoutBinding eccVoiceRecordViewLayoutBinding = this.binding;
        if (eccVoiceRecordViewLayoutBinding != null) {
            eccVoiceRecordViewLayoutBinding.smallBlinkingMic.setColorFilter(i);
            return eccVoiceRecordViewLayoutBinding;
        }
        return null;
    }

    public final void setTimeLimit(long j) {
        this.timeLimit = j;
        if (this.handler != null && this.runnable != null) {
            removeTimeLimitCallbacks();
        }
        initTimeLimitHandler();
    }

    private final void setCancelBounds(float f, boolean z) {
        if (z) {
            f = ViewExtensionsKt.dpToPx(this.context, (int) f);
        }
        this.cancelBounds = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.cancelBounds = 8.0f;
        this.isRecordButtonGrowingAnimationEnabled = true;
        this.isShimmerEffectEnabled = true;
        this.timeLimit = -1L;
        this.canRecord = true;
        this.context = context;
        init(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.cancelBounds = 8.0f;
        this.isRecordButtonGrowingAnimationEnabled = true;
        this.isShimmerEffectEnabled = true;
        this.timeLimit = -1L;
        this.canRecord = true;
        this.context = context;
        init(context, attributeSet, i);
    }
}
