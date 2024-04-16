package im.threads.ui.styles.permissions;

import im.threads.R;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PermissionDescriptionDialogStyle.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", "Ljava/io/Serializable;", "()V", "backgroundStyle", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogBackgroundStyle;", "getBackgroundStyle", "()Lim/threads/ui/styles/permissions/PermissionDescriptionDialogBackgroundStyle;", "imageStyle", "Lim/threads/ui/styles/permissions/PermissionDescriptionImageStyle;", "getImageStyle", "()Lim/threads/ui/styles/permissions/PermissionDescriptionImageStyle;", "messageStyle", "Lim/threads/ui/styles/permissions/PermissionDescriptionTextStyle;", "getMessageStyle", "()Lim/threads/ui/styles/permissions/PermissionDescriptionTextStyle;", "negativeButtonStyle", "Lim/threads/ui/styles/permissions/PermissionDescriptionButtonStyle;", "getNegativeButtonStyle", "()Lim/threads/ui/styles/permissions/PermissionDescriptionButtonStyle;", "positiveButtonStyle", "getPositiveButtonStyle", "titleStyle", "getTitleStyle", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionDescriptionDialogStyle implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final PermissionDescriptionImageStyle imageStyle = new PermissionDescriptionImageStyle();
    private final PermissionDescriptionTextStyle titleStyle = new PermissionDescriptionTextStyle();
    private final PermissionDescriptionTextStyle messageStyle = new PermissionDescriptionTextStyle();
    private final PermissionDescriptionButtonStyle positiveButtonStyle = new PermissionDescriptionButtonStyle();
    private final PermissionDescriptionButtonStyle negativeButtonStyle = new PermissionDescriptionButtonStyle();
    private final PermissionDescriptionDialogBackgroundStyle backgroundStyle = new PermissionDescriptionDialogBackgroundStyle();

    public static final PermissionDescriptionDialogStyle getDefaultDialogStyle(PermissionDescriptionType permissionDescriptionType) {
        return Companion.getDefaultDialogStyle(permissionDescriptionType);
    }

    public final PermissionDescriptionDialogBackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final PermissionDescriptionImageStyle getImageStyle() {
        return this.imageStyle;
    }

    public final PermissionDescriptionTextStyle getMessageStyle() {
        return this.messageStyle;
    }

    public final PermissionDescriptionButtonStyle getNegativeButtonStyle() {
        return this.negativeButtonStyle;
    }

    public final PermissionDescriptionButtonStyle getPositiveButtonStyle() {
        return this.positiveButtonStyle;
    }

    public final PermissionDescriptionTextStyle getTitleStyle() {
        return this.titleStyle;
    }

    /* compiled from: PermissionDescriptionDialogStyle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle$Companion;", "", "()V", "createTypeSpecificDialogStyle", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", "imageResId", "", "titleResId", "messageResId", "getDefaultDialogStyle", MessageAttributes.TYPE, "Lim/threads/ui/styles/permissions/PermissionDescriptionType;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: PermissionDescriptionDialogStyle.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PermissionDescriptionType.values().length];
                try {
                    iArr[PermissionDescriptionType.STORAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PermissionDescriptionType.RECORD_AUDIO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PermissionDescriptionType.CAMERA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PermissionDescriptionDialogStyle createTypeSpecificDialogStyle(int i, int i2, int i3) {
            PermissionDescriptionDialogStyle defaultDialogStyle = getDefaultDialogStyle();
            defaultDialogStyle.getImageStyle().setImageResId(i);
            defaultDialogStyle.getTitleStyle().setTextResId(i2);
            defaultDialogStyle.getMessageStyle().setTextResId(i3);
            return defaultDialogStyle;
        }

        static /* synthetic */ PermissionDescriptionDialogStyle createTypeSpecificDialogStyle$default(Companion companion, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = R.drawable.ecc_image_placeholder;
            }
            return companion.createTypeSpecificDialogStyle(i, i2, i3);
        }

        public final PermissionDescriptionDialogStyle getDefaultDialogStyle(PermissionDescriptionType permissionDescriptionType) {
            z65.h(permissionDescriptionType, MessageAttributes.TYPE);
            int i = WhenMappings.$EnumSwitchMapping$0[permissionDescriptionType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return createTypeSpecificDialogStyle$default(this, 0, R.string.ecc_permission_description_access_to_camera_title, R.string.ecc_permission_description_access_to_camera_message, 1, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return createTypeSpecificDialogStyle$default(this, 0, R.string.ecc_permission_description_access_to_audio_recording_title, R.string.ecc_permission_description_access_to_audio_recording_message, 1, null);
            }
            return createTypeSpecificDialogStyle$default(this, 0, R.string.ecc_permission_description_access_to_files_title, R.string.ecc_permission_description_access_to_files_message, 1, null);
        }

        private final PermissionDescriptionDialogStyle getDefaultDialogStyle() {
            PermissionDescriptionDialogStyle permissionDescriptionDialogStyle = new PermissionDescriptionDialogStyle();
            permissionDescriptionDialogStyle.getMessageStyle().setTextSizeSpResId(R.dimen.ecc_text_regular);
            PermissionDescriptionButtonStyle negativeButtonStyle = permissionDescriptionDialogStyle.getNegativeButtonStyle();
            negativeButtonStyle.setTextResId(R.string.ecc_close);
            negativeButtonStyle.setMarginTopDpResId(R.dimen.ecc_margin_quarter);
            negativeButtonStyle.setMarginBottomDpResId(R.dimen.ecc_margin_material);
            negativeButtonStyle.setBackgroundColorResId(17170445);
            return permissionDescriptionDialogStyle;
        }
    }
}
