package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: RegexBasedMatcher.java */
/* renamed from: fc9  reason: default package */
/* loaded from: classes.dex */
public final class fc9 implements v96 {
    private final gc9 a = new gc9(100);

    private fc9() {
    }

    public static v96 b() {
        return new fc9();
    }

    private static boolean c(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }

    @Override // defpackage.v96
    public boolean a(CharSequence charSequence, f58 f58Var, boolean z) {
        String a = f58Var.a();
        if (a.length() == 0) {
            return false;
        }
        return c(charSequence, this.a.a(a), z);
    }
}
