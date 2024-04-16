package im.threads.business.chatUpdates;

import kotlin.Metadata;
/* compiled from: ChatUpdateProcessorJavaGetter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lim/threads/business/chatUpdates/ChatUpdateProcessorJavaGetter;", "", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "processor$delegate", "Lrn5;", "getProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "processor", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatUpdateProcessorJavaGetter {
    private final rn5 processor$delegate;

    public ChatUpdateProcessorJavaGetter() {
        rn5 b;
        b = yn5.b(ChatUpdateProcessorJavaGetter$special$$inlined$inject$1.INSTANCE);
        this.processor$delegate = b;
    }

    public final ChatUpdateProcessor getProcessor() {
        return (ChatUpdateProcessor) this.processor$delegate.getValue();
    }
}
