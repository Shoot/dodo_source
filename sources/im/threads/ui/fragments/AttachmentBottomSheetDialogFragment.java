package im.threads.ui.fragments;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.business.useractivity.UserActivityTime;
import im.threads.business.useractivity.UserActivityTimeProvider;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.views.BottomSheetView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AttachmentBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0002\u001c\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/b;", "Lim/threads/ui/views/BottomSheetView$ButtonsListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "onDetach", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onCameraClick", "onGalleryClick", "onFilePickerClick", "onSendClick", "Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment$Callback;", "callback", "Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment$Callback;", "<init>", "()V", "Companion", "Callback", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class AttachmentBottomSheetDialogFragment extends com.google.android.material.bottomsheet.b implements BottomSheetView.ButtonsListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG;
    private Callback callback;

    /* compiled from: AttachmentBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¨\u0006\b"}, d2 = {"Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment$Callback;", "Lim/threads/ui/views/BottomSheetView$ButtonsListener;", "onBottomSheetDetached", "", "onImageSelectionChanged", "imageList", "", "Landroid/net/Uri;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Callback extends BottomSheetView.ButtonsListener {
        void onBottomSheetDetached();

        void onImageSelectionChanged(List<? extends Uri> list);
    }

    /* compiled from: AttachmentBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return AttachmentBottomSheetDialogFragment.TAG;
        }
    }

    static {
        String simpleName = AttachmentBottomSheetDialogFragment.class.getSimpleName();
        z65.g(simpleName, "AttachmentBottomSheetDia…nt::class.java.simpleName");
        TAG = simpleName;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        if (getParentFragment() instanceof Callback) {
            this.callback = (Callback) getParentFragment();
        } else if (context instanceof Callback) {
            this.callback = (Callback) context;
        }
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onCameraClick() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onCameraClick();
        }
    }

    @Override // com.google.android.material.bottomsheet.b, defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        final Context requireContext = requireContext();
        final int theme = getTheme();
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(requireContext, theme) { // from class: im.threads.ui.fragments.AttachmentBottomSheetDialogFragment$onCreateDialog$dialog$1
            @Override // android.app.Dialog, android.view.Window.Callback
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                z65.h(motionEvent, "ev");
                UserActivityTime lastUserActivityTimeCounter = UserActivityTimeProvider.INSTANCE.getLastUserActivityTimeCounter();
                if (motionEvent.getAction() == 0) {
                    lastUserActivityTimeCounter.updateLastUserActivityTime();
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        Window window = aVar.getWindow();
        if (window != null) {
            window.setFlags(32, 32);
        }
        if (window != null) {
            window.clearFlags(2);
        }
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        View inflate = layoutInflater.inflate(R.layout.ecc_bottom_sheet_dialog_attachment, viewGroup, false);
        BottomSheetView bottomSheetView = (BottomSheetView) inflate.findViewById(R.id.file_input_sheet);
        int i = chatStyle.chatBodyIconsTint;
        if (i == 0) {
            i = chatStyle.attachmentBottomSheetButtonTintResId;
        }
        bottomSheetView.setButtonsTint(i);
        bottomSheetView.setButtonsListener(this);
        Context context = getContext();
        if (context != null) {
            ColorsHelper.setBackgroundColor(context, bottomSheetView, chatStyle.chatMessageInputColor);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        Callback callback = this.callback;
        if (callback != null) {
            callback.onBottomSheetDetached();
        }
        this.callback = null;
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onFilePickerClick() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onFilePickerClick();
        }
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onGalleryClick() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onGalleryClick();
        }
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onSendClick() {
        Callback callback = this.callback;
        if (callback != null) {
            callback.onSendClick();
        }
    }
}
