package im.threads.ui.styles.permissions;

import im.threads.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PermissionDescriptionDialogStyle.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lim/threads/ui/styles/permissions/PermissionDescriptionButtonStyle;", "Ljava/io/Serializable;", "()V", "backgroundColorResId", "", "getBackgroundColorResId", "()I", "setBackgroundColorResId", "(I)V", "backgroundResId", "getBackgroundResId", "setBackgroundResId", "cornerRadiusDpResId", "getCornerRadiusDpResId", "setCornerRadiusDpResId", "fontPath", "", "getFontPath", "()Ljava/lang/String;", "setFontPath", "(Ljava/lang/String;)V", "marginBottomDpResId", "getMarginBottomDpResId", "setMarginBottomDpResId", "marginTopDpResId", "getMarginTopDpResId", "setMarginTopDpResId", "strokeColorResId", "getStrokeColorResId", "setStrokeColorResId", "strokeWidthDpResId", "getStrokeWidthDpResId", "setStrokeWidthDpResId", "textAppearanceResId", "getTextAppearanceResId", "setTextAppearanceResId", "textColorResId", "getTextColorResId", "setTextColorResId", "textResId", "getTextResId", "setTextResId", "textSizeSpResId", "getTextSizeSpResId", "setTextSizeSpResId", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionDescriptionButtonStyle implements Serializable {
    private int backgroundResId;
    private int strokeColorResId;
    private int textAppearanceResId;
    private int textResId = R.string.ecc_allow;
    private String fontPath = "";
    private int textSizeSpResId = R.dimen.ecc_text_medium;
    private int textColorResId = R.color.ecc_black;
    private int marginTopDpResId = R.dimen.ecc_margin_material;
    private int marginBottomDpResId = R.dimen.ecc_margin_zero;
    private int cornerRadiusDpResId = R.dimen.ecc_threads_radius_big;
    private int backgroundColorResId = R.color.ecc_teal_009688;
    private int strokeWidthDpResId = R.dimen.ecc_stroke_width_small;

    public final int getBackgroundColorResId() {
        return this.backgroundColorResId;
    }

    public final int getBackgroundResId() {
        return this.backgroundResId;
    }

    public final int getCornerRadiusDpResId() {
        return this.cornerRadiusDpResId;
    }

    public final String getFontPath() {
        return this.fontPath;
    }

    public final int getMarginBottomDpResId() {
        return this.marginBottomDpResId;
    }

    public final int getMarginTopDpResId() {
        return this.marginTopDpResId;
    }

    public final int getStrokeColorResId() {
        return this.strokeColorResId;
    }

    public final int getStrokeWidthDpResId() {
        return this.strokeWidthDpResId;
    }

    public final int getTextAppearanceResId() {
        return this.textAppearanceResId;
    }

    public final int getTextColorResId() {
        return this.textColorResId;
    }

    public final int getTextResId() {
        return this.textResId;
    }

    public final int getTextSizeSpResId() {
        return this.textSizeSpResId;
    }

    public final void setBackgroundColorResId(int i) {
        this.backgroundColorResId = i;
    }

    public final void setBackgroundResId(int i) {
        this.backgroundResId = i;
    }

    public final void setCornerRadiusDpResId(int i) {
        this.cornerRadiusDpResId = i;
    }

    public final void setFontPath(String str) {
        z65.h(str, "<set-?>");
        this.fontPath = str;
    }

    public final void setMarginBottomDpResId(int i) {
        this.marginBottomDpResId = i;
    }

    public final void setMarginTopDpResId(int i) {
        this.marginTopDpResId = i;
    }

    public final void setStrokeColorResId(int i) {
        this.strokeColorResId = i;
    }

    public final void setStrokeWidthDpResId(int i) {
        this.strokeWidthDpResId = i;
    }

    public final void setTextAppearanceResId(int i) {
        this.textAppearanceResId = i;
    }

    public final void setTextColorResId(int i) {
        this.textColorResId = i;
    }

    public final void setTextResId(int i) {
        this.textResId = i;
    }

    public final void setTextSizeSpResId(int i) {
        this.textSizeSpResId = i;
    }
}
