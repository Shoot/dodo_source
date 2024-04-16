package im.threads.ui.views.recordview;

import kotlin.Metadata;
/* compiled from: VoiceOnRecordListener.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lim/threads/ui/views/recordview/VoiceOnRecordListener;", "", "onCancel", "", "onFinish", "recordTime", "", "limitReached", "", "onLessThanSecond", "onLock", "onStart", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface VoiceOnRecordListener {
    void onCancel();

    void onFinish(long j, boolean z);

    void onLessThanSecond();

    void onLock();

    void onStart();
}
