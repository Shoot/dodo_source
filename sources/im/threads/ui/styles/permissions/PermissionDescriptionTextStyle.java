package im.threads.ui.styles.permissions;

import im.threads.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PermissionDescriptionDialogStyle.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lim/threads/ui/styles/permissions/PermissionDescriptionTextStyle;", "Ljava/io/Serializable;", "()V", "fontPath", "", "getFontPath", "()Ljava/lang/String;", "setFontPath", "(Ljava/lang/String;)V", "gravity", "Lim/threads/ui/styles/permissions/ContentGravity;", "getGravity", "()Lim/threads/ui/styles/permissions/ContentGravity;", "setGravity", "(Lim/threads/ui/styles/permissions/ContentGravity;)V", "marginTopDpResId", "", "getMarginTopDpResId", "()I", "setMarginTopDpResId", "(I)V", "textAppearanceResId", "getTextAppearanceResId", "setTextAppearanceResId", "textColorResId", "getTextColorResId", "setTextColorResId", "textResId", "getTextResId", "setTextResId", "textSizeSpResId", "getTextSizeSpResId", "setTextSizeSpResId", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionDescriptionTextStyle implements Serializable {
    private int textAppearanceResId;
    private int textResId;
    private String fontPath = "";
    private int textSizeSpResId = R.dimen.ecc_text_medium;
    private int textColorResId = R.color.ecc_black;
    private int marginTopDpResId = R.dimen.ecc_margin_three_fourth;
    private ContentGravity gravity = ContentGravity.CENTER;

    public final String getFontPath() {
        return this.fontPath;
    }

    public final ContentGravity getGravity() {
        return this.gravity;
    }

    public final int getMarginTopDpResId() {
        return this.marginTopDpResId;
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

    public final void setFontPath(String str) {
        z65.h(str, "<set-?>");
        this.fontPath = str;
    }

    public final void setGravity(ContentGravity contentGravity) {
        z65.h(contentGravity, "<set-?>");
        this.gravity = contentGravity;
    }

    public final void setMarginTopDpResId(int i) {
        this.marginTopDpResId = i;
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
