package defpackage;

import androidx.annotation.NonNull;
/* compiled from: DataUriParser.java */
/* renamed from: ul2  reason: default package */
/* loaded from: classes3.dex */
public abstract class ul2 {

    /* compiled from: DataUriParser.java */
    /* renamed from: ul2$a */
    /* loaded from: classes3.dex */
    static class a extends ul2 {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
            if (r4.indexOf(47) > (-1)) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
        @Override // defpackage.ul2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public defpackage.sl2 b(@androidx.annotation.NonNull java.lang.String r12) {
            /*
                r11 = this;
                r0 = 44
                int r0 = r12.indexOf(r0)
                r1 = 0
                if (r0 >= 0) goto La
                return r1
            La:
                r2 = 1
                r3 = 0
                if (r0 <= 0) goto L4b
                java.lang.String r4 = r12.substring(r3, r0)
                java.lang.String r5 = ";"
                java.lang.String[] r4 = r4.split(r5)
                int r5 = r4.length
                if (r5 <= 0) goto L4b
                r6 = -1
                r7 = 47
                java.lang.String r8 = "base64"
                if (r5 != r2) goto L34
                r4 = r4[r3]
                boolean r5 = r8.equals(r4)
                if (r5 == 0) goto L2d
                r4 = r1
                r3 = 1
                goto L4c
            L2d:
                int r5 = r4.indexOf(r7)
                if (r5 <= r6) goto L4b
                goto L4c
            L34:
                r9 = r4[r3]
                int r7 = r9.indexOf(r7)
                if (r7 <= r6) goto L3f
                r3 = r4[r3]
                goto L40
            L3f:
                r3 = r1
            L40:
                int r5 = r5 - r2
                r4 = r4[r5]
                boolean r4 = r8.equals(r4)
                r10 = r4
                r4 = r3
                r3 = r10
                goto L4c
            L4b:
                r4 = r1
            L4c:
                int r5 = r12.length()
                if (r0 >= r5) goto L6b
                int r0 = r0 + r2
                int r2 = r12.length()
                java.lang.String r12 = r12.substring(r0, r2)
                java.lang.String r0 = "\n"
                java.lang.String r2 = ""
                java.lang.String r12 = r12.replaceAll(r0, r2)
                int r0 = r12.length()
                if (r0 != 0) goto L6a
                goto L6b
            L6a:
                r1 = r12
            L6b:
                sl2 r12 = new sl2
                r12.<init>(r4, r3, r1)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ul2.a.b(java.lang.String):sl2");
        }
    }

    @NonNull
    public static ul2 a() {
        return new a();
    }

    public abstract sl2 b(@NonNull String str);
}
