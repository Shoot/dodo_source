package im.threads.business.models;

import kotlin.Metadata;
/* compiled from: InputFieldEnableModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0010"}, d2 = {"Lim/threads/business/models/InputFieldEnableModel;", "", "isEnabledInputField", "", "isEnabledSendButton", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputFieldEnableModel {
    private final boolean isEnabledInputField;
    private final boolean isEnabledSendButton;

    public InputFieldEnableModel(boolean z, boolean z2) {
        this.isEnabledInputField = z;
        this.isEnabledSendButton = z2;
    }

    public static /* synthetic */ InputFieldEnableModel copy$default(InputFieldEnableModel inputFieldEnableModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inputFieldEnableModel.isEnabledInputField;
        }
        if ((i & 2) != 0) {
            z2 = inputFieldEnableModel.isEnabledSendButton;
        }
        return inputFieldEnableModel.copy(z, z2);
    }

    public final boolean component1() {
        return this.isEnabledInputField;
    }

    public final boolean component2() {
        return this.isEnabledSendButton;
    }

    public final InputFieldEnableModel copy(boolean z, boolean z2) {
        return new InputFieldEnableModel(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputFieldEnableModel)) {
            return false;
        }
        InputFieldEnableModel inputFieldEnableModel = (InputFieldEnableModel) obj;
        if (this.isEnabledInputField == inputFieldEnableModel.isEnabledInputField && this.isEnabledSendButton == inputFieldEnableModel.isEnabledSendButton) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isEnabledInputField;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        boolean z2 = this.isEnabledSendButton;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i2 + i;
    }

    public final boolean isEnabledInputField() {
        return this.isEnabledInputField;
    }

    public final boolean isEnabledSendButton() {
        return this.isEnabledSendButton;
    }

    public String toString() {
        boolean z = this.isEnabledInputField;
        boolean z2 = this.isEnabledSendButton;
        return "isEnabledInputField: " + z + ", isEnabledSendButton: " + z2;
    }
}
