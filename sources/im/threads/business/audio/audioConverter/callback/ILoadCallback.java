package im.threads.business.audio.audioConverter.callback;

import kotlin.Metadata;
/* compiled from: ILoadCallback.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lim/threads/business/audio/audioConverter/callback/ILoadCallback;", "", "onFailure", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ILoadCallback {
    void onFailure(Exception exc);

    void onSuccess();
}
