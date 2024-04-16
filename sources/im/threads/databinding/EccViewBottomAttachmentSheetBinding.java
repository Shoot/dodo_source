package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.CustomFontButton;
/* loaded from: classes3.dex */
public final class EccViewBottomAttachmentSheetBinding {
    @NonNull
    public final CustomFontButton camera;
    @NonNull
    public final CustomFontButton file;
    @NonNull
    public final CustomFontButton gallery;
    @NonNull
    private final View rootView;
    @NonNull
    public final CustomFontButton send;

    private EccViewBottomAttachmentSheetBinding(@NonNull View view, @NonNull CustomFontButton customFontButton, @NonNull CustomFontButton customFontButton2, @NonNull CustomFontButton customFontButton3, @NonNull CustomFontButton customFontButton4) {
        this.rootView = view;
        this.camera = customFontButton;
        this.file = customFontButton2;
        this.gallery = customFontButton3;
        this.send = customFontButton4;
    }

    @NonNull
    public static EccViewBottomAttachmentSheetBinding bind(@NonNull View view) {
        int i = R.id.camera;
        CustomFontButton customFontButton = (CustomFontButton) pyb.a(view, i);
        if (customFontButton != null) {
            i = R.id.file;
            CustomFontButton customFontButton2 = (CustomFontButton) pyb.a(view, i);
            if (customFontButton2 != null) {
                i = R.id.gallery;
                CustomFontButton customFontButton3 = (CustomFontButton) pyb.a(view, i);
                if (customFontButton3 != null) {
                    i = R.id.send;
                    CustomFontButton customFontButton4 = (CustomFontButton) pyb.a(view, i);
                    if (customFontButton4 != null) {
                        return new EccViewBottomAttachmentSheetBinding(view, customFontButton, customFontButton2, customFontButton3, customFontButton4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccViewBottomAttachmentSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.ecc_view_bottom_attachment_sheet, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
