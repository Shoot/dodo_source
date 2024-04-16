package im.threads.ui.styles.permissions;

import im.threads.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PermissionDescriptionDialogStyle.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lim/threads/ui/styles/permissions/PermissionDescriptionImageStyle;", "Ljava/io/Serializable;", "()V", "imageResId", "", "getImageResId", "()I", "setImageResId", "(I)V", "layoutGravity", "Lim/threads/ui/styles/permissions/ContentGravity;", "getLayoutGravity", "()Lim/threads/ui/styles/permissions/ContentGravity;", "setLayoutGravity", "(Lim/threads/ui/styles/permissions/ContentGravity;)V", "marginTopDpResId", "getMarginTopDpResId", "setMarginTopDpResId", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionDescriptionImageStyle implements Serializable {
    private int imageResId = R.drawable.ecc_image_placeholder;
    private int marginTopDpResId = R.dimen.ecc_margin_material;
    private ContentGravity layoutGravity = ContentGravity.CENTER;

    public final int getImageResId() {
        return this.imageResId;
    }

    public final ContentGravity getLayoutGravity() {
        return this.layoutGravity;
    }

    public final int getMarginTopDpResId() {
        return this.marginTopDpResId;
    }

    public final void setImageResId(int i) {
        this.imageResId = i;
    }

    public final void setLayoutGravity(ContentGravity contentGravity) {
        z65.h(contentGravity, "<set-?>");
        this.layoutGravity = contentGravity;
    }

    public final void setMarginTopDpResId(int i) {
        this.marginTopDpResId = i;
    }
}
