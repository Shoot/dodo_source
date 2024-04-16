package im.threads.ui.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.b;
import androidx.appcompat.app.c;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.logger.LoggerEdna;
import im.threads.ui.permissions.PermissionsActivity;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PermissionsActivity.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J#\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014J-\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lim/threads/ui/permissions/PermissionsActivity;", "Landroidx/appcompat/app/c;", "", "allPermissionsGranted", "allPermissionsDenied", "neverAskAgain", "", "", "permissions", "requestPermissions", "([Ljava/lang/String;)V", "", "grantResults", "", "hasAllPermissionsGranted", "([Ljava/lang/String;[I)Z", "showMissingPermissionDialog", "startAppSettings", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "", "requestCode", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "requiresCheck", "Z", "[Ljava/lang/String;", "textId", "I", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "Lrn5;", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "getPermissionText", "()I", "permissionText", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PermissionsActivity extends c {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_PERMISSIONS = "EXTRA_PERMISSIONS";
    private static final String EXTRA_PERMISSION_TEXT = "EXTRA_PERMISSION_TEXT";
    private static final String EXTRA_REQUEST_CODE = "EXTRA_REQUEST_CODE";
    private static final String PACKAGE_URL_SCHEME = "package:";
    public static final int RESPONSE_DENIED = 20;
    public static final int RESPONSE_GRANTED = 10;
    public static final int RESPONSE_NEVER_AGAIN = 30;
    private static final int TEXT_DEFAULT = -1;
    private final rn5 chatUpdateProcessor$delegate;
    private int requestCode;
    private boolean requiresCheck;
    private String[] permissions = new String[0];
    private int textId = -1;

    /* compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002JE\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lim/threads/ui/permissions/PermissionsActivity$Companion;", "", "()V", PermissionsActivity.EXTRA_PERMISSIONS, "", PermissionsActivity.EXTRA_PERMISSION_TEXT, PermissionsActivity.EXTRA_REQUEST_CODE, "PACKAGE_URL_SCHEME", "RESPONSE_DENIED", "", "RESPONSE_GRANTED", "RESPONSE_NEVER_AGAIN", "TEXT_DEFAULT", "checkForMediaPermissions", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "permissions", "(Landroid/content/Context;[Ljava/lang/String;)[Ljava/lang/String;", "showPermissionsIsNullLog", "", "startActivityForResult", "activity", "Landroid/app/Activity;", "requestCode", "text", "", "(Landroid/app/Activity;IIZ[Ljava/lang/String;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String[] checkForMediaPermissions(Context context, String... strArr) {
            List U;
            boolean A;
            List W;
            List o;
            List o2;
            if (context == null) {
                return (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                A = yr.A(strArr, "android.permission.READ_EXTERNAL_STORAGE");
                if (A) {
                    W = yr.W(strArr);
                    W.remove("android.permission.READ_EXTERNAL_STORAGE");
                    if (i >= 34) {
                        o2 = kc1.o("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                        W.addAll(o2);
                    } else {
                        o = kc1.o("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO");
                        W.addAll(o);
                    }
                    return (String[]) W.toArray(new String[0]);
                }
            }
            U = yr.U(strArr);
            return (String[]) U.toArray(new String[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showPermissionsIsNullLog() {
            LoggerEdna.error("Permissions array is empty");
        }

        public static /* synthetic */ void startActivityForResult$default(Companion companion, Activity activity, int i, int i2, boolean z, String[] strArr, int i3, Object obj) {
            boolean z2;
            if ((i3 & 8) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            companion.startActivityForResult(activity, i, i2, z2, strArr);
        }

        public final void startActivityForResult(Activity activity, int i, int i2, boolean z, String... strArr) {
            boolean z2;
            Context context;
            z65.h(strArr, "permissions");
            if (strArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z) {
                    if (activity != null) {
                        context = activity.getApplicationContext();
                    } else {
                        context = null;
                    }
                    strArr = checkForMediaPermissions(context, (String[]) Arrays.copyOf(strArr, strArr.length));
                }
                Intent intent = new Intent(activity, PermissionsActivity.class);
                intent.putExtra(PermissionsActivity.EXTRA_PERMISSIONS, strArr);
                intent.putExtra(PermissionsActivity.EXTRA_PERMISSION_TEXT, i2);
                intent.putExtra(PermissionsActivity.EXTRA_REQUEST_CODE, i);
                z65.e(activity);
                l5.x(activity, intent, i, null);
                return;
            }
            showPermissionsIsNullLog();
        }
    }

    public PermissionsActivity() {
        rn5 b;
        b = yn5.b(PermissionsActivity$special$$inlined$inject$1.INSTANCE);
        this.chatUpdateProcessor$delegate = b;
    }

    private final void allPermissionsDenied() {
        setResult(20);
        finish();
    }

    private final void allPermissionsGranted() {
        setResult(10);
        finish();
    }

    private final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    private final int getPermissionText() {
        if (this.textId == -1) {
            this.textId = R.string.ecc_permissions_string_help_text;
        }
        return this.textId;
    }

    private final boolean hasAllPermissionsGranted(String[] strArr, int[] iArr) {
        int i;
        if (Build.VERSION.SDK_INT >= 34 && getApplicationContext().getApplicationInfo().targetSdkVersion >= 34) {
            i = yr.I(strArr, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        } else {
            i = -1;
        }
        if (i > 0 && iArr[i] == 0) {
            return true;
        }
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == -1 && i2 != i) {
                return false;
            }
        }
        return true;
    }

    private final void neverAskAgain() {
        setResult(30);
        finish();
    }

    private final void requestPermissions(String... strArr) {
        l5.t(this, strArr, this.requestCode);
    }

    private final void showMissingPermissionDialog() {
        b.a aVar = new b.a(this);
        aVar.r(R.string.ecc_permissions_help);
        aVar.g(getPermissionText());
        aVar.j(R.string.ecc_close, new DialogInterface.OnClickListener() { // from class: sy7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PermissionsActivity.showMissingPermissionDialog$lambda$0(PermissionsActivity.this, dialogInterface, i);
            }
        });
        aVar.n(R.string.ecc_permissions_settings, new DialogInterface.OnClickListener() { // from class: ty7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PermissionsActivity.showMissingPermissionDialog$lambda$1(PermissionsActivity.this, dialogInterface, i);
            }
        });
        aVar.l(new DialogInterface.OnCancelListener() { // from class: uy7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PermissionsActivity.showMissingPermissionDialog$lambda$2(PermissionsActivity.this, dialogInterface);
            }
        });
        final b a = aVar.a();
        z65.g(a, "dialogBuilder.create()");
        a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vy7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PermissionsActivity.showMissingPermissionDialog$lambda$3(b.this, this, dialogInterface);
            }
        });
        a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMissingPermissionDialog$lambda$0(PermissionsActivity permissionsActivity, DialogInterface dialogInterface, int i) {
        z65.h(permissionsActivity, "this$0");
        PermissionsChecker permissionsChecker = PermissionsChecker.INSTANCE;
        String[] strArr = permissionsActivity.permissions;
        if (permissionsChecker.clickedNeverAskAgain(permissionsActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            permissionsActivity.neverAskAgain();
        } else {
            permissionsActivity.allPermissionsDenied();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMissingPermissionDialog$lambda$1(PermissionsActivity permissionsActivity, DialogInterface dialogInterface, int i) {
        z65.h(permissionsActivity, "this$0");
        permissionsActivity.startAppSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMissingPermissionDialog$lambda$2(PermissionsActivity permissionsActivity, DialogInterface dialogInterface) {
        z65.h(permissionsActivity, "this$0");
        permissionsActivity.allPermissionsDenied();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMissingPermissionDialog$lambda$3(b bVar, PermissionsActivity permissionsActivity, DialogInterface dialogInterface) {
        z65.h(bVar, "$alertDialog");
        z65.h(permissionsActivity, "this$0");
        bVar.b(-2).setTextColor(iu1.c(permissionsActivity, 17170444));
        bVar.b(-1).setTextColor(iu1.c(permissionsActivity, 17170444));
    }

    public static final void startActivityForResult(Activity activity, int i, int i2, boolean z, String... strArr) {
        Companion.startActivityForResult(activity, i, i2, z, strArr);
    }

    private final void startAppSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        String packageName = getPackageName();
        intent.setData(Uri.parse(PACKAGE_URL_SCHEME + packageName));
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        String[] strArr;
        super.onCreate(bundle);
        int i = -1;
        if (getIntent() != null) {
            String[] stringArrayExtra = getIntent().getStringArrayExtra(EXTRA_PERMISSIONS);
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            this.permissions = stringArrayExtra;
            this.textId = getIntent().getIntExtra(EXTRA_PERMISSION_TEXT, -1);
            this.requestCode = getIntent().getIntExtra(EXTRA_REQUEST_CODE, 0);
        }
        if (this.permissions.length == 0) {
            if (bundle != null) {
                strArr = bundle.getStringArray(EXTRA_PERMISSIONS);
            } else {
                strArr = null;
            }
            if (strArr == null) {
                strArr = new String[0];
            }
            this.permissions = strArr;
            if (bundle != null) {
                i = bundle.getInt(EXTRA_PERMISSION_TEXT);
            }
            this.textId = i;
        }
        if (this.permissions.length == 0) {
            finish();
        }
        setContentView(R.layout.ecc_activity_permissions);
        this.requiresCheck = true;
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        z65.h(strArr, "permissions");
        z65.h(iArr, "grantResults");
        if (this.requestCode == i && hasAllPermissionsGranted(strArr, iArr)) {
            this.requiresCheck = true;
            getChatUpdateProcessor().postGrantedPermissions(i);
            allPermissionsGranted();
            return;
        }
        this.requiresCheck = false;
        showMissingPermissionDialog();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        boolean z;
        super.onResume();
        if (this.requiresCheck) {
            String[] strArr = this.permissions;
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (PermissionsChecker.INSTANCE.permissionsDenied(this, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                    String[] strArr2 = this.permissions;
                    requestPermissions((String[]) Arrays.copyOf(strArr2, strArr2.length));
                    return;
                }
                allPermissionsGranted();
                return;
            }
        }
        if (this.permissions.length == 0) {
            Companion.showPermissionsIsNullLog();
            finish();
            return;
        }
        this.requiresCheck = true;
    }
}
