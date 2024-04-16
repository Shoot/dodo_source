package im.threads.business.markdown;

import android.text.TextPaint;
import android.text.style.URLSpan;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: UrlSpanNoUnderline.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lim/threads/business/markdown/UrlSpanNoUnderline;", "Landroid/text/style/URLSpan;", RemoteMessageConst.Notification.URL, "", "(Ljava/lang/String;)V", "updateDrawState", "", "drawState", "Landroid/text/TextPaint;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UrlSpanNoUnderline extends URLSpan {
    public UrlSpanNoUnderline(String str) {
        super(str);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        z65.h(textPaint, "drawState");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
