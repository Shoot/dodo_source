package im.threads.business.markdown;

import android.net.Uri;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.utils.UrlUtils;
import kotlin.Metadata;
/* compiled from: LinkifyLinksHighlighter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lim/threads/business/markdown/LinkifyLinksHighlighter;", "Lim/threads/business/markdown/LinksHighlighter;", "()V", "highlightAllTypeOfLinks", "", "textView", "Landroid/widget/TextView;", RemoteMessageConst.Notification.URL, "", "isUnderlined", "", "highlightEmailAndPhonesLinks", "stripUnderlines", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkifyLinksHighlighter implements LinksHighlighter {
    private final void highlightEmailAndPhonesLinks(TextView textView) {
        Linkify.addLinks(textView, 6);
    }

    private final void stripUnderlines(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        z65.g(uRLSpanArr, "spans");
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new UrlSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
    }

    @Override // im.threads.business.markdown.LinksHighlighter
    public void highlightAllTypeOfLinks(TextView textView, String str, boolean z) {
        String str2;
        z65.h(textView, "textView");
        if (str != null) {
            str2 = Uri.parse(str).getScheme();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            Linkify.addLinks(textView, 7);
        } else {
            highlightEmailAndPhonesLinks(textView);
        }
        Linkify.addLinks(textView, UrlUtils.WEB_URL, str2);
        Linkify.addLinks(textView, UrlUtils.INSTANCE.getDEEPLINK_URL(), str2);
        if (!z) {
            stripUnderlines(textView);
        }
    }
}
