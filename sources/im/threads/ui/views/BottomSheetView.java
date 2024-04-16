package im.threads.ui.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import im.threads.R;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.FileHelper;
import im.threads.ui.utils.ViewUtils;
import im.threads.ui.views.BottomSheetView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* loaded from: classes3.dex */
public final class BottomSheetView extends LinearLayout {
    private ButtonsListener buttonsListener;
    private Button camera;
    private final ChatStyle chatStyle;
    private Button file;
    private Button gallery;
    private Button send;
    private final ViewUtils viewUtils;

    /* loaded from: classes3.dex */
    public interface ButtonsListener {
        void onCameraClick();

        void onFilePickerClick();

        void onGalleryClick();

        void onSendClick();
    }

    public BottomSheetView(Context context) {
        super(context);
        this.chatStyle = Config.getInstance().getChatStyle();
        this.viewUtils = new ViewUtils();
        init();
    }

    private static void animateHide(final View view) {
        view.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: im.threads.ui.views.BottomSheetView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void animateShow(View view) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setListener(null);
    }

    private void init() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.ecc_view_bottom_attachment_sheet, (ViewGroup) this, true);
        Button button = (Button) findViewById(R.id.camera);
        this.camera = button;
        this.viewUtils.setCompoundDrawablesWithIntrinsicBoundsCompat(button, this.chatStyle.attachmentCameraIconResId, 1);
        this.camera.setOnClickListener(new View.OnClickListener() { // from class: ze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetView.this.lambda$init$0(view);
            }
        });
        Button button2 = (Button) findViewById(R.id.gallery);
        this.gallery = button2;
        this.viewUtils.setCompoundDrawablesWithIntrinsicBoundsCompat(button2, this.chatStyle.attachmentGalleryIconResId, 1);
        this.gallery.setOnClickListener(new View.OnClickListener() { // from class: af0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetView.this.lambda$init$1(view);
            }
        });
        Button button3 = (Button) findViewById(R.id.file);
        this.file = button3;
        this.viewUtils.setCompoundDrawablesWithIntrinsicBoundsCompat(button3, this.chatStyle.attachmentFileIconResId, 1);
        this.file.setOnClickListener(new View.OnClickListener() { // from class: bf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetView.this.lambda$init$2(view);
            }
        });
        Button button4 = (Button) findViewById(R.id.send);
        this.send = button4;
        this.viewUtils.setCompoundDrawablesWithIntrinsicBoundsCompat(button4, this.chatStyle.attachmentSendIconResId, 1);
        this.send.setOnClickListener(new View.OnClickListener() { // from class: cf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetView.this.lambda$init$3(view);
            }
        });
        FileHelper fileHelper = FileHelper.INSTANCE;
        if (fileHelper.isFileExtensionsEmpty()) {
            this.file.setVisibility(8);
        } else {
            this.file.setVisibility(0);
        }
        if (fileHelper.isJpgAllow()) {
            this.camera.setVisibility(0);
            this.gallery.setVisibility(0);
        } else {
            this.camera.setVisibility(8);
            this.gallery.setVisibility(8);
        }
        setBackgroundColor(getContext().getResources().getColor(17170443));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(View view) {
        ButtonsListener buttonsListener = this.buttonsListener;
        if (buttonsListener != null) {
            buttonsListener.onCameraClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(View view) {
        ButtonsListener buttonsListener = this.buttonsListener;
        if (buttonsListener != null) {
            buttonsListener.onGalleryClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(View view) {
        ButtonsListener buttonsListener = this.buttonsListener;
        if (buttonsListener != null) {
            buttonsListener.onFilePickerClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(View view) {
        ButtonsListener buttonsListener = this.buttonsListener;
        if (buttonsListener != null) {
            buttonsListener.onSendClick();
        }
    }

    public void setButtonsListener(ButtonsListener buttonsListener) {
        this.buttonsListener = buttonsListener;
    }

    public void setButtonsTint(int i) {
        int i2;
        if (i == 0) {
            i2 = this.chatStyle.inputTextColor;
        } else {
            i2 = i;
        }
        int c = iu1.c(getContext(), i2);
        this.file.setTextColor(c);
        this.camera.setTextColor(c);
        this.gallery.setTextColor(c);
        this.send.setTextColor(c);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(this.file.getCompoundDrawables()));
        arrayList.addAll(Arrays.asList(this.camera.getCompoundDrawables()));
        arrayList.addAll(Arrays.asList(this.gallery.getCompoundDrawables()));
        arrayList.addAll(Arrays.asList(this.send.getCompoundDrawables()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ColorsHelper.setDrawableColor(this.file.getContext(), (Drawable) it.next(), i);
        }
    }

    public void showMainItemList() {
        if (this.send.getVisibility() == 0) {
            this.send.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: im.threads.ui.views.BottomSheetView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    BottomSheetView.this.send.setVisibility(8);
                    BottomSheetView.animateShow(BottomSheetView.this.file);
                    BottomSheetView.animateShow(BottomSheetView.this.camera);
                    BottomSheetView.animateShow(BottomSheetView.this.gallery);
                }
            });
        }
    }

    public void showSend() {
        if (this.send.getVisibility() == 8) {
            animateHide(this.camera);
            animateHide(this.gallery);
            this.file.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: im.threads.ui.views.BottomSheetView.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    BottomSheetView.this.file.setVisibility(8);
                    BottomSheetView.animateShow(BottomSheetView.this.send);
                }
            });
        }
    }

    public BottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.chatStyle = Config.getInstance().getChatStyle();
        this.viewUtils = new ViewUtils();
        init();
    }

    public BottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.chatStyle = Config.getInstance().getChatStyle();
        this.viewUtils = new ViewUtils();
        init();
    }
}
