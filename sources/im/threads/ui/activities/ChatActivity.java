package im.threads.ui.activities;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import im.threads.BuildConfig;
import im.threads.R;
import im.threads.ui.fragments.ChatFragment;
import kotlin.Metadata;
/* compiled from: ChatActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J-\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lim/threads/ui/activities/ChatActivity;", "Lim/threads/ui/activities/BaseActivity;", "()V", "hasAllPermissionsGranted", "", "grantResults", "", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "(I[Ljava/lang/String;[I)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatActivity extends BaseActivity {
    private final boolean hasAllPermissionsGranted(int[] iArr) {
        for (int i : iArr) {
            if (i == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ChatFragment chatFragment;
        Fragment l0 = getSupportFragmentManager().l0("frag_chat");
        if (l0 instanceof ChatFragment) {
            chatFragment = (ChatFragment) l0;
        } else {
            chatFragment = null;
        }
        if (chatFragment != null && chatFragment.onBackPressed()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.threads.ui.activities.BaseActivity, androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ecc_activity_chat_activity);
        if (BuildConfig.IS_ANIMATIONS_DISABLED.get()) {
            getWindow().addFlags(128);
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        z65.h(strArr, "permissions");
        z65.h(iArr, "grantResults");
        if (i == 123 && hasAllPermissionsGranted(iArr)) {
            Toast.makeText(this, "All permissions are granted", 1).show();
            return;
        }
        Toast.makeText(this, "Permissions not granted. Code: " + i, 1).show();
    }
}
