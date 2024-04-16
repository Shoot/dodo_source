package defpackage;

import java.util.regex.Pattern;
/* compiled from: MultiFileModeFileNameProvider.java */
/* renamed from: kp6  reason: default package */
/* loaded from: classes.dex */
public final class kp6 implements x28 {
    private static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    private final String a;

    public kp6(String str) {
        this.a = str + "_";
    }

    @Override // defpackage.x28
    public String a(Object obj) {
        String obj2 = obj.toString();
        if (b.matcher(obj2).matches()) {
            return this.a + obj;
        }
        throw new IllegalArgumentException("Invalid key: " + obj2);
    }
}
