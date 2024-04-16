package com.github.hiteshsondhi88.libffmpeg;
/* compiled from: CommandResult.java */
/* loaded from: classes2.dex */
class a {
    final String a;
    final boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z, String str) {
        this.b = z;
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a() {
        return new a(false, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(Process process) {
        String c;
        if (c(Integer.valueOf(process.exitValue()))) {
            c = m.c(process.getInputStream());
        } else {
            c = m.c(process.getErrorStream());
        }
        return new a(c(Integer.valueOf(process.exitValue())), c);
    }

    static boolean c(Integer num) {
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }
}
