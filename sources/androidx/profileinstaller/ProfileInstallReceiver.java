package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.profileinstaller.f;
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f.c {
        a() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i, Object obj) {
            f.b.a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i, Object obj) {
            f.b.b(i, obj);
        }
    }

    static void a(@NonNull f.c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            cVar.a(12, null);
            return;
        }
        cVar.a(13, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.k(context, new hc6(), new a(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    f.l(context, new hc6(), new a());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    f.c(context, new hc6(), new a());
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            a aVar = new a();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                androidx.profileinstaller.a.b(context, aVar);
            } else {
                aVar.a(16, null);
            }
        }
    }
}
