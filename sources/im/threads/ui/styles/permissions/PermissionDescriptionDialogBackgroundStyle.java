package im.threads.ui.styles.permissions;

import im.threads.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PermissionDescriptionDialogStyle.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lim/threads/ui/styles/permissions/PermissionDescriptionDialogBackgroundStyle;", "Ljava/io/Serializable;", "()V", "backgroundColorResId", "", "getBackgroundColorResId", "()I", "setBackgroundColorResId", "(I)V", "backgroundResId", "getBackgroundResId", "setBackgroundResId", "cornerRadiusDpResId", "getCornerRadiusDpResId", "setCornerRadiusDpResId", "strokeColorResId", "getStrokeColorResId", "setStrokeColorResId", "strokeWidthDpResId", "getStrokeWidthDpResId", "setStrokeWidthDpResId", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionDescriptionDialogBackgroundStyle implements Serializable {
    private int backgroundResId;
    private int strokeColorResId;
    private int cornerRadiusDpResId = R.dimen.ecc_threads_radius_big;
    private int backgroundColorResId = R.color.ecc_cian_b2dfdb;
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

    public final int getStrokeColorResId() {
        return this.strokeColorResId;
    }

    public final int getStrokeWidthDpResId() {
        return this.strokeWidthDpResId;
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

    public final void setStrokeColorResId(int i) {
        this.strokeColorResId = i;
    }

    public final void setStrokeWidthDpResId(int i) {
        this.strokeWidthDpResId = i;
    }
}
