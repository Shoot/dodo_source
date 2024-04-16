package im.threads.business.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.models.ExtractedLink;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
/* compiled from: UrlUtils.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u0010\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\tJ\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0018\u0010&\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002J\u000e\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020\tJ\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010(\u001a\u00020\tH\u0007J\u0010\u0010.\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lim/threads/business/utils/UrlUtils;", "", "()V", "DEEPLINK_URL", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getDEEPLINK_URL", "()Ljava/util/regex/Pattern;", "DOMAIN_NAME_STR", "", "HOST_NAME", "IP_ADDRESS_STRING", "IRI_LABEL", "LABEL_CHAR", "PATH_AND_QUERY", "PORT_NUMBER", "PROTOCOL", "PUNYCODE_TLD", "TLD", "TLD_CHAR", "UCS_CHAR", "USER_INFO", "WEB_URL", "WEB_URL_PATTERN", "WORD_BOUNDARY", "imageExtensions", "", "getImageExtensions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "extractDeepLink", "text", "extractEmailAddresses", "", "extractImageMarkdownLink", "extractLink", "Lim/threads/business/models/ExtractedLink;", "getLink", "isTextContainsNotOnlyEmail", "", RemoteMessageConst.Notification.URL, "isValidUrl", "openUrl", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "trimInvalidUrlCharacters", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UrlUtils {
    private static final String DOMAIN_NAME_STR = "(([a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]_\\-]{0,4048}[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))";
    private static final String HOST_NAME = "([a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]_\\-]{0,4048}[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63})";
    private static final String IP_ADDRESS_STRING = "((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))";
    private static final String IRI_LABEL = "[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]_\\-]{0,4048}[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}";
    private static final String LABEL_CHAR = "a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]";
    private static final String PATH_AND_QUERY = "[/?](?:(?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/?:@&=#~\\-.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*";
    private static final String PORT_NUMBER = "\\:\\d{1,5}";
    private static final String PROTOCOL = "(?i:http|https|rtsp|webview)://";
    private static final String PUNYCODE_TLD = "xn\\-\\-[\\w\\-]{0,58}\\w";
    private static final String TLD = "(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63})";
    private static final String TLD_CHAR = "a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]";
    private static final String UCS_CHAR = "[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]";
    private static final String USER_INFO = "(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@";
    private static final String WORD_BOUNDARY = "(?:\\/|\\b|$|^)";
    public static final UrlUtils INSTANCE = new UrlUtils();
    private static final Pattern DEEPLINK_URL = Pattern.compile("[a-z0-9+.-]+(?<!http)(?<!https)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|*]*");
    public static final Pattern WEB_URL = Pattern.compile("(((?:(?i:http|https|rtsp|webview)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]_\\-]{0,4048}[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)([/?](?:(?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/?:@&=#~\\-.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\/|\\b|$|^))");
    private static final Pattern WEB_URL_PATTERN = Patterns.WEB_URL;
    private static final String[] imageExtensions = {".jpg", ".png", ".gif", ".tiff", ".raw"};

    private UrlUtils() {
    }

    public static final String extractDeepLink(String str) {
        z65.h(str, "text");
        Matcher matcher = DEEPLINK_URL.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static final List<String> extractEmailAddresses(String str) {
        z65.h(str, "text");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static final ExtractedLink extractLink(String str) {
        z65.h(str, "text");
        return INSTANCE.getLink(str);
    }

    private final ExtractedLink getLink(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = WEB_URL.matcher(str);
        if (matcher.find()) {
            String group = matcher.group();
            z65.g(group, RemoteMessageConst.Notification.URL);
            return new ExtractedLink(trimInvalidUrlCharacters(group), !isTextContainsNotOnlyEmail(str, group));
        }
        Matcher matcher2 = WEB_URL_PATTERN.matcher(str);
        if (!matcher2.find()) {
            return null;
        }
        String group2 = matcher2.group();
        z65.g(group2, RemoteMessageConst.Notification.URL);
        return new ExtractedLink(trimInvalidUrlCharacters(group2), !isTextContainsNotOnlyEmail(str, group2));
    }

    private final boolean isTextContainsNotOnlyEmail(String str, String str2) {
        int Z;
        while (true) {
            Z = m0b.Z(str, str2, 0, false, 6, null);
            if (Z != 0) {
                if (Z <= 0 || str.charAt(Z - 1) == '@') {
                    if (Z >= 0) {
                        str = str.substring(Z + str2.length());
                        z65.g(str, "this as java.lang.String).substring(startIndex)");
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
    }

    public static final void openUrl(Context context, String str) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(str, RemoteMessageConst.Notification.URL);
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            parse = Uri.parse("https://" + str);
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        } else {
            Balloon.show(context, "No application support this type of link");
        }
    }

    private final String trimInvalidUrlCharacters(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        while (str.length() > 0) {
            String substring = str.substring(str.length() - 1);
            z65.g(substring, "this as java.lang.String).substring(startIndex)");
            if (new ec9("[/\\w]+").f(substring)) {
                break;
            }
            str = str.substring(0, str.length() - 1);
            z65.g(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return str;
    }

    public final String extractImageMarkdownLink(String str) {
        String str2;
        boolean O;
        z65.h(str, "text");
        ExtractedLink extractLink = extractLink(str);
        if (extractLink != null) {
            str2 = extractLink.getLink();
        } else {
            str2 = null;
        }
        if (str2 != null && !extractLink.isEmail()) {
            String link = extractLink.getLink();
            Locale locale = Locale.getDefault();
            z65.g(locale, "getDefault()");
            String lowerCase = link.toLowerCase(locale);
            z65.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            for (String str3 : imageExtensions) {
                O = m0b.O(lowerCase, str3, false, 2, null);
                if (O) {
                    return lowerCase;
                }
            }
        }
        return null;
    }

    public final Pattern getDEEPLINK_URL() {
        return DEEPLINK_URL;
    }

    public final String[] getImageExtensions() {
        return imageExtensions;
    }

    public final boolean isValidUrl(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        if (getLink(str) != null) {
            return true;
        }
        return false;
    }
}
