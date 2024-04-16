package im.threads.business.markdown;

import android.text.Spanned;
import kotlin.Metadata;
/* compiled from: MarkdownProcessor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lim/threads/business/markdown/MarkdownProcessor;", "", "parseClientMessage", "Landroid/text/Spanned;", "text", "", "parseOperatorMessage", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MarkdownProcessor {
    Spanned parseClientMessage(String str);

    Spanned parseOperatorMessage(String str);
}
