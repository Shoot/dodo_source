package com.huawei.hms.hatool;
/* loaded from: classes3.dex */
public class m0 implements n0 {
    public String a;
    public String b;

    public m0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        r0.a(this.a, this.b);
    }
}
