package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.regex.Pattern;
/* compiled from: TopicOperation.java */
/* loaded from: classes2.dex */
final class c0 {
    private static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String a;
    private final String b;
    private final String c;

    private c0(String str, String str2) {
        this.a = d(str2, str);
        this.b = str;
        this.c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new c0(split[0], split[1]);
    }

    @NonNull
    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!this.a.equals(c0Var.a) || !this.b.equals(c0Var.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return m57.b(this.b, this.a);
    }
}
