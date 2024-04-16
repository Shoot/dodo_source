package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.views.BottomSheetView;
/* loaded from: classes3.dex */
public final class EccBottomSheetDialogAttachmentBinding {
    @NonNull
    public final BottomSheetView fileInputSheet;
    @NonNull
    private final LinearLayout rootView;

    private EccBottomSheetDialogAttachmentBinding(@NonNull LinearLayout linearLayout, @NonNull BottomSheetView bottomSheetView) {
        this.rootView = linearLayout;
        this.fileInputSheet = bottomSheetView;
    }

    @NonNull
    public static EccBottomSheetDialogAttachmentBinding bind(@NonNull View view) {
        int i = R.id.file_input_sheet;
        BottomSheetView bottomSheetView = (BottomSheetView) pyb.a(view, i);
        if (bottomSheetView != null) {
            return new EccBottomSheetDialogAttachmentBinding((LinearLayout) view, bottomSheetView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccBottomSheetDialogAttachmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccBottomSheetDialogAttachmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_bottom_sheet_dialog_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
