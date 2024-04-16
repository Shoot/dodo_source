package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: jp5  reason: default package */
/* loaded from: classes2.dex */
public interface jp5 {
    void a(@NonNull Activity activity, @NonNull Bundle bundle, Bundle bundle2);

    @NonNull
    View b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void g();

    void o();

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onStart();

    void p(@NonNull Bundle bundle);

    void u();

    void w(Bundle bundle);
}
