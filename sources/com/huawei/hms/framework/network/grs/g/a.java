package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public class a {
    protected d a;
    private final String b;
    private final c c;
    private final int d;
    private final Context e;
    private final String f;
    private final GrsBaseInfo g;
    private final com.huawei.hms.framework.network.grs.e.c h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.huawei.hms.framework.network.grs.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0254a {
        GRSPOST,
        GRSGET,
        GRSDEFAULT
    }

    public a(String str, int i, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.b = str;
        this.c = cVar;
        this.d = i;
        this.e = context;
        this.f = str2;
        this.g = grsBaseInfo;
        this.h = cVar2;
    }

    private EnumC0254a h() {
        if (this.b.isEmpty()) {
            return EnumC0254a.GRSDEFAULT;
        }
        String a = a(this.b);
        if (a.contains("1.0")) {
            return EnumC0254a.GRSGET;
        }
        if (a.contains("2.0")) {
            return EnumC0254a.GRSPOST;
        }
        return EnumC0254a.GRSDEFAULT;
    }

    public Context a() {
        return this.e;
    }

    public c b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.f;
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.h;
    }

    public Callable<d> g() {
        if (EnumC0254a.GRSDEFAULT.equals(h())) {
            return null;
        }
        if (EnumC0254a.GRSGET.equals(h())) {
            return new f(this.b, this.d, this.c, this.e, this.f, this.g);
        }
        return new g(this.b, this.d, this.c, this.e, this.f, this.g, this.h);
    }

    private String a(String str) {
        return Uri.parse(str).getPath();
    }
}
