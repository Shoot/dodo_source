package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
/* compiled from: PinCodeSmsParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\u000b"}, d2 = {"Ls68;", "Lr68;", "", "message", "a", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "pinCodeMessagePattern", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s68  reason: default package */
/* loaded from: classes4.dex */
public final class s68 implements r68 {
    private final Pattern a = Pattern.compile("^(\\d+)");

    @Override // defpackage.r68
    public String a(String str) {
        z65.h(str, "message");
        Matcher matcher = this.a.matcher(str);
        if (!matcher.find()) {
            matcher = null;
        }
        if (matcher == null) {
            return null;
        }
        return matcher.group(0);
    }
}
