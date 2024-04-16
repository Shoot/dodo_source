package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.inappstory.sdk.network.NetworkHandler;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: DefaultLottieNetworkFetcher.java */
/* renamed from: sq2  reason: default package */
/* loaded from: classes.dex */
public class sq2 implements vz5 {
    @Override // defpackage.vz5
    @NonNull
    public pz5 a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod(NetworkHandler.GET);
        httpURLConnection.connect();
        return new rq2(httpURLConnection);
    }
}
