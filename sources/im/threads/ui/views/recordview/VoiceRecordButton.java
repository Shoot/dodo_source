package im.threads.ui.views.recordview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import kotlin.Metadata;
/* compiled from: VoiceRecordButton.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u001a\u0010 \u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010!\u001a\u00020\u001eH\u0014J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010,\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0015\u0010-\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u000bJ\u0010\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u000bH\u0002J\u0006\u00106\u001a\u00020\u001eJ\u0006\u00107\u001a\u00020\u001eR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lim/threads/ui/views/recordview/VoiceRecordButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnClickListener;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isInLockMode", "", "isListenForRecord", "()Z", "setListenForRecord", "(Z)V", "micIcon", "Landroid/graphics/drawable/Drawable;", "onRecordClickListener", "Lim/threads/ui/views/recordview/VoiceRecordOnRecordClickListener;", "recordView", "Lim/threads/ui/views/recordview/VoiceRecordView;", "scaleAnim", "Lim/threads/ui/views/recordview/VoiceRecordScaleAnim;", "sendClickListener", "sendIcon", "changeIconToRecord", "", "changeIconToSend", "init", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onTouch", "event", "Landroid/view/MotionEvent;", "setClip", "setInLockMode", "inLockMode", "setOnRecordClickListener", "setRecordView", "setScaleUpTo", "scaleTo", "", "(Ljava/lang/Float;)V", "setSendClickListener", "setSendIconResource", "resource", "setTheImageResource", "imageResource", "startScale", "stopScale", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VoiceRecordButton extends AppCompatImageView implements View.OnTouchListener, View.OnClickListener {
    private boolean isInLockMode;
    private boolean isListenForRecord;
    private Drawable micIcon;
    private VoiceRecordOnRecordClickListener onRecordClickListener;
    private VoiceRecordView recordView;
    private VoiceRecordScaleAnim scaleAnim;
    private VoiceRecordOnRecordClickListener sendClickListener;
    private Drawable sendIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordButton(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.isListenForRecord = true;
        init(context, null);
    }

    private final void init(Context context, AttributeSet attributeSet) {
        float f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.VoiceRecordButton);
            z65.g(obtainStyledAttributes, "context.obtainStyledAttr…leable.VoiceRecordButton)");
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.VoiceRecordButton_mic_icon, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.VoiceRecordButton_send_icon, -1);
            f = obtainStyledAttributes.getFloat(R.styleable.VoiceRecordButton_scale_up_to, -1.0f);
            if (resourceId != -1) {
                setTheImageResource(resourceId);
            }
            if (resourceId2 != -1) {
                this.sendIcon = on.b(getContext(), resourceId2);
            }
            obtainStyledAttributes.recycle();
        } else {
            f = 1.0f;
        }
        VoiceRecordScaleAnim voiceRecordScaleAnim = new VoiceRecordScaleAnim(this);
        this.scaleAnim = voiceRecordScaleAnim;
        if (f > 1.0f) {
            voiceRecordScaleAnim.setScaleUpTo(f);
        }
        setOnTouchListener(this);
        setOnClickListener(this);
    }

    private final void setClip(View view) {
        if (view.getParent() == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        if (view.getParent() instanceof View) {
            ViewParent parent = view.getParent();
            z65.f(parent, "null cannot be cast to non-null type android.view.View");
            setClip((View) parent);
        }
    }

    private final void setTheImageResource(int i) {
        Drawable b = on.b(getContext(), i);
        setImageDrawable(b);
        this.micIcon = b;
    }

    public final void changeIconToRecord() {
        Drawable drawable = this.micIcon;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final void changeIconToSend() {
        Drawable drawable = this.sendIcon;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    public final boolean isListenForRecord() {
        return this.isListenForRecord;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClip(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VoiceRecordOnRecordClickListener voiceRecordOnRecordClickListener;
        z65.h(view, "v");
        if (this.isInLockMode && (voiceRecordOnRecordClickListener = this.sendClickListener) != null) {
            z65.e(voiceRecordOnRecordClickListener);
            voiceRecordOnRecordClickListener.onClick(view);
            return;
        }
        VoiceRecordOnRecordClickListener voiceRecordOnRecordClickListener2 = this.onRecordClickListener;
        if (voiceRecordOnRecordClickListener2 != null) {
            voiceRecordOnRecordClickListener2.onClick(view);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VoiceRecordView voiceRecordView;
        z65.h(view, "v");
        z65.h(motionEvent, "event");
        if (this.isListenForRecord) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && (voiceRecordView = this.recordView) != null) {
                        voiceRecordView.onActionMove$threads_release((VoiceRecordButton) view, motionEvent);
                    }
                } else {
                    VoiceRecordView voiceRecordView2 = this.recordView;
                    if (voiceRecordView2 != null) {
                        voiceRecordView2.onActionUp$threads_release();
                    }
                }
            } else {
                VoiceRecordView voiceRecordView3 = this.recordView;
                if (voiceRecordView3 != null) {
                    voiceRecordView3.onActionDown$threads_release((VoiceRecordButton) view);
                }
            }
        }
        return this.isListenForRecord;
    }

    public final void setInLockMode(boolean z) {
        this.isInLockMode = z;
    }

    public final void setListenForRecord(boolean z) {
        this.isListenForRecord = z;
    }

    public final void setOnRecordClickListener(VoiceRecordOnRecordClickListener voiceRecordOnRecordClickListener) {
        this.onRecordClickListener = voiceRecordOnRecordClickListener;
    }

    public final void setRecordView(VoiceRecordView voiceRecordView) {
        this.recordView = voiceRecordView;
        if (voiceRecordView != null) {
            voiceRecordView.setRecordButton$threads_release(this);
        }
    }

    public final void setScaleUpTo(Float f) {
        VoiceRecordScaleAnim voiceRecordScaleAnim = this.scaleAnim;
        if (voiceRecordScaleAnim != null) {
            z65.e(f);
            voiceRecordScaleAnim.setScaleUpTo(f.floatValue());
        }
    }

    public final void setSendClickListener(VoiceRecordOnRecordClickListener voiceRecordOnRecordClickListener) {
        this.sendClickListener = voiceRecordOnRecordClickListener;
    }

    public final void setSendIconResource(int i) {
        this.sendIcon = on.b(getContext(), i);
    }

    public final void startScale() {
        VoiceRecordScaleAnim voiceRecordScaleAnim = this.scaleAnim;
        if (voiceRecordScaleAnim != null) {
            voiceRecordScaleAnim.start();
        }
    }

    public final void stopScale() {
        VoiceRecordScaleAnim voiceRecordScaleAnim = this.scaleAnim;
        if (voiceRecordScaleAnim != null) {
            voiceRecordScaleAnim.stop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.isListenForRecord = true;
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRecordButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.isListenForRecord = true;
        init(context, attributeSet);
    }
}
