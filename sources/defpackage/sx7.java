package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.tk9;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: sx7  reason: default package */
/* loaded from: classes2.dex */
public abstract class sx7<R extends tk9> {

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* renamed from: sx7$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(@NonNull Status status);
    }

    public abstract void addStatusListener(@NonNull a aVar);

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract R await(long j, @NonNull TimeUnit timeUnit);
}
