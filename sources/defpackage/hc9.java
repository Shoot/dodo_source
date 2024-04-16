package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
import kotlin.text.MatchResult;
/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0002¨\u0006\r"}, d2 = {"Ljava/util/regex/Matcher;", "", RemoteMessageConst.FROM, "", "input", "Lkotlin/text/MatchResult;", e.a, "f", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "g", "groupIndex", Image.TYPE_HIGH, "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: hc9 */
/* loaded from: classes3.dex */
public final class hc9 {
    public static final /* synthetic */ MatchResult a(Matcher matcher, int i, CharSequence charSequence) {
        return e(matcher, i, charSequence);
    }

    public static final /* synthetic */ MatchResult b(Matcher matcher, CharSequence charSequence) {
        return f(matcher, charSequence);
    }

    public static final MatchResult e(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new w96(matcher, charSequence);
    }

    public static final MatchResult f(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new w96(matcher, charSequence);
    }

    public static final IntRange g(java.util.regex.MatchResult matchResult) {
        IntRange q;
        q = i.q(matchResult.start(), matchResult.end());
        return q;
    }

    public static final IntRange h(java.util.regex.MatchResult matchResult, int i) {
        IntRange q;
        q = i.q(matchResult.start(i), matchResult.end(i));
        return q;
    }
}
