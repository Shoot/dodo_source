package com.github.hiteshsondhi88.libffmpeg;

import java.io.IOException;
/* compiled from: ShellCommand.java */
/* loaded from: classes2.dex */
class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Process a(String[] strArr) {
        try {
            return Runtime.getRuntime().exec(strArr);
        } catch (IOException e) {
            j.b("Exception while trying to run: " + strArr, e);
            return null;
        }
    }
}
