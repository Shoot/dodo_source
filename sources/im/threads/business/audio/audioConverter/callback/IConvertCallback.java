package im.threads.business.audio.audioConverter.callback;

import java.io.File;
import kotlin.Metadata;
/* compiled from: IConvertCallback.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lim/threads/business/audio/audioConverter/callback/IConvertCallback;", "", "onFailure", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "convertedFile", "Ljava/io/File;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IConvertCallback {
    void onFailure(Exception exc);

    void onSuccess(File file);
}
