package defpackage;

import kotlin.Metadata;
import kotlin.ranges.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Char.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0000¨\u0006\u0006"}, d2 = {"", "other", "", "ignoreCase", "f", "g", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/CharsKt")
/* renamed from: ow0  reason: default package */
/* loaded from: classes3.dex */
public class ow0 extends nw0 {
    public static final boolean f(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static boolean g(char c) {
        return new b((char) 55296, (char) 57343).t(c);
    }
}
