package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: yd0  reason: default package */
/* loaded from: classes2.dex */
public interface yd0 {
    @NonNull
    y6b<RetrieveBytesResponse> b(@NonNull RetrieveBytesRequest retrieveBytesRequest);

    @NonNull
    y6b<Integer> c(@NonNull StoreBytesData storeBytesData);

    @NonNull
    y6b<Boolean> d(@NonNull DeleteBytesRequest deleteBytesRequest);

    @NonNull
    y6b<Boolean> e();
}
